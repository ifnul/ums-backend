package org.lnu.is.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.dao.dao.enrolment.EnrolmentDao;
import org.lnu.is.dao.dao.specoffer.SpecOfferWaveDao;
import org.lnu.is.domain.enrolment.EnrolmentRating;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferWave;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EnrolmentServiceTest {

    @Mock
    private Dao<SpecOffer, SpecOffer, Long> specOfferDao;

    @Mock
    private SpecOfferWaveDao specOfferWaveDao;

    @Mock
    protected EnrolmentDao dao;

    @InjectMocks
    private EnrolmentService unit;

    @Test
    public void testGetRatingEnrolments() throws Exception {
        // Given
        long specOfferId = 1L;
        SpecOffer specOffer = new SpecOffer();
        specOffer.setId(specOfferId);
        SpecOfferWave specOfferWave = new SpecOfferWave();
        specOfferWave.setSpecOffer(specOffer);
        specOfferWave.setTargetCount(8);
        specOfferWave.setBenefitCount(5);

        List<EnrolmentRating> ratings = IntStream.range(0, 10)
                .mapToObj(i -> {
                    EnrolmentRating rating = new EnrolmentRating();
                    rating.setKb(10 - i);
                    return rating;
                }).collect(Collectors.toList());
        List<EnrolmentRating> offEnrolmentRatings = IntStream.range(0, 5)
                .mapToObj(i -> {
                    EnrolmentRating rating = new EnrolmentRating();
                    rating.setKb(5 - i);
                    return rating;
                }).collect(Collectors.toList());

        int expectedDestinationLimit = 8;
        int offDestinationCount = 5;

        // When
        when(specOfferDao.getEntityById(anyLong())).thenReturn(specOffer);
        when(specOfferWaveDao.getLastSpecOfferWave(any(SpecOffer.class))).thenReturn(specOfferWave);
        when(dao.getDestinationEntryEnrolments(anyLong())).thenReturn(ratings);
        when(dao.getOffCompetitionEnrolments(anyLong())).thenReturn(offEnrolmentRatings);
        unit.getRatingEnrolments(specOfferId);

        // Then
        verify(dao).getRatingEnrolments(specOfferId, expectedDestinationLimit, offDestinationCount);
    }


    @Test
    public void testGetRatingEnrolmentsWithLessCount() throws Exception {
        // Given
        long specOfferId = 1L;
        SpecOffer specOffer = new SpecOffer();
        specOffer.setId(specOfferId);
        SpecOfferWave specOfferWave = new SpecOfferWave();
        specOfferWave.setSpecOffer(specOffer);
        specOfferWave.setTargetCount(8);
        specOfferWave.setBenefitCount(4);

        List<EnrolmentRating> ratings = IntStream.range(0, 10)
                .mapToObj(i -> {
                    EnrolmentRating rating = new EnrolmentRating();
                    rating.setKb(10 - i);
                    return rating;
                }).collect(Collectors.toList());
        List<EnrolmentRating> offEnrolmentRatings = IntStream.range(0, 5)
                .mapToObj(i -> {
                    EnrolmentRating rating = new EnrolmentRating();
                    rating.setKb(5 - i);
                    return rating;
                }).collect(Collectors.toList());

        int expectedDestinationLimit = 8;
        int offDestinationCount = 4;

        // When
        when(specOfferDao.getEntityById(anyLong())).thenReturn(specOffer);
        when(specOfferWaveDao.getLastSpecOfferWave(any(SpecOffer.class))).thenReturn(specOfferWave);
        when(dao.getDestinationEntryEnrolments(anyLong())).thenReturn(ratings);
        when(dao.getOffCompetitionEnrolments(anyLong())).thenReturn(offEnrolmentRatings);
        unit.getRatingEnrolments(specOfferId);

        // Then
        verify(dao).getRatingEnrolments(specOfferId, expectedDestinationLimit, offDestinationCount);
    }

    @Test
    public void testGetRatingEnrolmentsWithLessCountAndSomeEqualsBoundScores() throws Exception {
        // Given
        long specOfferId = 1L;
        SpecOffer specOffer = new SpecOffer();
        specOffer.setId(specOfferId);
        SpecOfferWave specOfferWave = new SpecOfferWave();
        specOfferWave.setSpecOffer(specOffer);
        specOfferWave.setTargetCount(8);
        specOfferWave.setBenefitCount(4);

        List<EnrolmentRating> ratings = IntStream.range(0, 10)
                .mapToObj(i -> {
                    EnrolmentRating rating = new EnrolmentRating();
                    rating.setKb(10 - i);
                    return rating;
                }).collect(Collectors.toList());
        List<EnrolmentRating> offEnrolmentRatings = IntStream.range(0, 5)
                .mapToObj(i -> {
                    EnrolmentRating rating = new EnrolmentRating();
                    rating.setKb(5 - i);
                    return rating;
                }).collect(Collectors.toList());
        offEnrolmentRatings.get(2).setKb(2);

        int expectedDestinationLimit = 8;
        int offDestinationCount = 2;

        // When
        when(specOfferDao.getEntityById(anyLong())).thenReturn(specOffer);
        when(specOfferWaveDao.getLastSpecOfferWave(any(SpecOffer.class))).thenReturn(specOfferWave);
        when(dao.getDestinationEntryEnrolments(anyLong())).thenReturn(ratings);
        when(dao.getOffCompetitionEnrolments(anyLong())).thenReturn(offEnrolmentRatings);
        unit.getRatingEnrolments(specOfferId);

        // Then
        verify(dao).getRatingEnrolments(specOfferId, expectedDestinationLimit, offDestinationCount);
    }

    @Test
    public void testGetRatingEnrolmentsWithLessCountAndSomeEqualBoundScores() throws Exception {
        // Given
        long specOfferId = 1L;
        SpecOffer specOffer = new SpecOffer();
        specOffer.setId(specOfferId);
        SpecOfferWave specOfferWave = new SpecOfferWave();
        specOfferWave.setSpecOffer(specOffer);
        specOfferWave.setTargetCount(8);
        specOfferWave.setBenefitCount(5);

        List<EnrolmentRating> ratings = IntStream.range(0, 10)
                .mapToObj(i -> {
                    EnrolmentRating rating = new EnrolmentRating();
                    rating.setKb(10 - i);
                    return rating;
                }).collect(Collectors.toList());
        List<EnrolmentRating> offEnrolmentRatings = IntStream.range(0, 5)
                .mapToObj(i -> {
                    EnrolmentRating rating = new EnrolmentRating();
                    rating.setKb(5 - i);
                    return rating;
                }).collect(Collectors.toList());
        offEnrolmentRatings.get(3).setKb(1);

        int expectedDestinationLimit = 8;
        int offDestinationCount = 3;

        // When
        when(specOfferDao.getEntityById(anyLong())).thenReturn(specOffer);
        when(specOfferWaveDao.getLastSpecOfferWave(any(SpecOffer.class))).thenReturn(specOfferWave);
        when(dao.getDestinationEntryEnrolments(anyLong())).thenReturn(ratings);
        when(dao.getOffCompetitionEnrolments(anyLong())).thenReturn(offEnrolmentRatings);
        unit.getRatingEnrolments(specOfferId);

        // Then
        verify(dao).getRatingEnrolments(specOfferId, expectedDestinationLimit, offDestinationCount);
    }

    @Test
    public void testGetRatingEnrolmentsWithOffDestinationCountZero() throws Exception {
        // Given
        long specOfferId = 1L;
        SpecOffer specOffer = new SpecOffer();
        specOffer.setId(specOfferId);
        SpecOfferWave specOfferWave = new SpecOfferWave();
        specOfferWave.setSpecOffer(specOffer);
        specOfferWave.setTargetCount(8);
        specOfferWave.setBenefitCount(0);

        List<EnrolmentRating> ratings = IntStream.range(0, 10)
                .mapToObj(i -> {
                    EnrolmentRating rating = new EnrolmentRating();
                    rating.setKb(10 - i);
                    return rating;
                }).collect(Collectors.toList());
        List<EnrolmentRating> offEnrolmentRatings = IntStream.range(0, 5)
                .mapToObj(i -> {
                    EnrolmentRating rating = new EnrolmentRating();
                    rating.setKb(5 - i);
                    return rating;
                }).collect(Collectors.toList());

        int expectedDestinationLimit = 8;
        int offDestinationCount = 5;

        // When
        when(specOfferDao.getEntityById(anyLong())).thenReturn(specOffer);
        when(specOfferWaveDao.getLastSpecOfferWave(any(SpecOffer.class))).thenReturn(specOfferWave);
        when(dao.getDestinationEntryEnrolments(anyLong())).thenReturn(ratings);
        when(dao.getOffCompetitionEnrolments(anyLong())).thenReturn(offEnrolmentRatings);
        unit.getRatingEnrolments(specOfferId);

        // Then
        verify(dao).getRatingEnrolments(specOfferId, expectedDestinationLimit, offDestinationCount);
    }

    @Test
    public void testGetRatingEnrolmentsWithLargerOffDestinationCount() throws Exception {
        // Given
        long specOfferId = 1L;
        SpecOffer specOffer = new SpecOffer();
        specOffer.setId(specOfferId);
        SpecOfferWave specOfferWave = new SpecOfferWave();
        specOfferWave.setSpecOffer(specOffer);
        specOfferWave.setTargetCount(8);
        specOfferWave.setBenefitCount(10);

        List<EnrolmentRating> ratings = IntStream.range(0, 10)
                .mapToObj(i -> {
                    EnrolmentRating rating = new EnrolmentRating();
                    rating.setKb(10 - i);
                    return rating;
                }).collect(Collectors.toList());
        List<EnrolmentRating> offEnrolmentRatings = IntStream.range(0, 5)
                .mapToObj(i -> {
                    EnrolmentRating rating = new EnrolmentRating();
                    rating.setKb(5 - i);
                    return rating;
                }).collect(Collectors.toList());

        int expectedDestinationLimit = 8;
        int offDestinationCount = 10;

        // When
        when(specOfferDao.getEntityById(anyLong())).thenReturn(specOffer);
        when(specOfferWaveDao.getLastSpecOfferWave(any(SpecOffer.class))).thenReturn(specOfferWave);
        when(dao.getDestinationEntryEnrolments(anyLong())).thenReturn(ratings);
        when(dao.getOffCompetitionEnrolments(anyLong())).thenReturn(offEnrolmentRatings);
        unit.getRatingEnrolments(specOfferId);

        // Then
        verify(dao).getRatingEnrolments(specOfferId, expectedDestinationLimit, offDestinationCount);
    }

    @Test
    public void testGetRatingEnrolmentsWithLargerCount() throws Exception {
        // Given
        long specOfferId = 1L;
        SpecOffer specOffer = new SpecOffer();
        specOffer.setId(specOfferId);
        SpecOfferWave specOfferWave = new SpecOfferWave();
        specOfferWave.setSpecOffer(specOffer);
        specOfferWave.setTargetCount(20);
        specOfferWave.setBenefitCount(5);

        List<EnrolmentRating> ratings = IntStream.range(0, 10)
                .mapToObj(i -> {
                    EnrolmentRating rating = new EnrolmentRating();
                    rating.setKb(10 - i);
                    return rating;
                }).collect(Collectors.toList());

        List<EnrolmentRating> offEnrolmentRatings = IntStream.range(0, 5)
                .mapToObj(i -> {
                    EnrolmentRating rating = new EnrolmentRating();
                    rating.setKb(5 - i);
                    return rating;
                }).collect(Collectors.toList());

        int expectedDestinationLimit = 20;
        int offDestinationCount = 5;

        // When
        when(specOfferDao.getEntityById(anyLong())).thenReturn(specOffer);
        when(specOfferWaveDao.getLastSpecOfferWave(any(SpecOffer.class))).thenReturn(specOfferWave);
        when(dao.getDestinationEntryEnrolments(anyLong())).thenReturn(ratings);
        when(dao.getOffCompetitionEnrolments(anyLong())).thenReturn(offEnrolmentRatings);
        unit.getRatingEnrolments(specOfferId);

        // Then
        verify(dao).getRatingEnrolments(specOfferId, expectedDestinationLimit, offDestinationCount);
    }

    @Test
    public void testGetRatingEnrolmentsWithZeroCount() throws Exception {
        // Given
        long specOfferId = 1L;
        SpecOffer specOffer = new SpecOffer();
        specOffer.setId(specOfferId);
        SpecOfferWave specOfferWave = new SpecOfferWave();
        specOfferWave.setSpecOffer(specOffer);
        specOfferWave.setTargetCount(0);
        specOfferWave.setBenefitCount(5);

        List<EnrolmentRating> ratings = IntStream.range(0, 10)
                .mapToObj(i -> {
                    EnrolmentRating rating = new EnrolmentRating();
                    rating.setKb(10 - i);
                    return rating;
                }).collect(Collectors.toList());
        List<EnrolmentRating> offEnrolmentRatings = IntStream.range(0, 5)
                .mapToObj(i -> {
                    EnrolmentRating rating = new EnrolmentRating();
                    rating.setKb(5 - i);
                    return rating;
                }).collect(Collectors.toList());

        int expectedDestinationLimit = 10;
        int offDestinationCount = 5;

        // When
        when(specOfferDao.getEntityById(anyLong())).thenReturn(specOffer);
        when(specOfferWaveDao.getLastSpecOfferWave(any(SpecOffer.class))).thenReturn(specOfferWave);
        when(dao.getDestinationEntryEnrolments(anyLong())).thenReturn(ratings);
        when(dao.getOffCompetitionEnrolments(anyLong())).thenReturn(offEnrolmentRatings);
        unit.getRatingEnrolments(specOfferId);

        // Then
        verify(dao).getRatingEnrolments(specOfferId, expectedDestinationLimit, offDestinationCount);
    }

    @Test
    public void testGetRatingEnrolmentsWithTargetCountAsRatingsCount() throws Exception {
        // Given
        long specOfferId = 1L;
        SpecOffer specOffer = new SpecOffer();
        specOffer.setId(specOfferId);
        SpecOfferWave specOfferWave = new SpecOfferWave();
        specOfferWave.setSpecOffer(specOffer);
        specOfferWave.setTargetCount(10);
        specOfferWave.setBenefitCount(5);

        List<EnrolmentRating> ratings = IntStream.range(0, 10)
                .mapToObj(i -> {
                    EnrolmentRating rating = new EnrolmentRating();
                    rating.setKb(10 - i);
                    return rating;
                }).collect(Collectors.toList());

        List<EnrolmentRating> offEnrolmentRatings = IntStream.range(0, 5)
                .mapToObj(i -> {
                    EnrolmentRating rating = new EnrolmentRating();
                    rating.setKb(5 - i);
                    return rating;
                }).collect(Collectors.toList());

        int expectedDestinationLimit = 10;
        int offDestinationCount = 5;

        // When
        when(specOfferDao.getEntityById(anyLong())).thenReturn(specOffer);
        when(specOfferWaveDao.getLastSpecOfferWave(any(SpecOffer.class))).thenReturn(specOfferWave);
        when(dao.getDestinationEntryEnrolments(anyLong())).thenReturn(ratings);
        when(dao.getOffCompetitionEnrolments(anyLong())).thenReturn(offEnrolmentRatings);
        unit.getRatingEnrolments(specOfferId);

        // Then
        verify(dao).getRatingEnrolments(specOfferId, expectedDestinationLimit, offDestinationCount);
    }

    @Test
    public void testGetRatingEnrolmentsWithTargetCountAsRatingsCountAndSameLAstKb() throws Exception {
        // Given
        long specOfferId = 1L;
        SpecOffer specOffer = new SpecOffer();
        specOffer.setId(specOfferId);
        SpecOfferWave specOfferWave = new SpecOfferWave();
        specOfferWave.setSpecOffer(specOffer);
        specOfferWave.setTargetCount(10);
        specOfferWave.setBenefitCount(5);

        List<EnrolmentRating> ratings = IntStream.range(0, 10)
                .mapToObj(i -> {
                    EnrolmentRating rating = new EnrolmentRating();
                    rating.setKb(10 - i);
                    return rating;
                }).collect(Collectors.toList());
        ratings.get(8).setKb(1);

        List<EnrolmentRating> offEnrolmentRatings = IntStream.range(0, 5)
                .mapToObj(i -> {
                    EnrolmentRating rating = new EnrolmentRating();
                    rating.setKb(5 - i);
                    return rating;
                }).collect(Collectors.toList());

        int expectedDestinationLimit = 8;
        int offDestinationCount = 5;

        // When
        when(specOfferDao.getEntityById(anyLong())).thenReturn(specOffer);
        when(specOfferWaveDao.getLastSpecOfferWave(any(SpecOffer.class))).thenReturn(specOfferWave);
        when(dao.getDestinationEntryEnrolments(anyLong())).thenReturn(ratings);
        when(dao.getOffCompetitionEnrolments(anyLong())).thenReturn(offEnrolmentRatings);
        unit.getRatingEnrolments(specOfferId);

        // Then
        verify(dao).getRatingEnrolments(specOfferId, expectedDestinationLimit, offDestinationCount);
    }

    @Test
    public void testGetRatingEnrolmentsWithTheSameLastKb() throws Exception {
        // Given
        long specOfferId = 1L;
        SpecOffer specOffer = new SpecOffer();
        specOffer.setId(specOfferId);
        SpecOfferWave specOfferWave = new SpecOfferWave();
        specOfferWave.setSpecOffer(specOffer);
        specOfferWave.setTargetCount(8);
        specOfferWave.setBenefitCount(5);

        List<EnrolmentRating> ratings = IntStream.range(0, 10)
                .mapToObj(i -> {
                    EnrolmentRating rating = new EnrolmentRating();
                    rating.setKb(10 - i);
                    return rating;
                }).collect(Collectors.toList());
        ratings.get(6).setKb(3.0);

        List<EnrolmentRating> offEnrolmentRatings = IntStream.range(0, 5)
                .mapToObj(i -> {
                    EnrolmentRating rating = new EnrolmentRating();
                    rating.setKb(5 - i);
                    return rating;
                }).collect(Collectors.toList());

        int expectedDestinationLimit = 6;
        int offDestinationCount = 5;

        // When
        when(specOfferDao.getEntityById(anyLong())).thenReturn(specOffer);
        when(specOfferWaveDao.getLastSpecOfferWave(any(SpecOffer.class))).thenReturn(specOfferWave);
        when(dao.getDestinationEntryEnrolments(anyLong())).thenReturn(ratings);
        when(dao.getOffCompetitionEnrolments(anyLong())).thenReturn(offEnrolmentRatings);
        unit.getRatingEnrolments(specOfferId);

        // Then
        verify(dao).getRatingEnrolments(specOfferId, expectedDestinationLimit, offDestinationCount);
    }
}