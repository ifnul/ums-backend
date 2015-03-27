
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dEducationalCyclesDisciplinesTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dEducationalCyclesDisciplinesTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_EducationalCyclesDisciplinesTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationalCyclesDisciplinesTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dEducationalCyclesDisciplinesTypes", propOrder = {
    "idEducationalCyclesDisciplinesTypes",
    "educationalCyclesDisciplinesTypeName"
})
public class DEducationalCyclesDisciplinesTypes {

    @XmlElement(name = "Id_EducationalCyclesDisciplinesTypes")
    protected int idEducationalCyclesDisciplinesTypes;
    @XmlElement(name = "EducationalCyclesDisciplinesTypeName")
    protected String educationalCyclesDisciplinesTypeName;

    /**
     * Gets the value of the idEducationalCyclesDisciplinesTypes property.
     * 
     */
    public int getIdEducationalCyclesDisciplinesTypes() {
        return idEducationalCyclesDisciplinesTypes;
    }

    /**
     * Sets the value of the idEducationalCyclesDisciplinesTypes property.
     * 
     */
    public void setIdEducationalCyclesDisciplinesTypes(int value) {
        this.idEducationalCyclesDisciplinesTypes = value;
    }

    /**
     * Gets the value of the educationalCyclesDisciplinesTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesDisciplinesTypeName() {
        return educationalCyclesDisciplinesTypeName;
    }

    /**
     * Sets the value of the educationalCyclesDisciplinesTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesDisciplinesTypeName(String value) {
        this.educationalCyclesDisciplinesTypeName = value;
    }

}
