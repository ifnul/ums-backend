
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
 *         &lt;element name="UzLogGetResult" type="{http://edboservice.ua/}ArrayOfDUzLog" minOccurs="0"/>
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
    "uzLogGetResult"
})
@XmlRootElement(name = "UzLogGetResponse")
public class UzLogGetResponse {

    @XmlElement(name = "UzLogGetResult")
    protected ArrayOfDUzLog uzLogGetResult;

    /**
     * Gets the value of the uzLogGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUzLog }
     *     
     */
    public ArrayOfDUzLog getUzLogGetResult() {
        return uzLogGetResult;
    }

    /**
     * Sets the value of the uzLogGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUzLog }
     *     
     */
    public void setUzLogGetResult(ArrayOfDUzLog value) {
        this.uzLogGetResult = value;
    }

}
