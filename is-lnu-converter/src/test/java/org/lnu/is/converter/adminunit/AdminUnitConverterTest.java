package org.lnu.is.converter.adminunit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.domain.adminunit.type.AdminUnitType;
import org.lnu.is.resource.adminunit.AdminUnitResource;

public class AdminUnitConverterTest {

	private AdminUnitConverter unit = new AdminUnitConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long parentId = 2L;
		AdminUnit parent = new AdminUnit();
		parent.setId(parentId);

		Long adminUnitTypeId = 3L;
		AdminUnitType adminUnitType = new AdminUnitType();
		adminUnitType.setId(adminUnitTypeId);

		Date begDate = new Date();
		Date endDate = new Date();
		Long id = 1L;
		String identifier = "identifier";
		String identifier1 = "identifier1";
		String identifier2 = "identifier2";
		String identifier3 = "identifier3";
		String name = "name1";

		AdminUnit source = new AdminUnit();
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		source.setId(id);
		source.setIdentifier(identifier);
		source.setIdentifier1(identifier1);
		source.setIdentifier2(identifier2);
		source.setIdentifier3(identifier3);
		source.setName(name);
		
		source.setParent(parent);
		source.setAdminUnitType(adminUnitType);

		AdminUnitResource expected = new AdminUnitResource();
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		expected.setId(id);
		expected.setIdentifier(identifier);
		expected.setIdentifier1(identifier1);
		expected.setIdentifier2(identifier2);
		expected.setIdentifier3(identifier3);
		expected.setName(name);

		expected.setParentId(parentId);
		expected.setAdminUnitTypeId(adminUnitTypeId);

		// When
		AdminUnitResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long parentId = 2L;
		AdminUnit parent = new AdminUnit();
		parent.setId(parentId);
		
		Long adminUnitTypeId = 3L;
		AdminUnitType adminUnitType = new AdminUnitType();
		adminUnitType.setId(adminUnitTypeId);
		
		Date begDate = new Date();
		Date endDate = new Date();
		Long id = 1L;
		String identifier = "identifier";
		String identifier1 = "identifier1";
		String identifier2 = "identifier2";
		String identifier3 = "identifier3";
		String name = "name1";
		
		AdminUnit source = new AdminUnit();
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		source.setId(id);
		source.setIdentifier(identifier);
		source.setIdentifier1(identifier1);
		source.setIdentifier2(identifier2);
		source.setIdentifier3(identifier3);
		source.setName(name);
		
		source.setParent(parent);
		source.setAdminUnitType(adminUnitType);
		
		List<AdminUnit> sources = Arrays.asList(source);
		
		AdminUnitResource expected = new AdminUnitResource();
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		expected.setId(id);
		expected.setIdentifier(identifier);
		expected.setIdentifier1(identifier1);
		expected.setIdentifier2(identifier2);
		expected.setIdentifier3(identifier3);
		expected.setName(name);
		
		List<AdminUnitResource> expecteds = Arrays.asList(expected);
		
		expected.setParentId(parentId);
		expected.setAdminUnitTypeId(adminUnitTypeId);
		
		// When
		List<AdminUnitResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
