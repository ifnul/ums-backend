
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcademicCouncilSpecDecisionGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicCouncilSpecDecision" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "academicCouncilSpecDecisionGetResult"
})
@XmlRootElement(name = "AcademicCouncilSpecDecisionGetResponse")
public class AcademicCouncilSpecDecisionGetResponse {

    @XmlElement(name = "AcademicCouncilSpecDecisionGetResult")
    protected ArrayOfDAcademicCouncilSpecDecision academicCouncilSpecDecisionGetResult;

    /**
     * Gets the value of the academicCouncilSpecDecisionGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicCouncilSpecDecision }
     *     
     */
    public ArrayOfDAcademicCouncilSpecDecision getAcademicCouncilSpecDecisionGetResult() {
        return academicCouncilSpecDecisionGetResult;
    }

    /**
     * Sets the value of the academicCouncilSpecDecisionGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicCouncilSpecDecision }
     *     
     */
    public void setAcademicCouncilSpecDecisionGetResult(ArrayOfDAcademicCouncilSpecDecision value) {
        this.academicCouncilSpecDecisionGetResult = value;
    }

}
