package org.lnu.is.dao.verifier.group;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.verifier.VerifierChainLink;
import org.lnu.is.domain.department.Department;
import org.lnu.is.security.exception.AccessDeniedException;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GroupVerifierChainLinkTest {

	@Mock
	private VerifierChainLink<? super Object> nextVerifier;
	
	@Mock
	private SessionService sessionService;
	
	@InjectMocks
	private GroupVerifierChainLink<Department> unit;
	
	@Test
	public void testVerifyLink() throws Exception {
		// Given
		String crtUserGroup = "developers";
		Department resource = new Department();
		resource.setCrtUserGroup(crtUserGroup);

		// When
		unit.verify(resource);

		// Then
		verify(nextVerifier).verify(any());
		verify(sessionService).verifyGroup(crtUserGroup);
	}

	@Test
	public void testVerifyLinkWithNullNextVerifier() throws Exception {
		// Given
		unit.setNextVerifier(null);
		String crtUserGroup = "developers";
		Department resource = new Department();
		resource.setCrtUserGroup(crtUserGroup);
		
		// When
		unit.verify(resource);
		
		// Then
		verify(nextVerifier, times(0)).verify(any());
		verify(sessionService).verifyGroup(crtUserGroup);
	}
	
	@Test(expected = AccessDeniedException.class)
	public void testVerifyLinkWithException() throws Exception {
		// Given
		String crtUserGroup = "developers";
		Department resource = new Department();
		resource.setCrtUserGroup(crtUserGroup);
		
		// When
		doThrow(AccessDeniedException.class).when(sessionService).verifyGroup(anyString());
		unit.verify(resource);
		
		// Then
		verify(sessionService).verifyGroup(crtUserGroup);
	}
}
