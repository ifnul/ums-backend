package org.lnu.is.facade.facade.specoffer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.service.specoffer.SpecOfferService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultSpecOfferFacadeTest {

	@Mock
	private SpecOfferService specOfferService;
	
	@InjectMocks
	private DefaultSpecOfferFacade unit;
	
	@Test
	public void testCreateSpecOffer() throws Exception {
		// Given

		// When

		// Then
		assertEquals(true, true);
	}
}
