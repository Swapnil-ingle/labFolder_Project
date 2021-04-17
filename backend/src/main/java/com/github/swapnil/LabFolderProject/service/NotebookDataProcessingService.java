package com.github.swapnil.LabFolderProject.service;

import com.github.swapnil.LabFolderProject.dto.NotebookDataStatsDTO;
import com.github.swapnil.LabFolderProject.model.LabNotebook;

/**
 * 
 * Service Class for all types of processing to be done on the Notebook data
 * 
 * @author Swapnil I.
 *
 */
public interface NotebookDataProcessingService {
	/**
	 * Get the frequency of a word in the {@link LabNotebook}
	 * 
	 * @param word
	 * @return {@link NotebookDataStatsDTO}
	 */
	public NotebookDataStatsDTO getFrequencyOfWordInNotebook(String word);
	
	/**
	 * Find similar words in the {@link LabNotebook} whose Levenshtein distance is not more than 1
	 * 
	 * @param word
	 * @return {@link NotebookDataStatsDTO}
	 */
	public NotebookDataStatsDTO findSimilarWordsInNotebook(String word);
}
