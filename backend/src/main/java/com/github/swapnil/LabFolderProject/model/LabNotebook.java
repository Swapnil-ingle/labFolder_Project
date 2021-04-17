package com.github.swapnil.LabFolderProject.model;

/**
 * 
 * The model for LabNotebook persisted in DB
 * 
 * @author Swap
 *
 */
public class LabNotebook {
	private Long id;
	
	private String name;
	
	private String data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
