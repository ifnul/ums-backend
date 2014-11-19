package org.lnu.is.web.controller.enrolment;

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
import org.lnu.is.facade.facade.enrolment.statustype.EnrolmentStatusTypeFacade;
import org.lnu.is.facade.facade.enrolment.subject.EnrolmentSubjectFacade;
import org.lnu.is.facade.resource.enrolment.statustype.EnrolmentStatusTypeResource;
import org.lnu.is.facade.resource.enrolment.subject.EnrolmentSubjectResource;
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
public class EnrolmentControllerTest extends AbstractControllerTest {

	@Mock
	private EnrolmentStatusTypeFacade enrolmentStatusTypeFacade;
	
	@Mock
	private EnrolmentSubjectFacade enrolmentSubjectFacade;
	
	@InjectMocks
	private EnrolmentController unit;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
	}

	@Test
	public void testGetEnrolmentStatusTypes() throws Exception {
		// Given
		String name = "name";
		EnrolmentStatusTypeResource resource = new EnrolmentStatusTypeResource();
		resource.setName(name);

		List<EnrolmentStatusTypeResource> entities = Arrays.asList(resource);

		Integer offset = 0;
		long count = 1;
		Integer limit = 38;
		PagedResultResource<EnrolmentStatusTypeResource> expected = new PagedResultResource<>("/enrolmentstatustypes");
		expected.setResources(entities);
		expected.setCount(count);
		expected.setOffset(offset);
		expected.setLimit(limit);

		EnrolmentStatusTypeResource paramResource = new EnrolmentStatusTypeResource();
		paramResource.setName(name);
		PagedRequest<EnrolmentStatusTypeResource> request = 
				new PagedRequest<EnrolmentStatusTypeResource>(paramResource, offset, limit);

		// When
		when(enrolmentStatusTypeFacade.getEnrolmentStatusTypes(Matchers.<PagedRequest<EnrolmentStatusTypeResource>> any()))
			.thenReturn(expected);

		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/enrolments/statustypes").param("name", name))
				.andExpect(status().isOk())
				.andExpect(content().string(response));

		verify(enrolmentStatusTypeFacade).getEnrolmentStatusTypes(request);
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
		PagedResultResource<EnrolmentSubjectResource> expected = new PagedResultResource<>("/enrolments/subjects");
		expected.setResources(entities);
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
    	mockMvc.perform(get("/enrolments/subjects")
    			.param("name", name))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(enrolmentSubjectFacade).getEnrolmentSubjects(request);
	}
}
