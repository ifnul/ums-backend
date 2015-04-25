package org.lnu.is.facade.facade.broadcasting;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.converter.Converter;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.broadcasting.BroadcastingMessage;
import org.lnu.is.mailing.exception.MailException;
import org.lnu.is.mailing.model.Email;
import org.lnu.is.mailing.service.MailService;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.resource.broadcasting.BroadcastingMessageResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.service.DefaultService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BroadcastingFacadeTest {
	
	@Mock
	private Converter<BroadcastingMessageResource, BroadcastingMessage> insertConverter;

	@Mock
	private Converter<BroadcastingMessageResource, BroadcastingMessage> updateConverter;

	@Mock
	private Converter<BroadcastingMessageResource, BroadcastingMessage> resourceConverter;

	@Mock
	private Converter<BroadcastingMessage, BroadcastingMessageResource> entityConverter;

	@Mock
	private DefaultService<BroadcastingMessage, BroadcastingMessage, Long, Dao<BroadcastingMessage, BroadcastingMessage, Long>> service;

	@Mock
	private Converter<PagedRequest<BroadcastingMessageResource>, MultiplePagedSearch<BroadcastingMessage>> pagedRequestConverter;

	@Mock
	private Converter<BroadcastingMessage, BroadcastingMessageResource> entityDetailsConverter;
	
	@Mock
	private Converter<PagedResult<BroadcastingMessage>, PagedResultResource<BroadcastingMessageResource>> pagedResultConverter;

	@Mock
	private Converter<BroadcastingMessageResource, Email> broadcastResourceEmailConverter;
	
	@Mock
	private Converter<Email, BroadcastingMessageResource> emailBroadcastingConverter;

	@Mock
	private Converter<BroadcastingMessageResource, BroadcastingMessageResource> broadcastingConverter;
	
	@Mock
	private MailService<Email> mailService;
	
	@InjectMocks
	private BroadcastingFacade unit;
	
	@Before
	public void setup() {
		unit.setEntityConverter(entityConverter);
		unit.setEntityDetailsConverter(entityDetailsConverter);
		unit.setInsertConverter(insertConverter);
		unit.setPagedRequestConverter(pagedRequestConverter);
		unit.setPagedResultConverter(pagedResultConverter);
		unit.setResourceConverter(resourceConverter);
		unit.setService(service);
		unit.setUpdateConverter(updateConverter);
		unit.setMailService(mailService);
		unit.setBroadcastResourceEmailConverter(broadcastResourceEmailConverter);
	}
	
	@Test
	public void testCreateEntity() throws Exception {
		// Given
		BroadcastingMessageResource expected = new BroadcastingMessageResource();
		BroadcastingMessage broadcastingMessage = new BroadcastingMessage();
		Email email = new Email();

		// When
		when(resourceConverter.convert(any(BroadcastingMessageResource.class))).thenReturn(broadcastingMessage);
		when(entityConverter.convert(any(BroadcastingMessage.class))).thenReturn(expected);
		when(broadcastResourceEmailConverter.convert(any(BroadcastingMessageResource.class))).thenReturn(email);
		BroadcastingMessageResource actual = unit.createResource(expected);

		// Then
		verify(emailBroadcastingConverter).convert(any(Email.class), any(BroadcastingMessageResource.class));
		verify(broadcastingConverter).convert(any(BroadcastingMessageResource.class), any(BroadcastingMessageResource.class));
		verify(mailService).send(email);
		
		assertEquals(expected, actual);
	}

	@Test(expected = MailException.class)
	public void testCreateEntityWithException() throws Exception {
		// Given
		BroadcastingMessageResource expected = new BroadcastingMessageResource();
		Email email = new Email();
		
		// When
		when(broadcastResourceEmailConverter.convert(any(BroadcastingMessageResource.class))).thenReturn(email);
		doThrow(MailException.class).when(mailService).send(email);
		
		BroadcastingMessageResource actual = unit.createResource(expected);
		
		// Then
		verify(broadcastResourceEmailConverter).convert(expected);
		verify(mailService).send(email);
		
		assertEquals(expected, actual);
	}

}
