package org.lnu.is.web.rest.processor.resolver.parameters;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DefaultMultipleParameterRetrieverTest {

    private DefaultMultipleParameterRetriever unit = new DefaultMultipleParameterRetriever();

    @Test
    public void testGetMultiParameter() throws Exception {
        // Given
        String id1 = "fsdfs";
        String id2 = "rewr";
        String id3 = "vxcv";

        String[] value = {id1, id2, id3};
        List<String> expected = Arrays.<String>asList(id1, id2, id3);

        // When
        List<?> actual = unit.getMultiParameter(value);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testGetMultiParameterWithNumericValues() throws Exception {
        // Given
        Long id1 = 1L;
        Long id2 = 2L;
        Long id3 = 3L;

        String[] value = {String.valueOf(id1), String.valueOf(id2), String.valueOf(id3)};
        List<Long> expected = Arrays.<Long>asList(id1, id2, id3);

        // When
        List<?> actual = unit.getMultiParameter(value);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testGetMultiParameterWithSingleValue() throws Exception {
        // Given
        String id1 = "fsdsd";

        String[] value = {id1};
        List<String> expected = Arrays.<String>asList(id1);

        // When
        List<?> actual = unit.getMultiParameter(value);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testGetMultiParameterWithSingleValueAndSpaces() throws Exception {
        // Given
        String id1 = "fsdfsd";

        String[] value = {id1};
        List<String> expected = Arrays.<String>asList(id1);

        // When
        List<?> actual = unit.getMultiParameter(value);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testGetMultiParameterWithSpaces() throws Exception {
        // Given
        String id1 = "fsdfs";
        String id2 = "rewr";
        String id3 = "vxcv";

        String[] value = {id1, id2, id3};
        List<String> expected = Arrays.<String>asList(id1, id2, id3);

        // When
        List<?> actual = unit.getMultiParameter(value);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testGetMultiParameterWithBeginningSpaces() throws Exception {
        // Given
        String id1 = "fsdfs";
        String id2 = "rewr";
        String id3 = "vxcv";

        String[] value = {id1, id2, id3};
        List<String> expected = Arrays.<String>asList(id1, id2, id3);

        // When
        List<?> actual = unit.getMultiParameter(value);

        // Then
        assertEquals(expected, actual);
    }

}