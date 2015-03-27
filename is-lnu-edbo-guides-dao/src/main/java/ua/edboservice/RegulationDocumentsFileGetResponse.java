
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
 *         &lt;element name="RegulationDocumentsFileGetResult" type="{http://edboservice.ua/}ArrayOfDRegulationDocumentsFile" minOccurs="0"/>
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
    "regulationDocumentsFileGetResult"
})
@XmlRootElement(name = "RegulationDocumentsFileGetResponse")
public class RegulationDocumentsFileGetResponse {

    @XmlElement(name = "RegulationDocumentsFileGetResult")
    protected ArrayOfDRegulationDocumentsFile regulationDocumentsFileGetResult;

    /**
     * Gets the value of the regulationDocumentsFileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDRegulationDocumentsFile }
     *     
     */
    public ArrayOfDRegulationDocumentsFile getRegulationDocumentsFileGetResult() {
        return regulationDocumentsFileGetResult;
    }

    /**
     * Sets the value of the regulationDocumentsFileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDRegulationDocumentsFile }
     *     
     */
    public void setRegulationDocumentsFileGetResult(ArrayOfDRegulationDocumentsFile value) {
        this.regulationDocumentsFileGetResult = value;
    }

}
