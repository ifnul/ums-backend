package org.lnu.is.service.department;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.department.DepartmentDao;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultDepartmentServiceTest {

	@Mock
	private DepartmentDao departmentDao;
	
	@InjectMocks
	private DefaultDepartmentService unit;
	
	@Test
	public void testTest() throws Exception {
		// Given

		// When

		// Then
		assertEquals(true, true);
	}
}
