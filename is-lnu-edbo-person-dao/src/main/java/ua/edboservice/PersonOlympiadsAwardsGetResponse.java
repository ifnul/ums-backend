
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
 *         &lt;element name="PersonOlympiadsAwardsGetResult" type="{http://edboservice.ua/}ArrayOfDPersonOlympiadsAwards" minOccurs="0"/>
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
    "personOlympiadsAwardsGetResult"
})
@XmlRootElement(name = "PersonOlympiadsAwardsGetResponse")
public class PersonOlympiadsAwardsGetResponse {

    @XmlElement(name = "PersonOlympiadsAwardsGetResult")
    protected ArrayOfDPersonOlympiadsAwards personOlympiadsAwardsGetResult;

    /**
     * Gets the value of the personOlympiadsAwardsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonOlympiadsAwards }
     *     
     */
    public ArrayOfDPersonOlympiadsAwards getPersonOlympiadsAwardsGetResult() {
        return personOlympiadsAwardsGetResult;
    }

    /**
     * Sets the value of the personOlympiadsAwardsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonOlympiadsAwards }
     *     
     */
    public void setPersonOlympiadsAwardsGetResult(ArrayOfDPersonOlympiadsAwards value) {
        this.personOlympiadsAwardsGetResult = value;
    }

}
