
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
 *         &lt;element name="PersonRequestOlympiadsAwardsFullGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestOlympiadsAwardsFull" minOccurs="0"/>
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
    "personRequestOlympiadsAwardsFullGetResult"
})
@XmlRootElement(name = "PersonRequestOlympiadsAwardsFullGetResponse")
public class PersonRequestOlympiadsAwardsFullGetResponse {

    @XmlElement(name = "PersonRequestOlympiadsAwardsFullGetResult")
    protected ArrayOfDPersonRequestOlympiadsAwardsFull personRequestOlympiadsAwardsFullGetResult;

    /**
     * Gets the value of the personRequestOlympiadsAwardsFullGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestOlympiadsAwardsFull }
     *     
     */
    public ArrayOfDPersonRequestOlympiadsAwardsFull getPersonRequestOlympiadsAwardsFullGetResult() {
        return personRequestOlympiadsAwardsFullGetResult;
    }

    /**
     * Sets the value of the personRequestOlympiadsAwardsFullGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestOlympiadsAwardsFull }
     *     
     */
    public void setPersonRequestOlympiadsAwardsFullGetResult(ArrayOfDPersonRequestOlympiadsAwardsFull value) {
        this.personRequestOlympiadsAwardsFullGetResult = value;
    }

}
