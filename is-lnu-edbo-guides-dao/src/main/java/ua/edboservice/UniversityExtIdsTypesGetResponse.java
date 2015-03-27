
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
 *         &lt;element name="UniversityExtIdsTypesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityExtIdsTypes" minOccurs="0"/>
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
    "universityExtIdsTypesGetResult"
})
@XmlRootElement(name = "UniversityExtIdsTypesGetResponse")
public class UniversityExtIdsTypesGetResponse {

    @XmlElement(name = "UniversityExtIdsTypesGetResult")
    protected ArrayOfDUniversityExtIdsTypes universityExtIdsTypesGetResult;

    /**
     * Gets the value of the universityExtIdsTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityExtIdsTypes }
     *     
     */
    public ArrayOfDUniversityExtIdsTypes getUniversityExtIdsTypesGetResult() {
        return universityExtIdsTypesGetResult;
    }

    /**
     * Sets the value of the universityExtIdsTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityExtIdsTypes }
     *     
     */
    public void setUniversityExtIdsTypesGetResult(ArrayOfDUniversityExtIdsTypes value) {
        this.universityExtIdsTypesGetResult = value;
    }

}
