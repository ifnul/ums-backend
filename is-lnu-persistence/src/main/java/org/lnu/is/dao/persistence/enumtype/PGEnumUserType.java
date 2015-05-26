package org.lnu.is.dao.persistence.enumtype;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.usertype.EnhancedUserType;
import org.hibernate.usertype.ParameterizedType;
import org.postgresql.util.PGobject;

/**
 * Enum Type for resolving RowStatus Enum.
 * @author ivanursul
 *
 * @param <E> param
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class PGEnumUserType<E extends Enum> implements EnhancedUserType, ParameterizedType {

	private Class<Enum> enumClass;

	@Override
	public void setParameterValues(final Properties parameters) {
		String enumClassName = parameters.getProperty("enumClassName");
		try {
			enumClass = (Class<Enum>) Class.forName(enumClassName);
		} catch (ClassNotFoundException cnfe) {
			throw new HibernateException("Enum class not found", cnfe);
		}
	}

	@Override
	public Object assemble(final Serializable cached, final Object owner) throws HibernateException {
		return cached;
	}

	@Override
	public Object deepCopy(final Object value) throws HibernateException {
		return value;
	}

	@Override
	public Serializable disassemble(final Object value) throws HibernateException {
		return (Enum) value;
	}

	@Override
	public boolean equals(final Object x, final Object y) throws HibernateException {
		return x == y;
	}

	@Override
	public int hashCode(final Object x) throws HibernateException {
		return x.hashCode();
	}

	@Override
	public boolean isMutable() {
		return false;
	}

	@Override
	public void nullSafeSet(final PreparedStatement st, final Object value,
			final int index, final SessionImplementor session)
			throws HibernateException, SQLException {
		if (value == null) {
			st.setNull(index, Types.VARCHAR);
			// UPDATE: To support NULL insertion, change to: st.setNull(index, 1111);
		} else {
			// Notice 1111 which java.sql.Type for Postgres Enum
			st.setObject(index, (value), 1111);
		}
	}

	@Override
	public Object replace(final Object original, final Object target, final Object owner) throws HibernateException {
		return original;
	}

	@Override
	public Class returnedClass() {
		return enumClass;
	}

	@Override
	public int[] sqlTypes() {
 		int[] sqlTypes = { Types.VARCHAR };
		return sqlTypes;
	}

	@Override
	public Object fromXMLString(final String xmlValue) {
		return Enum.valueOf(enumClass, xmlValue);
	}

	@Override
	public String objectToSQLString(final Object value) {
		return '\'' + ((Enum) value).name() + '\'';
	}

	@Override
	public String toXMLString(final Object value) {
		return ((Enum) value).name();
	}

	@Override
	public Object nullSafeGet(final ResultSet rs, final String[] names,
			final SessionImplementor session, final Object owner)
			throws HibernateException, SQLException {
		Object object = rs.getObject(names[0]);
		if (rs.wasNull()) {
			return null;
		}

		// Notice how Object is mapped to PGobject. This makes this implementation Postgres specific
		if (object instanceof PGobject) {
			PGobject pg = (PGobject) object;
			return Enum.valueOf(enumClass, pg.getValue());
		}
		return null;
	}

}
