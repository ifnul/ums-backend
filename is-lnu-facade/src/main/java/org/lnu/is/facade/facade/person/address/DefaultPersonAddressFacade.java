package org.lnu.is.facade.facade.person.address;

import java.text.MessageFormat;
import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.person.PersonAddress;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.facade.BaseFacade;
import org.lnu.is.facade.resource.person.address.PersonAddressResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.person.address.PersonAddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * Default person address facade.
 * 
 * @author ivanursul
 *
 */
@Transactional
@Facade("personAddressFacade")
public class DefaultPersonAddressFacade extends BaseFacade<PersonAddressResource, PersonAddress> implements PersonAddressFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultPersonAddressFacade.class);
	
	@Resource(name = "personAddressResourceConverter")
	private Converter<PersonAddressResource, PersonAddress> resourceConverter;

	@Resource(name = "personAddressConverter")
	private Converter<PersonAddress, PersonAddressResource> entityConverter;
	
	@Resource(name = "personAddressService")
	private PersonAddressService service;
	
	@Override
	public PersonAddressResource createAddress(final PersonAddressResource resource) {
		LOG.info("Creating person address, {}", resource);
		
		PersonAddress address = new PersonAddress();
		
		resourceConverter.convert(resource, address);
		insertConverter.convert(resource, address);
		service.createAddress(address);
		
		return entityConverter.convert(address);
	}

	@Override
	public void updateAddress(final Long addressId, final PersonAddressResource resource) {
		LOG.info("Updating person address resource({}): {}", addressId, resource);
		
		PersonAddress address = service.getAddress(addressId);
		resourceConverter.convert(resource, address);
		service.updateAddress(address);
	}

	@Override
	public PersonAddressResource getAddress(final Long addressId) {
		LOG.info("Getting person address({})", addressId);
		
		PersonAddress address = service.getAddress(addressId);
		return entityConverter.convert(address);
	}

	@Override
	public PagedResultResource<PersonAddressResource> getAddresses(final PagedRequest<PersonAddressResource> request) {
		LOG.info("Get person papers by paged request: {}", request);

		PagedSearch<PersonAddress> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(resourceConverter.convert(request.getResource()));

		PagedResult<PersonAddress> pagedResult = service.getAddresses(pagedSearch);

		List<PersonAddressResource> resources = entityConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<PersonAddressResource> pagedResultResource = new PagedResultResource<>(MessageFormat.format("/persons/{0}/addresses", request.getResource().getPersonId()));
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}

	@Override
	public void deleteAddress(final Long addressId) {
		PersonAddress address = service.getAddress(addressId);
		service.deleteAddress(address);
	}

}
