package org.lnu.is.web.rest.controller.order;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.order.OrderResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.constant.Request;
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
 * Controller for orders.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/orders")
@Api("Order Controller")
public class OrderController extends BaseController implements CrudController<OrderResource> {
	private static final Logger LOG = LoggerFactory.getLogger(OrderController.class);

	@Resource(name = "orderFacade")
	private Facade<OrderResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Create Order", position = 1)
	public OrderResource createResource(@RequestBody final OrderResource orderResource) {
		LOG.info("Creating order: {}", orderResource);
		return facade.createResource(orderResource);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.PUT)
	@ApiOperation(value = "Update Order", position = 2)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@RequestBody final OrderResource resource) {
		LOG.info("Updating order with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "Order Updated");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get Order by id", position = 3)
	public OrderResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving order with id: {}", id);
		return facade.getResource(id);
	}

	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = Request.ID, method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Order", position = 4)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing order with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "Order removed");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Orders")
	public PagedResultResource<OrderResource> getPagedResource(final PagedRequest<OrderResource> request) {
		LOG.info("Retrieving PagedResultResource for Order Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}
}
