package org.lnu.is.converter.session;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.group.Group;
import org.lnu.is.domain.role.Role;
import org.lnu.is.domain.session.Session;
import org.lnu.is.domain.user.User;
import org.lnu.is.resource.session.SessionResource;

public class SessionConverterTest {

	private SessionConverter unit = new SessionConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String group1Title = "group1";
		String group2Title = "group2";
		
		Group group1 = new Group();
		group1.setTitle(group1Title);
		Group group2 = new Group();
		group2.setTitle(group2Title);
		Role role1 = new Role();

		String role1String = "role1";
		role1.setTitle(role1String);

		String role2String = "role2";
		Role role2 = new Role();
		role2.setTitle(role2String);
		
		String login = "login";
		User user = new User();
		user.setLogin(login);

		Session session = new Session();
		session.setUser(user);
		session.setGroups(Arrays.asList(group1, group2));
		session.setRoles(Arrays.asList(role1, role2));
		
		List<String> groupStrings = Arrays.asList(group1Title, group2Title);
		List<String> roleStrings = Arrays.asList(role1String,role2String);

		SessionResource expected = new SessionResource();
		expected.setLogin(login);
		expected.setGroups(groupStrings);
		expected.setRoles(roleStrings);
		
		// When
		SessionResource actual = unit.convert(session);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		
		String login = "login";
		User user = new User();
		user.setLogin(login);

		Session session = new Session();
		session.setUser(user);
		session.setGroups(Collections.<Group>emptyList());
		session.setRoles(Collections.<Role>emptyList());
		
		List<String> groupStrings = Arrays.asList();
		List<String> roleStrings = Arrays.asList();

		SessionResource expected = new SessionResource();
		expected.setLogin(login);
		expected.setGroups(groupStrings);
		expected.setRoles(roleStrings);
		
		Session session1 = new Session();
		session1.setName(null);
		session1.setGroups(Collections.<Group>emptyList());
		session1.setRoles(Collections.<Role>emptyList());
		
		SessionResource expected1 = new SessionResource();
		expected1.setLogin(null);
		expected1.setGroups(groupStrings);
		expected1.setRoles(roleStrings);
		
		
		List<Session> sessions = Arrays.asList(session,session1);
		List<SessionResource> expecteds = Arrays.asList(expected,expected1);
		// When
		List<SessionResource> actual = unit.convertAll(sessions);

		// Then
		assertEquals(expecteds, actual);
	}
}
