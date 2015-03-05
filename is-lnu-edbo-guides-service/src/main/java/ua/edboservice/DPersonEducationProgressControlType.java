
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonEducationProgressControlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonEducationProgressControlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonEducationProgressControlType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationProgressControlTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonEducationProgressControlType", propOrder = {
    "idPersonEducationProgressControlType",
    "personEducationProgressControlTypeName"
})
public class DPersonEducationProgressControlType {

    @XmlElement(name = "Id_PersonEducationProgressControlType")
    protected int idPersonEducationProgressControlType;
    @XmlElement(name = "PersonEducationProgressControlTypeName")
    protected String personEducationProgressControlTypeName;

    /**
     * Gets the value of the idPersonEducationProgressControlType property.
     * 
     */
    public int getIdPersonEducationProgressControlType() {
        return idPersonEducationProgressControlType;
    }

    /**
     * Sets the value of the idPersonEducationProgressControlType property.
     * 
     */
    public void setIdPersonEducationProgressControlType(int value) {
        this.idPersonEducationProgressControlType = value;
    }

    /**
     * Gets the value of the personEducationProgressControlTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationProgressControlTypeName() {
        return personEducationProgressControlTypeName;
    }

    /**
     * Sets the value of the personEducationProgressControlTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationProgressControlTypeName(String value) {
        this.personEducationProgressControlTypeName = value;
    }

}
