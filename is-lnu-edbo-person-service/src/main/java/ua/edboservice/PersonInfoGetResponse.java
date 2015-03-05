
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
 *         &lt;element name="PersonInfoGetResult" type="{http://edboservice.ua/}ArrayOfDPersonInfo" minOccurs="0"/>
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
    "personInfoGetResult"
})
@XmlRootElement(name = "PersonInfoGetResponse")
public class PersonInfoGetResponse {

    @XmlElement(name = "PersonInfoGetResult")
    protected ArrayOfDPersonInfo personInfoGetResult;

    /**
     * Gets the value of the personInfoGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonInfo }
     *     
     */
    public ArrayOfDPersonInfo getPersonInfoGetResult() {
        return personInfoGetResult;
    }

    /**
     * Sets the value of the personInfoGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonInfo }
     *     
     */
    public void setPersonInfoGetResult(ArrayOfDPersonInfo value) {
        this.personInfoGetResult = value;
    }

}
