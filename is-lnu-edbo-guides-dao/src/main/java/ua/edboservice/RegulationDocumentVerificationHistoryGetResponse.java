
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
 *         &lt;element name="RegulationDocumentVerificationHistoryGetResult" type="{http://edboservice.ua/}ArrayOfDRegulationDocumentVerificationHistory" minOccurs="0"/>
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
    "regulationDocumentVerificationHistoryGetResult"
})
@XmlRootElement(name = "RegulationDocumentVerificationHistoryGetResponse")
public class RegulationDocumentVerificationHistoryGetResponse {

    @XmlElement(name = "RegulationDocumentVerificationHistoryGetResult")
    protected ArrayOfDRegulationDocumentVerificationHistory regulationDocumentVerificationHistoryGetResult;

    /**
     * Gets the value of the regulationDocumentVerificationHistoryGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDRegulationDocumentVerificationHistory }
     *     
     */
    public ArrayOfDRegulationDocumentVerificationHistory getRegulationDocumentVerificationHistoryGetResult() {
        return regulationDocumentVerificationHistoryGetResult;
    }

    /**
     * Sets the value of the regulationDocumentVerificationHistoryGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDRegulationDocumentVerificationHistory }
     *     
     */
    public void setRegulationDocumentVerificationHistoryGetResult(ArrayOfDRegulationDocumentVerificationHistory value) {
        this.regulationDocumentVerificationHistoryGetResult = value;
    }

}
