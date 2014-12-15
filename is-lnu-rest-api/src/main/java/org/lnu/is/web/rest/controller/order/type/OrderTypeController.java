package org.lnu.is.web.rest.controller.order.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.order.type.OrderTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Controller for order types.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/orders/types")
public class OrderTypeController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(OrderTypeController.class);
	
	@Resource(name = "orderTypeFacade")
	private Facade<OrderTypeResource, Long> facade;
	
	/**
	 * Method for getting paged result of order types.
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Order Types")
	public PagedResultResource<OrderTypeResource> getOrderTypes(
			@RequestParam(value = "offset", defaultValue = "0") final Integer offset,
			@RequestParam(value = "limit", defaultValue = "20") final Integer limit,
			final OrderTypeResource resource) {
		LOG.info("Getting PagedResultResource for Order Type with offset: {}, limit: {}", offset, limit);
		PagedRequest<OrderTypeResource> request = new PagedRequest<OrderTypeResource>(resource, offset, limit);
		return facade.getResources(request);	
	}

}
