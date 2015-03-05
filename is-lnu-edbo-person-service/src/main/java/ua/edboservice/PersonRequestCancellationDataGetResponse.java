
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
 *         &lt;element name="PersonRequestCancellationDataGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestCancellationData" minOccurs="0"/>
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
    "personRequestCancellationDataGetResult"
})
@XmlRootElement(name = "PersonRequestCancellationDataGetResponse")
public class PersonRequestCancellationDataGetResponse {

    @XmlElement(name = "PersonRequestCancellationDataGetResult")
    protected ArrayOfDPersonRequestCancellationData personRequestCancellationDataGetResult;

    /**
     * Gets the value of the personRequestCancellationDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestCancellationData }
     *     
     */
    public ArrayOfDPersonRequestCancellationData getPersonRequestCancellationDataGetResult() {
        return personRequestCancellationDataGetResult;
    }

    /**
     * Sets the value of the personRequestCancellationDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestCancellationData }
     *     
     */
    public void setPersonRequestCancellationDataGetResult(ArrayOfDPersonRequestCancellationData value) {
        this.personRequestCancellationDataGetResult = value;
    }

}
