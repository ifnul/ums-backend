
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonEducationProgressPeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonEducationProgressPeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonEducationProgressPeriodType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationProgressPeriodTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonEducationProgressPeriodType", propOrder = {
    "idPersonEducationProgressPeriodType",
    "personEducationProgressPeriodTypeName"
})
public class DPersonEducationProgressPeriodType {

    @XmlElement(name = "Id_PersonEducationProgressPeriodType")
    protected int idPersonEducationProgressPeriodType;
    @XmlElement(name = "PersonEducationProgressPeriodTypeName")
    protected String personEducationProgressPeriodTypeName;

    /**
     * Gets the value of the idPersonEducationProgressPeriodType property.
     * 
     */
    public int getIdPersonEducationProgressPeriodType() {
        return idPersonEducationProgressPeriodType;
    }

    /**
     * Sets the value of the idPersonEducationProgressPeriodType property.
     * 
     */
    public void setIdPersonEducationProgressPeriodType(int value) {
        this.idPersonEducationProgressPeriodType = value;
    }

    /**
     * Gets the value of the personEducationProgressPeriodTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationProgressPeriodTypeName() {
        return personEducationProgressPeriodTypeName;
    }

    /**
     * Sets the value of the personEducationProgressPeriodTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationProgressPeriodTypeName(String value) {
        this.personEducationProgressPeriodTypeName = value;
    }

}
