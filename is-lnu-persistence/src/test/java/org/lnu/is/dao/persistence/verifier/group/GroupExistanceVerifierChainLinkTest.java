package org.lnu.is.dao.persistence.verifier.group;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.exception.NoGroupForUserException;
import org.lnu.is.dao.persistence.verifier.VerifierChainLink;
import org.lnu.is.dao.persistence.verifier.group.GroupExistanceVerifierChainLink;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.user.User;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GroupExistanceVerifierChainLinkTest {

	@Mock
	private VerifierChainLink<? super Object> nextVerifier;
	
	@Mock
	private SessionService sessionService;
	
	@InjectMocks
	private GroupExistanceVerifierChainLink<Department> unit;
	
	@Test(expected = NoGroupForUserException.class)
	public void testVerifyLink() throws Exception {
		// Given
		Department resource = null;
		List<String> groups = Collections.emptyList();

		String login = "developers";
		User user = new User();
		user.setLogin(login);

		// When
		when(sessionService.getGroups()).thenReturn(groups);
		when(sessionService.getUser()).thenReturn(user);
		unit.verify(resource);

		// Then
		verify(sessionService).getGroups();
		verify(sessionService).getUser();
	}
	
	@Test
	public void testVerifyLinkWithoutException() throws Exception {
		// Given
		Department resource = null;
		String group1 = "group1";
		List<String> groups = Arrays.asList(group1 );
		
		String login = "developers";
		User user = new User();
		user.setLogin(login);
		
		// When
		when(sessionService.getGroups()).thenReturn(groups);
		when(sessionService.getUser()).thenReturn(user);
		unit.verify(resource);
		
		// Then
		verify(nextVerifier).verify(any());
		verify(sessionService).getGroups();
		verify(sessionService).getUser();
	}
	
	@Test
	public void testVerifyLinkWithoutExceptionWithNullNextVerifier() throws Exception {
		// Given
		unit.setNextVerifier(null);
		Department resource = null;
		String group1 = "group1";
		List<String> groups = Arrays.asList(group1 );
		
		String login = "developers";
		User user = new User();
		user.setLogin(login);
		
		// When
		when(sessionService.getGroups()).thenReturn(groups);
		when(sessionService.getUser()).thenReturn(user);
		unit.verify(resource);
		
		// Then
		verify(nextVerifier, times(0)).verify(any());
		verify(sessionService).getGroups();
		verify(sessionService).getUser();
	}
}
