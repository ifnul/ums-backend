
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dExaminationSheetValuesTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dExaminationSheetValuesTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ExaminationSheetValuesType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExaminationSheetValuesTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dExaminationSheetValuesTypes", propOrder = {
    "idExaminationSheetValuesType",
    "examinationSheetValuesTypeName"
})
public class DExaminationSheetValuesTypes {

    @XmlElement(name = "Id_ExaminationSheetValuesType")
    protected int idExaminationSheetValuesType;
    @XmlElement(name = "ExaminationSheetValuesTypeName")
    protected String examinationSheetValuesTypeName;

    /**
     * Gets the value of the idExaminationSheetValuesType property.
     * 
     */
    public int getIdExaminationSheetValuesType() {
        return idExaminationSheetValuesType;
    }

    /**
     * Sets the value of the idExaminationSheetValuesType property.
     * 
     */
    public void setIdExaminationSheetValuesType(int value) {
        this.idExaminationSheetValuesType = value;
    }

    /**
     * Gets the value of the examinationSheetValuesTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetValuesTypeName() {
        return examinationSheetValuesTypeName;
    }

    /**
     * Sets the value of the examinationSheetValuesTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetValuesTypeName(String value) {
        this.examinationSheetValuesTypeName = value;
    }

}
