
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
 *         &lt;element name="UniversitiesFindResult" type="{http://edboservice.ua/}ArrayOfDUniversities" minOccurs="0"/>
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
    "universitiesFindResult"
})
@XmlRootElement(name = "UniversitiesFindResponse")
public class UniversitiesFindResponse {

    @XmlElement(name = "UniversitiesFindResult")
    protected ArrayOfDUniversities universitiesFindResult;

    /**
     * Gets the value of the universitiesFindResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversities }
     *     
     */
    public ArrayOfDUniversities getUniversitiesFindResult() {
        return universitiesFindResult;
    }

    /**
     * Sets the value of the universitiesFindResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversities }
     *     
     */
    public void setUniversitiesFindResult(ArrayOfDUniversities value) {
        this.universitiesFindResult = value;
    }

}
