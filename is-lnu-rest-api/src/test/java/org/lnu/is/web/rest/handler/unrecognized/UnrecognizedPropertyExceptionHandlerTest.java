package org.lnu.is.web.rest.handler.unrecognized;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import org.junit.Test;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.message.validation.UnrecognizedPropertyMessageResource;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/**
 * Created by ivanursul on 6/18/15.
 */
public class UnrecognizedPropertyExceptionHandlerTest {

    private UnrecognizedPropertyExceptionHandler unit = new UnrecognizedPropertyExceptionHandler();

    @Test
    public void testHandle() throws Exception {
        // Given
        JsonLocation loc = new JsonLocation(null, 1L, 1, 1, 1);
        Class<?> clz = UnrecognizedPropertyException.class;
        Collection<Object> fields = Arrays.asList("field1", "field2");
        String propName = "propName";
        String message = "message";
        UnrecognizedPropertyException e = new UnrecognizedPropertyException(message, loc, clz, propName, fields);

        MessageResource expected = new UnrecognizedPropertyMessageResource(MessageType.ERROR, "Unrecognized Property sent", propName, fields.stream().map(field -> field.toString()).collect(Collectors.toList()));

        // When
        MessageResource actual = unit.handle(e);

        // Then
        assertEquals(expected, actual);
    }
}