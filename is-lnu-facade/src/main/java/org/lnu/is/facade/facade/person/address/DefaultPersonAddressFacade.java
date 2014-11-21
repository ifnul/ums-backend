package org.lnu.is.facade.facade.person.address;

import javax.annotation.Resource;

import org.lnu.is.domain.person.PersonAddress;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.facade.BaseFacade;
import org.lnu.is.facade.resource.person.address.PersonAddressResource;
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
	
	//@Resource(name = "personAddressResourceConverter")
	private Converter<PersonAddressResource, PersonAddress> personAddressResourceConverter;

	//@Resource(name = "personAddressConverter")
	private Converter<PersonAddress, PersonAddressResource> personAddressConverter;
	
	@Resource(name = "personAddressService")
	private PersonAddressService personAddressService;
	
	@Override
	public PersonAddressResource createAddress(final PersonAddressResource resource) {
		LOG.info("Creating person address, {}", resource);
		
		PersonAddress address = new PersonAddress();
		
		personAddressResourceConverter.convert(resource, address);
		insertConverter.convert(resource, address);
		personAddressService.createAddress(address);
		
		return personAddressConverter.convert(address);
	}

}
