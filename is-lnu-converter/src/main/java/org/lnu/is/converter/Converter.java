package org.lnu.is.converter;

import java.util.List;

/**
 * Interface for converting one object into another.
 * @author ivanursul
 *
 * @param <Source> Input object class
 * @param <Target> Output object class
 */
public interface Converter<Source, Target> {

	/**
	 * Method is used to convert from one object to Another.
	 * Note, that another object should be already instantiated.
	 * @param source From.
	 * @param target To.
	 * @return Converted object.
	 */
    Target convert(Source source, Target target);
    
    /**
     * Classic method, that is used to convert from one instance
     * to another.
     * @param source From what to convert.
     * @return Converted object.
     */
    Target convert(Source source);

    /**
     * Converts List of objects.
     * @param sources List input objects.
     * @return Converted List of Output objects.
     */
    List<Target> convertAll(List<Source> sources);

    /**
     * Converts List of objects.
     * targets should be already instantiated.
     * @param sources List input objects.
     * @param targets List of Ouput objects
     * @return Converted List of Output objects.
     */
    List<Target> convertAll(List<Source> sources, List<Target> targets);

}
