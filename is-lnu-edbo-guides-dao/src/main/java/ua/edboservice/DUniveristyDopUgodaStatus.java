
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniveristyDopUgodaStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniveristyDopUgodaStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityDopUgodasStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityDopUgodasStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniveristyDopUgodaStatus", propOrder = {
    "idUniversityDopUgodasStatus",
    "universityDopUgodasStatusName"
})
public class DUniveristyDopUgodaStatus {

    @XmlElement(name = "Id_UniversityDopUgodasStatus")
    protected int idUniversityDopUgodasStatus;
    @XmlElement(name = "UniversityDopUgodasStatusName")
    protected String universityDopUgodasStatusName;

    /**
     * Gets the value of the idUniversityDopUgodasStatus property.
     * 
     */
    public int getIdUniversityDopUgodasStatus() {
        return idUniversityDopUgodasStatus;
    }

    /**
     * Sets the value of the idUniversityDopUgodasStatus property.
     * 
     */
    public void setIdUniversityDopUgodasStatus(int value) {
        this.idUniversityDopUgodasStatus = value;
    }

    /**
     * Gets the value of the universityDopUgodasStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityDopUgodasStatusName() {
        return universityDopUgodasStatusName;
    }

    /**
     * Sets the value of the universityDopUgodasStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityDopUgodasStatusName(String value) {
        this.universityDopUgodasStatusName = value;
    }

}
