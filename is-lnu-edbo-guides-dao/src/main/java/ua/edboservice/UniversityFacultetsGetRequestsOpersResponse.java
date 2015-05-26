
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
 *         &lt;element name="UniversityFacultetsGetRequestsOpersResult" type="{http://edboservice.ua/}ArrayOfDUniversityFacultetsRequestsOpers" minOccurs="0"/>
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
    "universityFacultetsGetRequestsOpersResult"
})
@XmlRootElement(name = "UniversityFacultetsGetRequestsOpersResponse")
public class UniversityFacultetsGetRequestsOpersResponse {

    @XmlElement(name = "UniversityFacultetsGetRequestsOpersResult")
    protected ArrayOfDUniversityFacultetsRequestsOpers universityFacultetsGetRequestsOpersResult;

    /**
     * Gets the value of the universityFacultetsGetRequestsOpersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityFacultetsRequestsOpers }
     *     
     */
    public ArrayOfDUniversityFacultetsRequestsOpers getUniversityFacultetsGetRequestsOpersResult() {
        return universityFacultetsGetRequestsOpersResult;
    }

    /**
     * Sets the value of the universityFacultetsGetRequestsOpersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityFacultetsRequestsOpers }
     *     
     */
    public void setUniversityFacultetsGetRequestsOpersResult(ArrayOfDUniversityFacultetsRequestsOpers value) {
        this.universityFacultetsGetRequestsOpersResult = value;
    }

}
