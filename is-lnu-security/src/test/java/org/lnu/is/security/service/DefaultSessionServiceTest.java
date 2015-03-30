package org.lnu.is.security.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.group.Group;
import org.lnu.is.domain.session.Session;
import org.lnu.is.domain.user.User;
import org.lnu.is.domain.user.group.UserGroup;
import org.lnu.is.security.exception.AccessDeniedException;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

@RunWith(MockitoJUnitRunner.class)
public class DefaultSessionServiceTest {

	@InjectMocks
	private DefaultSessionService unit;
	
	@Mock
	private SecurityContext context;

	@Mock
	private Authentication authentification;
	
	@Before
	public void setup() {
		SecurityContextHolder.setContext(context);
	}
	
	@Test
	public void testGetUser() throws Exception {
		// Given
		User expected = new User();
		Session session = new Session();
		session.setUser(expected);

		// When
		when(context.getAuthentication()).thenReturn(authentification);
		when(authentification.getDetails()).thenReturn(session);
		
		User actual = unit.getUser();
		
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testGetGroups() throws Exception {
		// Given
		String groupTitle1 = "developers";
		Group group1 = new Group();
		group1.setTitle(groupTitle1);

		String groupTitle2 = "users";
		Group group2 = new Group();
		group2.setTitle(groupTitle2);
		
		List<Group> groups = Arrays.asList(group1, group2);
		User user = new User();
		user.setGroups(groups);
		Session session = new Session();
		session.setUser(user);

		List<String> expected = Arrays.asList(groupTitle1, groupTitle2);
		
		// When
		when(context.getAuthentication()).thenReturn(authentification);
		when(authentification.getDetails()).thenReturn(session);
		
		List<String> actual = unit.getGroups();
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetRoles() throws Exception {
		// Given
		String role1 = "ROLE_ADMIN";
		String role2 = "ROLE_USER";
		List<String> expected = Arrays.asList(role1, role2);
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(role1));
		authorities.add(new SimpleGrantedAuthority(role2));
		
		// When
		when(context.getAuthentication()).thenReturn(authentification);
		doReturn(authorities).when(authentification).getAuthorities();
		
		List<String> actual = unit.getRoles();

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRolesWithEmptyAuthorities() throws Exception {
		// Given
		List<String> expected = Collections.emptyList();
		Collection<GrantedAuthority> authorities = Collections.emptyList();
		
		// When
		when(context.getAuthentication()).thenReturn(authentification);
		doReturn(authorities).when(authentification).getAuthorities();
		
		List<String> actual = unit.getRoles();
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetDefaultGroup() throws Exception {
		// Given
		String groupTitle1 = "developers";
		Group group1 = new Group();
		group1.setTitle(groupTitle1);

		String groupTitle2 = "users";
		Group group2 = new Group();
		group2.setTitle(groupTitle2);
		
		UserGroup userGroup1 = new UserGroup();
		userGroup1.setGroup(group1);
		userGroup1.setMajor(true);
		
		UserGroup userGroups2 = new UserGroup();
		userGroups2.setGroup(group2);
		userGroups2.setMajor(false);
		
		List<Group> groups = Arrays.asList(group1, group2);
		List<UserGroup> userGroups = Arrays.asList(userGroup1, userGroups2);

		User user = new User();
		user.setGroups(groups);
		user.setUserGroups(userGroups);
		Session session = new Session();
		session.setUser(user);

		// When
		when(context.getAuthentication()).thenReturn(authentification);
		when(authentification.getDetails()).thenReturn(session);
		Group actaul = unit.getDefaultGroup();

		// Then
		verify(context).getAuthentication();
		verify(authentification).getDetails();
		
		assertEquals(group1, actaul);
	}
	
	@Test
	public void testGetDefaulGroupWithEmptyUserGroups() throws Exception {
		// Given
		List<UserGroup> userGroups = Collections.emptyList();
		
		User user = new User();
		user.setUserGroups(userGroups);
		Session session = new Session();
		session.setUser(user);
		
		// When
		when(context.getAuthentication()).thenReturn(authentification);
		when(authentification.getDetails()).thenReturn(session);
		Group actaul = unit.getDefaultGroup();
		
		// Then
		verify(context).getAuthentication();
		verify(authentification).getDetails();
		
		assertEquals(null, actaul);
	}

	@Test
	public void testVerifyGroup() throws Exception {
		// Given
		String title = "developers";
		Group group1 = new Group();
		group1.setTitle(title);
		
		String groupTitle2 = "users";
		Group group2 = new Group();
		group2.setTitle(groupTitle2);
		
		List<Group> groups = Arrays.asList(group1, group2);
		User user = new User();
		user.setGroups(groups);
		Session session = new Session();
		session.setUser(user);
		
		// When
		when(context.getAuthentication()).thenReturn(authentification);
		when(authentification.getDetails()).thenReturn(session);
		
		unit.verifyGroup(title);
		
		// Then
		verify(context).getAuthentication();
		verify(authentification).getDetails();
	}
	
	@Test(expected = AccessDeniedException.class)
	public void testVerifyGroupWithException() throws Exception {
		// Given
		String title = "developers";
		
		String groupTitle2 = "users";
		Group group2 = new Group();
		group2.setTitle(groupTitle2);
		
		List<Group> groups = Arrays.asList(group2);
		User user = new User();
		user.setGroups(groups);
		Session session = new Session();
		session.setUser(user);
		
		// When
		when(context.getAuthentication()).thenReturn(authentification);
		when(authentification.getDetails()).thenReturn(session);
		
		unit.verifyGroup(title);

		// Then
		verify(context).getAuthentication();
		verify(authentification).getDetails();
	}
	
}
