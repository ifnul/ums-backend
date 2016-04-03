package org.lnu.is.facade.facade.enrolment;

import org.lnu.is.converter.Converter;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.EnrolmentRating;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.facade.facade.DefaultFacade;
import org.lnu.is.resource.enrolment.EnrolmentRatingResource;
import org.lnu.is.resource.enrolment.EnrolmentResource;
import org.lnu.is.resource.enrolment.RatingResource;
import org.lnu.is.service.Service;
import org.lnu.is.service.enrolment.EnrolmentService;

import java.util.List;

public class DefaultEnrolmentFacade extends DefaultFacade<Enrolment, EnrolmentResource, Enrolment, EnrolmentResource,
        EnrolmentService, Long> implements EnrolmentFacade {

    private Converter<EnrolmentRating, EnrolmentRatingResource> enrolmentRatingResourceConverter;

    private Service<SpecOffer, SpecOffer, Long> specOfferService;

    @Override
    public RatingResource getRatingEnrolments(long specofferId) {
        RatingResource ratingResource = new RatingResource();
        List<EnrolmentRating> enrolmentRatings = service.getRatingEnrolments(specofferId);
        SpecOffer specOffer = specOfferService.getEntity(specofferId);
        List<EnrolmentRatingResource> enrolments = enrolmentRatingResourceConverter.convertAll(enrolmentRatings);

        ratingResource.setEnrolments(enrolments);
        ratingResource.setLicCount(specOffer.getLicCount());
        ratingResource.setStateCount(specOffer.getStateCount());

        return ratingResource;
    }

    public void setEnrolmentRatingResourceConverter(Converter<EnrolmentRating, EnrolmentRatingResource> enrolmentRatingResourceConverter) {
        this.enrolmentRatingResourceConverter = enrolmentRatingResourceConverter;
    }

    public void setSpecOfferService(Service<SpecOffer, SpecOffer, Long> specOfferService) {
        this.specOfferService = specOfferService;
    }
}
