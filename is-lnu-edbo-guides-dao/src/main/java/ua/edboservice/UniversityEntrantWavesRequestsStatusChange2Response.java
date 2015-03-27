
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
 *         &lt;element name="UniversityEntrantWavesRequestsStatusChange2Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "universityEntrantWavesRequestsStatusChange2Result"
})
@XmlRootElement(name = "UniversityEntrantWavesRequestsStatusChange2Response")
public class UniversityEntrantWavesRequestsStatusChange2Response {

    @XmlElement(name = "UniversityEntrantWavesRequestsStatusChange2Result")
    protected String universityEntrantWavesRequestsStatusChange2Result;

    /**
     * Gets the value of the universityEntrantWavesRequestsStatusChange2Result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityEntrantWavesRequestsStatusChange2Result() {
        return universityEntrantWavesRequestsStatusChange2Result;
    }

    /**
     * Sets the value of the universityEntrantWavesRequestsStatusChange2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityEntrantWavesRequestsStatusChange2Result(String value) {
        this.universityEntrantWavesRequestsStatusChange2Result = value;
    }

}
