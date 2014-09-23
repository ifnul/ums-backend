package com.optigra.funnypictures.facade.converter.search;

import org.springframework.stereotype.Component;

import com.optigra.funnypictures.facade.converter.AbstractConverter;
import com.optigra.funnypictures.facade.resources.ApiResource;
import com.optigra.funnypictures.facade.resources.search.PagedResultResource;
import com.optigra.funnypictures.pagination.PagedResult;

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

