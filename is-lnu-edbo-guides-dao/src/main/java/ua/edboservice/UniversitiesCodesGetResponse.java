
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
 *         &lt;element name="UniversitiesCodesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversitiesCodes" minOccurs="0"/>
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
    "universitiesCodesGetResult"
})
@XmlRootElement(name = "UniversitiesCodesGetResponse")
public class UniversitiesCodesGetResponse {

    @XmlElement(name = "UniversitiesCodesGetResult")
    protected ArrayOfDUniversitiesCodes universitiesCodesGetResult;

    /**
     * Gets the value of the universitiesCodesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversitiesCodes }
     *     
     */
    public ArrayOfDUniversitiesCodes getUniversitiesCodesGetResult() {
        return universitiesCodesGetResult;
    }

    /**
     * Sets the value of the universitiesCodesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversitiesCodes }
     *     
     */
    public void setUniversitiesCodesGetResult(ArrayOfDUniversitiesCodes value) {
        this.universitiesCodesGetResult = value;
    }

}
