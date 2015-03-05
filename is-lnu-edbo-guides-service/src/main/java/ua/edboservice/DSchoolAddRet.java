
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dSchoolAddRet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dSchoolAddRet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_School" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Kode_School" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dSchoolAddRet", propOrder = {
    "idSchool",
    "kodeSchool"
})
public class DSchoolAddRet {

    @XmlElement(name = "Id_School")
    protected int idSchool;
    @XmlElement(name = "Kode_School")
    protected String kodeSchool;

    /**
     * Gets the value of the idSchool property.
     * 
     */
    public int getIdSchool() {
        return idSchool;
    }

    /**
     * Sets the value of the idSchool property.
     * 
     */
    public void setIdSchool(int value) {
        this.idSchool = value;
    }

    /**
     * Gets the value of the kodeSchool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeSchool() {
        return kodeSchool;
    }

    /**
     * Sets the value of the kodeSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeSchool(String value) {
        this.kodeSchool = value;
    }

}
