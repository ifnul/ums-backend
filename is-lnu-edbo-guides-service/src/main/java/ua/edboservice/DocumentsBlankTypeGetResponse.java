
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
 *         &lt;element name="DocumentsBlankTypeGetResult" type="{http://edboservice.ua/}ArrayOfDDocumentsBlankType" minOccurs="0"/>
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
    "documentsBlankTypeGetResult"
})
@XmlRootElement(name = "DocumentsBlankTypeGetResponse")
public class DocumentsBlankTypeGetResponse {

    @XmlElement(name = "DocumentsBlankTypeGetResult")
    protected ArrayOfDDocumentsBlankType documentsBlankTypeGetResult;

    /**
     * Gets the value of the documentsBlankTypeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDDocumentsBlankType }
     *     
     */
    public ArrayOfDDocumentsBlankType getDocumentsBlankTypeGetResult() {
        return documentsBlankTypeGetResult;
    }

    /**
     * Sets the value of the documentsBlankTypeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDDocumentsBlankType }
     *     
     */
    public void setDocumentsBlankTypeGetResult(ArrayOfDDocumentsBlankType value) {
        this.documentsBlankTypeGetResult = value;
    }

}
