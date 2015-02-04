package org.lnu.is.dao.builder.person.contact;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.contacttype.ContactType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.contact.PersonContact;


public class PersonContactQueryBuilderTest {

	private PersonContactQueryBuilder unit = new PersonContactQueryBuilder();
	
	private Boolean active = true;
	private Boolean security = true;
	
	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);
	}

	@Test
	public void testBuild() throws Exception {
		// Given
		PersonContact context = new PersonContact();

		String expectedQuery = "SELECT e FROM PersonContact e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		PersonContact context = new PersonContact();
		
		String expectedQuery = "SELECT e FROM PersonContact e WHERE e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		PersonContact context = new PersonContact();
		
		String expectedQuery = "SELECT e FROM PersonContact e WHERE e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		PersonContact context = new PersonContact();
		
		String expectedQuery = "SELECT e FROM PersonContact e ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		
		Person person = new Person();
		ContactType addressType = new ContactType();
		String value = "fasd";
		
		PersonContact context = new PersonContact();
		context.setPerson(person);
		context.setContactType(addressType);
		context.setValue(value);
		
		String expectedQuery = "SELECT e FROM PersonContact e WHERE ( e.person = :person OR e.contactType = :addressType OR e.value LIKE CONCAT('%',:value,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Person person = new Person();
		ContactType addressType = new ContactType();
		String value = "fasd";
		
		PersonContact context = new PersonContact();
		context.setPerson(person);;
		context.setContactType(addressType);
		context.setValue(value);
		
		String expectedQuery = "SELECT e FROM PersonContact e WHERE ( e.person = :person OR e.contactType = :addressType OR e.value LIKE CONCAT('%',:value,'%') ) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
}
