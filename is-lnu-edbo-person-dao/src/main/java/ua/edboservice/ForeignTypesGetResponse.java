
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
 *         &lt;element name="ForeignTypesGetResult" type="{http://edboservice.ua/}ArrayOfDForeignTypes" minOccurs="0"/>
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
    "foreignTypesGetResult"
})
@XmlRootElement(name = "ForeignTypesGetResponse")
public class ForeignTypesGetResponse {

    @XmlElement(name = "ForeignTypesGetResult")
    protected ArrayOfDForeignTypes foreignTypesGetResult;

    /**
     * Gets the value of the foreignTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDForeignTypes }
     *     
     */
    public ArrayOfDForeignTypes getForeignTypesGetResult() {
        return foreignTypesGetResult;
    }

    /**
     * Sets the value of the foreignTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDForeignTypes }
     *     
     */
    public void setForeignTypesGetResult(ArrayOfDForeignTypes value) {
        this.foreignTypesGetResult = value;
    }

}
