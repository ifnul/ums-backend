package org.lnu.is.extractor.operationtype;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.optype.OperationType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Operation Type parameters extractor.
 * 
 * @author kushnir.
 *
 */
@ParametersExtractor("operationTypeParametersExtractor")
public class OperationTypeParametersExtractor extends AbstractParametersExtractor<OperationType> {

	@Override
	public Map<String, Object> getParameters(final OperationType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
