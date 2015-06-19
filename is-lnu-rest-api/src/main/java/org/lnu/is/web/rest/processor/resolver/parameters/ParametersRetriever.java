package org.lnu.is.web.rest.processor.resolver.parameters;

import org.springframework.web.context.request.NativeWebRequest;

import java.util.Map;

/**
 * Interface for extracting parameters extractor.
 */
public interface ParametersRetriever {

    /**
     * Method for getting parameters.
     * @param webRequest webRequest
     * @return Map of parameters.
     */
    Map<String, Object> getParameters(final NativeWebRequest webRequest);
}
