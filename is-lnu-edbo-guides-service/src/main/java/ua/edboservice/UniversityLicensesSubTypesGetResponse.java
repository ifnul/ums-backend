
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
 *         &lt;element name="UniversityLicensesSubTypesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityLicensesSubTypes" minOccurs="0"/>
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
    "universityLicensesSubTypesGetResult"
})
@XmlRootElement(name = "UniversityLicensesSubTypesGetResponse")
public class UniversityLicensesSubTypesGetResponse {

    @XmlElement(name = "UniversityLicensesSubTypesGetResult")
    protected ArrayOfDUniversityLicensesSubTypes universityLicensesSubTypesGetResult;

    /**
     * Gets the value of the universityLicensesSubTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityLicensesSubTypes }
     *     
     */
    public ArrayOfDUniversityLicensesSubTypes getUniversityLicensesSubTypesGetResult() {
        return universityLicensesSubTypesGetResult;
    }

    /**
     * Sets the value of the universityLicensesSubTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityLicensesSubTypes }
     *     
     */
    public void setUniversityLicensesSubTypesGetResult(ArrayOfDUniversityLicensesSubTypes value) {
        this.universityLicensesSubTypesGetResult = value;
    }

}
