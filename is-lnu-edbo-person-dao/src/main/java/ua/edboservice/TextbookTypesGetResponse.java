
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
 *         &lt;element name="TextbookTypesGetResult" type="{http://edboservice.ua/}ArrayOfDTextbookType" minOccurs="0"/>
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
    "textbookTypesGetResult"
})
@XmlRootElement(name = "TextbookTypesGetResponse")
public class TextbookTypesGetResponse {

    @XmlElement(name = "TextbookTypesGetResult")
    protected ArrayOfDTextbookType textbookTypesGetResult;

    /**
     * Gets the value of the textbookTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDTextbookType }
     *     
     */
    public ArrayOfDTextbookType getTextbookTypesGetResult() {
        return textbookTypesGetResult;
    }

    /**
     * Sets the value of the textbookTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDTextbookType }
     *     
     */
    public void setTextbookTypesGetResult(ArrayOfDTextbookType value) {
        this.textbookTypesGetResult = value;
    }

}
