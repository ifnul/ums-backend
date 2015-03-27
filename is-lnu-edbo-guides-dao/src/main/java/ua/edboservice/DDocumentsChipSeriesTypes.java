
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dDocumentsChipSeriesTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dDocumentsChipSeriesTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_DocumentChipSeriesType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocumentChipSeriesTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dDocumentsChipSeriesTypes", propOrder = {
    "idDocumentChipSeriesType",
    "documentChipSeriesTypeName"
})
public class DDocumentsChipSeriesTypes {

    @XmlElement(name = "Id_DocumentChipSeriesType")
    protected int idDocumentChipSeriesType;
    @XmlElement(name = "DocumentChipSeriesTypeName")
    protected String documentChipSeriesTypeName;

    /**
     * Gets the value of the idDocumentChipSeriesType property.
     * 
     */
    public int getIdDocumentChipSeriesType() {
        return idDocumentChipSeriesType;
    }

    /**
     * Sets the value of the idDocumentChipSeriesType property.
     * 
     */
    public void setIdDocumentChipSeriesType(int value) {
        this.idDocumentChipSeriesType = value;
    }

    /**
     * Gets the value of the documentChipSeriesTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentChipSeriesTypeName() {
        return documentChipSeriesTypeName;
    }

    /**
     * Sets the value of the documentChipSeriesTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentChipSeriesTypeName(String value) {
        this.documentChipSeriesTypeName = value;
    }

}
