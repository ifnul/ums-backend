
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
 *         &lt;element name="RegulationDocumentDataTypesGetResult" type="{http://edboservice.ua/}ArrayOfDRegulationDocumentDataTypes" minOccurs="0"/>
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
    "regulationDocumentDataTypesGetResult"
})
@XmlRootElement(name = "RegulationDocumentDataTypesGetResponse")
public class RegulationDocumentDataTypesGetResponse {

    @XmlElement(name = "RegulationDocumentDataTypesGetResult")
    protected ArrayOfDRegulationDocumentDataTypes regulationDocumentDataTypesGetResult;

    /**
     * Gets the value of the regulationDocumentDataTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDRegulationDocumentDataTypes }
     *     
     */
    public ArrayOfDRegulationDocumentDataTypes getRegulationDocumentDataTypesGetResult() {
        return regulationDocumentDataTypesGetResult;
    }

    /**
     * Sets the value of the regulationDocumentDataTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDRegulationDocumentDataTypes }
     *     
     */
    public void setRegulationDocumentDataTypesGetResult(ArrayOfDRegulationDocumentDataTypes value) {
        this.regulationDocumentDataTypesGetResult = value;
    }

}
