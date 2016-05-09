package org.lnu.is.edbo.exeption;

public enum EdboType {

    Benefit("Benefit", false),
    CourseTimePeriod("Course Time Period", false),
    Department("Department", false),
    EducationFormType("Education Form Type", false),
    EnrolmentSubject("Enrolment Subject", false),
    Person("Person", false),
    PersonAddres("Person Addres", false),
    PersonBenefit("Person Benefit", false),
    PersonDocument("Person Document", false),
    PersonDocumentSubject("Person Document Subject", false),
    PersonOlympiadsAwards("Person Olympiads Awards", false),
    Request("Request", false),
    RequestBenefits("Request Benefits", false),
    RequestDocumentSubject("Request Document Subject", false),
    RequestExaminations("Request Examinations", false),
    RequestOlympiadAward("Request Olympiad Award", false),
    RequestQuota("Request Quota", false),
    Specialty("Specialty", false),
    SpecialtyParent("Specialty Parent", false),
    SpecOffer("Spec Offer", false),
    SpecOfferType("Spec Offer Type", false),
    TimePeriod("Time Period", false);

    private final String name;

    private EdboType(String s, boolean implement) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        return (otherName == null) ? false : name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }
}
