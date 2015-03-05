
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
 *         &lt;element name="UniversityFacultetsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityFacultets" minOccurs="0"/>
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
    "universityFacultetsGetResult"
})
@XmlRootElement(name = "UniversityFacultetsGetResponse")
public class UniversityFacultetsGetResponse {

    @XmlElement(name = "UniversityFacultetsGetResult")
    protected ArrayOfDUniversityFacultets universityFacultetsGetResult;

    /**
     * Gets the value of the universityFacultetsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityFacultets }
     *     
     */
    public ArrayOfDUniversityFacultets getUniversityFacultetsGetResult() {
        return universityFacultetsGetResult;
    }

    /**
     * Sets the value of the universityFacultetsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityFacultets }
     *     
     */
    public void setUniversityFacultetsGetResult(ArrayOfDUniversityFacultets value) {
        this.universityFacultetsGetResult = value;
    }

}
