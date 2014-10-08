package org.lnu.is.service.specoffer;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.SpecOfferDao;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultSpecOfferServiceTest {

	@Mock
	private SpecOfferDao specOfferDao;
	
	@InjectMocks
	private DefaultSpecOfferService unit;
	
	@Test
	public void testCreateSpecOffer() throws Exception {
		// Given
		SpecOffer specOffer = new SpecOffer();

		// When
		unit.createSpecOffer(specOffer);
		
		// Then
		verify(specOfferDao).save(specOffer);
	}
}
