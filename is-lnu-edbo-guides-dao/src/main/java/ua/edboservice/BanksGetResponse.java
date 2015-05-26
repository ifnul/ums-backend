
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
 *         &lt;element name="BanksGetResult" type="{http://edboservice.ua/}ArrayOfDBanks" minOccurs="0"/>
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
    "banksGetResult"
})
@XmlRootElement(name = "BanksGetResponse")
public class BanksGetResponse {

    @XmlElement(name = "BanksGetResult")
    protected ArrayOfDBanks banksGetResult;

    /**
     * Gets the value of the banksGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDBanks }
     *     
     */
    public ArrayOfDBanks getBanksGetResult() {
        return banksGetResult;
    }

    /**
     * Sets the value of the banksGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDBanks }
     *     
     */
    public void setBanksGetResult(ArrayOfDBanks value) {
        this.banksGetResult = value;
    }

}
