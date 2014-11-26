package org.lnu.is.facade.facade.specoffer.subject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.specoffer.SpecofferSubject;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specoffer.subject.SpecOfferSubjectResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.specoffer.subject.SpecOfferSubjectService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultSpecOfferSubjectFacadeTest {

	@Mock
	protected Converter<SpecOfferSubjectResource, SpecofferSubject> insertConverter;
	
	@Mock
	protected Converter<SpecOfferSubjectResource, SpecofferSubject> updateConverter;
	
	@Mock
	protected Converter<PagedRequest<SpecOfferSubjectResource>, PagedSearch<SpecofferSubject>> pagedRequestConverter;

	@Mock
	protected Converter<PagedResult<SpecofferSubject>, PagedResultResource<SpecOfferSubjectResource>> pagedResultConverter;
	
	@Mock
	private SpecOfferSubjectService specOfferSubjectService;
	
	@InjectMocks
	private DefaultSpecOfferSubjectFacade unit;
	
    @Test
	public void test() throws Exception {
		// Given

		// When

		// Then
    	assertEquals(true, true);
	}
}
