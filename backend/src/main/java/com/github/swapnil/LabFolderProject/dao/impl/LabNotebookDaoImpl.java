package com.github.swapnil.LabFolderProject.dao.impl;

import org.springframework.stereotype.Component;

import com.github.swapnil.LabFolderProject.dao.LabNotebookDao;

@Component
public class LabNotebookDaoImpl implements LabNotebookDao {
//	private static final String TEST_DATA_1 = "Word Words Wor word";

	private static final String TEST_DATA_2 = "Word Word Word word";

	@Override
	/**
	 * Returns the notebook data from DB (As of now this is static - for demo purpose)
	 */
	public String getLabNotebookDataById(Long id) {
		return TEST_DATA_2;
	}
}
