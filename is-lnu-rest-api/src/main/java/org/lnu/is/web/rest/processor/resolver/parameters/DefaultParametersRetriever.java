package org.lnu.is.web.rest.processor.resolver.parameters;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.servlet.HandlerMapping;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Default implemntation of Parameters Retriever
 */
@Component("parametersRetriever")
public class DefaultParametersRetriever implements ParametersRetriever {

    @Resource(name = "multipleParameterRetriever")
    private MultipleParameterRetriever multipleParameterRetriever;

    @Override
    public Map<String, Object> getParameters(final NativeWebRequest webRequest) {
        Map<String, Object> resultMap = new HashMap<String, Object>();

        Map<String, String> pathVariables = (Map<String, String>) webRequest.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE, RequestAttributes.SCOPE_REQUEST);
        Map<String, Object> requestParams = getRequestParameterMap(webRequest);

        for (Map.Entry<String, Object> entry : requestParams.entrySet()) {
            resultMap.put(entry.getKey(), entry.getValue());
        }

        resultMap.putAll(pathVariables);

        return resultMap;
    }

    private Map<String, Object> getRequestParameterMap(final NativeWebRequest webRequest) {
        Map<String, String[]> parameters = webRequest.getParameterMap();
        Map<String, Object> resultMap = new HashMap<>();

        for (Map.Entry<String, String[]> entry : parameters.entrySet()) {
            String[] value = entry.getValue();
            String strValue = getParameter(value);
            Object newValue = strValue;

            if (multipleParameterRetriever.isMultipleValue(strValue)) {
                newValue = multipleParameterRetriever.getMultiParameter(strValue);
            }

            resultMap.put(entry.getKey(), newValue);
        }


        return resultMap;
    }

    private String getParameter(final String[] values) {
        return values[0];
    }


}
