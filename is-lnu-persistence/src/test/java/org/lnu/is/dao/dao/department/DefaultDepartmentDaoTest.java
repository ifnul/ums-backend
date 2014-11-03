package org.lnu.is.dao.dao.department;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.persistence.PersistenceManager;
import org.lnu.is.domain.department.Department;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultDepartmentDaoTest {

	@Mock
	private PersistenceManager<Department, Long> persistenceManager;
	
	@InjectMocks
	private DefaultDepartmentDao unit;
	
	@Test
	public void testTest() throws Exception {
		// Given

		// When

		// Then
		assertEquals(true, true);
	}
}
