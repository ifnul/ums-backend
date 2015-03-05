
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonDocumentValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonDocumentValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonDocumentValueType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonDocumentValueTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonDocumentValueType", propOrder = {
    "idPersonDocumentValueType",
    "personDocumentValueTypeName"
})
public class DPersonDocumentValueType {

    @XmlElement(name = "Id_PersonDocumentValueType")
    protected int idPersonDocumentValueType;
    @XmlElement(name = "PersonDocumentValueTypeName")
    protected String personDocumentValueTypeName;

    /**
     * Gets the value of the idPersonDocumentValueType property.
     * 
     */
    public int getIdPersonDocumentValueType() {
        return idPersonDocumentValueType;
    }

    /**
     * Sets the value of the idPersonDocumentValueType property.
     * 
     */
    public void setIdPersonDocumentValueType(int value) {
        this.idPersonDocumentValueType = value;
    }

    /**
     * Gets the value of the personDocumentValueTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonDocumentValueTypeName() {
        return personDocumentValueTypeName;
    }

    /**
     * Sets the value of the personDocumentValueTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonDocumentValueTypeName(String value) {
        this.personDocumentValueTypeName = value;
    }

}
