
package org.lnu.is.edbo.proxy;

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
 *         &lt;element name="UniversityFacultetsGetRequests2Result" type="{http://edboservice.ua/}ArrayOfDUniversityFacultetsRequests2" minOccurs="0"/>
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
    "universityFacultetsGetRequests2Result"
})
@XmlRootElement(name = "UniversityFacultetsGetRequests2Response")
public class UniversityFacultetsGetRequests2Response {

    @XmlElement(name = "UniversityFacultetsGetRequests2Result")
    protected ArrayOfDUniversityFacultetsRequests2 universityFacultetsGetRequests2Result;

    /**
     * Gets the value of the universityFacultetsGetRequests2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityFacultetsRequests2 }
     *     
     */
    public ArrayOfDUniversityFacultetsRequests2 getUniversityFacultetsGetRequests2Result() {
        return universityFacultetsGetRequests2Result;
    }

    /**
     * Sets the value of the universityFacultetsGetRequests2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityFacultetsRequests2 }
     *     
     */
    public void setUniversityFacultetsGetRequests2Result(ArrayOfDUniversityFacultetsRequests2 value) {
        this.universityFacultetsGetRequests2Result = value;
    }

}
