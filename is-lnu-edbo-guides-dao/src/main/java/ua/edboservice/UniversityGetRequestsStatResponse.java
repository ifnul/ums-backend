
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
 *         &lt;element name="UniversityGetRequestsStatResult" type="{http://edboservice.ua/}ArrayOfDUniversityRequestsStat" minOccurs="0"/>
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
    "universityGetRequestsStatResult"
})
@XmlRootElement(name = "UniversityGetRequestsStatResponse")
public class UniversityGetRequestsStatResponse {

    @XmlElement(name = "UniversityGetRequestsStatResult")
    protected ArrayOfDUniversityRequestsStat universityGetRequestsStatResult;

    /**
     * Gets the value of the universityGetRequestsStatResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityRequestsStat }
     *     
     */
    public ArrayOfDUniversityRequestsStat getUniversityGetRequestsStatResult() {
        return universityGetRequestsStatResult;
    }

    /**
     * Sets the value of the universityGetRequestsStatResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityRequestsStat }
     *     
     */
    public void setUniversityGetRequestsStatResult(ArrayOfDUniversityRequestsStat value) {
        this.universityGetRequestsStatResult = value;
    }

}
