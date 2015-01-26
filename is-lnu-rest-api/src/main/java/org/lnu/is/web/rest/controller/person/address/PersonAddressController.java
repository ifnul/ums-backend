package org.lnu.is.web.rest.controller.person.address;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.person.address.PersonAddressResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.CrudController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Person address controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/persons")
@Api("Person Address Controller")
public class PersonAddressController extends BaseController implements CrudController<PersonAddressResource> {
	private static final Logger LOG = LoggerFactory.getLogger(PersonAddressController.class);
	
	@Resource(name = "personAddressFacade")
	private Facade<PersonAddressResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{personId}/addresses", method = RequestMethod.POST)
	@ApiOperation(value = "Method for creating person address")
	public PersonAddressResource createResource(@Valid @RequestBody final PersonAddressResource resource) {
		LOG.info("Creating person address: {}", resource);
		return facade.createResource(resource);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/addresses/{addressId}", method = RequestMethod.PUT)
	@ApiOperation(value = "Method for updating person address")
	public MessageResource updateResource(@PathVariable("addressId") final Long addressId,
			@Valid @RequestBody final PersonAddressResource resource) {
		LOG.info("Updating person address({}): {}", addressId, resource);
		facade.updateResource(addressId, resource);
		return new MessageResource(MessageType.INFO, "Person address updated");
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{personId}/addresses/{addressId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Method for deleting person address")
	public MessageResource removeResource(@PathVariable("addressId") final Long addressId) {
		LOG.info("Deletin person address({})", addressId);
		
		facade.removeResource(addressId);
		return new MessageResource(MessageType.INFO, "Person Address deleted");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/addresses/{addressId}", method = RequestMethod.GET)
	@ApiOperation(value = "Method for getting person address by id")
	public PersonAddressResource getResource(@PathVariable("addressId") final Long addressId) {
		LOG.info("Getting person address({})", addressId);
		return facade.getResource(addressId);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{person}/addresses", method = RequestMethod.GET)
	@ApiOperation(value = "Method for getting paged result.")
	public PagedResultResource<PersonAddressResource> getPagedResource(final PagedRequest<PersonAddressResource> request) {
		LOG.info("Getting paged result for person({}) addresses with parameters: {}", request.getResource().getPersonId(), request.getResource());
		return facade.getResources(request);
	}

}
