
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
 *         &lt;element name="DocumentsPaymentSystemTypesGetResult" type="{http://edboservice.ua/}ArrayOfDDocumentsPaymentSystemTypes" minOccurs="0"/>
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
    "documentsPaymentSystemTypesGetResult"
})
@XmlRootElement(name = "DocumentsPaymentSystemTypesGetResponse")
public class DocumentsPaymentSystemTypesGetResponse {

    @XmlElement(name = "DocumentsPaymentSystemTypesGetResult")
    protected ArrayOfDDocumentsPaymentSystemTypes documentsPaymentSystemTypesGetResult;

    /**
     * Gets the value of the documentsPaymentSystemTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDDocumentsPaymentSystemTypes }
     *     
     */
    public ArrayOfDDocumentsPaymentSystemTypes getDocumentsPaymentSystemTypesGetResult() {
        return documentsPaymentSystemTypesGetResult;
    }

    /**
     * Sets the value of the documentsPaymentSystemTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDDocumentsPaymentSystemTypes }
     *     
     */
    public void setDocumentsPaymentSystemTypesGetResult(ArrayOfDDocumentsPaymentSystemTypes value) {
        this.documentsPaymentSystemTypesGetResult = value;
    }

}
