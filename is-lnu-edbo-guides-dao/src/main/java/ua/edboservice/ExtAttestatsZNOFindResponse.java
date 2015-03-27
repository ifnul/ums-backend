
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
 *         &lt;element name="ExtAttestatsZNOFindResult" type="{http://edboservice.ua/}ArrayOfDExtAttestatsZNOFind" minOccurs="0"/>
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
    "extAttestatsZNOFindResult"
})
@XmlRootElement(name = "ExtAttestatsZNOFindResponse")
public class ExtAttestatsZNOFindResponse {

    @XmlElement(name = "ExtAttestatsZNOFindResult")
    protected ArrayOfDExtAttestatsZNOFind extAttestatsZNOFindResult;

    /**
     * Gets the value of the extAttestatsZNOFindResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDExtAttestatsZNOFind }
     *     
     */
    public ArrayOfDExtAttestatsZNOFind getExtAttestatsZNOFindResult() {
        return extAttestatsZNOFindResult;
    }

    /**
     * Sets the value of the extAttestatsZNOFindResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDExtAttestatsZNOFind }
     *     
     */
    public void setExtAttestatsZNOFindResult(ArrayOfDExtAttestatsZNOFind value) {
        this.extAttestatsZNOFindResult = value;
    }

}
