
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
 *         &lt;element name="PersonTypeDictGetResult" type="{http://edboservice.ua/}ArrayOfDPersonTypeDictGet" minOccurs="0"/>
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
    "personTypeDictGetResult"
})
@XmlRootElement(name = "PersonTypeDictGetResponse")
public class PersonTypeDictGetResponse {

    @XmlElement(name = "PersonTypeDictGetResult")
    protected ArrayOfDPersonTypeDictGet personTypeDictGetResult;

    /**
     * Gets the value of the personTypeDictGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonTypeDictGet }
     *     
     */
    public ArrayOfDPersonTypeDictGet getPersonTypeDictGetResult() {
        return personTypeDictGetResult;
    }

    /**
     * Sets the value of the personTypeDictGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonTypeDictGet }
     *     
     */
    public void setPersonTypeDictGetResult(ArrayOfDPersonTypeDictGet value) {
        this.personTypeDictGetResult = value;
    }

}
