package com.github.swapnil.LabFolderProject.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.swapnil.LabFolderProject.common.LevenshtienDistanceUtil;
import com.github.swapnil.LabFolderProject.dao.LabNotebookDao;
import com.github.swapnil.LabFolderProject.dto.NotebookDataStatsDTO;
import com.github.swapnil.LabFolderProject.service.NotebookDataProcessingService;

@Service
public class NotebookDataProcessingServiceImpl implements NotebookDataProcessingService {
	@Autowired
	private LabNotebookDao labNotebookDao;

	@Override
	public NotebookDataStatsDTO getFrequencyOfWordInNotebook(String word) {
		String data = labNotebookDao.getLabNotebookDataById(1L);

		NotebookDataStatsDTO notebookDataStatsDTO = new NotebookDataStatsDTO();
		notebookDataStatsDTO.setInputWord(word);
		notebookDataStatsDTO.setFrequencyInNotebook(getFrequencyOfWordInData(word, data));

		return notebookDataStatsDTO;
	}

	@Override
	public NotebookDataStatsDTO findSimilarWordsInNotebook(String word) {
		Map<String, Long> tokenizedData = tokenizeDataByWordFrequency(labNotebookDao.getLabNotebookDataById(1L));
		
		List<String> similarWords = new ArrayList<>();
		
		for (String uniqueWord : tokenizedData.keySet()) {
			if (LevenshtienDistanceUtil.isLevenshtienDistanceWithinBound(uniqueWord, word, 1)) {
				if (!uniqueWord.equals(word)) {
					similarWords.add(uniqueWord);
				}
			}
		}

		NotebookDataStatsDTO notebookDataStatsDTO = new NotebookDataStatsDTO();
		notebookDataStatsDTO.setInputWord(word);
		notebookDataStatsDTO.setSimilarWords(similarWords);

		return notebookDataStatsDTO;
	}

	private Long getFrequencyOfWordInData(String word, String data) {
		Map<String, Long> tokenizedData = tokenizeDataByWordFrequency(data);
		return tokenizedData.getOrDefault(word, 0L);
	}

	private Map<String, Long> tokenizeDataByWordFrequency(String data) {
		List<String> tokens = Arrays.asList(data.trim().split(" "));

		Map<String, Long> tokenizedData = tokens.stream().collect(Collectors.groupingBy(token -> {
			return token;
		}, Collectors.counting()));

		return tokenizedData;
	}
}
