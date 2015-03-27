
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
 *         &lt;element name="PersonSubjectsAreTaughtGetResult" type="{http://edboservice.ua/}ArrayOfDPersonSubjectsAreTaughtGet" minOccurs="0"/>
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
    "personSubjectsAreTaughtGetResult"
})
@XmlRootElement(name = "PersonSubjectsAreTaughtGetResponse")
public class PersonSubjectsAreTaughtGetResponse {

    @XmlElement(name = "PersonSubjectsAreTaughtGetResult")
    protected ArrayOfDPersonSubjectsAreTaughtGet personSubjectsAreTaughtGetResult;

    /**
     * Gets the value of the personSubjectsAreTaughtGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonSubjectsAreTaughtGet }
     *     
     */
    public ArrayOfDPersonSubjectsAreTaughtGet getPersonSubjectsAreTaughtGetResult() {
        return personSubjectsAreTaughtGetResult;
    }

    /**
     * Sets the value of the personSubjectsAreTaughtGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonSubjectsAreTaughtGet }
     *     
     */
    public void setPersonSubjectsAreTaughtGetResult(ArrayOfDPersonSubjectsAreTaughtGet value) {
        this.personSubjectsAreTaughtGetResult = value;
    }

}
