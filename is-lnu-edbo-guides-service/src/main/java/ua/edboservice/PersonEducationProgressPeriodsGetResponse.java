
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
 *         &lt;element name="PersonEducationProgressPeriodsGetResult" type="{http://edboservice.ua/}ArrayOfDPersonEducationProgressPeriods" minOccurs="0"/>
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
    "personEducationProgressPeriodsGetResult"
})
@XmlRootElement(name = "PersonEducationProgressPeriodsGetResponse")
public class PersonEducationProgressPeriodsGetResponse {

    @XmlElement(name = "PersonEducationProgressPeriodsGetResult")
    protected ArrayOfDPersonEducationProgressPeriods personEducationProgressPeriodsGetResult;

    /**
     * Gets the value of the personEducationProgressPeriodsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationProgressPeriods }
     *     
     */
    public ArrayOfDPersonEducationProgressPeriods getPersonEducationProgressPeriodsGetResult() {
        return personEducationProgressPeriodsGetResult;
    }

    /**
     * Sets the value of the personEducationProgressPeriodsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationProgressPeriods }
     *     
     */
    public void setPersonEducationProgressPeriodsGetResult(ArrayOfDPersonEducationProgressPeriods value) {
        this.personEducationProgressPeriodsGetResult = value;
    }

}
