
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
 *         &lt;element name="PersonDeleteRequestGetResult" type="{http://edboservice.ua/}ArrayOfDPersonDeleteRequest" minOccurs="0"/>
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
    "personDeleteRequestGetResult"
})
@XmlRootElement(name = "PersonDeleteRequestGetResponse")
public class PersonDeleteRequestGetResponse {

    @XmlElement(name = "PersonDeleteRequestGetResult")
    protected ArrayOfDPersonDeleteRequest personDeleteRequestGetResult;

    /**
     * Gets the value of the personDeleteRequestGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonDeleteRequest }
     *     
     */
    public ArrayOfDPersonDeleteRequest getPersonDeleteRequestGetResult() {
        return personDeleteRequestGetResult;
    }

    /**
     * Sets the value of the personDeleteRequestGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonDeleteRequest }
     *     
     */
    public void setPersonDeleteRequestGetResult(ArrayOfDPersonDeleteRequest value) {
        this.personDeleteRequestGetResult = value;
    }

}
