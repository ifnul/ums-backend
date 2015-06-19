package org.lnu.is.web.rest.processor.resolver.parameters;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.servlet.HandlerMapping;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Default implemntation of Parameters Retriever
 */
@Component("parametersRetriever")
public class DefaultParametersRetriever implements ParametersRetriever {

    @Override
    public Map<String, Object> getParameters(final NativeWebRequest webRequest) {
        Map<String, Object> resultMap = new HashMap<String, Object>();

        Map<String, String> pathVariables = (Map<String, String>) webRequest.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE, RequestAttributes.SCOPE_REQUEST);
        Map<String, String[]> requestParams = webRequest.getParameterMap();

        for (Map.Entry<String, String[]> entry : requestParams.entrySet()) {
            resultMap.put(entry.getKey(), Arrays.asList(entry.getValue()));
        }

        resultMap.putAll(pathVariables);

        return resultMap;
    }
}
