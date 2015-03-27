
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
 *         &lt;element name="RegulationDocumentDataGetResult" type="{http://edboservice.ua/}ArrayOfDRegulationDocumentData" minOccurs="0"/>
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
    "regulationDocumentDataGetResult"
})
@XmlRootElement(name = "RegulationDocumentDataGetResponse")
public class RegulationDocumentDataGetResponse {

    @XmlElement(name = "RegulationDocumentDataGetResult")
    protected ArrayOfDRegulationDocumentData regulationDocumentDataGetResult;

    /**
     * Gets the value of the regulationDocumentDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDRegulationDocumentData }
     *     
     */
    public ArrayOfDRegulationDocumentData getRegulationDocumentDataGetResult() {
        return regulationDocumentDataGetResult;
    }

    /**
     * Sets the value of the regulationDocumentDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDRegulationDocumentData }
     *     
     */
    public void setRegulationDocumentDataGetResult(ArrayOfDRegulationDocumentData value) {
        this.regulationDocumentDataGetResult = value;
    }

}
