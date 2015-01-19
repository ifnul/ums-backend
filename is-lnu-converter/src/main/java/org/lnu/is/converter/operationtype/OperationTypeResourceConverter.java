package org.lnu.is.converter.operationtype;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.optype.OperationType;
import org.lnu.is.resource.operationtype.OperationTypeResource;

/**
 * Converter from operation type resource to operation type.
 * 
 * @author kushnir
 *
 */
@Converter("operationTypeResourceConverter")
public class OperationTypeResourceConverter extends AbstractConverter<OperationTypeResource, OperationType> {

	@Override
	public OperationType convert(final OperationTypeResource source, final OperationType target) {
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public OperationType convert(final OperationTypeResource source) {
		return convert(source, new OperationType());
	}

}
