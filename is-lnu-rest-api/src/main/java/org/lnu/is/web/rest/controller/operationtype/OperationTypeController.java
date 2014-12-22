package org.lnu.is.web.rest.controller.operationtype;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.operationtype.OperationTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.annotation.Limit;
import org.lnu.is.web.rest.annotation.Offset;
import org.lnu.is.web.rest.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
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
public class OperationTypeController extends BaseController {

	private static final Logger LOG = LoggerFactory.getLogger(OperationTypeController.class);

	@Resource(name = "operationTypeFacade")
	private Facade<OperationTypeResource, Long> facade;

	/**
	 * Method for getting paged result of operation types.
	 * 
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Operation Types")
	public PagedResultResource<OperationTypeResource> getOperationTypes(@Offset final Integer offset,
			@Limit final Integer limit, final OperationTypeResource resource) {
		LOG.info("Getting PagedResultResource for Operation Type with offset: {}, limit: {}", offset, limit);
		PagedRequest<OperationTypeResource> request = new PagedRequest<OperationTypeResource>(resource, offset, limit);
		return facade.getResources(request);
	}

}
