
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonEducationsCancelEducationTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonEducationsCancelEducationTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonEducationsCancelEducationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationsCancelEducationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonEducationsCancelEducationTypes", propOrder = {
    "idPersonEducationsCancelEducationType",
    "personEducationsCancelEducationTypeName"
})
public class DPersonEducationsCancelEducationTypes {

    @XmlElement(name = "Id_PersonEducationsCancelEducationType")
    protected int idPersonEducationsCancelEducationType;
    @XmlElement(name = "PersonEducationsCancelEducationTypeName")
    protected String personEducationsCancelEducationTypeName;

    /**
     * Gets the value of the idPersonEducationsCancelEducationType property.
     * 
     */
    public int getIdPersonEducationsCancelEducationType() {
        return idPersonEducationsCancelEducationType;
    }

    /**
     * Sets the value of the idPersonEducationsCancelEducationType property.
     * 
     */
    public void setIdPersonEducationsCancelEducationType(int value) {
        this.idPersonEducationsCancelEducationType = value;
    }

    /**
     * Gets the value of the personEducationsCancelEducationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationsCancelEducationTypeName() {
        return personEducationsCancelEducationTypeName;
    }

    /**
     * Sets the value of the personEducationsCancelEducationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationsCancelEducationTypeName(String value) {
        this.personEducationsCancelEducationTypeName = value;
    }

}
