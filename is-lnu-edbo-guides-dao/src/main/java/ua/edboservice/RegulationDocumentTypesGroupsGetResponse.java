
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
 *         &lt;element name="RegulationDocumentTypesGroupsGetResult" type="{http://edboservice.ua/}ArrayOfDRegulationDocumentTypesGroups" minOccurs="0"/>
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
    "regulationDocumentTypesGroupsGetResult"
})
@XmlRootElement(name = "RegulationDocumentTypesGroupsGetResponse")
public class RegulationDocumentTypesGroupsGetResponse {

    @XmlElement(name = "RegulationDocumentTypesGroupsGetResult")
    protected ArrayOfDRegulationDocumentTypesGroups regulationDocumentTypesGroupsGetResult;

    /**
     * Gets the value of the regulationDocumentTypesGroupsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDRegulationDocumentTypesGroups }
     *     
     */
    public ArrayOfDRegulationDocumentTypesGroups getRegulationDocumentTypesGroupsGetResult() {
        return regulationDocumentTypesGroupsGetResult;
    }

    /**
     * Sets the value of the regulationDocumentTypesGroupsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDRegulationDocumentTypesGroups }
     *     
     */
    public void setRegulationDocumentTypesGroupsGetResult(ArrayOfDRegulationDocumentTypesGroups value) {
        this.regulationDocumentTypesGroupsGetResult = value;
    }

}
