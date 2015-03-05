
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
 *         &lt;element name="PersonRequestCancellationAddResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestCancellationAddRet" minOccurs="0"/>
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
    "personRequestCancellationAddResult"
})
@XmlRootElement(name = "PersonRequestCancellationAddResponse")
public class PersonRequestCancellationAddResponse {

    @XmlElement(name = "PersonRequestCancellationAddResult")
    protected ArrayOfDPersonRequestCancellationAddRet personRequestCancellationAddResult;

    /**
     * Gets the value of the personRequestCancellationAddResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestCancellationAddRet }
     *     
     */
    public ArrayOfDPersonRequestCancellationAddRet getPersonRequestCancellationAddResult() {
        return personRequestCancellationAddResult;
    }

    /**
     * Sets the value of the personRequestCancellationAddResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestCancellationAddRet }
     *     
     */
    public void setPersonRequestCancellationAddResult(ArrayOfDPersonRequestCancellationAddRet value) {
        this.personRequestCancellationAddResult = value;
    }

}
