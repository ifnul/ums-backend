package org.lnu.is.web.rest.controller.address.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.address.type.AddressTypeResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.constant.Request;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.PagedController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
public class AddressTypeController extends BaseController implements PagedController<AddressTypeResource, AddressTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(AddressTypeController.class);

	@Resource(name = "addressTypeFacade")
	private Facade<AddressTypeResource, AddressTypeResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Address Types")
	public PagedResultResource<AddressTypeResource> getPagedResource(final PagedRequest<AddressTypeResource> request) {
		LOG.info("Getting PagedResultResource for Address Tyoe with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get Address Types by id")
	public AddressTypeResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Getting address type resource:{}", id);
		return facade.getResource(id);
	}
}
