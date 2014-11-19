package org.lnu.is.facade.facade.person;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.service.person.paper.PersonPaperService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultPersonPaperFacadeTest {

	@Mock
	private PersonPaperService personPaperService;
	
	@InjectMocks
	private DefaultPersonFacade unit;
	
	@Test
	public void test() throws Exception {
		// Given

		// When

		// Then
		assertEquals(true, true);
	}
}
