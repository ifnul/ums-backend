
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
 *         &lt;element name="RegulationDocumentsRekvizitGetResult" type="{http://edboservice.ua/}ArrayOfDRegulationDocumentsRekvizit" minOccurs="0"/>
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
    "regulationDocumentsRekvizitGetResult"
})
@XmlRootElement(name = "RegulationDocumentsRekvizitGetResponse")
public class RegulationDocumentsRekvizitGetResponse {

    @XmlElement(name = "RegulationDocumentsRekvizitGetResult")
    protected ArrayOfDRegulationDocumentsRekvizit regulationDocumentsRekvizitGetResult;

    /**
     * Gets the value of the regulationDocumentsRekvizitGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDRegulationDocumentsRekvizit }
     *     
     */
    public ArrayOfDRegulationDocumentsRekvizit getRegulationDocumentsRekvizitGetResult() {
        return regulationDocumentsRekvizitGetResult;
    }

    /**
     * Sets the value of the regulationDocumentsRekvizitGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDRegulationDocumentsRekvizit }
     *     
     */
    public void setRegulationDocumentsRekvizitGetResult(ArrayOfDRegulationDocumentsRekvizit value) {
        this.regulationDocumentsRekvizitGetResult = value;
    }

}
