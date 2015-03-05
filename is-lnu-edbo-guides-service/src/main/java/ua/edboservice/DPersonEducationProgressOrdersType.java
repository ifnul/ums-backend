
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonEducationProgressOrdersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonEducationProgressOrdersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonEducationProgressOrdersType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationProgressOrdersTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonEducationProgressOrdersType", propOrder = {
    "idPersonEducationProgressOrdersType",
    "personEducationProgressOrdersTypeName"
})
public class DPersonEducationProgressOrdersType {

    @XmlElement(name = "Id_PersonEducationProgressOrdersType")
    protected int idPersonEducationProgressOrdersType;
    @XmlElement(name = "PersonEducationProgressOrdersTypeName")
    protected String personEducationProgressOrdersTypeName;

    /**
     * Gets the value of the idPersonEducationProgressOrdersType property.
     * 
     */
    public int getIdPersonEducationProgressOrdersType() {
        return idPersonEducationProgressOrdersType;
    }

    /**
     * Sets the value of the idPersonEducationProgressOrdersType property.
     * 
     */
    public void setIdPersonEducationProgressOrdersType(int value) {
        this.idPersonEducationProgressOrdersType = value;
    }

    /**
     * Gets the value of the personEducationProgressOrdersTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationProgressOrdersTypeName() {
        return personEducationProgressOrdersTypeName;
    }

    /**
     * Sets the value of the personEducationProgressOrdersTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationProgressOrdersTypeName(String value) {
        this.personEducationProgressOrdersTypeName = value;
    }

}
