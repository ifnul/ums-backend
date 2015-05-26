
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
 *         &lt;element name="RegulationDocumentsPageFileGetResult" type="{http://edboservice.ua/}ArrayOfDRegulationDocumentsPageFile" minOccurs="0"/>
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
    "regulationDocumentsPageFileGetResult"
})
@XmlRootElement(name = "RegulationDocumentsPageFileGetResponse")
public class RegulationDocumentsPageFileGetResponse {

    @XmlElement(name = "RegulationDocumentsPageFileGetResult")
    protected ArrayOfDRegulationDocumentsPageFile regulationDocumentsPageFileGetResult;

    /**
     * Gets the value of the regulationDocumentsPageFileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDRegulationDocumentsPageFile }
     *     
     */
    public ArrayOfDRegulationDocumentsPageFile getRegulationDocumentsPageFileGetResult() {
        return regulationDocumentsPageFileGetResult;
    }

    /**
     * Sets the value of the regulationDocumentsPageFileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDRegulationDocumentsPageFile }
     *     
     */
    public void setRegulationDocumentsPageFileGetResult(ArrayOfDRegulationDocumentsPageFile value) {
        this.regulationDocumentsPageFileGetResult = value;
    }

}
