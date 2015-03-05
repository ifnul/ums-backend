
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
 *         &lt;element name="UniversityCloseStatusTypesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityCloseStatusTypes" minOccurs="0"/>
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
    "universityCloseStatusTypesGetResult"
})
@XmlRootElement(name = "UniversityCloseStatusTypesGetResponse")
public class UniversityCloseStatusTypesGetResponse {

    @XmlElement(name = "UniversityCloseStatusTypesGetResult")
    protected ArrayOfDUniversityCloseStatusTypes universityCloseStatusTypesGetResult;

    /**
     * Gets the value of the universityCloseStatusTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityCloseStatusTypes }
     *     
     */
    public ArrayOfDUniversityCloseStatusTypes getUniversityCloseStatusTypesGetResult() {
        return universityCloseStatusTypesGetResult;
    }

    /**
     * Sets the value of the universityCloseStatusTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityCloseStatusTypes }
     *     
     */
    public void setUniversityCloseStatusTypesGetResult(ArrayOfDUniversityCloseStatusTypes value) {
        this.universityCloseStatusTypesGetResult = value;
    }

}
