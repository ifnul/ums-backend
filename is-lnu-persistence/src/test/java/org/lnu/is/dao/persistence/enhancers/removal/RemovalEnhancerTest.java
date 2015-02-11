package org.lnu.is.dao.persistence.enhancers.removal;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.persistence.enhancers.Enhancer;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.department.Department;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RemovalEnhancerTest {

	@Mock
	private Enhancer<? super Object> nextEnhancer;
	
	@InjectMocks
	private RemovalEnhancer<Department> unit;
	
	@Test
	public void testEnhance() throws Exception {
		// Given
		Department entity = new Department();
		Integer expectedActual = 0;

		// When
		unit.enhance(entity);

		// Then
		verify(nextEnhancer).enhance(any());
		assertEquals(expectedActual, entity.getActual());
		assertEquals(RowStatus.DELETED, entity.getStatus());
	}
	
	@Test
	public void testEnhanceWithoutNextEnhancer() throws Exception {
		// Given
		unit.setNextEnhancer(null);
		Department entity = new Department();
		Integer expectedActual = 0;
		
		// When
		unit.enhance(entity);
		
		// Then
		verify(nextEnhancer, times(0)).enhance(any());
		assertEquals(expectedActual, entity.getActual());
		assertEquals(RowStatus.DELETED, entity.getStatus());
	}
}
