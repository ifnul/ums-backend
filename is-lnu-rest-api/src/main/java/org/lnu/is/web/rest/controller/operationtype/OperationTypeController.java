package org.lnu.is.web.rest.controller.operationtype;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.operationtype.OperationTypeResource;
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

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Operation type controller.
 * 
 * @author kushnir
 *
 */

@RestController
@RequestMapping("/operationtypes")
@Api(value = "Operation Types", description = "Operation Types")
public class OperationTypeController extends BaseController implements PagedController<OperationTypeResource> {

	private static final Logger LOG = LoggerFactory.getLogger(OperationTypeController.class);

	@Resource(name = "operationTypeFacade")
	private Facade<OperationTypeResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Operation Types")
	public PagedResultResource<OperationTypeResource> getPagedResource(final PagedRequest<OperationTypeResource> request) {
		LOG.info("Getting PagedResultResource for Operation Type with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get operation type by id")
	public OperationTypeResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}

}
