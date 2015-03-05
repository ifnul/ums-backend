
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
 *         &lt;element name="PersonOlympiadsAwardsFullGetResult" type="{http://edboservice.ua/}ArrayOfDPersonOlympiadsAwardsFull" minOccurs="0"/>
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
    "personOlympiadsAwardsFullGetResult"
})
@XmlRootElement(name = "PersonOlympiadsAwardsFullGetResponse")
public class PersonOlympiadsAwardsFullGetResponse {

    @XmlElement(name = "PersonOlympiadsAwardsFullGetResult")
    protected ArrayOfDPersonOlympiadsAwardsFull personOlympiadsAwardsFullGetResult;

    /**
     * Gets the value of the personOlympiadsAwardsFullGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonOlympiadsAwardsFull }
     *     
     */
    public ArrayOfDPersonOlympiadsAwardsFull getPersonOlympiadsAwardsFullGetResult() {
        return personOlympiadsAwardsFullGetResult;
    }

    /**
     * Sets the value of the personOlympiadsAwardsFullGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonOlympiadsAwardsFull }
     *     
     */
    public void setPersonOlympiadsAwardsFullGetResult(ArrayOfDPersonOlympiadsAwardsFull value) {
        this.personOlympiadsAwardsFullGetResult = value;
    }

}
