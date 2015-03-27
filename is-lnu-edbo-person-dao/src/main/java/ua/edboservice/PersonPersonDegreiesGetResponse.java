
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
 *         &lt;element name="PersonPersonDegreiesGetResult" type="{http://edboservice.ua/}ArrayOfDPersonPersonDegreiesGet" minOccurs="0"/>
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
    "personPersonDegreiesGetResult"
})
@XmlRootElement(name = "PersonPersonDegreiesGetResponse")
public class PersonPersonDegreiesGetResponse {

    @XmlElement(name = "PersonPersonDegreiesGetResult")
    protected ArrayOfDPersonPersonDegreiesGet personPersonDegreiesGetResult;

    /**
     * Gets the value of the personPersonDegreiesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonPersonDegreiesGet }
     *     
     */
    public ArrayOfDPersonPersonDegreiesGet getPersonPersonDegreiesGetResult() {
        return personPersonDegreiesGetResult;
    }

    /**
     * Sets the value of the personPersonDegreiesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonPersonDegreiesGet }
     *     
     */
    public void setPersonPersonDegreiesGetResult(ArrayOfDPersonPersonDegreiesGet value) {
        this.personPersonDegreiesGetResult = value;
    }

}
