
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
 *         &lt;element name="UniveristyDopUgodaClientGetResult" type="{http://edboservice.ua/}ArrayOfDUniveristyDopUgodaClient" minOccurs="0"/>
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
    "univeristyDopUgodaClientGetResult"
})
@XmlRootElement(name = "UniveristyDopUgodaClientGetResponse")
public class UniveristyDopUgodaClientGetResponse {

    @XmlElement(name = "UniveristyDopUgodaClientGetResult")
    protected ArrayOfDUniveristyDopUgodaClient univeristyDopUgodaClientGetResult;

    /**
     * Gets the value of the univeristyDopUgodaClientGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniveristyDopUgodaClient }
     *     
     */
    public ArrayOfDUniveristyDopUgodaClient getUniveristyDopUgodaClientGetResult() {
        return univeristyDopUgodaClientGetResult;
    }

    /**
     * Sets the value of the univeristyDopUgodaClientGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniveristyDopUgodaClient }
     *     
     */
    public void setUniveristyDopUgodaClientGetResult(ArrayOfDUniveristyDopUgodaClient value) {
        this.univeristyDopUgodaClientGetResult = value;
    }

}
