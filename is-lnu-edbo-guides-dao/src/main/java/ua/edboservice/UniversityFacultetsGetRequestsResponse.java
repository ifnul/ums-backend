
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
 *         &lt;element name="UniversityFacultetsGetRequestsResult" type="{http://edboservice.ua/}ArrayOfDUniversityFacultetsRequests" minOccurs="0"/>
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
    "universityFacultetsGetRequestsResult"
})
@XmlRootElement(name = "UniversityFacultetsGetRequestsResponse")
public class UniversityFacultetsGetRequestsResponse {

    @XmlElement(name = "UniversityFacultetsGetRequestsResult")
    protected ArrayOfDUniversityFacultetsRequests universityFacultetsGetRequestsResult;

    /**
     * Gets the value of the universityFacultetsGetRequestsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityFacultetsRequests }
     *     
     */
    public ArrayOfDUniversityFacultetsRequests getUniversityFacultetsGetRequestsResult() {
        return universityFacultetsGetRequestsResult;
    }

    /**
     * Sets the value of the universityFacultetsGetRequestsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityFacultetsRequests }
     *     
     */
    public void setUniversityFacultetsGetRequestsResult(ArrayOfDUniversityFacultetsRequests value) {
        this.universityFacultetsGetRequestsResult = value;
    }

}
