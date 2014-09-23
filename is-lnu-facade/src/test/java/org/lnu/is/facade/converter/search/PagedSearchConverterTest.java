package org.lnu.is.facade.converter.search;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.converter.search.PagedSearchConverter;
import org.lnu.is.facade.resources.ApiResource;
import org.lnu.is.facade.resources.picture.PictureResource;
import org.lnu.is.facade.resources.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PagedSearchConverterTest {

	PagedSearchConverter unit = new PagedSearchConverter();

	@Test
	public void testConvert() {
		Long id1 = 1L;
		Long id2 = 1L;
		String name = "Name";
		String url = "Url";

		Integer offset = 0;
		Integer limit = 10;
		long count = 100;

		PictureResource picture1 = new PictureResource();
		picture1.setId(id1);
		picture1.setName(name);
		picture1.setUrl(url);

		PictureResource picture2 = new PictureResource();
		picture2.setId(id2);
		picture2.setName(name);
		picture2.setUrl(url);

		List<PictureResource> entities = Arrays.asList(picture1, picture2);

		PagedResult<PictureResource> pagedResult = new PagedResult<PictureResource>(offset, limit, count, entities);

		PagedResultResource<? extends ApiResource> expectedResource = new PagedResultResource<PictureResource>("/pictures");

		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		
		PagedResultResource<? extends ApiResource> actualResource = new PagedResultResource<PictureResource>("/pictures");
		
		actualResource = unit.convert(pagedResult, actualResource);
		
		assertEquals(actualResource, expectedResource);

	}
}
