package org.lnu.is.converter.gendertype;

import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.gender.type.GenderTypeAllocation;
import org.lnu.is.resource.gender.type.GenderTypeAllocationResource;
import org.springframework.stereotype.Component;

@Component("genderTypeAllocationConverter")
public class GenderTypeAllocationConverter extends AbstractConverter<GenderTypeAllocation, GenderTypeAllocationResource> {

    @Override
    public GenderTypeAllocationResource convert(GenderTypeAllocation source, GenderTypeAllocationResource target) {

        target.setName(source.getName());
        target.setMenCount(source.getMenCount());
        target.setWomenCount(source.getWomenCount());

        return target;
    }

    @Override
    public GenderTypeAllocationResource convert(GenderTypeAllocation source) {
        return convert(source, new GenderTypeAllocationResource());
    }
}
