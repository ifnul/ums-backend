package org.lnu.is.web.rest.processor.resolver.parameters;

import org.apache.commons.lang.math.NumberUtils;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Default implementation of Multi Parameter Retriver.
 */
@Component("multipleParameterRetriever")
public class DefaultMultipleParameterRetriever implements MultipleParameterRetriever {
    public static final String EMPTY_STRING = "";
    public static final String COMMA = ",";
    public static final String OPEN_BRACKET = "[";
    public static final String CLOSE_BRACKET = "]";

    @Override
    public List<?> getMultiParameter(final String value) {
        String formattedValue = value.replace(OPEN_BRACKET, EMPTY_STRING).replace(CLOSE_BRACKET, EMPTY_STRING).trim().replaceAll("\\s", "");
        String[] splittedValues = formattedValue.split(COMMA);
        List<String> stringResult = Arrays.asList(splittedValues);
        boolean isDigits = stringResult.stream().anyMatch(e -> NumberUtils.isNumber(e));

        return isDigits ? stringResult.stream().map(e -> Long.valueOf(e)).collect(Collectors.toList()) : stringResult;
    }


    @Override
    public boolean isMultipleValue(final String value) {
        return value.charAt(0) == '[' && value.charAt(value.length() - 1) == ']';
    }

}
