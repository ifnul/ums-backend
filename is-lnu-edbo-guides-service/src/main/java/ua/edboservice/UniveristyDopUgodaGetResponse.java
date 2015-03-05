
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
 *         &lt;element name="UniveristyDopUgodaGetResult" type="{http://edboservice.ua/}ArrayOfDUniveristyDopUgoda" minOccurs="0"/>
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
    "univeristyDopUgodaGetResult"
})
@XmlRootElement(name = "UniveristyDopUgodaGetResponse")
public class UniveristyDopUgodaGetResponse {

    @XmlElement(name = "UniveristyDopUgodaGetResult")
    protected ArrayOfDUniveristyDopUgoda univeristyDopUgodaGetResult;

    /**
     * Gets the value of the univeristyDopUgodaGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniveristyDopUgoda }
     *     
     */
    public ArrayOfDUniveristyDopUgoda getUniveristyDopUgodaGetResult() {
        return univeristyDopUgodaGetResult;
    }

    /**
     * Sets the value of the univeristyDopUgodaGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniveristyDopUgoda }
     *     
     */
    public void setUniveristyDopUgodaGetResult(ArrayOfDUniveristyDopUgoda value) {
        this.univeristyDopUgodaGetResult = value;
    }

}
