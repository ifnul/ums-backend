package org.lnu.is.facade.converter.search;

import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resources.ApiResource;
import org.lnu.is.facade.resources.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.springframework.stereotype.Component;

/**
 * @date Feb 14, 2014
 * @author ivanursul
 *
 */
@Component("pagedSearchConverter")
public class PagedSearchConverter extends AbstractConverter<PagedResult<?>, PagedResultResource<? extends ApiResource>> {

    @Override
    public PagedResultResource<? extends ApiResource> convert(final PagedResult<?> source) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PagedResultResource<? extends ApiResource> convert(final PagedResult<?> source, final PagedResultResource<? extends ApiResource> target) {

    	target.setOffset(source.getOffset());
    	target.setLimit(source.getLimit());
        target.setCount(source.getCount());

        return target;
    }
}

