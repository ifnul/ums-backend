
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityImportDocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityImportDocType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityImportDocType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityImportDocTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityImportDocType", propOrder = {
    "idUniversityImportDocType",
    "universityImportDocTypeName"
})
public class DUniversityImportDocType {

    @XmlElement(name = "Id_UniversityImportDocType")
    protected int idUniversityImportDocType;
    @XmlElement(name = "UniversityImportDocTypeName")
    protected String universityImportDocTypeName;

    /**
     * Gets the value of the idUniversityImportDocType property.
     * 
     */
    public int getIdUniversityImportDocType() {
        return idUniversityImportDocType;
    }

    /**
     * Sets the value of the idUniversityImportDocType property.
     * 
     */
    public void setIdUniversityImportDocType(int value) {
        this.idUniversityImportDocType = value;
    }

    /**
     * Gets the value of the universityImportDocTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityImportDocTypeName() {
        return universityImportDocTypeName;
    }

    /**
     * Sets the value of the universityImportDocTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityImportDocTypeName(String value) {
        this.universityImportDocTypeName = value;
    }

}
