
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
 *         &lt;element name="UniversityFacultetsGetRequests2BinResult" type="{http://edboservice.ua/}ArrayOfString" minOccurs="0"/>
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
    "universityFacultetsGetRequests2BinResult"
})
@XmlRootElement(name = "UniversityFacultetsGetRequests2BinResponse")
public class UniversityFacultetsGetRequests2BinResponse {

    @XmlElement(name = "UniversityFacultetsGetRequests2BinResult")
    protected ArrayOfString universityFacultetsGetRequests2BinResult;

    /**
     * Gets the value of the universityFacultetsGetRequests2BinResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getUniversityFacultetsGetRequests2BinResult() {
        return universityFacultetsGetRequests2BinResult;
    }

    /**
     * Sets the value of the universityFacultetsGetRequests2BinResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setUniversityFacultetsGetRequests2BinResult(ArrayOfString value) {
        this.universityFacultetsGetRequests2BinResult = value;
    }

}
