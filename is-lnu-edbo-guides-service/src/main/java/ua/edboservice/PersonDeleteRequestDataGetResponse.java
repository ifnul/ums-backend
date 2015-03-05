
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
 *         &lt;element name="PersonDeleteRequestDataGetResult" type="{http://edboservice.ua/}ArrayOfDPersonDeleteRequestData" minOccurs="0"/>
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
    "personDeleteRequestDataGetResult"
})
@XmlRootElement(name = "PersonDeleteRequestDataGetResponse")
public class PersonDeleteRequestDataGetResponse {

    @XmlElement(name = "PersonDeleteRequestDataGetResult")
    protected ArrayOfDPersonDeleteRequestData personDeleteRequestDataGetResult;

    /**
     * Gets the value of the personDeleteRequestDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonDeleteRequestData }
     *     
     */
    public ArrayOfDPersonDeleteRequestData getPersonDeleteRequestDataGetResult() {
        return personDeleteRequestDataGetResult;
    }

    /**
     * Sets the value of the personDeleteRequestDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonDeleteRequestData }
     *     
     */
    public void setPersonDeleteRequestDataGetResult(ArrayOfDPersonDeleteRequestData value) {
        this.personDeleteRequestDataGetResult = value;
    }

}
