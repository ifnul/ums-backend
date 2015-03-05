
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
 *         &lt;element name="PersonRequestsBulkStatusChangeResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestsBulkStatusChangeRet" minOccurs="0"/>
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
    "personRequestsBulkStatusChangeResult"
})
@XmlRootElement(name = "PersonRequestsBulkStatusChangeResponse")
public class PersonRequestsBulkStatusChangeResponse {

    @XmlElement(name = "PersonRequestsBulkStatusChangeResult")
    protected ArrayOfDPersonRequestsBulkStatusChangeRet personRequestsBulkStatusChangeResult;

    /**
     * Gets the value of the personRequestsBulkStatusChangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestsBulkStatusChangeRet }
     *     
     */
    public ArrayOfDPersonRequestsBulkStatusChangeRet getPersonRequestsBulkStatusChangeResult() {
        return personRequestsBulkStatusChangeResult;
    }

    /**
     * Sets the value of the personRequestsBulkStatusChangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestsBulkStatusChangeRet }
     *     
     */
    public void setPersonRequestsBulkStatusChangeResult(ArrayOfDPersonRequestsBulkStatusChangeRet value) {
        this.personRequestsBulkStatusChangeResult = value;
    }

}
