package org.lnu.is.populator.edbo.person;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.is.lnu.edbo.resource.person.EdboPersonResource;
import org.junit.Test;

import ua.edboservice.ArrayOfDPersonsFind;
import ua.edboservice.DPersonsFind;

public class ArrayOfDPersonFindResourceConverterTest {

	private ArrayOfDPersonFindResourceConverter unit = new ArrayOfDPersonFindResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		DPersonsFind dpersonFind1 = new DPersonsFind();
		List<DPersonsFind> dPersonsFind = Arrays.asList(dpersonFind1);
		ArrayOfDPersonsFind source = new ArrayOfDPersonsFind();
		source.setdPersonsFind(dPersonsFind);
		
		EdboPersonResource expected1 = new EdboPersonResource();
		List<EdboPersonResource> expected = Arrays.asList(expected1);
		
		// When
		List<EdboPersonResource> actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
