package org.lnu.is.dao.builder.adminunit;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.domain.adminunit.type.AdminUnitType;

public class AdminUnitQueryBuilderTest {

	private AdminUnitQueryBuilder unit = new AdminUnitQueryBuilder();
	
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
		AdminUnit context = new AdminUnit();
		
		String expected = "SELECT e FROM AdminUnit e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testBuildWithFullEntity() throws Exception {
		// Given
		AdminUnit parent = new AdminUnit();
		AdminUnitType adminUnitType = new AdminUnitType();
		String identifier = "identifgier";
		String identifier1 = "identifier1";
		String identifier2 = "identifeir12";
		String identifier3 = "identifier3";
		String name = "ndasdsa";
		Date begDate = new Date();
		Date endDate = new Date();
		
		AdminUnit context = new AdminUnit();
		context.setAdminUnitType(adminUnitType);
		context.setParent(parent);
		context.setIdentifier(identifier);
		context.setIdentifier1(identifier1);
		context.setIdentifier2(identifier2);
		context.setIdentifier3(identifier3);
		context.setName(name);
		context.setBegDate(begDate);
		context.setEndDate(endDate);
		
		
		String expected = "SELECT e FROM AdminUnit e WHERE ( e.adminUnitType = :adminUnitTypeOR e.parent = :parent OR e.identifier LIKE CONCAT('%',:identifier,'%') OR e.identifier1 LIKE CONCAT('%',:identifier1,'%') OR e.identifier2 LIKE CONCAT('%',:identifier2,'%') OR e.identifier3 LIKE CONCAT('%',:identifier3,'%') OR e.name LIKE CONCAT('%',:name,'%') OR e.begDate <= :begDate OR e.endDate >= :endDate ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
}
