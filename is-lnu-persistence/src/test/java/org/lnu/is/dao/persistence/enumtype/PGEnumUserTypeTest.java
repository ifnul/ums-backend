package org.lnu.is.dao.persistence.enumtype;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.Properties;

import org.hibernate.engine.spi.SessionImplementor;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.common.RowStatus;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.postgresql.util.PGobject;

@RunWith(MockitoJUnitRunner.class)
public class PGEnumUserTypeTest {

	private PGEnumUserType<RowStatus> unit = new PGEnumUserType<RowStatus>();
	
	@Mock
	private Properties parameters;

	@Mock
	private PreparedStatement st;

	private Object original = new Object();

	private Object target = new Object();

	private Object owner = new Object();
	
	@Mock
	private ResultSet rs;

	@Mock
	private SessionImplementor session;
	
	@Before
	public void setup() {
		when(parameters.getProperty(anyString())).thenReturn(RowStatus.class.getName());
		unit.setParameterValues(parameters);
		
		unit.replace(original, target, owner);
		unit.returnedClass();
		unit.sqlTypes();
		unit.objectToSQLString(RowStatus.ACTIVE);
		unit.toXMLString(RowStatus.ACTIVE);
	}
	
	@Test
	public void testSetParameterValues() throws Exception {
		// Given

		// When
		when(parameters.getProperty(anyString())).thenReturn(RowStatus.class.getName());
		
		unit.setParameterValues(parameters);

		// Then
		verify(parameters, times(2)).getProperty("enumClassName");
	}
	
	@Test(expected = ClassNotFoundException.class)
	public void testSetParameterValuesWithException() throws Exception {
		// Given
		
		// When
		doThrow(ClassNotFoundException.class).when(parameters).getProperty(anyString());
		unit.setParameterValues(parameters);
		
		// Then
		verify(parameters).getProperty("enumClassName");
	}
	
	@Test
	public void testAssemble() throws Exception {
		// Given
		Object owner = new Object();
		Serializable cached = new Serializable() {
			private static final long serialVersionUID = 1L;
		};

		// When
		unit.assemble(cached, owner);

		// Then
	}
	
	@Test
	public void testDeepCopy() throws Exception {
		// Given
		Object value = new Object();

		// When
		Object actual = unit.deepCopy(value);

		// Then
		assertEquals(value, actual);
	}
	
	@Test
	public void testDisassemble() throws Exception {
		// Given
		RowStatus value = RowStatus.ACTIVE;

		// When
		Serializable actual = unit.disassemble(value);

		// Then
		assertEquals(value, actual);
	}
	
	@Test
	public void testEquals() throws Exception {
		// Given
		Object x = new Object();
		Object y = x;

		// When
		boolean actual = unit.equals(x, y);

		// Then
		assertEquals(true, actual);
	}
	
	@Test
	public void testHashCode() throws Exception {
		// Given
		Object x = new Object();

		// When
		int actual = unit.hashCode(x);

		// Then
		assertEquals(x.hashCode(), actual);
	}
	
	@Test
	public void testIsMutable() throws Exception {
		// Given

		// When
		boolean actual = unit.isMutable();

		// Then
		assertEquals(false, actual);
	}
	
	@Test
	public void testNullSaveSet() throws Exception {
		// Given
		Object value = new Object();
		int index = 1;
		SessionImplementor session = null;

		// When
		unit.nullSafeSet(st, value, index, session);

		// Then
		verify(st).setObject(index, value, 1111);
	}
	
	@Test
	public void testNullSaveSetWithNullValue() throws Exception {
		// Given
		Object value = null;
		int index = 1;
		SessionImplementor session = null;
		
		// When
		unit.nullSafeSet(st, value, index, session);
		
		// Then
		verify(st).setNull(index, Types.VARCHAR);
	}
	
	@Test
	public void testNullSafeGet() throws Exception {
		// Given
		String[] names = { "status" };
		PGobject value = new PGobject();
		value.setValue("ACTIVE");
		
		// When
		when(rs.wasNull()).thenReturn(false);
		when(rs.getObject(anyString())).thenReturn(value );
		
		Object actual = unit.nullSafeGet(rs, names, session, owner);

		// Then
		assertEquals(RowStatus.ACTIVE, actual);
	}
	
	@Test
	public void testNullSafeGetWhenobjectIsNotPGobject() throws Exception {
		// Given
		String[] names = { "status" };
		Object value = new Object();
		
		// When
		when(rs.wasNull()).thenReturn(false);
		when(rs.getObject(anyString())).thenReturn(value );
		
		Object actual = unit.nullSafeGet(rs, names, session, owner);
		
		// Then
		assertEquals(null, actual);
	}
	
	@Test
	public void testNullSafeGetWhenRsWasNull() throws Exception {
		// Given
		String[] names = { "status" };
		PGobject value = new PGobject();
		value.setValue("ACTIVE");
		
		// When
		when(rs.wasNull()).thenReturn(true);
		when(rs.getObject(anyString())).thenReturn(value );
		
		Object actual = unit.nullSafeGet(rs, names, session, owner);
		
		// Then
		assertEquals(null, actual);
	}
}
