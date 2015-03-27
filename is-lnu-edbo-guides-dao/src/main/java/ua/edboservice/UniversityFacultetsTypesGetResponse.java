
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
 *         &lt;element name="UniversityFacultetsTypesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityFacultetsTypes" minOccurs="0"/>
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
    "universityFacultetsTypesGetResult"
})
@XmlRootElement(name = "UniversityFacultetsTypesGetResponse")
public class UniversityFacultetsTypesGetResponse {

    @XmlElement(name = "UniversityFacultetsTypesGetResult")
    protected ArrayOfDUniversityFacultetsTypes universityFacultetsTypesGetResult;

    /**
     * Gets the value of the universityFacultetsTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityFacultetsTypes }
     *     
     */
    public ArrayOfDUniversityFacultetsTypes getUniversityFacultetsTypesGetResult() {
        return universityFacultetsTypesGetResult;
    }

    /**
     * Sets the value of the universityFacultetsTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityFacultetsTypes }
     *     
     */
    public void setUniversityFacultetsTypesGetResult(ArrayOfDUniversityFacultetsTypes value) {
        this.universityFacultetsTypesGetResult = value;
    }

}
