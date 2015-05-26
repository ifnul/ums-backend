package org.lnu.is.security;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.role.Role;
import org.lnu.is.domain.session.Session;
import org.lnu.is.domain.user.User;
import org.lnu.is.domain.user.group.UserGroup;
import org.lnu.is.domain.user.role.UserRole;
import org.lnu.is.service.user.UserService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

@RunWith(MockitoJUnitRunner.class)
public class DefaultAuthenticationProviderTest {

	@Mock
    private UserService userService;
    
	@Mock
	private Authentication authentication;

	@InjectMocks
	private DefaultAuthenticationProvider unit;
	
	@Test
	public void testSupports() throws Exception {
		// Given
		boolean expected = true;
		
		// When
		boolean actual = unit.supports(UsernamePasswordAuthenticationToken.class);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAuthentificate() throws Exception {
		// Given
		String login = "login";
		String password = "password";
		String roleCode1 = "ROLE_ADMIN";
		
		Role role = new Role();
		role.setTitle(roleCode1);
		UserRole userRole1 = new UserRole();
		userRole1.setRole(role);
		List<UserRole> roles = Arrays.asList(userRole1);

		List<UserGroup> userGroups = Collections.emptyList();

		User user = new User();
		user.setLogin(login);
		user.setPassword(password);
		user.setUserRoles(roles);
		user.setUserGroups(userGroups);
		
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(roleCode1));

		Session session = new Session();
		session.setUser(user);
        
        UsernamePasswordAuthenticationToken expected = new UsernamePasswordAuthenticationToken(login, password, authorities);
        expected.setDetails(session);
        
		// When
		when(authentication.getName()).thenReturn(login);
		when(authentication.getCredentials()).thenReturn(password);
		
		when(userService.getUserByLogin(anyString())).thenReturn(user);
		Authentication actual = unit.authenticate(authentication);

		// Then
		verify(userService).getUserByLogin(login);
		verify(authentication).getName();
		verify(authentication).getCredentials();
		assertEquals(expected, actual);
	}

	@Test(expected = BadCredentialsException.class)
	public void testAuthentificateWithException() throws Exception {
		// Given
		String login = "login";
		String credentials = "password";
		User user = new User();
		user.setLogin(login);
		user.setPassword(credentials);
		
		// When
		when(authentication.getName()).thenReturn(login);
		when(authentication.getCredentials()).thenReturn(credentials);
		
		when(userService.getUserByLogin(anyString())).thenThrow(new BadCredentialsException(""));
		unit.authenticate(authentication);
	}
}
