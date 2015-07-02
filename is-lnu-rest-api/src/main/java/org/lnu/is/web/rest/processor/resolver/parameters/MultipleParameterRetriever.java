package org.lnu.is.web.rest.processor.resolver.parameters;

import java.util.List;

/**
 * Interface for work with Multiple parameters.
 */
public interface MultipleParameterRetriever {

    /**
     * Single method for parsing multi parameter value.
     * @param values value
     * @return value.
     */
    List<?> getMultiParameter(String[] values);

}
