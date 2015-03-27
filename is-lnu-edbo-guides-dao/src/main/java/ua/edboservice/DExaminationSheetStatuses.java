
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dExaminationSheetStatuses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dExaminationSheetStatuses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ExaminationSheetStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExaminationSheetStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dExaminationSheetStatuses", propOrder = {
    "idExaminationSheetStatus",
    "examinationSheetStatusName"
})
public class DExaminationSheetStatuses {

    @XmlElement(name = "Id_ExaminationSheetStatus")
    protected int idExaminationSheetStatus;
    @XmlElement(name = "ExaminationSheetStatusName")
    protected String examinationSheetStatusName;

    /**
     * Gets the value of the idExaminationSheetStatus property.
     * 
     */
    public int getIdExaminationSheetStatus() {
        return idExaminationSheetStatus;
    }

    /**
     * Sets the value of the idExaminationSheetStatus property.
     * 
     */
    public void setIdExaminationSheetStatus(int value) {
        this.idExaminationSheetStatus = value;
    }

    /**
     * Gets the value of the examinationSheetStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetStatusName() {
        return examinationSheetStatusName;
    }

    /**
     * Sets the value of the examinationSheetStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetStatusName(String value) {
        this.examinationSheetStatusName = value;
    }

}
