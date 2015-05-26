package org.lnu.is.dao.persistence.verifier.entity;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.exception.EntityNotFoundException;
import org.lnu.is.dao.persistence.verifier.VerifierChainLink;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.department.Department;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ValidEntityVerifierTest {

	@Mock
	private VerifierChainLink<? super Object> nextVerifier;
	
	@InjectMocks
	private ValidEntityVerifier<Department> unit;
	
	@Test
	public void testVerify() throws Exception {
		// Given
		Department resource = new Department();
		resource.setStatus(RowStatus.ACTIVE);

		// When
		unit.verify(resource);
		
		// Then
		verify(nextVerifier).verify(any());
	}
	
	@Test
	public void testVerifyWithoutNextVerifier() throws Exception {
		// Given
		unit.setNextVerifier(null);
		Department resource = new Department();
		resource.setStatus(RowStatus.ACTIVE);
		
		// When
		unit.verify(resource);
		
		// Then
		verify(nextVerifier, times(0)).verify(any());
	}
	
	@Test(expected = EntityNotFoundException.class)
	public void testVerifyWithDeletedEntity() throws Exception {
		// Given
		Long id = 1L;
		Department resource = new Department();
		resource.setId(id);
		resource.setStatus(RowStatus.DELETED);
		
		// When
		unit.verify(resource);
	}
}
