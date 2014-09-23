package org.lnu.is.facade.converter.search;

import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resources.search.PagedRequest;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Component;

@Component("pagedRequestConverter")
public class PagedRequestConverter<T> extends AbstractConverter<PagedRequest, PagedSearch<T>> {

	@Override
	public PagedSearch<T> convert(PagedRequest source, PagedSearch<T> target) {
		
		target.setOffset(source.getOffset());
		target.setLimit(source.getLimit());
		
		return target;
	}

	@Override
	public PagedSearch<T> convert(PagedRequest source) {
		return convert(source, new PagedSearch<T>());
	}

}
