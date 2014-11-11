package org.lnu.is.facade.facade.timeperiod;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.timeperiod.TimePeriodResource;

/**
 * Time Period Interface.
 * @author ivanursul
 *
 */
public interface TimePeriodFacade extends Facade<TimePeriodResource> {

	/**
	 * Method for getting time periods.
	 * @param request
	 * @return paged result.
	 */
	PagedResultResource<TimePeriodResource> getTimePeriods(PagedRequest<TimePeriodResource> request);

}
