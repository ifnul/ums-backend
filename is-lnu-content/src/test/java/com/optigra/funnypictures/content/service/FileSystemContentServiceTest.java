package com.optigra.funnypictures.content.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.optigra.funnypictures.content.ContentSaveException;
import com.optigra.funnypictures.content.model.Content;
import com.optigra.funnypictures.model.content.MimeType;

public class FileSystemContentServiceTest {

	private String contentRepositoryPath = "./";
	private String fileName = "test-image.png";
	private String saveFileName = "test-save-image.png";

	private FileSystemContentService unit = new FileSystemContentService();

	@Before
	public void setUp() throws IOException {
		unit.setContentRepositoryPath(contentRepositoryPath);
		File file = new File(fileName);
		file.deleteOnExit();
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write("Hello world!!!");
		fileWriter.close();
		
		File saveFile = new File(contentRepositoryPath + saveFileName);
		if(saveFile.exists()){
			saveFile.delete();
		}
	}

	@Test
	public void testGetContentByPath() throws Exception {
		// Given
		Content expectedContent = new Content();
		expectedContent.setMimeType(MimeType.IMAGE_PNG_PNG);
		expectedContent.setPath(fileName);

		// When
		Content actualContent = unit.getContentByPath(fileName);

		// Then
		assertEquals(expectedContent.getPath(), actualContent.getPath());
		assertEquals(expectedContent.getMimeType(), actualContent.getMimeType());
	}
	
	@Test
	public void testSaveContent() throws Exception {
		// Given
		File file = new File(fileName);
		file.deleteOnExit();
		
		Content content = new Content();
		content.setMimeType(MimeType.IMAGE_PNG_PNG);
		content.setPath(saveFileName);
		content.setContentStream(new FileInputStream(file));	
		
		// When
		unit.saveContent(content);
		
		// Then
		File savedFile = new File(contentRepositoryPath + saveFileName);
		savedFile.deleteOnExit();
		
		assertTrue(savedFile.exists());
	}
	
	@Test(expected = ContentSaveException.class)
	public void testSaveContentWhenException() throws Exception {
		// Given
		Content content = new Content();
		content.setMimeType(MimeType.IMAGE_PNG_PNG);
		content.setPath(saveFileName);
		
		// When
		unit.saveContent(content);
		
		// Then
		// expected exception
	}
}
