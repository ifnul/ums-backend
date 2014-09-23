package com.optigra.funnypictures.service.picture;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.optigra.funnypictures.dao.picture.PictureDao;
import com.optigra.funnypictures.model.Picture;
import com.optigra.funnypictures.pagination.PagedResult;
import com.optigra.funnypictures.pagination.PagedSearch;

@RunWith(MockitoJUnitRunner.class)
public class DefaultPictureServiceTest {

	@InjectMocks
	private DefaultPictureService unit;

	@Mock
	private PictureDao pictureDao;

	@Test
	public void testGetPictures() throws Exception {
		// Given
		Integer limit = 20;
		Integer offset = 0;
		long count = 100;
		Picture entity1 = new Picture();
		List<Picture> entities = Arrays.asList(entity1);

		PagedSearch<Picture> pagedSearch = new PagedSearch<>();
		pagedSearch.setLimit(limit);
		pagedSearch.setOffset(offset);

		PagedResult<Picture> expected = new PagedResult<Picture>(offset, limit, count, entities);

		when(pictureDao.getPictures(Matchers.<PagedSearch<Picture>> any())).thenReturn(expected);

		// When
		PagedResult<Picture> actual = unit.getPictures(pagedSearch);

		// Then
		verify(pictureDao).getPictures(pagedSearch);
		assertEquals(expected, actual);
	}

	@Test
	public void testCreatePicture() {
		
		// Given
		String name = "name";
		String url = "url";
		
		Picture picture = new Picture();
		picture.setName(name);
		picture.setUrl(url);
		
		Picture expectedPicture = new Picture();
		expectedPicture.setName(name);
		expectedPicture.setUrl(url);
		
		// When
		Picture actualPicture = unit.createPicture(picture);
		
		// Then
		verify(pictureDao).save(picture);
		assertEquals(expectedPicture, actualPicture);
	}

	@Test
	public void testUpdatePicture() throws Exception {
		// Given
		String name = "name";
		String url = "url";
		
		Picture picture = new Picture();
		picture.setName(name);
		picture.setUrl(url);
		
		// When
		unit.updatePicture(picture);
		
		// Then
		verify(pictureDao).update(picture);
	}
	
	@Test
	public void testGetPicture() throws Exception {
		// Given
		Long id = 2L;
		String name = "name";
		String url = "url";
		
		Picture expected = new Picture();
		expected.setName(name);
		expected.setUrl(url);

		// When
		when(pictureDao.findById(anyLong())).thenReturn(expected);
		Picture actual = unit.getPicture(id);

		// Then
		verify(pictureDao).findById(id);
		assertEquals(expected, actual);
	}
}
