package com.optigra.funnypictures.dao.picture;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.optigra.funnypictures.dao.persistence.PersistenceManager;
import com.optigra.funnypictures.dao.picture.DefaultPictureDao;
import com.optigra.funnypictures.model.Picture;
import com.optigra.funnypictures.pagination.PagedResult;
import com.optigra.funnypictures.pagination.PagedSearch;
import com.optigra.funnypictures.queries.Queries;

@RunWith(MockitoJUnitRunner.class)
public class DefaultPictureDaoTest {

	@InjectMocks
	private DefaultPictureDao unit;
	
	@Mock
	private PersistenceManager<Picture, Long> persistenceManager;
	
	@Test
	public void testGetPictures() throws Exception {
		// Given
		Integer limit = 20;
		Integer offset = 0;
		long count = 100;
		Picture entity1 = new Picture();
		List<Picture> entities = Arrays.asList(entity1 );
		
		PagedSearch<Picture> pagedSearch = new PagedSearch<Picture>();
		pagedSearch.setLimit(limit);
		pagedSearch.setOffset(offset);
		pagedSearch.setClazz(Picture.class);
		pagedSearch.setParameters(Collections.<String, Object>emptyMap());
		pagedSearch.setQuery(Queries.FIND_PICTURES);
		
		PagedResult<Picture> expected = new PagedResult<Picture>(offset, limit, count, entities);
		
		when(persistenceManager.search(Matchers.<PagedSearch<Picture>>any())).thenReturn(expected);
		
		// When
		PagedResult<Picture> actual = unit.getPictures(pagedSearch);

		// Then
		verify(persistenceManager).search(pagedSearch);
		assertEquals(expected, actual);
	}
}
