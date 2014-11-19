package org.lnu.is.web.controller.person;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.person.PersonFacade;
import org.lnu.is.facade.facade.person.types.PersonTypeFacade;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.person.PersonResource;
import org.lnu.is.facade.resource.person.type.PersonTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.controller.AbstractControllerTest;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class PersonControllerTest extends AbstractControllerTest {

	@Mock
	private PersonFacade personFacade;
	
	@Mock
	private PersonTypeFacade personTypeFacade;
	
	@InjectMocks
	private PersonController unit;
	
    private MockMvc mockMvc;

    @Before
    public void setup() {
    	  this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
    }
    
    @Test
	public void testCreatePerson() throws Exception {
		// Given
    	String docNum = "docNum";
    	
    	PersonResource personResource = new PersonResource();
    	personResource.setBegDate(new Date());
		personResource.setDocNum(docNum);
		
		// When
    	String request = getJson(personResource, true);
		String response = getJson(personResource, false);
    	
		when(personFacade.createPerson(any(PersonResource.class))).thenReturn(personResource);
		
    	// Then
		mockMvc.perform(post("/persons")
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(personFacade).createPerson(personResource);
	}
    
    @Test
	public void testUpdatePerson() throws Exception {
		// Given
    	Long id = 1L;
    	String docNum = "docNum";
    	
    	PersonResource personResource = new PersonResource();
    	personResource.setId(id);
    	personResource.setBegDate(new Date());
		personResource.setDocNum(docNum);
		
		MessageResource responseResource = new MessageResource(MessageType.INFO, "Person Updated");
		
		// When
    	String request = getJson(personResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/persons/{id}", id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(personFacade).updatePerson(id, personResource);
	}
    
    @Test
	public void testGetSpecoffer() throws Exception {
		// Given
    	Long id = 1L;
    	String docNum = "docNum";
    	
    	PersonResource personResource = new PersonResource();
    	personResource.setId(id);
    	personResource.setBegDate(new Date());
		personResource.setDocNum(docNum);

		// When
		String response = getJson(personResource, false);
		
		when(personFacade.getPerson(anyLong())).thenReturn(personResource);
		
		// Then
    	mockMvc.perform(get("/persons/{id}", id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(personFacade).getPerson(id);
	}
    
    @Test
	public void testDeletePerson() throws Exception {
		// Given
    	Long id = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/persons/{id}", id))
    		.andExpect(status().is(204));
    	
    	verify(personFacade).removePerson(id);
	}
    
    @Test
	public void testGetPersons() throws Exception {
		// Given
    	Long id = 1L;
    	String docNum = "docNum";
    	
    	PersonResource personResource = new PersonResource();
    	personResource.setId(id);
    	personResource.setBegDate(new Date());
		personResource.setDocNum(docNum);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = "/persons";
		List<PersonResource> entities = Arrays.asList(personResource);
    	PagedResultResource<PersonResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		PagedRequest<PersonResource> pagedRequest = new PagedRequest<PersonResource>(new PersonResource(), offset, limit);
		
		// When
		when(personFacade.getPersons(Matchers.<PagedRequest<PersonResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/persons")
    			.param("offset", String.valueOf(offset))
    			.param("limit", String.valueOf(limit)))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(personFacade).getPersons(pagedRequest);
	}
    
    @Test
    public void testGetPersonTypes() throws Exception {
    	// Given
    	Long id = 1L;
    	String abbrName = "abbr name";
    	String name = "name";
    	
    	PersonTypeResource personResource = new PersonTypeResource();
    	personResource.setId(id);
		personResource.setAbbrName(abbrName);
		personResource.setName(name);
    	
    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = "/persons/types";
    	List<PersonTypeResource> entities = Arrays.asList(personResource);
    	PagedResultResource<PersonTypeResource> expectedResource = new PagedResultResource<>();
    	expectedResource.setCount(count);
    	expectedResource.setLimit(limit);
    	expectedResource.setOffset(offset);
    	expectedResource.setUri(uri);
    	expectedResource.setResources(entities);
    	
    	PagedRequest<PersonTypeResource> pagedRequest = new PagedRequest<PersonTypeResource>(new PersonTypeResource(), offset, limit);
    	
    	// When
    	when(personTypeFacade.getPersonTypes(Matchers.<PagedRequest<PersonTypeResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);
    	
    	// Then
    	mockMvc.perform(get("/persons/types")
    			.param("offset", String.valueOf(offset))
    			.param("limit", String.valueOf(limit)))
    			.andExpect(status().isOk())
    			.andExpect(content().string(response));
    	
    	verify(personTypeFacade).getPersonTypes(pagedRequest);
    }
}
