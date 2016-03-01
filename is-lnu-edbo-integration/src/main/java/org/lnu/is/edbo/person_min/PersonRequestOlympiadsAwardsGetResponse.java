
package org.lnu.is.edbo.person_min;

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
 *         &lt;element name="PersonRequestOlympiadsAwardsGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestOlympiadsAwards" minOccurs="0"/>
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
    "personRequestOlympiadsAwardsGetResult"
})
@XmlRootElement(name = "PersonRequestOlympiadsAwardsGetResponse")
public class PersonRequestOlympiadsAwardsGetResponse {

    @XmlElement(name = "PersonRequestOlympiadsAwardsGetResult")
    protected ArrayOfDPersonRequestOlympiadsAwards personRequestOlympiadsAwardsGetResult;

    /**
     * Gets the value of the personRequestOlympiadsAwardsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestOlympiadsAwards }
     *     
     */
    public ArrayOfDPersonRequestOlympiadsAwards getPersonRequestOlympiadsAwardsGetResult() {
        return personRequestOlympiadsAwardsGetResult;
    }

    /**
     * Sets the value of the personRequestOlympiadsAwardsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestOlympiadsAwards }
     *     
     */
    public void setPersonRequestOlympiadsAwardsGetResult(ArrayOfDPersonRequestOlympiadsAwards value) {
        this.personRequestOlympiadsAwardsGetResult = value;
    }

}
