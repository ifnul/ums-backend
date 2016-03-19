package org.lnu.is.dao.utils;

import org.apache.commons.beanutils.BeanUtils;
import org.lnu.is.annotation.NativeQueryResultColumn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NativeQueryResultsMapper {

    private static Logger log = LoggerFactory.getLogger(NativeQueryResultsMapper.class);

    public static <T> List<T> map(List<Object[]> objectArrayList, Class<T> genericType) {
        List<T> ret = new ArrayList<T>();
        List<Field> mappingFields = getNativeQueryResultColumnAnnotatedFields(genericType);
        try {
            for (Object[] objectArr : objectArrayList) {
                T t = genericType.newInstance();
                for (int i = 0; i < objectArr.length; i++) {
                    BeanUtils.setProperty(t, mappingFields.get(i).getName(), objectArr[i]);
                }
                ret.add(t);
            }
        } catch (InstantiationException ie) {
            log.debug("Cannot instantiate: ", ie);
            ret.clear();
        } catch (IllegalAccessException iae) {
            log.debug("Illegal access: ", iae);
            ret.clear();
        } catch (InvocationTargetException ite) {
            log.debug("Cannot invoke method: ", ite);
            ret.clear();
        }
        return ret;
    }

    public static <T> T map(Object[] objectArr, Class<T> genericType) {
        T ret = null;
        List<Field> mappingFields = getNativeQueryResultColumnAnnotatedFields(genericType);
        try {
            T t = genericType.newInstance();
            for (int i = 0; i < objectArr.length; i++) {
                BeanUtils.setProperty(t, mappingFields.get(i).getName(), objectArr[i]);
            }
            ret = t;
        } catch (InstantiationException ie) {
            log.debug("Cannot instantiate: ", ie);
        } catch (IllegalAccessException iae) {
            log.debug("Illegal access: ", iae);
        } catch (InvocationTargetException ite) {
            log.debug("Cannot invoke method: ", ite);
        }

        return ret;
    }

    // Get ordered list of fields
    private static <T> List<Field> getNativeQueryResultColumnAnnotatedFields(Class<T> genericType) {
        Field[] fields = genericType.getDeclaredFields();
        List<Field> orderedFields = Arrays.asList(new Field[fields.length]);
        for (int i = 0; i < fields.length; i++) {
            if (fields[i].isAnnotationPresent(NativeQueryResultColumn.class)) {
                NativeQueryResultColumn nqrc = fields[i].getAnnotation(NativeQueryResultColumn.class);
                orderedFields.set(nqrc.index(), fields[i]);
            }
        }
        return orderedFields;
    }
}
