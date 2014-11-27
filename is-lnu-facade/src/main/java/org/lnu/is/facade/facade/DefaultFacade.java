package org.lnu.is.facade.facade;

import java.util.List;

import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author kushnir
 *
 * @param <ENTITY> Entity.
 * @param <RESOURCE> Resource.
 * @param <SERVICE> Service.
 * @param <KEY> Key.S
 */
public class DefaultFacade<ENTITY, RESOURCE extends ApiResource, SERVICE extends Service<ENTITY, KEY>, KEY> implements Facade<RESOURCE, KEY> {

	private static final Logger LOG = LoggerFactory.getLogger(DefaultFacade.class);

	private Converter<RESOURCE, ENTITY> resourceConverter;

	private Converter<ENTITY, RESOURCE> entityConverter;

	private Converter<PagedRequest<RESOURCE>, PagedSearch<ENTITY>> pagedRequestConverter;

	private Converter<PagedResult<ENTITY>, PagedResultResource<RESOURCE>> pagedResultConverter;

	private Converter<RESOURCE, ENTITY> insertConverter;

	private Converter<RESOURCE, ENTITY> updateConverter;

	private SERVICE defaultService;

	@Override
	public RESOURCE createResource(final RESOURCE resource) {
		LOG.info("Creating entity: {}", resource);

		ENTITY entity = resourceConverter.convert(resource);

		insertConverter.convert(resource, entity);
		defaultService.createEntity(entity);

		return entityConverter.convert(entity);
	}

	@Override
	public RESOURCE getResource(final KEY id) {
		LOG.info("Getting entity with id: {}", id);

		ENTITY entity = defaultService.getEntity(id);
		return entityConverter.convert(entity);
	}

	@Override
	public void removeResource(final KEY id) {
		LOG.info("Removing entity with id: {}", id);

		ENTITY entity = defaultService.getEntity(id);
		defaultService.removeEntity(entity);
	}

	@Override
	public void updateResource(final KEY id, final RESOURCE resource) {
		LOG.info("Updating entity with id: {}, resource: {}", id, resource);

		ENTITY entity = defaultService.getEntity(id);

		resourceConverter.convert(resource, entity);
		updateConverter.convert(resource, entity);

		defaultService.updateEntity(entity);

	}

	@Override
	public PagedResultResource<RESOURCE> getResources(final PagedRequest<RESOURCE> request) {
		LOG.info("Getting paged result resource for {0}: {1}", request.getResource().getClass().getSimpleName(), request);

		PagedSearch<ENTITY> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(resourceConverter.convert(request.getResource()));

		PagedResult<ENTITY> pagedResult = defaultService.getEntities(pagedSearch);

		List<RESOURCE> resources = entityConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<RESOURCE> pagedResultResource = new PagedResultResource<>(request.getResource().getRootUri());
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}

	public SERVICE getDefaultService() {
		return defaultService;
	}

	public void setDefaultService(final SERVICE defaultService) {
		this.defaultService = defaultService;
	}

	public Converter<RESOURCE, ENTITY> getResourceConverter() {
		return resourceConverter;
	}

	public void setResourceConverter(final Converter<RESOURCE, ENTITY> resourceConverter) {
		this.resourceConverter = resourceConverter;
	}

	public Converter<ENTITY, RESOURCE> getEntityConverter() {
		return entityConverter;
	}

	public void setEntityConverter(final Converter<ENTITY, RESOURCE> entityConverter) {
		this.entityConverter = entityConverter;
	}

	public Converter<PagedRequest<RESOURCE>, PagedSearch<ENTITY>> getPagedRequestConverter() {
		return pagedRequestConverter;
	}

	public void setPagedRequestConverter(final Converter<PagedRequest<RESOURCE>, PagedSearch<ENTITY>> pagedRequestConverter) {
		this.pagedRequestConverter = pagedRequestConverter;
	}

	public Converter<PagedResult<ENTITY>, PagedResultResource<RESOURCE>> getPagedResultConverter() {
		return pagedResultConverter;
	}

	public void setPagedResultConverter(final Converter<PagedResult<ENTITY>, PagedResultResource<RESOURCE>> pagedResultConverter) {
		this.pagedResultConverter = pagedResultConverter;
	}

	public Converter<RESOURCE, ENTITY> getInsertConverter() {
		return insertConverter;
	}

	public void setInsertConverter(final Converter<RESOURCE, ENTITY> insertConverter) {
		this.insertConverter = insertConverter;
	}

	public Converter<RESOURCE, ENTITY> getUpdateConverter() {
		return updateConverter;
	}

	public void setUpdateConverter(final Converter<RESOURCE, ENTITY> updateConverter) {
		this.updateConverter = updateConverter;
	}

}
