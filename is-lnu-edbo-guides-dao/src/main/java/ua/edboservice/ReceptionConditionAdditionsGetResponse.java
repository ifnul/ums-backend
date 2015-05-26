
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
 *         &lt;element name="ReceptionConditionAdditionsGetResult" type="{http://edboservice.ua/}ArrayOfDReceptionConditionAdditions" minOccurs="0"/>
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
    "receptionConditionAdditionsGetResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsGetResponse")
public class ReceptionConditionAdditionsGetResponse {

    @XmlElement(name = "ReceptionConditionAdditionsGetResult")
    protected ArrayOfDReceptionConditionAdditions receptionConditionAdditionsGetResult;

    /**
     * Gets the value of the receptionConditionAdditionsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDReceptionConditionAdditions }
     *     
     */
    public ArrayOfDReceptionConditionAdditions getReceptionConditionAdditionsGetResult() {
        return receptionConditionAdditionsGetResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDReceptionConditionAdditions }
     *     
     */
    public void setReceptionConditionAdditionsGetResult(ArrayOfDReceptionConditionAdditions value) {
        this.receptionConditionAdditionsGetResult = value;
    }

}
