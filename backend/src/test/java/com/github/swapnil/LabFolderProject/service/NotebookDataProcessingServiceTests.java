package com.github.swapnil.LabFolderProject.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.swapnil.LabFolderProject.dao.LabNotebookDao;
import com.github.swapnil.LabFolderProject.service.impl.NotebookDataProcessingServiceImpl;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class NotebookDataProcessingServiceTests {
	@Mock
	private LabNotebookDao labNotebookDao;

	@InjectMocks
	private NotebookDataProcessingService notebookDataProcessingSvc = new NotebookDataProcessingServiceImpl();

	@Test
	public void getFrequencyOfWordInNotebookTest_whenApple_thenTwo() {
		when(labNotebookDao.getLabNotebookDataById(1L)).thenReturn(SAMPLE_DATA);
		assertEquals(2L, notebookDataProcessingSvc.getFrequencyOfWordInNotebook("Apple").getFrequencyInNotebook());
	}

	@Test
	public void getFrequencyOfWordInNotebookTest_whenOrange_thenOne() {
		when(labNotebookDao.getLabNotebookDataById(1L)).thenReturn(SAMPLE_DATA);
		assertEquals(1L, notebookDataProcessingSvc.getFrequencyOfWordInNotebook("Orange").getFrequencyInNotebook());
	}

	@Test
	public void getFrequencyOfWordInNotebookTest_whenNone_thenZero() {
		when(labNotebookDao.getLabNotebookDataById(1L)).thenReturn(SAMPLE_DATA);
		assertEquals(0L, notebookDataProcessingSvc.getFrequencyOfWordInNotebook("").getFrequencyInNotebook());
	}

	@Test
	public void findSimilarWordsInNotebookTest_whenApplORApples_thenApple() {
		when(labNotebookDao.getLabNotebookDataById(1L)).thenReturn(SAMPLE_DATA);
		assertEquals("Apple", notebookDataProcessingSvc.findSimilarWordsInNotebook("Appl").getSimilarWords().get(0));
		assertEquals("Apple", notebookDataProcessingSvc.findSimilarWordsInNotebook("Apples").getSimilarWords().get(0));
	}

	private final static String SAMPLE_DATA = "Apple Orange Banana Apple";
}
