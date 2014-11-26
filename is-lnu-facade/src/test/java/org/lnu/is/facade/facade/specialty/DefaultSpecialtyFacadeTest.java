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
import org.lnu.is.domain.specialty.SpecialtyType;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specialty.SpecialtyResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
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
	private Converter<SpecialtyResource, Specialty> resourceConverter;
	
	@Mock
	private Converter<Specialty, SpecialtyResource> entityConverter;
	
	@Mock
	private SpecialtyService service;

	@Mock
	private Converter<PagedRequest<SpecialtyResource>, PagedSearch<Specialty>> pagedRequestConverter;

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
		when(resourceConverter.convert(any(SpecialtyResource.class))).thenReturn(specialty);
		when(entityConverter.convert(any(Specialty.class))).thenReturn(expected);
		
		SpecialtyResource actual = unit.createSpecialty(expected);

		// Then
		verify(resourceConverter).convert(expected);
		verify(service).createSpecialty(specialty);
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
		when(service.getSpecialty(anyLong())).thenReturn(specialty);
		
		unit.updateSpecialty(id, expected);

		// Then
		verify(service).getSpecialty(id);
		verify(resourceConverter).convert(expected, specialty);
		verify(service).updateSpecialty(specialty);
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
		when(service.getSpecialty(anyLong())).thenReturn(specialty);
		when(entityConverter.convert(any(Specialty.class))).thenReturn(expected);
		SpecialtyResource actual = unit.getSpecialty(id);

		// Then
		verify(service).getSpecialty(id);
		verify(entityConverter).convert(specialty);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRemoveSpecoffer() throws Exception {
		// Given
		Long id = 1L;
		
		Specialty specialty = new Specialty();
		specialty.setId(id);
		
		// When
		when(service.getSpecialty(anyLong())).thenReturn(specialty);
		unit.removeSpecialty(id);

		// Then
		verify(service).getSpecialty(id);
		verify(service).removeSpecialty(specialty);
	}
	
	@Test
	public void testGetSpecialties() throws Exception {
		// Given
		PagedRequest<SpecialtyResource> pagedRequest = new PagedRequest<SpecialtyResource>(new SpecialtyResource(), 10, 10);
		List<SpecialtyResource> funnyResources = Collections.singletonList(new SpecialtyResource());
		PagedResultResource<SpecialtyResource> expected = new PagedResultResource<>("/specialties");
		expected.setResources(funnyResources);

		int offset = 8;
		int limit = 3;
		int count = 100;
		
		PagedSearch<Specialty> pagedSearch = new PagedSearch<Specialty>(offset, limit, Collections.<String, Object> emptyMap(), Specialty.class);
		List<Specialty> entities = Arrays.asList(new Specialty());
		PagedResult<Specialty> pagedResult = new PagedResult<Specialty>(offset, limit, count, entities);

		// When
		when(pagedRequestConverter.convert(Matchers.<PagedRequest<SpecialtyResource>>any())).thenReturn(pagedSearch);
		when(service.getSpecialties(Matchers.<PagedSearch<Specialty>> any())).thenReturn(pagedResult);
		when(entityConverter.convertAll(anyListOf(Specialty.class))).thenReturn(funnyResources);

		PagedResultResource<SpecialtyResource> actual = unit.getSpecialties(pagedRequest);

		// Then
		verify(pagedRequestConverter).convert(pagedRequest);
		verify(service).getSpecialties(pagedSearch);
		verify(entityConverter).convertAll(entities);
		verify(pagedResultConverter).convert(pagedResult, expected);

		assertEquals(expected, actual);
	}
}
