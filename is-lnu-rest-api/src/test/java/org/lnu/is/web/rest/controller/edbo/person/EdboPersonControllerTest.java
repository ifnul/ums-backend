package org.lnu.is.web.rest.controller.edbo.person;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.is.lnu.edbo.resource.person.EdboPersonFindRequest;
import org.is.lnu.edbo.resource.person.EdboPersonResource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.edbo.person.EdboPersonFacade;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EdboPersonControllerTest extends AbstractControllerTest {

	@Mock
	private EdboPersonFacade facade;

	@InjectMocks
	private EdboPersonController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}
	
	@Test
	public void testGetPersons() throws Exception {
		// Given
		String fioMask = "person1 surname";
	    String documentSeries = "DS";
	    String documentNumber = "DN";
	    String idsDocumentTypes = "12412";
	    Integer hundred = 100;
	    String personCodeU = "1241";
	    String filters = "filters";
	    
	    EdboPersonFindRequest request = new EdboPersonFindRequest();
	    request.setFioMask(fioMask);
	    request.setDocumentNumber(documentNumber);
	    request.setDocumentSeries(documentSeries);
	    request.setIdsDocumentTypes(idsDocumentTypes);
	    request.setHundred(hundred);
	    request.setPersonCodeU(personCodeU);
	    request.setFilters(filters);
	    
	    String father = "father";
	    EdboPersonResource resource1 = new EdboPersonResource();
		resource1.setFather(father);
	    
	    List<EdboPersonResource> expected = Arrays.asList(resource1);
	    String response = getJson(expected);
	    
	    // When
	    when(facade.findPersons(any(EdboPersonFindRequest.class))).thenReturn(expected);

		// Then
		mockMvc.perform(get("/edbo/persons")
				.param("fioMask", fioMask)
				.param("documentSeries", documentSeries)
				.param("documentNumber", documentNumber)
				.param("idsDocumentTypes", idsDocumentTypes)
				.param("hundred", String.valueOf(hundred))
				.param("personCodeU", personCodeU)
				.param("filters", filters))
			.andExpect(status().isOk())
			.andExpect(content().string(response));
		
		verify(facade).findPersons(request);
	}
}
