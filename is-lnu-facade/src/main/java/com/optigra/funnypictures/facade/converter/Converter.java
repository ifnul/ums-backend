package com.optigra.funnypictures.facade.converter;

import java.util.List;

public interface Converter<Source, Target> {

    Target convert(Source source, Target target);

    Target convert(Source source);

    List<Target> convertAll(List<Source> sources);

    List<Target> convertAll(List<Source> sources, List<Target> targets);

}