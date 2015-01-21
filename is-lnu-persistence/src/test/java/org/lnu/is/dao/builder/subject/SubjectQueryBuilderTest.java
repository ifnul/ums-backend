package org.lnu.is.dao.builder.subject;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.subject.Subject;
import org.lnu.is.domain.subject.SubjectType;

public class SubjectQueryBuilderTest {

	private SubjectQueryBuilder unit = new SubjectQueryBuilder();
	
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
		Subject context = new Subject();
		
		String expectedQuery = "SELECT e FROM Subject e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		Subject context = new Subject();
		
		String expectedQuery = "SELECT e FROM Subject e WHERE e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		Subject context = new Subject();
		
		String expectedQuery = "SELECT e FROM Subject e WHERE e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraints() throws Exception {
		// Given
		Subject context = new Subject();
		
		String expectedQuery = "SELECT e FROM Subject e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		Long subjectTypeId = 1L;
		SubjectType subjectType = new SubjectType();
		subjectType.setId(subjectTypeId);
		String name = "name";
		Subject context = new Subject();
		context.setName(name);
		context.setSubjectType(subjectType);

		String expectedQuery = "SELECT e FROM Subject e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.subjectType = :subjectType ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Long subjectTypeId = 1L;
		SubjectType subjectType = new SubjectType();
		subjectType.setId(subjectTypeId);
		String name = "name";
		Subject context = new Subject();
		context.setName(name);
		context.setSubjectType(subjectType);
		
		String expectedQuery = "SELECT e FROM Subject e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.subjectType = :subjectType ) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
