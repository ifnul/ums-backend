
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonDocumentCancellationTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonDocumentCancellationTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonDocumentCancellationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonDocumentCancellationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonDocumentCancellationTypes", propOrder = {
    "idPersonDocumentCancellationType",
    "personDocumentCancellationTypeName"
})
public class DPersonDocumentCancellationTypes {

    @XmlElement(name = "Id_PersonDocumentCancellationType")
    protected int idPersonDocumentCancellationType;
    @XmlElement(name = "PersonDocumentCancellationTypeName")
    protected String personDocumentCancellationTypeName;

    /**
     * Gets the value of the idPersonDocumentCancellationType property.
     * 
     */
    public int getIdPersonDocumentCancellationType() {
        return idPersonDocumentCancellationType;
    }

    /**
     * Sets the value of the idPersonDocumentCancellationType property.
     * 
     */
    public void setIdPersonDocumentCancellationType(int value) {
        this.idPersonDocumentCancellationType = value;
    }

    /**
     * Gets the value of the personDocumentCancellationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonDocumentCancellationTypeName() {
        return personDocumentCancellationTypeName;
    }

    /**
     * Sets the value of the personDocumentCancellationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonDocumentCancellationTypeName(String value) {
        this.personDocumentCancellationTypeName = value;
    }

}
