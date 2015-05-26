package org.lnu.is.dao.dao.user;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.persistence.PersistenceManager;
import org.lnu.is.domain.user.User;
import org.lnu.is.queries.Query;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultUserDaoTest {

	@Mock
	private PersistenceManager<User, Long> persistenceManager;
	
	@InjectMocks
	private DefaultUserDao unit;
	
	@Test
	public void testGetUserByLogin() throws Exception {
		// Given
		String login = "login";
		
		User expected = new User();
		expected.setLogin(login);
		String querySql = "SELECT u FROM User u WHERE u.login=:login";
		Map<String, Object> parameters = Collections.<String, Object>singletonMap("login", login);
		
		Query<User> query = new Query<User>(User.class, querySql, parameters);
		// When
		when(persistenceManager.getSingleResult(Matchers.<Query<User>>any())).thenReturn(expected);
		User actual = unit.getUserByLogin(login);

		// Then
		verify(persistenceManager).getSingleResult(query);
		assertEquals(expected, actual);
	}
}
