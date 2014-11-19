package org.lnu.is.service.person.paper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.person.paper.PersonPaperDao;
import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.service.person.paper.DefaultPersonPaperService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultPersonPaperServiceTest {

	@Mock
	private ParametersExtractor<PersonPaper> parametersExtractor;
	
	@Mock
	private PersonPaperDao personPaperDao;
	
	@InjectMocks
	private DefaultPersonPaperService unit;
	
	@Test
	public void test() throws Exception {
		// Given

		// When

		// Then
		assertEquals(true, true);
	}
}
