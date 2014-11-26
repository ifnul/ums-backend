package org.lnu.is.facade.facade.enrolment.statustype;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.enrolment.EnrolmentStatusType;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.facade.BaseFacade;
import org.lnu.is.facade.resource.enrolment.statustype.EnrolmentStatusTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.enrolment.statustype.EnrolmentStatusTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * Enrolment Status Type Facade.
 * 
 * @author kushnir
 *
 */
@Transactional
@Facade("enrolmentStatusTypeFacade")
public class DefaultEnrolmentStatusTypeFacade extends BaseFacade<EnrolmentStatusTypeResource, EnrolmentStatusType> implements EnrolmentStatusTypeFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultEnrolmentStatusTypeFacade.class);
	
	@Resource(name = "enrolmentStatusTypeConverter")
	private Converter<EnrolmentStatusType, EnrolmentStatusTypeResource> entityConverter;

	@Resource(name = "enrolmentStatusTypeResourceConverter")
	private Converter<EnrolmentStatusTypeResource, EnrolmentStatusType> resourceConverter;

	@Resource(name = "enrolmentStatusTypeService")
	private EnrolmentStatusTypeService service;

	@Override
	public PagedResultResource<EnrolmentStatusTypeResource> getEnrolmentStatusTypes(final PagedRequest<EnrolmentStatusTypeResource> request) {
		LOG.info("Getting paged result for enrolment status type resources : {}", request);
		
		PagedSearch<EnrolmentStatusType> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(resourceConverter.convert(request.getResource()));

		PagedResult<EnrolmentStatusType> pagedResult = service.getEnrolmentStatusTypes(pagedSearch);

		List<EnrolmentStatusTypeResource> resources = entityConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<EnrolmentStatusTypeResource> pagedResultResource = new PagedResultResource<EnrolmentStatusTypeResource>("/enrolments/statustypes");

		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);
		return pagedResultResource;
	}

}
