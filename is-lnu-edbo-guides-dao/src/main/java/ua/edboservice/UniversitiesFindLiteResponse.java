
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
 *         &lt;element name="UniversitiesFindLiteResult" type="{http://edboservice.ua/}ArrayOfDUniversitiesFindLite" minOccurs="0"/>
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
    "universitiesFindLiteResult"
})
@XmlRootElement(name = "UniversitiesFindLiteResponse")
public class UniversitiesFindLiteResponse {

    @XmlElement(name = "UniversitiesFindLiteResult")
    protected ArrayOfDUniversitiesFindLite universitiesFindLiteResult;

    /**
     * Gets the value of the universitiesFindLiteResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversitiesFindLite }
     *     
     */
    public ArrayOfDUniversitiesFindLite getUniversitiesFindLiteResult() {
        return universitiesFindLiteResult;
    }

    /**
     * Sets the value of the universitiesFindLiteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversitiesFindLite }
     *     
     */
    public void setUniversitiesFindLiteResult(ArrayOfDUniversitiesFindLite value) {
        this.universitiesFindLiteResult = value;
    }

}
