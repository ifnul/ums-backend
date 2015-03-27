
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
 *         &lt;element name="RegulationDocumentsGetResult" type="{http://edboservice.ua/}ArrayOfDRegulationDocuments" minOccurs="0"/>
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
    "regulationDocumentsGetResult"
})
@XmlRootElement(name = "RegulationDocumentsGetResponse")
public class RegulationDocumentsGetResponse {

    @XmlElement(name = "RegulationDocumentsGetResult")
    protected ArrayOfDRegulationDocuments regulationDocumentsGetResult;

    /**
     * Gets the value of the regulationDocumentsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDRegulationDocuments }
     *     
     */
    public ArrayOfDRegulationDocuments getRegulationDocumentsGetResult() {
        return regulationDocumentsGetResult;
    }

    /**
     * Sets the value of the regulationDocumentsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDRegulationDocuments }
     *     
     */
    public void setRegulationDocumentsGetResult(ArrayOfDRegulationDocuments value) {
        this.regulationDocumentsGetResult = value;
    }

}
