
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
 *         &lt;element name="UniversityLicensesTypesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityLicensesTypes" minOccurs="0"/>
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
    "universityLicensesTypesGetResult"
})
@XmlRootElement(name = "UniversityLicensesTypesGetResponse")
public class UniversityLicensesTypesGetResponse {

    @XmlElement(name = "UniversityLicensesTypesGetResult")
    protected ArrayOfDUniversityLicensesTypes universityLicensesTypesGetResult;

    /**
     * Gets the value of the universityLicensesTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityLicensesTypes }
     *     
     */
    public ArrayOfDUniversityLicensesTypes getUniversityLicensesTypesGetResult() {
        return universityLicensesTypesGetResult;
    }

    /**
     * Sets the value of the universityLicensesTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityLicensesTypes }
     *     
     */
    public void setUniversityLicensesTypesGetResult(ArrayOfDUniversityLicensesTypes value) {
        this.universityLicensesTypesGetResult = value;
    }

}
