package com.github.swapnil.LabFolderProject.dto;

import java.util.List;

/**
 * The Data Transfer Object for the NotebookData post-processing statistics
 * 
 * @author Swap
 *
 */
public class NotebookDataStatsDTO {
	private String inputWord;
	
	private List<String> similarWords;

	private Long frequencyInNotebook;

	public String getInputWord() {
		return inputWord;
	}

	public void setInputWord(String inputWord) {
		this.inputWord = inputWord;
	}

	public List<String> getSimilarWords() {
		return similarWords;
	}

	public void setSimilarWords(List<String> similarWords) {
		this.similarWords = similarWords;
	}

	public Long getFrequencyInNotebook() {
		return frequencyInNotebook;
	}

	public void setFrequencyInNotebook(Long frequencyInNotebook) {
		this.frequencyInNotebook = frequencyInNotebook;
	}

	@Override
	public String toString() {
		return "NotebookDataStatsDTO [inputWord=" + inputWord + ", similarWords=" + similarWords
				+ ", frequencyInNotebook=" + frequencyInNotebook + "]";
	}
}
