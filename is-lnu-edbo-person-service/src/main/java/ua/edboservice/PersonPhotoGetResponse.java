
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
 *         &lt;element name="PersonPhotoGetResult" type="{http://edboservice.ua/}ArrayOfDPersonPhoto" minOccurs="0"/>
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
    "personPhotoGetResult"
})
@XmlRootElement(name = "PersonPhotoGetResponse")
public class PersonPhotoGetResponse {

    @XmlElement(name = "PersonPhotoGetResult")
    protected ArrayOfDPersonPhoto personPhotoGetResult;

    /**
     * Gets the value of the personPhotoGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonPhoto }
     *     
     */
    public ArrayOfDPersonPhoto getPersonPhotoGetResult() {
        return personPhotoGetResult;
    }

    /**
     * Sets the value of the personPhotoGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonPhoto }
     *     
     */
    public void setPersonPhotoGetResult(ArrayOfDPersonPhoto value) {
        this.personPhotoGetResult = value;
    }

}
