package org.lnu.is.service.person;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.person.entrant.PersonEntrant;
import org.lnu.is.domain.person.entrant.PersonEntrantAuto;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultPersonEntrantServiceTest {

	@Mock
	private Dao<PersonEntrant, PersonEntrant, Long> entrantDao;
	
	@Mock
	private Dao<PersonEntrantAuto, PersonEntrantAuto, Long> entrantAutoDao;
	
	@InjectMocks
	private DefaultPersonEntrantService unit;
	
	@Test
	public void testGetEntrant() throws Exception {
		// Given
		Long id = 1L;

		PersonEntrant expected = new PersonEntrant();
		
		// When
		when(entrantDao.getEntityById(anyLong())).thenReturn(expected);
		
		PersonEntrant actual = unit.getEntrant(id);

		// Then
		verify(entrantDao).getEntityById(id);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetEntrantAuto() throws Exception {
		// Given
		Long id = 1L;
		
		PersonEntrantAuto expected = new PersonEntrantAuto();
		
		// When
		when(entrantAutoDao.getEntityById(anyLong())).thenReturn(expected);
		
		PersonEntrantAuto actual = unit.getEntrantAuto(id);
		
		// Then
		verify(entrantAutoDao).getEntityById(id);
		assertEquals(expected, actual);
	}
}
