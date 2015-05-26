
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
 *         &lt;element name="UniversityFacultetsGetRequests3Result" type="{http://edboservice.ua/}ArrayOfDUniversityFacultetsRequests3" minOccurs="0"/>
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
    "universityFacultetsGetRequests3Result"
})
@XmlRootElement(name = "UniversityFacultetsGetRequests3Response")
public class UniversityFacultetsGetRequests3Response {

    @XmlElement(name = "UniversityFacultetsGetRequests3Result")
    protected ArrayOfDUniversityFacultetsRequests3 universityFacultetsGetRequests3Result;

    /**
     * Gets the value of the universityFacultetsGetRequests3Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityFacultetsRequests3 }
     *     
     */
    public ArrayOfDUniversityFacultetsRequests3 getUniversityFacultetsGetRequests3Result() {
        return universityFacultetsGetRequests3Result;
    }

    /**
     * Sets the value of the universityFacultetsGetRequests3Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityFacultetsRequests3 }
     *     
     */
    public void setUniversityFacultetsGetRequests3Result(ArrayOfDUniversityFacultetsRequests3 value) {
        this.universityFacultetsGetRequests3Result = value;
    }

}
