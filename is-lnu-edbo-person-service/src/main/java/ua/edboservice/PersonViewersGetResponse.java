
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
 *         &lt;element name="PersonViewersGetResult" type="{http://edboservice.ua/}ArrayOfDPersonViewers" minOccurs="0"/>
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
    "personViewersGetResult"
})
@XmlRootElement(name = "PersonViewersGetResponse")
public class PersonViewersGetResponse {

    @XmlElement(name = "PersonViewersGetResult")
    protected ArrayOfDPersonViewers personViewersGetResult;

    /**
     * Gets the value of the personViewersGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonViewers }
     *     
     */
    public ArrayOfDPersonViewers getPersonViewersGetResult() {
        return personViewersGetResult;
    }

    /**
     * Sets the value of the personViewersGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonViewers }
     *     
     */
    public void setPersonViewersGetResult(ArrayOfDPersonViewers value) {
        this.personViewersGetResult = value;
    }

}
