package org.lnu.is.dao.builder.addresstype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.addresstype.AddressType;

public class AddressTypeQueryBuilderTest {

	private AddressTypeQueryBuilder unit = new AddressTypeQueryBuilder();

	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "AN";

		AddressType context = new AddressType();
		context.setAbbrName(abbrName);

		String expectedQuery = "SELECT a FROM AddressType a WHERE a.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
