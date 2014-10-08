package org.lnu.is.facade.facade.specoffer;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resources.specoffer.SpecOfferResource;
import org.lnu.is.service.specoffer.SpecOfferService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultSpecOfferFacadeTest {

	@Mock
	private Converter<SpecOfferResource, SpecOffer> specOfferResourceConverter;
	
	@Mock
	private Converter<SpecOffer, SpecOfferResource> specOfferConverter;
	
	@Mock
	private SpecOfferService specOfferService;
	
	@InjectMocks
	private DefaultSpecOfferFacade unit;
	
	@Test
	public void testCreateSpecOffer() throws Exception {
		// Given
    	String note = "Note";
    	Integer licCount = 24;
    	Long eduFormTypeId = 1L;
    	String docNum = "docNum";
    	Long departmentId = 23L;
    	
    	SpecOfferResource specOfferResource = new SpecOfferResource();
    	specOfferResource.setBegDate(new Date());
    	specOfferResource.setEndDate(new Date());
		specOfferResource.setDepartmentId(departmentId);
		specOfferResource.setDocNum(docNum);
		specOfferResource.setEduFormTypeId(eduFormTypeId);
		specOfferResource.setLicCount(licCount);
		specOfferResource.setNote(note);

		SpecOfferResource expected = new SpecOfferResource();
    	expected.setBegDate(new Date());
    	expected.setEndDate(new Date());
		expected.setDepartmentId(departmentId);
		expected.setDocNum(docNum);
		expected.setEduFormTypeId(eduFormTypeId);
		expected.setLicCount(licCount);
		expected.setNote(note);
		
		SpecOffer specOffer = new SpecOffer();
		
		// When
		when(specOfferResourceConverter.convert(any(SpecOfferResource.class))).thenReturn(specOffer);
		when(specOfferConverter.convert(any(SpecOffer.class))).thenReturn(specOfferResource);
		
		SpecOfferResource actual = unit.createSpecOffer(specOfferResource);

		// Then
		verify(specOfferResourceConverter).convert(specOfferResource);
		verify(specOfferService).createSpecOffer(specOffer);
		
		assertEquals(expected, actual);
	}
}
