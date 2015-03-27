
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dDocumentsBlankType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dDocumentsBlankType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_DocumentsBlnakTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocumentsBlnakTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dDocumentsBlankType", propOrder = {
    "idDocumentsBlnakTypes",
    "documentsBlnakTypeName"
})
public class DDocumentsBlankType {

    @XmlElement(name = "Id_DocumentsBlnakTypes")
    protected int idDocumentsBlnakTypes;
    @XmlElement(name = "DocumentsBlnakTypeName")
    protected String documentsBlnakTypeName;

    /**
     * Gets the value of the idDocumentsBlnakTypes property.
     * 
     */
    public int getIdDocumentsBlnakTypes() {
        return idDocumentsBlnakTypes;
    }

    /**
     * Sets the value of the idDocumentsBlnakTypes property.
     * 
     */
    public void setIdDocumentsBlnakTypes(int value) {
        this.idDocumentsBlnakTypes = value;
    }

    /**
     * Gets the value of the documentsBlnakTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentsBlnakTypeName() {
        return documentsBlnakTypeName;
    }

    /**
     * Sets the value of the documentsBlnakTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentsBlnakTypeName(String value) {
        this.documentsBlnakTypeName = value;
    }

}
