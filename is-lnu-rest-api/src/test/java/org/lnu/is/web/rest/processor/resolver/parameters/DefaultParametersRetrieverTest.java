package org.lnu.is.web.rest.processor.resolver.parameters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DefaultParametersRetrieverTest {

    private DefaultParametersRetriever unit = new DefaultParametersRetriever();

    @Mock
    private NativeWebRequest webRequest;

    @Test
    public void testGetParameters() throws Exception {
        // Given
        String field1 = "field1";
        String value1 = "value1";

        Map<String, String> pathVariables = new HashMap<>();
        pathVariables.put(field1, value1);
        Map<String,String[]> requestParams = new HashMap();
        String value2 = "value2";
        String[] values2 = {value2};
        String field2 = "field2";
        requestParams.put(field2, values2);

        Map<String, Object> expected = new HashMap();
        expected.put(field1, value1);
        expected.put(field2, Arrays.asList(values2));

        // When
        when(webRequest.getAttribute(anyString(), anyInt())).thenReturn(pathVariables);
        when(webRequest.getParameterMap()).thenReturn(requestParams);
        Map<String, Object> actual = unit.getParameters(webRequest);

        // Then
        assertEquals(expected, actual);
    }


}