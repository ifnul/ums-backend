package org.lnu.is.facade.facade.specialty;

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
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.specialtype.SpecialtyType;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specialty.SpecialtyResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.lnu.is.service.specialty.SpecialtyService;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultSpecialtyFacadeTest {

	@Mock
	private Converter<SpecialtyResource, Specialty> insertConverter;

	@Mock
	private Converter<SpecialtyResource, Specialty> updateConverter;
	
	@Mock
	private Converter<SpecialtyResource, Specialty> specialtyResourceConverter;
	
	@Mock
	private Converter<Specialty, SpecialtyResource> specialtyConverter;
	
	@Mock
	private SpecialtyService specialtyService;

	@Mock
	private Converter<PagedRequest, PagedSearch<Specialty>> pagedRequestConverter;

	@Mock
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;
	
	@InjectMocks
	private DefaultSpecialtyFacade unit;
	
	@Test
	public void testCreateSpecialty() throws Exception {
		// Given
    	String name = "fsd specialty";
    	Long specialtyTypeId = 25L;
    	String abbrName = "fds";
    	String cipher = "534tgfds";
    	
    	SpecialtyResource expected = new SpecialtyResource();
    	expected.setBegDate(new Date());
    	expected.setEndDate(new Date());
		expected.setAbbrName(abbrName );
		expected.setCipher(cipher);
		expected.setName(name);
		expected.setSpecialtyTypeId(specialtyTypeId);

		SpecialtyType specialtyType = new SpecialtyType();

		Specialty specialty = new Specialty();
    	specialty.setBegDate(new Date());
    	specialty.setEndDate(new Date());
		specialty.setAbbrName(abbrName );
		specialty.setCipher(cipher);
		specialty.setName(name);
		specialty.setSpecialtyType(specialtyType);
		
		// When
		when(specialtyResourceConverter.convert(any(SpecialtyResource.class))).thenReturn(specialty);
		when(specialtyConverter.convert(any(Specialty.class))).thenReturn(expected);
		
		SpecialtyResource actual = unit.createSpecialty(expected);

		// Then
		verify(specialtyResourceConverter).convert(expected);
		verify(specialtyService).createSpecialty(specialty);
		verify(insertConverter).convert(expected, specialty);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testUpdateSpecialty() throws Exception {
		// Given
		Long id = 1L;
    	String name = "fsd specialty";
    	Long specialtyTypeId = 25L;
    	String abbrName = "fds";
    	String cipher = "534tgfds";
    	
    	SpecialtyResource expected = new SpecialtyResource();
    	expected.setBegDate(new Date());
    	expected.setEndDate(new Date());
		expected.setAbbrName(abbrName );
		expected.setCipher(cipher);
		expected.setName(name);
		expected.setSpecialtyTypeId(specialtyTypeId);

		SpecialtyType specialtyType = new SpecialtyType();

		Specialty specialty = new Specialty();
    	specialty.setBegDate(new Date());
    	specialty.setEndDate(new Date());
		specialty.setAbbrName(abbrName );
		specialty.setCipher(cipher);
		specialty.setName(name);
		specialty.setSpecialtyType(specialtyType);
		
		// When
		when(specialtyService.getSpecialty(anyLong())).thenReturn(specialty);
		
		unit.updateSpecialty(id, expected);

		// Then
		verify(specialtyService).getSpecialty(id);
		verify(specialtyResourceConverter).convert(expected, specialty);
		verify(specialtyService).updateSpecialty(specialty);
		verify(updateConverter).convert(expected, specialty);
	}
	
	@Test
	public void testGetSpecialty() throws Exception {
		// Given
		Long id = 1L;
    	String name = "fsd specialty";
    	Long specialtyTypeId = 25L;
    	String abbrName = "fds";
    	String cipher = "534tgfds";
    	
    	SpecialtyResource expected = new SpecialtyResource();
    	expected.setBegDate(new Date());
    	expected.setEndDate(new Date());
		expected.setAbbrName(abbrName );
		expected.setCipher(cipher);
		expected.setName(name);
		expected.setSpecialtyTypeId(specialtyTypeId);

		SpecialtyType specialtyType = new SpecialtyType();

		Specialty specialty = new Specialty();
    	specialty.setBegDate(new Date());
    	specialty.setEndDate(new Date());
		specialty.setAbbrName(abbrName );
		specialty.setCipher(cipher);
		specialty.setName(name);
		specialty.setSpecialtyType(specialtyType);

		// When
		when(specialtyService.getSpecialty(anyLong())).thenReturn(specialty);
		when(specialtyConverter.convert(any(Specialty.class))).thenReturn(expected);
		SpecialtyResource actual = unit.getSpecialty(id);

		// Then
		verify(specialtyService).getSpecialty(id);
		verify(specialtyConverter).convert(specialty);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRemoveSpecoffer() throws Exception {
		// Given
		Long id = 1L;
		
		Specialty specialty = new Specialty();
		specialty.setId(id);
		
		// When
		when(specialtyService.getSpecialty(anyLong())).thenReturn(specialty);
		unit.removeSpecialty(id);

		// Then
		verify(specialtyService).getSpecialty(id);
		verify(specialtyService).removeSpecialty(specialty);
	}
	
	@Test
	public void testGetSpecialties() throws Exception {
		// Given
		PagedRequest pagedRequest = new PagedRequest(10, 10);
		List<SpecialtyResource> funnyResources = Collections.singletonList(new SpecialtyResource());
		PagedResultResource<SpecialtyResource> expectedFunnies = new PagedResultResource<>("/specialties");
		expectedFunnies.setEntities(funnyResources);

		int offset = 8;
		int limit = 3;
		int count = 100;
		
		PagedSearch<Specialty> pagedSearch = new PagedSearch<Specialty>(offset, limit, Queries.FIND_SPECOFFERS, Collections.<String, Object> emptyMap(), Specialty.class);
		List<Specialty> entities = Arrays.asList(new Specialty());
		PagedResult<Specialty> pagedResult = new PagedResult<Specialty>(offset, limit, count, entities);

		// When
		when(pagedRequestConverter.convert(any(PagedRequest.class))).thenReturn(pagedSearch);
		when(specialtyService.getSpecialties(Matchers.<PagedSearch<Specialty>> any())).thenReturn(pagedResult);
		when(specialtyConverter.convertAll(anyListOf(Specialty.class))).thenReturn(funnyResources);

		PagedResultResource<SpecialtyResource> actualFunnies = unit.getSpecialties(pagedRequest);

		// Then
		verify(pagedRequestConverter).convert(pagedRequest);
		verify(specialtyService).getSpecialties(pagedSearch);
		verify(specialtyConverter).convertAll(entities);
		verify(pagedResultConverter).convert(pagedResult, expectedFunnies);

		assertEquals(expectedFunnies, actualFunnies);
	}
}
