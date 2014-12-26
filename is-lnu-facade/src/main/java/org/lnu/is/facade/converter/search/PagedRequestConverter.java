package org.lnu.is.facade.converter.search;

import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.resource.search.PagedRequest;
import org.springframework.stereotype.Component;

/**
 * Converter that converts from PagedRequest to PagedSearch.
 * Main idea is that PagedRequest is from facade layer and
 * PagedSearch is from domain layer.
 * @author ivanursul
 *
 * @param <T> Entity class.
 */
@Component("pagedRequestConverter")
public class PagedRequestConverter<T> extends AbstractConverter<PagedRequest<?>, PagedSearch<T>> {

	@Override
	public PagedSearch<T> convert(final PagedRequest<?> source, final PagedSearch<T> target) {
		
		target.setOffset(source.getOffset());
		target.setLimit(source.getLimit());
		
		return target;
	}

	@Override
	public PagedSearch<T> convert(final PagedRequest<?> source) {
		return convert(source, new PagedSearch<T>());
	}

}
