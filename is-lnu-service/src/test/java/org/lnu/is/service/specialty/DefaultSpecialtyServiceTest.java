package org.lnu.is.service.specialty;



import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.specialty.SpecialtyDao;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultSpecialtyServiceTest {

	@Mock
	private SpecialtyDao specialtyDao;
	
	@InjectMocks
	private DefaultSpecialtyService unit;

	@Test
	public void testCreateSpecialty() throws Exception {
		// Given
		Specialty expected = new Specialty();

		// When
		Specialty actual = unit.createSpecialty(expected);

		// Then
		verify(specialtyDao).save(expected);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testUpdateSpecialty() throws Exception {
		// Given
		Specialty specialty = new Specialty();

		// When
		unit.updateSpecialty(specialty);

		// Then
		verify(specialtyDao).update(specialty);
	}
	
	@Test
	public void testGetSpecialty() throws Exception {
		// Given
		Long id = 1L;
		Specialty expected = new Specialty();
		expected.setId(id);

		// When
		when(specialtyDao.findById(anyLong())).thenReturn(expected);
		Specialty actual = unit.getSpecialty(id);

		// Then
		verify(specialtyDao).findById(id);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRemoveSpecialty() throws Exception {
		// Given
		Specialty specialty = new Specialty();

		// When
		unit.removeSpecialty(specialty);

		// Then
		verify(specialtyDao).delete(specialty);
	}
	
	@Test
	public void testGetSpecialties() throws Exception {
		// Given
		PagedSearch<Specialty> pagedSearch = new PagedSearch<>();
		
		Specialty specialty = new Specialty();
		Integer offset = 0;
		Integer limit = 100;
		long count = 200;
		List<Specialty> entities = Arrays.asList(specialty);
		PagedResult<Specialty> expected = new PagedResult<Specialty>(offset, limit, count, entities);
		
		// When
		when(specialtyDao.getSpecialties(Matchers.<PagedSearch<Specialty>>any())).thenReturn(expected);
		PagedResult<Specialty> actual = unit.getSpecialties(pagedSearch);

		// Then
		verify(specialtyDao).getSpecialties(pagedSearch);
		assertEquals(expected, actual);
	}
}
