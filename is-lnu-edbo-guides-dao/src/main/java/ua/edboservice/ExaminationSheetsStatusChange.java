
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_ExaminationSheet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ExaminationSheetStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionGUID",
    "idExaminationSheet",
    "idExaminationSheetStatus"
})
@XmlRootElement(name = "ExaminationSheetsStatusChange")
public class ExaminationSheetsStatusChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_ExaminationSheet")
    protected int idExaminationSheet;
    @XmlElement(name = "Id_ExaminationSheetStatus")
    protected int idExaminationSheetStatus;

    /**
     * Gets the value of the sessionGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionGUID() {
        return sessionGUID;
    }

    /**
     * Sets the value of the sessionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionGUID(String value) {
        this.sessionGUID = value;
    }

    /**
     * Gets the value of the idExaminationSheet property.
     * 
     */
    public int getIdExaminationSheet() {
        return idExaminationSheet;
    }

    /**
     * Sets the value of the idExaminationSheet property.
     * 
     */
    public void setIdExaminationSheet(int value) {
        this.idExaminationSheet = value;
    }

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

}
