
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
 *         &lt;element name="RegulationDocumentTypesGetResult" type="{http://edboservice.ua/}ArrayOfDRegulationDocumentTypes" minOccurs="0"/>
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
    "regulationDocumentTypesGetResult"
})
@XmlRootElement(name = "RegulationDocumentTypesGetResponse")
public class RegulationDocumentTypesGetResponse {

    @XmlElement(name = "RegulationDocumentTypesGetResult")
    protected ArrayOfDRegulationDocumentTypes regulationDocumentTypesGetResult;

    /**
     * Gets the value of the regulationDocumentTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDRegulationDocumentTypes }
     *     
     */
    public ArrayOfDRegulationDocumentTypes getRegulationDocumentTypesGetResult() {
        return regulationDocumentTypesGetResult;
    }

    /**
     * Sets the value of the regulationDocumentTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDRegulationDocumentTypes }
     *     
     */
    public void setRegulationDocumentTypesGetResult(ArrayOfDRegulationDocumentTypes value) {
        this.regulationDocumentTypesGetResult = value;
    }

}
