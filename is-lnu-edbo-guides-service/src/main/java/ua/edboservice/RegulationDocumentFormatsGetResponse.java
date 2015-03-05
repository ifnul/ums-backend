
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
 *         &lt;element name="RegulationDocumentFormatsGetResult" type="{http://edboservice.ua/}ArrayOfDRegulationDocumentFormats" minOccurs="0"/>
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
    "regulationDocumentFormatsGetResult"
})
@XmlRootElement(name = "RegulationDocumentFormatsGetResponse")
public class RegulationDocumentFormatsGetResponse {

    @XmlElement(name = "RegulationDocumentFormatsGetResult")
    protected ArrayOfDRegulationDocumentFormats regulationDocumentFormatsGetResult;

    /**
     * Gets the value of the regulationDocumentFormatsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDRegulationDocumentFormats }
     *     
     */
    public ArrayOfDRegulationDocumentFormats getRegulationDocumentFormatsGetResult() {
        return regulationDocumentFormatsGetResult;
    }

    /**
     * Sets the value of the regulationDocumentFormatsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDRegulationDocumentFormats }
     *     
     */
    public void setRegulationDocumentFormatsGetResult(ArrayOfDRegulationDocumentFormats value) {
        this.regulationDocumentFormatsGetResult = value;
    }

}
