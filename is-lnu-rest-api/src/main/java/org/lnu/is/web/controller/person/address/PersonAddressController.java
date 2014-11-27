package org.lnu.is.web.controller.person.address;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.person.address.PersonAddressResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
@Api(value = "Person Address Controller", description = "Controller, that describes method for accessing and modifying person addresses.")
public class PersonAddressController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(PersonAddressController.class);
	
	@Resource(name = "personAddressFacade")
	private Facade<PersonAddressResource, Long> facade;
	
	/**
	 * Method for creating person address.
	 * @param resource
	 * @param personId
	 * @return person address.
	 */
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{personId}/addresses", method = RequestMethod.POST)
	@ApiOperation(value = "Method for creating person address")
	public PersonAddressResource createPersonAddress(@RequestBody final PersonAddressResource resource,
			@PathVariable("personId") final Long personId) {
		LOG.info("Creating person address: {}", resource);
		return facade.createResource(resource);
	}

	/**
	 * Method for updating person address.
	 * @param personId
	 * @param addressId
	 * @param resource
	 * @return message resource.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/addresses/{addressId}", method = RequestMethod.PUT)
	@ApiOperation(value = "Method for updating person address")
	public MessageResource updateAddress(@PathVariable("personId") final Long personId,
			@PathVariable("addressId") final Long addressId,
			@RequestBody final PersonAddressResource resource) {
		LOG.info("Updating person({}) address({}): {}", personId, addressId, resource);
		
		resource.setPersonId(personId);
		facade.updateResource(addressId, resource);
		
		return new MessageResource(MessageType.INFO, "Person address updated");
	}
	
	/**
	 * Method for removing person address.
	 * @param addressId
	 * @return message resource.
	 */
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{personId}/addresses/{addressId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Method for deleting person address")
	public MessageResource deleteAddress(@PathVariable("addressId") final Long addressId) {
		LOG.info("Deletin person address({})", addressId);
		
		facade.removeResource(addressId);
		return new MessageResource(MessageType.INFO, "Person Address deleted");
	}
	
	/**
	 * Method for getting address by id.
	 * @param addressId
	 * @return person address.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/addresses/{addressId}", method = RequestMethod.GET)
	@ApiOperation(value = "Method for getting person address by id")
	public PersonAddressResource getAddress(@PathVariable("addressId") final Long addressId) {
		LOG.info("Getting person address({})", addressId);
		return facade.getResource(addressId);
	}
	
	/**
	 * Method for getting paged result.
	 * @param offset
	 * @param limit
	 * @param persId
	 * @param resource
	 * @return paged result.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{person}/addresses", method = RequestMethod.GET)
	@ApiOperation(value = "Method for getting paged result.")
	public PagedResultResource<PersonAddressResource> getAddresses(@RequestParam(value = "offset", defaultValue = "0") final Integer offset,
			@RequestParam(value = "limit", defaultValue = "20") final Integer limit,
			@PathVariable("person") final Long persId,
			final PersonAddressResource resource) {
		LOG.info("Getting paged result for person({}) addresses with parameters: {}", persId, resource);
		PagedRequest<PersonAddressResource> request = new PagedRequest<PersonAddressResource>(resource, offset, limit);
		return facade.getResources(request);
	}
}
