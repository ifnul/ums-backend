package org.lnu.is.web.rest.controller.contact.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.contact.type.ContactTypeResource;
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

import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Contact type controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/contacts/types")
public class ContactTypeController extends BaseController implements PagedController<ContactTypeResource, ContactTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(ContactTypeController.class);

	@Resource(name = "contactTypeFacade")
	private Facade<ContactTypeResource, ContactTypeResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Contact Type Resources")
	public PagedResultResource<ContactTypeResource> getPagedResource(final PagedRequest<ContactTypeResource> request) {
		LOG.info("Getting PagedResultResource for Address Tyoe with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get ContactTypeResource by id")
	public ContactTypeResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Getting contact type resource:{}", id);
		return facade.getResource(id);
	}
}
