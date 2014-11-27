package org.lnu.is.web.controller.addresstype;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.addresstype.AddressTypeFacade;
import org.lnu.is.facade.resource.addresstype.AddressTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Address types controller.
 * 
 * @author ROMA
 *
 */
@RestController
@RequestMapping("/addresstypes")
@ApiModel(value = "Address Types", description = "Address Types")
public class AddressTypeController extends BaseController {
	private static final Logger LOG = LoggerFactory
			.getLogger(AddressTypeController.class);

	@Resource(name = "addressTypeFacade")
	private AddressTypeFacade addressTypeFacade;

	/**
	 * Method for getting Address Types.
	 * 
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result 
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Address Types")
	public PagedResultResource<AddressTypeResource> getAddressTypes(
			@RequestParam(value = "offset", defaultValue = "0") final Integer offset,
			@RequestParam(value = "limit", defaultValue = "38") final Integer limit,
			final AddressTypeResource resource) {
		LOG.info(
				"Getting PagedResultResource for Address Tyoe with offset: {}, limit: {}",
				offset, limit);
		PagedRequest<AddressTypeResource> request = new PagedRequest<AddressTypeResource>(
				resource, offset, limit);
		return addressTypeFacade.getEntities(request);
	}
}
