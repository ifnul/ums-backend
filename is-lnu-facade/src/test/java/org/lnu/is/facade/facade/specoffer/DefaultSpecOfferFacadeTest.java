package org.lnu.is.facade.facade.specoffer;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specoffer.SpecOfferResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.specoffer.SpecOfferService;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultSpecOfferFacadeTest {

	@Mock
	private Converter<SpecOfferResource, SpecOffer> insertConverter;

	@Mock
	private Converter<SpecOfferResource, SpecOffer> updateConverter;
	
	@Mock
	private Converter<SpecOfferResource, SpecOffer> resourceConverter;
	
	@Mock
	private Converter<SpecOffer, SpecOfferResource> entityConverter;
	
	@Mock
	private SpecOfferService service;

	@Mock
	private Converter<PagedRequest<SpecOfferResource>, PagedSearch<SpecOffer>> pagedRequestConverter;

	@Mock
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;
	
	@InjectMocks
	private DefaultSpecOfferFacade unit;
	
	@Test
	public void testCreateSpecOffer() throws Exception {
		// Given
    	String note = "Note";
    	Integer licCount = 24;
    	Long eduFormTypeId = 1L;
    	String docNum = "docNum";
    	Long departmentId = 23L;

		SpecOfferResource expected = new SpecOfferResource();
    	expected.setBegDate(new Date());
    	expected.setEndDate(new Date());
		expected.setDepartmentId(departmentId);
		expected.setDocNum(docNum);
		expected.setEduFormTypeId(eduFormTypeId);
		expected.setLicCount(licCount);
		expected.setNote(note);
		
		SpecOffer specOffer = new SpecOffer();
		
		// When
		when(resourceConverter.convert(any(SpecOfferResource.class))).thenReturn(specOffer);
		when(entityConverter.convert(any(SpecOffer.class))).thenReturn(expected);
		
		SpecOfferResource actual = unit.createEntity(expected);

		// Then
		verify(resourceConverter).convert(expected);
		verify(service).createSpecOffer(specOffer);
		verify(insertConverter).convert(expected, specOffer);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testUpdateSpecOffer() throws Exception {
		// Given
		Long id = 1L;
    	String note = "Note";
    	Integer licCount = 24;
    	Long eduFormTypeId = 1L;
    	String docNum = "docNum";
    	Long departmentId = 23L;
    	
    	SpecOfferResource specOfferResource = new SpecOfferResource();
    	specOfferResource.setBegDate(new Date());
    	specOfferResource.setEndDate(new Date());
		specOfferResource.setDepartmentId(departmentId);
		specOfferResource.setDocNum(docNum);
		specOfferResource.setEduFormTypeId(eduFormTypeId);
		specOfferResource.setLicCount(licCount);
		specOfferResource.setNote(note);
		
		SpecOffer specOffer = new SpecOffer();
		
		// When
		when(service.getSpecOffer(anyLong())).thenReturn(specOffer);
		
		unit.updateEntity(id, specOfferResource);

		// Then
		verify(service).getSpecOffer(id);
		verify(resourceConverter).convert(specOfferResource, specOffer);
		verify(service).updateSpecOffer(specOffer);
		verify(updateConverter).convert(specOfferResource, specOffer);
	}
	
	@Test
	public void testGetSpecOffer() throws Exception {
		// Given
		Long id = 1L;
    	String note = "Note";
    	Integer licCount = 24;
    	Long eduFormTypeId = 1L;
    	String docNum = "docNum";
    	Long departmentId = 23L;
    	
    	SpecOfferResource expected = new SpecOfferResource();
    	expected.setBegDate(new Date());
    	expected.setEndDate(new Date());
		expected.setDepartmentId(departmentId);
		expected.setDocNum(docNum);
		expected.setEduFormTypeId(eduFormTypeId);
		expected.setLicCount(licCount);
		expected.setNote(note);
		
		SpecOffer specOffer = new SpecOffer();
		specOffer.setId(id);

		// When
		when(service.getSpecOffer(anyLong())).thenReturn(specOffer);
		when(entityConverter.convert(any(SpecOffer.class))).thenReturn(expected);
		SpecOfferResource actual = unit.getEntity(id);

		// Then
		verify(service).getSpecOffer(id);
		verify(entityConverter).convert(specOffer);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRemoveSpecoffer() throws Exception {
		// Given
		Long id = 1L;
		
		SpecOffer specOffer = new SpecOffer();
		specOffer.setId(id);
		
		// When
		when(service.getSpecOffer(anyLong())).thenReturn(specOffer);
		unit.removeEntity(id);

		// Then
		verify(service).getSpecOffer(id);
		verify(service).removeSpecOffer(specOffer);
	}
	
	@Test
	public void testGetSpecOffers() throws Exception {
		// Given
		PagedRequest<SpecOfferResource> pagedRequest = new PagedRequest<SpecOfferResource>(new SpecOfferResource(),10, 10);
		List<SpecOfferResource> funnyResources = Collections.singletonList(new SpecOfferResource());
		PagedResultResource<SpecOfferResource> expectedFunnies = new PagedResultResource<>("/specoffers");
		expectedFunnies.setResources(funnyResources);

		int offset = 8;
		int limit = 3;
		int count = 100;
		
		PagedSearch<SpecOffer> pagedSearch = new PagedSearch<SpecOffer>(offset, limit, Collections.<String, Object> emptyMap(), SpecOffer.class);
		List<SpecOffer> entities = Arrays.asList(new SpecOffer());
		PagedResult<SpecOffer> pagedResult = new PagedResult<SpecOffer>(offset, limit, count, entities);

		// When
		when(pagedRequestConverter.convert(Matchers.<PagedRequest<SpecOfferResource>>any())).thenReturn(pagedSearch);
		when(service.getSpecOffers(Matchers.<PagedSearch<SpecOffer>> any())).thenReturn(pagedResult);
		when(entityConverter.convertAll(anyListOf(SpecOffer.class))).thenReturn(funnyResources);

		PagedResultResource<SpecOfferResource> actualFunnies = unit.getEntities(pagedRequest);

		// Then
		verify(pagedRequestConverter).convert(pagedRequest);
		verify(service).getSpecOffers(pagedSearch);
		verify(entityConverter).convertAll(entities);
		verify(pagedResultConverter).convert(pagedResult, expectedFunnies);

		assertEquals(expectedFunnies, actualFunnies);
	}
}
