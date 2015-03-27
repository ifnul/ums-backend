
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
 *         &lt;element name="UniversityFacultetsGet2Result" type="{http://edboservice.ua/}ArrayOfDUniversityFacultets2" minOccurs="0"/>
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
    "universityFacultetsGet2Result"
})
@XmlRootElement(name = "UniversityFacultetsGet2Response")
public class UniversityFacultetsGet2Response {

    @XmlElement(name = "UniversityFacultetsGet2Result")
    protected ArrayOfDUniversityFacultets2 universityFacultetsGet2Result;

    /**
     * Gets the value of the universityFacultetsGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityFacultets2 }
     *     
     */
    public ArrayOfDUniversityFacultets2 getUniversityFacultetsGet2Result() {
        return universityFacultetsGet2Result;
    }

    /**
     * Sets the value of the universityFacultetsGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityFacultets2 }
     *     
     */
    public void setUniversityFacultetsGet2Result(ArrayOfDUniversityFacultets2 value) {
        this.universityFacultetsGet2Result = value;
    }

}
