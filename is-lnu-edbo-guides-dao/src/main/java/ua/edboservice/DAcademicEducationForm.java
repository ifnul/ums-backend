
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAcademicEducationForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicEducationForm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicEducationFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicEducationForm", propOrder = {
    "idAcademicEducationForm",
    "academicEducationFormName"
})
public class DAcademicEducationForm {

    @XmlElement(name = "Id_AcademicEducationForm")
    protected int idAcademicEducationForm;
    @XmlElement(name = "AcademicEducationFormName")
    protected String academicEducationFormName;

    /**
     * Gets the value of the idAcademicEducationForm property.
     * 
     */
    public int getIdAcademicEducationForm() {
        return idAcademicEducationForm;
    }

    /**
     * Sets the value of the idAcademicEducationForm property.
     * 
     */
    public void setIdAcademicEducationForm(int value) {
        this.idAcademicEducationForm = value;
    }

    /**
     * Gets the value of the academicEducationFormName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationFormName() {
        return academicEducationFormName;
    }

    /**
     * Sets the value of the academicEducationFormName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationFormName(String value) {
        this.academicEducationFormName = value;
    }

}
