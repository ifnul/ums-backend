package org.lnu.is.converter.enrolment;

import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.enrolment.EntrantPlace;
import org.lnu.is.resource.enrolment.EntrantPlaceResource;
import org.springframework.stereotype.Component;

/**
 * @since 3/11/16
 */
@Component("entrantPlaceResourceConverter")
public class EntrantPlaceResourceConverter extends AbstractConverter<EntrantPlace, EntrantPlaceResource> {

    @Override
    public EntrantPlaceResource convert(EntrantPlace source, EntrantPlaceResource target) {

        target.setDepartmentId(source.getDepartmentId());
        target.setDepartmentName(source.getDepartmentName());
        target.setEntrantPlace(source.getEntrantPlace());

        return target;
    }

    @Override
    public EntrantPlaceResource convert(EntrantPlace source) {
        return convert(source, new EntrantPlaceResource());
    }
}
