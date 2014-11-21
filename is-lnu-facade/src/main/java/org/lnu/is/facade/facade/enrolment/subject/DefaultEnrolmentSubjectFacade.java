package org.lnu.is.facade.facade.enrolment.subject;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.enrolment.EnrolmentSubject;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.facade.BaseFacade;
import org.lnu.is.facade.resource.enrolment.subject.EnrolmentSubjectResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.enrolment.subject.EnrolmentSubjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * Default implementation of enrolment subject facade.
 * @author ivanursul
 *
 */
@Transactional
@Facade("enrolmentSubjectFacade")
public class DefaultEnrolmentSubjectFacade extends BaseFacade<EnrolmentSubjectResource, EnrolmentSubject> implements EnrolmentSubjectFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultEnrolmentSubjectFacade.class);
	
	@Resource(name = "enrolmentSubjectConverter")
	private Converter<EnrolmentSubject, EnrolmentSubjectResource> enrolmentSubjectConverter;
	
	@Resource(name = "enrolmentSubjectResourceConverter")
	private Converter<EnrolmentSubjectResource, EnrolmentSubject> enrolmentSubjectResourceConverter;
	
	@Resource(name = "enrolmentSubjectService")
	private EnrolmentSubjectService enrolmentSubjectService;
	
	@Override
	public PagedResultResource<EnrolmentSubjectResource> getEnrolmentSubjects(final PagedRequest<EnrolmentSubjectResource> request) {
		LOG.info("Getting paged result for enrolment subjects: {}", request);
		
		PagedSearch<EnrolmentSubject> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(enrolmentSubjectResourceConverter.convert(request.getResource()));
		
		PagedResult<EnrolmentSubject> pagedResult = enrolmentSubjectService.getEnrolmentSubjects(pagedSearch);
		
		List<EnrolmentSubjectResource> resources = enrolmentSubjectConverter.convertAll(pagedResult.getEntities());
		
		PagedResultResource<EnrolmentSubjectResource> pagedResultResource = new PagedResultResource<>("/enrolments/subjects");
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);
		
		return pagedResultResource;
	}

}
