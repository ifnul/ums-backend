package org.lnu.is.facade.facade;

import org.lnu.is.converter.Converter;
import org.lnu.is.domain.Model;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.resource.Resource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 
 * @author kushnir
 *
 * @param <ENTITY> Entity.
 * @param <ENTITYLIST> ENTITYLIST.
 * @param <RESOURCE> Resource.
 * @param <RESOURCELIST> RESOURCELIST.
 * @param <SERVICE> Service.
 * @param <KEY> Key.S
 */
@Transactional
public class DefaultFacade<ENTITY extends Model, RESOURCE extends Resource, ENTITYLIST
		extends Model, RESOURCELIST extends Resource,
		SERVICE extends Service<ENTITY, ENTITYLIST, KEY>, KEY> implements Facade<RESOURCE, RESOURCELIST, KEY> {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultFacade.class);

	private Converter<RESOURCE, ENTITY> resourceConverter;

	private Converter<ENTITY, RESOURCE> entityConverter;

	private Converter<RESOURCELIST, ENTITYLIST> resourceListConverter;

	private Converter<PagedRequest<RESOURCELIST>, MultiplePagedSearch<ENTITYLIST>> pagedRequestConverter;

	private Converter<PagedResult<ENTITY>, PagedResultResource<RESOURCE>> pagedResultConverter;
	
	private Converter<ENTITY, RESOURCE> entityDetailsConverter;
	
	private Converter<RESOURCE, ENTITY> insertConverter;

	private Converter<RESOURCE, ENTITY> updateConverter;

	protected SERVICE service;

	@Override
	public RESOURCE createResource(final RESOURCE resource) {
		LOG.info("Creating resource: {}", resource);

		ENTITY entity = resourceConverter.convert(resource);

		insertConverter.convert(resource, entity);
		service.createEntity(entity);

		return entityConverter.convert(entity);
	}

	@Override
	public RESOURCE getResource(final KEY id) {
		LOG.info("Getting resource with id: {}", id);
		
		ENTITY entity = service.getEntity(id);
		
		RESOURCE resource = entityConverter.convert(entity);
		entityDetailsConverter.convert(entity, resource);
		
		return resource;
	}

	@Override
	public void removeResource(final KEY id) {
		LOG.info("Removing resource with id: {}", id);
		ENTITY entity = service.getEntity(id);
		
		service.removeEntity(entity);
	}

	@Override
	public void updateResource(final KEY id, final RESOURCE resource) {
		LOG.info("Updating resource with id: {}, resource: {}", id, resource);

		ENTITY entity = service.getEntity(id);
		
		resourceConverter.convert(resource, entity);
		updateConverter.convert(resource, entity);

		service.updateEntity(entity);

	}

	@Override
	public PagedResultResource<RESOURCE> getResources(final PagedRequest<RESOURCELIST> request) {
		LOG.info("Getting paged result resource for {0}: {1}", request.getResource().getClass().getSimpleName(), request);

		MultiplePagedSearch<ENTITYLIST> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(resourceListConverter.convert(request.getResource()));

		PagedResult<ENTITY> pagedResult = service.getEntities(pagedSearch);

		List<RESOURCE> resources = entityConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<RESOURCE> pagedResultResource = new PagedResultResource<>(request.getResource().getRootUri());
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}

	@Required
	public void setService(final SERVICE service) {
		this.service = service;
	}
	
	@Required
	public void setResourceConverter(final Converter<RESOURCE, ENTITY> resourceConverter) {
		this.resourceConverter = resourceConverter;
	}
	
	@Required
	public void setEntityConverter(final Converter<ENTITY, RESOURCE> entityConverter) {
		this.entityConverter = entityConverter;
	}
	
	@Required
	public void setPagedRequestConverter(final Converter<PagedRequest<RESOURCELIST>, MultiplePagedSearch<ENTITYLIST>> pagedRequestConverter) {
		this.pagedRequestConverter = pagedRequestConverter;
	}
	
	@Required
	public void setPagedResultConverter(final Converter<PagedResult<ENTITY>, PagedResultResource<RESOURCE>> pagedResultConverter) {
		this.pagedResultConverter = pagedResultConverter;
	}
	
	@Required
	public void setInsertConverter(final Converter<RESOURCE, ENTITY> insertConverter) {
		this.insertConverter = insertConverter;
	}
	
	@Required
	public void setEntityDetailsConverter(final Converter<ENTITY, RESOURCE> entityDetailsConverter) {
		this.entityDetailsConverter = entityDetailsConverter;
	}
	
	public SERVICE getService() {
		return service;
	}

	public Converter<ENTITY, RESOURCE> getEntityDetailsConverter() {
		return entityDetailsConverter;
	}


	public void setUpdateConverter(final Converter<RESOURCE, ENTITY> updateConverter) {
		this.updateConverter = updateConverter;
	}
	
	public Converter<RESOURCE, ENTITY> getResourceConverter() {
		return resourceConverter;
	}

	public Converter<ENTITY, RESOURCE> getEntityConverter() {
		return entityConverter;
	}

	public Converter<PagedRequest<RESOURCELIST>, MultiplePagedSearch<ENTITYLIST>> getPagedRequestConverter() {
		return pagedRequestConverter;
	}

	public Converter<PagedResult<ENTITY>, PagedResultResource<RESOURCE>> getPagedResultConverter() {
		return pagedResultConverter;
	}

	public Converter<RESOURCE, ENTITY> getInsertConverter() {
		return insertConverter;
	}

	public Converter<RESOURCE, ENTITY> getUpdateConverter() {
		return updateConverter;
	}

	public Converter<RESOURCELIST, ENTITYLIST> getResourceListConverter() {
		return resourceListConverter;
	}

	public void setResourceListConverter(final Converter<RESOURCELIST, ENTITYLIST> resourceListConverter) {
		this.resourceListConverter = resourceListConverter;
	}
}
