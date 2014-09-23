package com.optigra.funnypictures.content.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.optigra.funnypictures.content.ContentReadException;
import com.optigra.funnypictures.content.ContentSaveException;
import com.optigra.funnypictures.content.model.Content;
import com.optigra.funnypictures.model.content.MimeType;

public class FileSystemContentService implements ContentService {

	private static final Logger LOG = LoggerFactory.getLogger(FileSystemContentService.class);

	private static final char EXTENSION_SEPARATOR = '.';

	private String contentRepositoryPath;

	@Override
	public Content getContentByPath(String path) {
		Content content = null;

		LOG.info("Read file from {}" + path);

		try {
			File file = new File(getFullfilePath(path));
			FileInputStream fileInputStream = new FileInputStream(file);
			String fileExtention = FilenameUtils.getExtension(file.getName());

			content = new Content();
			content.setContentStream(fileInputStream);
			content.setPath(path);
			content.setSize(Long.valueOf(file.getTotalSpace()));
			content.setMimeType(MimeType.fromExtension(EXTENSION_SEPARATOR + fileExtention));

		} catch (FileNotFoundException e) {
			LOG.error("Can't read file from file system", e);
			throw new ContentReadException(e);
		}

		return content;
	}

	@Override
	public void saveContent(Content content) {
		LOG.info("Save content: {}", content);

		File file = new File(getFullfilePath(content.getPath()));

		try {
			file.createNewFile();
			IOUtils.copy(content.getContentStream(), new FileOutputStream(file));
		} catch (Exception e) {
			LOG.error("Can't save file", e);
			throw new ContentSaveException("Can't save file", e);
		}
	}

	private String getFullfilePath(String filePath) {
		return getContentRepositoryPath() + filePath;
	}

	public String getContentRepositoryPath() {
		return contentRepositoryPath;
	}

	public void setContentRepositoryPath(String contentRepositoryPath) {
		this.contentRepositoryPath = contentRepositoryPath;
	}
}
