
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
 *         &lt;element name="EDBOISUOZNZGetResult" type="{http://edboservice.ua/}ArrayOfDEDBOISUOZNZ" minOccurs="0"/>
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
    "edboisuoznzGetResult"
})
@XmlRootElement(name = "EDBOISUOZNZGetResponse")
public class EDBOISUOZNZGetResponse {

    @XmlElement(name = "EDBOISUOZNZGetResult")
    protected ArrayOfDEDBOISUOZNZ edboisuoznzGetResult;

    /**
     * Gets the value of the edboisuoznzGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEDBOISUOZNZ }
     *     
     */
    public ArrayOfDEDBOISUOZNZ getEDBOISUOZNZGetResult() {
        return edboisuoznzGetResult;
    }

    /**
     * Sets the value of the edboisuoznzGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEDBOISUOZNZ }
     *     
     */
    public void setEDBOISUOZNZGetResult(ArrayOfDEDBOISUOZNZ value) {
        this.edboisuoznzGetResult = value;
    }

}
