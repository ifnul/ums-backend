
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dRequestExaminationCauses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dRequestExaminationCauses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonRequestExaminationCause" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonRequestExaminationCauseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonRequestExaminationCauseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dRequestExaminationCauses", propOrder = {
    "idPersonRequestExaminationCause",
    "idLanguage",
    "personRequestExaminationCauseName",
    "personRequestExaminationCauseDescription"
})
public class DRequestExaminationCauses {

    @XmlElement(name = "Id_PersonRequestExaminationCause")
    protected int idPersonRequestExaminationCause;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "PersonRequestExaminationCauseName")
    protected String personRequestExaminationCauseName;
    @XmlElement(name = "PersonRequestExaminationCauseDescription")
    protected String personRequestExaminationCauseDescription;

    /**
     * Gets the value of the idPersonRequestExaminationCause property.
     * 
     */
    public int getIdPersonRequestExaminationCause() {
        return idPersonRequestExaminationCause;
    }

    /**
     * Sets the value of the idPersonRequestExaminationCause property.
     * 
     */
    public void setIdPersonRequestExaminationCause(int value) {
        this.idPersonRequestExaminationCause = value;
    }

    /**
     * Gets the value of the idLanguage property.
     * 
     */
    public int getIdLanguage() {
        return idLanguage;
    }

    /**
     * Sets the value of the idLanguage property.
     * 
     */
    public void setIdLanguage(int value) {
        this.idLanguage = value;
    }

    /**
     * Gets the value of the personRequestExaminationCauseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRequestExaminationCauseName() {
        return personRequestExaminationCauseName;
    }

    /**
     * Sets the value of the personRequestExaminationCauseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRequestExaminationCauseName(String value) {
        this.personRequestExaminationCauseName = value;
    }

    /**
     * Gets the value of the personRequestExaminationCauseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRequestExaminationCauseDescription() {
        return personRequestExaminationCauseDescription;
    }

    /**
     * Sets the value of the personRequestExaminationCauseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRequestExaminationCauseDescription(String value) {
        this.personRequestExaminationCauseDescription = value;
    }

}
