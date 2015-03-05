
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
 *         &lt;element name="PersonOlympiadsAwardsGet2Result" type="{http://edboservice.ua/}ArrayOfDPersonOlympiadsAwards2" minOccurs="0"/>
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
    "personOlympiadsAwardsGet2Result"
})
@XmlRootElement(name = "PersonOlympiadsAwardsGet2Response")
public class PersonOlympiadsAwardsGet2Response {

    @XmlElement(name = "PersonOlympiadsAwardsGet2Result")
    protected ArrayOfDPersonOlympiadsAwards2 personOlympiadsAwardsGet2Result;

    /**
     * Gets the value of the personOlympiadsAwardsGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonOlympiadsAwards2 }
     *     
     */
    public ArrayOfDPersonOlympiadsAwards2 getPersonOlympiadsAwardsGet2Result() {
        return personOlympiadsAwardsGet2Result;
    }

    /**
     * Sets the value of the personOlympiadsAwardsGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonOlympiadsAwards2 }
     *     
     */
    public void setPersonOlympiadsAwardsGet2Result(ArrayOfDPersonOlympiadsAwards2 value) {
        this.personOlympiadsAwardsGet2Result = value;
    }

}
