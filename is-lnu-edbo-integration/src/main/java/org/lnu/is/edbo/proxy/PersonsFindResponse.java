
package org.lnu.is.edbo.proxy;

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
 *         &lt;element name="PersonsFindResult" type="{http://edboservice.ua/}ArrayOfDPersonsFind" minOccurs="0"/>
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
    "personsFindResult"
})
@XmlRootElement(name = "PersonsFindResponse")
public class PersonsFindResponse {

    @XmlElement(name = "PersonsFindResult")
    protected ArrayOfDPersonsFind personsFindResult;

    /**
     * Gets the value of the personsFindResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonsFind }
     *     
     */
    public ArrayOfDPersonsFind getPersonsFindResult() {
        return personsFindResult;
    }

    /**
     * Sets the value of the personsFindResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonsFind }
     *     
     */
    public void setPersonsFindResult(ArrayOfDPersonsFind value) {
        this.personsFindResult = value;
    }

}
