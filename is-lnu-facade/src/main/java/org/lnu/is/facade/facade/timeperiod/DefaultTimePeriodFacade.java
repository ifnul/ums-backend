package org.lnu.is.facade.facade.timeperiod;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.timeperiod.TimePeriodResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.timeperiod.TimePeriodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Time Period Facade.
 * @author ivanursul
 *
 */
@Facade("timePeriodFacade")
public class DefaultTimePeriodFacade implements TimePeriodFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultTimePeriodFacade.class);
	
	@Resource(name = "timePeriodService")
	private TimePeriodService timePeriodService;

	@Resource(name = "timePeriodConverter")
	private Converter<TimePeriod, TimePeriodResource> timePeriodConverter;
	
	@Resource(name = "pagedRequestConverter")
	private Converter<PagedRequest<TimePeriodResource>, PagedSearch<TimePeriod>> pagedRequestConverter;

	@Resource(name = "pagedSearchConverter")
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;
	
	@Override
	public PagedResultResource<TimePeriodResource> getTimePeriods(final PagedRequest<TimePeriodResource> request) {
		LOG.info("Get time periods by paged request: {}", request);

		PagedSearch<TimePeriod> pagedSearch = pagedRequestConverter.convert(request);
		PagedResult<TimePeriod> pagedResult = timePeriodService.getTimePeriods(pagedSearch);
		List<TimePeriodResource> resources = timePeriodConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<TimePeriodResource> pagedResultResource = new PagedResultResource<>("/timeperiods");
		pagedResultResource.setEntities(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}

}
