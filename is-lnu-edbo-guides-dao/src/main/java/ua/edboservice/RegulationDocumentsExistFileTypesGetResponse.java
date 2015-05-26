
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
 *         &lt;element name="RegulationDocumentsExistFileTypesGetResult" type="{http://edboservice.ua/}ArrayOfDRegulationDocumentsExistFileTypes" minOccurs="0"/>
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
    "regulationDocumentsExistFileTypesGetResult"
})
@XmlRootElement(name = "RegulationDocumentsExistFileTypesGetResponse")
public class RegulationDocumentsExistFileTypesGetResponse {

    @XmlElement(name = "RegulationDocumentsExistFileTypesGetResult")
    protected ArrayOfDRegulationDocumentsExistFileTypes regulationDocumentsExistFileTypesGetResult;

    /**
     * Gets the value of the regulationDocumentsExistFileTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDRegulationDocumentsExistFileTypes }
     *     
     */
    public ArrayOfDRegulationDocumentsExistFileTypes getRegulationDocumentsExistFileTypesGetResult() {
        return regulationDocumentsExistFileTypesGetResult;
    }

    /**
     * Sets the value of the regulationDocumentsExistFileTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDRegulationDocumentsExistFileTypes }
     *     
     */
    public void setRegulationDocumentsExistFileTypesGetResult(ArrayOfDRegulationDocumentsExistFileTypes value) {
        this.regulationDocumentsExistFileTypesGetResult = value;
    }

}
