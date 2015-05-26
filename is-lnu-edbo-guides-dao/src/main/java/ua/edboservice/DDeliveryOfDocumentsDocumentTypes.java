
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dDeliveryOfDocumentsDocumentTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dDeliveryOfDocumentsDocumentTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_DeliveryOfDocumentsDocumentTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ImportDocType1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ImportDocType2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ImportDocType3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ImportDocType4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeliveryOfDocumentsDocumentTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dDeliveryOfDocumentsDocumentTypes", propOrder = {
    "idDeliveryOfDocumentsDocumentTypes",
    "idPersonDocumentType",
    "idImportDocType1",
    "idImportDocType2",
    "idImportDocType3",
    "idImportDocType4",
    "deliveryOfDocumentsDocumentTypesName"
})
public class DDeliveryOfDocumentsDocumentTypes {

    @XmlElement(name = "Id_DeliveryOfDocumentsDocumentTypes")
    protected int idDeliveryOfDocumentsDocumentTypes;
    @XmlElement(name = "Id_PersonDocumentType")
    protected int idPersonDocumentType;
    @XmlElement(name = "Id_ImportDocType1")
    protected int idImportDocType1;
    @XmlElement(name = "Id_ImportDocType2")
    protected int idImportDocType2;
    @XmlElement(name = "Id_ImportDocType3")
    protected int idImportDocType3;
    @XmlElement(name = "Id_ImportDocType4")
    protected int idImportDocType4;
    @XmlElement(name = "DeliveryOfDocumentsDocumentTypesName")
    protected String deliveryOfDocumentsDocumentTypesName;

    /**
     * Gets the value of the idDeliveryOfDocumentsDocumentTypes property.
     * 
     */
    public int getIdDeliveryOfDocumentsDocumentTypes() {
        return idDeliveryOfDocumentsDocumentTypes;
    }

    /**
     * Sets the value of the idDeliveryOfDocumentsDocumentTypes property.
     * 
     */
    public void setIdDeliveryOfDocumentsDocumentTypes(int value) {
        this.idDeliveryOfDocumentsDocumentTypes = value;
    }

    /**
     * Gets the value of the idPersonDocumentType property.
     * 
     */
    public int getIdPersonDocumentType() {
        return idPersonDocumentType;
    }

    /**
     * Sets the value of the idPersonDocumentType property.
     * 
     */
    public void setIdPersonDocumentType(int value) {
        this.idPersonDocumentType = value;
    }

    /**
     * Gets the value of the idImportDocType1 property.
     * 
     */
    public int getIdImportDocType1() {
        return idImportDocType1;
    }

    /**
     * Sets the value of the idImportDocType1 property.
     * 
     */
    public void setIdImportDocType1(int value) {
        this.idImportDocType1 = value;
    }

    /**
     * Gets the value of the idImportDocType2 property.
     * 
     */
    public int getIdImportDocType2() {
        return idImportDocType2;
    }

    /**
     * Sets the value of the idImportDocType2 property.
     * 
     */
    public void setIdImportDocType2(int value) {
        this.idImportDocType2 = value;
    }

    /**
     * Gets the value of the idImportDocType3 property.
     * 
     */
    public int getIdImportDocType3() {
        return idImportDocType3;
    }

    /**
     * Sets the value of the idImportDocType3 property.
     * 
     */
    public void setIdImportDocType3(int value) {
        this.idImportDocType3 = value;
    }

    /**
     * Gets the value of the idImportDocType4 property.
     * 
     */
    public int getIdImportDocType4() {
        return idImportDocType4;
    }

    /**
     * Sets the value of the idImportDocType4 property.
     * 
     */
    public void setIdImportDocType4(int value) {
        this.idImportDocType4 = value;
    }

    /**
     * Gets the value of the deliveryOfDocumentsDocumentTypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryOfDocumentsDocumentTypesName() {
        return deliveryOfDocumentsDocumentTypesName;
    }

    /**
     * Sets the value of the deliveryOfDocumentsDocumentTypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryOfDocumentsDocumentTypesName(String value) {
        this.deliveryOfDocumentsDocumentTypesName = value;
    }

}
