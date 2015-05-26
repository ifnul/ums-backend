package org.lnu.is.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for Limit values.
 * @author ivanursul
 *
 */
@Target({ ElementType.PARAMETER, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Limit {
	 
    /**
     * The name of the request attribute to bind to.
     */
    String value() default "limit";
 
    /**
     * Whether the parameter is required.
     * Default is true, leading to an exception thrown in case
     * of the parameter missing in the request. Switch this to
     * false if you prefer a null in case of the parameter missing.
     * Alternatively, provide a {@link #defaultValue() defaultValue},
     * which implicitly sets this flag to false.
     */
    boolean required() default false;
 
    /**
     * The default value to use as a fallback. Supplying a default value
     * implicitly sets {@link #required()} to false.
     */
    String defaultValue() default "20";
}
