package org.lnu.is.dao.picture;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.persistence.PersistenceManager;
import org.lnu.is.dao.picture.DefaultPictureDao;
import org.lnu.is.model.Picture;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

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
