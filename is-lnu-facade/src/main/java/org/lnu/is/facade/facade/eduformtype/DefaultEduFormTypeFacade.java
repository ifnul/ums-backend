package org.lnu.is.facade.facade.eduformtype;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.facade.BaseFacade;
import org.lnu.is.facade.resource.eduformtype.EduFormTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.eduformtype.EduFormTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author ivanursul
 *
 */
@Transactional
@Facade("eduFormTypeFacade")
public class DefaultEduFormTypeFacade extends BaseFacade<EduFormTypeResource, EduFormType> implements EduFormTypeFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultEduFormTypeFacade.class);
	
	@Resource(name = "eduFormTypeConverter")
	private Converter<EduFormType, EduFormTypeResource> entityConverter;
	
	@Resource(name = "eduFormTypeResourceConverter")
	private Converter<EduFormTypeResource, EduFormType> resourceConverter;
	
	@Resource(name = "eduFormTypeService")
	private EduFormTypeService service;
	
	@Override
	public PagedResultResource<EduFormTypeResource> getEntities(final PagedRequest<EduFormTypeResource> request) {
		LOG.info("Getting paged result for edu form types: {}", request);
		
		PagedSearch<EduFormType> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(resourceConverter.convert(request.getResource()));
		
		PagedResult<EduFormType> pagedResult = service.getEduFormTypes(pagedSearch);
		
		List<EduFormTypeResource> resources = entityConverter.convertAll(pagedResult.getEntities());
		
		PagedResultResource<EduFormTypeResource> pagedResultResource = new PagedResultResource<>("/eduformtypes");
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);
		
		return pagedResultResource;
	}

}
