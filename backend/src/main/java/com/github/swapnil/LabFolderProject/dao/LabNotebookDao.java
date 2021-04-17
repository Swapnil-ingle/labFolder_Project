package com.github.swapnil.LabFolderProject.dao;

import com.github.swapnil.LabFolderProject.model.LabNotebook;

/**
 * DataAccess interface for {@link LabNotebook} model
 * 
 * @author Swap
 *
 */
public interface LabNotebookDao {
	/**
	 * 
	 * @param id
	 * @return Data saved in the {@link LabNotebook} record
	 */
	public String getLabNotebookDataById(Long id);
}
