package org.lnu.is.converter.operationtype;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.optype.OperationType;
import org.lnu.is.resource.operationtype.OperationTypeResource;

/**
 * Converter from operation type to operation type resource.
 * 
 * @author kushnir
 *
 */
@ResourceConverter("operationTypeConverter")
public class OperationTypeConverter extends AbstractConverter<OperationType, OperationTypeResource> {

	@Override
	public OperationTypeResource convert(final OperationType source, final OperationTypeResource target) {
		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public OperationTypeResource convert(final OperationType source) {
		return convert(source, new OperationTypeResource());
	}

}
