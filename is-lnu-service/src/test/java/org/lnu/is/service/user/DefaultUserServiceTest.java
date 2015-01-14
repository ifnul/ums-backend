package org.lnu.is.service.user;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.user.UserDao;
import org.lnu.is.domain.user.User;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultUserServiceTest {

	@Mock
	private UserDao dao;
	
	@InjectMocks
	private DefaultUserService unit;
	
	@Test
	public void testUserByLogin() throws Exception {
		// Given
		String login = "login";

		User expected = new User();
		expected.setLogin(login);
		
		// When
		when(dao.getUserByLogin(anyString())).thenReturn(expected);
		User actual = unit.getUserByLogin(login);

		// Then
		verify(dao).getUserByLogin(login);
		assertEquals(expected, actual);
	}
}
