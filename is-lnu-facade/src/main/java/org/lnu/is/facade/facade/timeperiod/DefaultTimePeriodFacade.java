package org.lnu.is.facade.facade.timeperiod;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.facade.BaseFacade;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.timeperiod.TimePeriodResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.timeperiod.TimePeriodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * Time Period Facade.
 * @author ivanursul
 *
 */
@Transactional
@Facade("timePeriodFacade")
public class DefaultTimePeriodFacade extends BaseFacade<TimePeriodResource, TimePeriod> implements TimePeriodFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultTimePeriodFacade.class);
	
	@Resource(name = "timePeriodService")
	private TimePeriodService service;

	@Resource(name = "timePeriodConverter")
	private Converter<TimePeriod, TimePeriodResource> entityConverter;

	@Resource(name = "timePeriodResourceConverter")
	private Converter<TimePeriodResource, TimePeriod> resourceConverter;
	
	@Override
	public PagedResultResource<TimePeriodResource> getEntities(final PagedRequest<TimePeriodResource> request) {
		LOG.info("Get time periods by paged request: {}", request);

		PagedSearch<TimePeriod> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(resourceConverter.convert(request.getResource()));
		
		PagedResult<TimePeriod> pagedResult = service.getTimePeriods(pagedSearch);
		List<TimePeriodResource> resources = entityConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<TimePeriodResource> pagedResultResource = new PagedResultResource<>("/timeperiods");
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}

}
