package org.lnu.is.converter;

import java.util.ArrayList;
import java.util.List;

/**
 * Basic abstract converter, that implements two methods: convertAll with different signatures.
 * @author ivanursul
 *
 * @param <SOURCE> From what class to convert
 * @param <TARGET> To what class to convert
 */
public abstract class AbstractConverter<SOURCE, TARGET> implements Converter<SOURCE, TARGET> {

    @Override
    public List<TARGET> convertAll(final List<SOURCE> sources) {

        return convertAll(sources, new ArrayList<TARGET>(sources.size()));
    }

    @Override
    public List<TARGET> convertAll(final List<SOURCE> sources, final List<TARGET> targets) {

        for (SOURCE source : sources) {
            targets.add(convert(source));
        }

        return targets;
    }
}
