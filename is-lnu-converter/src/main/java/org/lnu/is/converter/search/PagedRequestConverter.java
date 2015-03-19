package org.lnu.is.converter.search;

import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.pagination.MultiplePagedSearch;
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
public class PagedRequestConverter<T> extends AbstractConverter<PagedRequest<?>, MultiplePagedSearch<T>> {

	@Override
	public MultiplePagedSearch<T> convert(final PagedRequest<?> source, final MultiplePagedSearch<T> target) {
		
		target.setOffset(source.getOffset());
		target.setLimit(source.getLimit());
		target.setOrders(source.getOrders());
		
		return target;
	}

	@Override
	public MultiplePagedSearch<T> convert(final PagedRequest<?> source) {
		return convert(source, new MultiplePagedSearch<T>());
	}

}
