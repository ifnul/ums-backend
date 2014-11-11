package org.lnu.is.web.controller.enrolmentsubject;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.enrolmentsubject.EnrolmentSubjectFacade;
import org.lnu.is.facade.resource.enrolmentsubject.EnrolmentSubjectResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.controller.AbstractControllerTest;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class EnrolmentSubjectControllerTest extends AbstractControllerTest {

	@Mock
	private EnrolmentSubjectFacade enrolmentSubjectFacade;
	
	@InjectMocks
	private EnrolmentSubjectController unit;
	
    private MockMvc mockMvc;

    @Before
    public void setup() {
    	  this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
    }
    
    @Test
	public void testGetEnrolmentSubjects() throws Exception {
		// Given
    	String name = "Ua lan";
    	String abbrName = "ua";
		EnrolmentSubjectResource resource = new EnrolmentSubjectResource();
		resource.setAbbrName(abbrName);
		resource.setName(name);
		
		List<EnrolmentSubjectResource> entities = Arrays.asList(resource);


		Integer offset = 0;
		long count = 1;
		Integer limit = 38;
		PagedResultResource<EnrolmentSubjectResource> expected = new PagedResultResource<>("/enrolmentsubjects");
		expected.setEntities(entities);
		expected.setCount(count);
		expected.setLimit(limit);
		expected.setOffset(offset);

		EnrolmentSubjectResource paramResource = new EnrolmentSubjectResource();
		paramResource.setName(name);
		PagedRequest<EnrolmentSubjectResource> request = new PagedRequest<EnrolmentSubjectResource>(paramResource, offset, limit);
		
		// When
		when(enrolmentSubjectFacade.getEnrolmentSubjects(Matchers.<PagedRequest<EnrolmentSubjectResource>>any())).thenReturn(expected);
    	String response = getJson(expected, false);

		// Then
    	mockMvc.perform(get("/enrolmentsubjects")
    			.param("name", name))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(enrolmentSubjectFacade).getEnrolmentSubjects(request);
	}
}
