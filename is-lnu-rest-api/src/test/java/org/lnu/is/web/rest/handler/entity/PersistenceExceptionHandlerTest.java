package org.lnu.is.web.rest.handler.entity;

import org.hibernate.exception.ConstraintViolationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
import java.sql.SQLException;
import java.text.MessageFormat;
import static org.junit.Assert.assertEquals;


/**
 * PersistenceExceptionHandler Tester.
 * Date: 07/10/2015
 *
 * @author : Lebedev S.V. aka Moro
 */

@RunWith(MockitoJUnitRunner.class)
public class PersistenceExceptionHandlerTest {
    private PersistenceExceptionHandler handler = new PersistenceExceptionHandler();

    @Test
    public void shouldChangeExceptionMessage() throws Exception {
        ConstraintViolationException constraintViolationException = new ConstraintViolationException("Could not execute JDBC batch update", Mockito.mock(SQLException.class), "ConstraintName");
        PersistenceException exception = new PersistenceException("", constraintViolationException);

        MessageResource expected = new MessageResource();
        expected.setMessageType(MessageType.ERROR);
        expected.setMessage(MessageFormat.format("ConstraintViolationName : {0}", constraintViolationException.getConstraintName()));

        MessageResource actual = handler.handle(exception);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotChangeExceptionMessage() throws Exception {
        NoResultException noResultException = new NoResultException("");
        PersistenceException exception = new PersistenceException("Without result", noResultException);

        MessageResource expected = new MessageResource();
        expected.setMessageType(MessageType.ERROR);
        expected.setMessage(exception.getMessage());

        MessageResource actual = handler.handle(exception);

        assertEquals(expected, actual);
    }
}
