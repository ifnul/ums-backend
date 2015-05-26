package org.is.lnu.edbo.service.date;

import static org.junit.Assert.assertNotNull;

import org.is.lnu.edbo.service.date.DefaultActualDateService;
import org.junit.Test;

public class DefaultActualDateServiceTest {

	private DefaultActualDateService unit = new DefaultActualDateService();
	
	@Test
	public void testGetActualDate() throws Exception {
		String actual = unit.getActualDate();
		assertNotNull(actual);
	}
}
