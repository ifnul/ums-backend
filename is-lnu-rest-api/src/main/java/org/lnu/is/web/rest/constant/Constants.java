package org.lnu.is.web.rest.constant;

import java.text.SimpleDateFormat;

/**
 * Constants class.
 * @author ivanursul
 *
 */
public class Constants {

    public static final String JAVAX_SERVLET_ERROR_MESSAGE = "javax.servlet.error.message";
    public static final String JAVAX_SERVLET_ERROR_STATUS_CODE = "javax.servlet.error.status_code";
    public static final String JAVAX_SERVLET_ERROR_EXCEPTION = "javax.servlet.error.exception";

    public static final String APPLICATION_API_PROPERTY = "application.api.context.path";
    public static final String DEFAULT_DATEFORMAT = "yyyy-MM-dd";
    public static final String ORDER_BY = "orderBy";
	
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(DEFAULT_DATEFORMAT);

    static {
    	DATE_FORMAT.setLenient(false);
    }
    
}
