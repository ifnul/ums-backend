
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
 *         &lt;element name="UniversityAccreditationsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityAccreditation" minOccurs="0"/>
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
    "universityAccreditationsGetResult"
})
@XmlRootElement(name = "UniversityAccreditationsGetResponse")
public class UniversityAccreditationsGetResponse {

    @XmlElement(name = "UniversityAccreditationsGetResult")
    protected ArrayOfDUniversityAccreditation universityAccreditationsGetResult;

    /**
     * Gets the value of the universityAccreditationsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityAccreditation }
     *     
     */
    public ArrayOfDUniversityAccreditation getUniversityAccreditationsGetResult() {
        return universityAccreditationsGetResult;
    }

    /**
     * Sets the value of the universityAccreditationsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityAccreditation }
     *     
     */
    public void setUniversityAccreditationsGetResult(ArrayOfDUniversityAccreditation value) {
        this.universityAccreditationsGetResult = value;
    }

}
