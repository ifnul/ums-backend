package org.lnu.is.dao.persistence.enhancers.user;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.persistence.enhancers.Enhancer;
import org.lnu.is.dao.persistence.enhancers.user.SessionUserEnhancer;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.user.User;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SessionUserEnhancerTest {

	@Mock
	private Enhancer<? super Object> nextEnhancer;
	
	@Mock
	private SessionService sessionService;

	@InjectMocks
	private SessionUserEnhancer<Department> unit;
	
	@Test
	public void testEnhance() throws Exception {
		// Given
		Department entity = new Department();
		String login = "login";
		User user = new User();
		user.setLogin(login);

		// When
		when(sessionService.getUser()).thenReturn(user);
		
		unit.enhance(entity);

		// Then
		verify(nextEnhancer).enhance(any());
		verify(sessionService).getUser();
	}
	
	@Test
	public void testEnhanceWithiytNExtEnhancer() throws Exception {
		// Given
		unit.setNextEnhancer(null);
		Department entity = new Department();
		String login = "login";
		User user = new User();
		user.setLogin(login);
		
		// When
		when(sessionService.getUser()).thenReturn(user);
		
		unit.enhance(entity);
		
		// Then
		verify(nextEnhancer, times(0)).enhance(any());
		verify(sessionService).getUser();
	}
}
