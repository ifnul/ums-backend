package org.lnu.is.web.rest.processor.resolver.parameters;

import java.util.List;

/**
 * Interface for work with Multiple parameters.
 */
public interface MultipleParameterRetriever {

    /**
     * Single method for parsing multi parameter value.
     * @param value value
     * @return value.
     */
    List<?> getMultiParameter(String value);

    /**
     * Method for finding out if this value is multi.
     * @param value value
     * @return boolean value.
     */
    boolean isMultipleValue(String value);
}
