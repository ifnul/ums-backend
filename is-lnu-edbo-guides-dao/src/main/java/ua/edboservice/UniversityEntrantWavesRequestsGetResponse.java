
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
 *         &lt;element name="UniversityEntrantWavesRequestsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityEntrantWavesRequests" minOccurs="0"/>
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
    "universityEntrantWavesRequestsGetResult"
})
@XmlRootElement(name = "UniversityEntrantWavesRequestsGetResponse")
public class UniversityEntrantWavesRequestsGetResponse {

    @XmlElement(name = "UniversityEntrantWavesRequestsGetResult")
    protected ArrayOfDUniversityEntrantWavesRequests universityEntrantWavesRequestsGetResult;

    /**
     * Gets the value of the universityEntrantWavesRequestsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityEntrantWavesRequests }
     *     
     */
    public ArrayOfDUniversityEntrantWavesRequests getUniversityEntrantWavesRequestsGetResult() {
        return universityEntrantWavesRequestsGetResult;
    }

    /**
     * Sets the value of the universityEntrantWavesRequestsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityEntrantWavesRequests }
     *     
     */
    public void setUniversityEntrantWavesRequestsGetResult(ArrayOfDUniversityEntrantWavesRequests value) {
        this.universityEntrantWavesRequestsGetResult = value;
    }

}
