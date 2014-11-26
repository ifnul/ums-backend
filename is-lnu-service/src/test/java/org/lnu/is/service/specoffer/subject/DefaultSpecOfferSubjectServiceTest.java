package org.lnu.is.service.specoffer.subject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.specoffer.subject.SpecOfferSubjectDao;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultSpecOfferSubjectServiceTest {

	@Mock
	private SpecOfferSubjectDao specOfferSubjectDao;
	
	@InjectMocks
	private DefaultSpecOfferSubjectService unit;
	
    @Test
	public void test() throws Exception {
		// Given

		// When

		// Then
    	assertEquals(true, true);
	}
}
