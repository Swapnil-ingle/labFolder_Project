package com.github.swapnil.LabFolderProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.swapnil.LabFolderProject.common.LabNotebookResp;
import com.github.swapnil.LabFolderProject.dto.NotebookDataStatsDTO;
import com.github.swapnil.LabFolderProject.service.NotebookDataProcessingService;

@RestController
@RequestMapping("labNotebook/api")
public class LabNotebookEntryController {
	@Autowired
	private NotebookDataProcessingService notebookDataProcessingSvc;

	@GetMapping("/frequencyOf")
	public ResponseEntity<LabNotebookResp<NotebookDataStatsDTO>> findFrequencyOfWordInNotebook(
			@RequestParam(name = "word") String word) {
		LabNotebookResp<NotebookDataStatsDTO> resp = new LabNotebookResp<NotebookDataStatsDTO>();

		try {
			NotebookDataStatsDTO notebookDataStatsDTO = notebookDataProcessingSvc.getFrequencyOfWordInNotebook(word);
			return ResponseEntity.status(HttpStatus.OK).body(resp.wrap(notebookDataStatsDTO));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resp.error(e));
		}
	}

	@GetMapping("/findSimilarWords")
	public ResponseEntity<LabNotebookResp<NotebookDataStatsDTO>> findSimilarWordsInNotebook(
			@RequestParam(name = "word") String word) {
		LabNotebookResp<NotebookDataStatsDTO> resp = new LabNotebookResp<NotebookDataStatsDTO>();

		try {
			NotebookDataStatsDTO notebookDataStatsDTO = notebookDataProcessingSvc.findSimilarWordsInNotebook(word);
			return ResponseEntity.status(HttpStatus.OK).body(resp.wrap(notebookDataStatsDTO));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resp.error(e));
		}
	}
}
