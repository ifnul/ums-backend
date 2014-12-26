package org.lnu.is.converter.base;

import java.util.Date;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.Model;
import org.lnu.is.resource.ApiResource;

/**
 * Converter, that is used, when Update(PUT) method is called.
 * @author ivanursul
 *
 * @param <S> resource.
 * @param <T> entity.
 */
@Converter("updateConverter")
public class UpdateConverter<S extends ApiResource, T extends Model> extends AbstractConverter<S, T> {

	@Override
	public T convert(final S source, final T target) {
		target.setUpdateDate(new Date());
		return target;
	}

	@Override
	public T convert(final S source) {
		throw new UnsupportedOperationException("Method not allowed");
	}

}
