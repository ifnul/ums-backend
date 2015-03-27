
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
 *         &lt;element name="SpecRedactionsGetResult" type="{http://edboservice.ua/}ArrayOfDSpecRedactions" minOccurs="0"/>
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
    "specRedactionsGetResult"
})
@XmlRootElement(name = "SpecRedactionsGetResponse")
public class SpecRedactionsGetResponse {

    @XmlElement(name = "SpecRedactionsGetResult")
    protected ArrayOfDSpecRedactions specRedactionsGetResult;

    /**
     * Gets the value of the specRedactionsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDSpecRedactions }
     *     
     */
    public ArrayOfDSpecRedactions getSpecRedactionsGetResult() {
        return specRedactionsGetResult;
    }

    /**
     * Sets the value of the specRedactionsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDSpecRedactions }
     *     
     */
    public void setSpecRedactionsGetResult(ArrayOfDSpecRedactions value) {
        this.specRedactionsGetResult = value;
    }

}
