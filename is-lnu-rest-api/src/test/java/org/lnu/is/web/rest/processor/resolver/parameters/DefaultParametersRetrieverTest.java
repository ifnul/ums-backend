package org.lnu.is.web.rest.processor.resolver.parameters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DefaultParametersRetrieverTest {

    @InjectMocks
    private DefaultParametersRetriever unit;

    @Mock
    private MultipleParameterRetriever multipleParameterRetriever;

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
        expected.put(field2, value2);

        // When
        when(webRequest.getAttribute(anyString(), anyInt())).thenReturn(pathVariables);
        when(webRequest.getParameterMap()).thenReturn(requestParams);
        Map<String, Object> actual = unit.getParameters(webRequest);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testGetParametersWithEmptyMap() throws Exception {
        // Given
        Map<String, String> pathVariables = new HashMap<>();
        Map<String,String[]> requestParams = new HashMap();
        Map<String, Object> expected = new HashMap();

        // When
        when(webRequest.getAttribute(anyString(), anyInt())).thenReturn(pathVariables);
        when(webRequest.getParameterMap()).thenReturn(requestParams);
        Map<String, Object> actual = unit.getParameters(webRequest);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testGetParametersWithMultipleParameter() throws Exception {
        // Given
        String field1 = "field1";
        String value1 = "value1";

        Map<String, String> pathVariables = new HashMap<>();
        pathVariables.put(field1, value1);

        Long id1 = 1L;
        Long id2 = 2L;
        Long id3 = 3L;

        List<Object> idList = Arrays.asList(String.valueOf(id1), String.valueOf(id2), String.valueOf(id3));
        String value2 = String.valueOf(id1);
        String[] values2 = {value2};
        String field2 = "field2";

        Map<String,String[]> requestParams = new HashMap();
        requestParams.put(field2, values2);

        Map<String, Object> expected = new HashMap();
        expected.put(field1, value1);
        expected.put(field2, value2);
        expected.put(field2, value2);

        // When
        when(webRequest.getAttribute(anyString(), anyInt())).thenReturn(pathVariables);
        when(webRequest.getParameterMap()).thenReturn(requestParams);
        doReturn(idList).when(multipleParameterRetriever).getMultiParameter(values2);
        Map<String, Object> actual = unit.getParameters(webRequest);

        // Then
        verifyZeroInteractions(multipleParameterRetriever);
        assertEquals(expected, actual);
    }


}