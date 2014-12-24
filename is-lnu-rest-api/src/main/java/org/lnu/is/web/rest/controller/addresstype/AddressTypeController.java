package org.lnu.is.web.rest.controller.addresstype;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.addresstype.AddressTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.PagedController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
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
public class AddressTypeController extends BaseController implements PagedController<AddressTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(AddressTypeController.class);

	@Resource(name = "addressTypeFacade")
	private Facade<AddressTypeResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Address Types")
	public PagedResultResource<AddressTypeResource> getPagedResource(final PagedRequest<AddressTypeResource> request) {
		LOG.info("Getting PagedResultResource for Address Tyoe with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}
}
