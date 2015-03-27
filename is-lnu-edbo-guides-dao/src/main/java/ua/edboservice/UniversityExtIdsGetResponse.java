
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
 *         &lt;element name="UniversityExtIdsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityExtIds" minOccurs="0"/>
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
    "universityExtIdsGetResult"
})
@XmlRootElement(name = "UniversityExtIdsGetResponse")
public class UniversityExtIdsGetResponse {

    @XmlElement(name = "UniversityExtIdsGetResult")
    protected ArrayOfDUniversityExtIds universityExtIdsGetResult;

    /**
     * Gets the value of the universityExtIdsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityExtIds }
     *     
     */
    public ArrayOfDUniversityExtIds getUniversityExtIdsGetResult() {
        return universityExtIdsGetResult;
    }

    /**
     * Sets the value of the universityExtIdsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityExtIds }
     *     
     */
    public void setUniversityExtIdsGetResult(ArrayOfDUniversityExtIds value) {
        this.universityExtIdsGetResult = value;
    }

}
