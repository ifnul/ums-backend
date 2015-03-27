
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
 *         &lt;element name="AcandemyTypesGetResult" type="{http://edboservice.ua/}ArrayOfDAcandemyType" minOccurs="0"/>
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
    "acandemyTypesGetResult"
})
@XmlRootElement(name = "AcandemyTypesGetResponse")
public class AcandemyTypesGetResponse {

    @XmlElement(name = "AcandemyTypesGetResult")
    protected ArrayOfDAcandemyType acandemyTypesGetResult;

    /**
     * Gets the value of the acandemyTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcandemyType }
     *     
     */
    public ArrayOfDAcandemyType getAcandemyTypesGetResult() {
        return acandemyTypesGetResult;
    }

    /**
     * Sets the value of the acandemyTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcandemyType }
     *     
     */
    public void setAcandemyTypesGetResult(ArrayOfDAcandemyType value) {
        this.acandemyTypesGetResult = value;
    }

}
