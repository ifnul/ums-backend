package org.lnu.is.dao.builder.addresstype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.addresstype.AddressType;

public class AddressTypeQueryBuilderTest {

	private AddressTypeQueryBuilder unit = new AddressTypeQueryBuilder();

	@Test
	public void testBuild() throws Exception {
		// Given
		AddressType context = new AddressType();
		
		String expectedQuery = "SELECT e FROM AddressType e ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "AN";
		String name = "name";

		AddressType context = new AddressType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expectedQuery = "SELECT e FROM AddressType e WHERE e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
