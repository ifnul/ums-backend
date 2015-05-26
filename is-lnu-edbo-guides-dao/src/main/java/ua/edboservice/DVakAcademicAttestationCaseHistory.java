
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dVakAcademicAttestationCaseHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dVakAcademicAttestationCaseHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicAttestationCaseSatusHistory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicAttestationCaseSatusHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicAttestationCase" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicAttestationCaseIsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_User" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicAttestationCaseDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatorFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicAttestationCaseSatusHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dVakAcademicAttestationCaseHistory", propOrder = {
    "idAcademicAttestationCaseSatusHistory",
    "idAcademicAttestationCaseSatusHistoryType",
    "idAcademicAttestationCase",
    "academicAttestationCaseIsActive",
    "idUser",
    "academicAttestationCaseDateLastChange",
    "description",
    "operatorFIO",
    "academicAttestationCaseSatusHistoryTypeName"
})
public class DVakAcademicAttestationCaseHistory {

    @XmlElement(name = "Id_AcademicAttestationCaseSatusHistory")
    protected int idAcademicAttestationCaseSatusHistory;
    @XmlElement(name = "Id_AcademicAttestationCaseSatusHistoryType")
    protected int idAcademicAttestationCaseSatusHistoryType;
    @XmlElement(name = "Id_AcademicAttestationCase")
    protected int idAcademicAttestationCase;
    @XmlElement(name = "AcademicAttestationCaseIsActive")
    protected int academicAttestationCaseIsActive;
    @XmlElement(name = "Id_User")
    protected int idUser;
    @XmlElement(name = "AcademicAttestationCaseDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar academicAttestationCaseDateLastChange;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "OperatorFIO")
    protected String operatorFIO;
    @XmlElement(name = "AcademicAttestationCaseSatusHistoryTypeName")
    protected String academicAttestationCaseSatusHistoryTypeName;

    /**
     * Gets the value of the idAcademicAttestationCaseSatusHistory property.
     * 
     */
    public int getIdAcademicAttestationCaseSatusHistory() {
        return idAcademicAttestationCaseSatusHistory;
    }

    /**
     * Sets the value of the idAcademicAttestationCaseSatusHistory property.
     * 
     */
    public void setIdAcademicAttestationCaseSatusHistory(int value) {
        this.idAcademicAttestationCaseSatusHistory = value;
    }

    /**
     * Gets the value of the idAcademicAttestationCaseSatusHistoryType property.
     * 
     */
    public int getIdAcademicAttestationCaseSatusHistoryType() {
        return idAcademicAttestationCaseSatusHistoryType;
    }

    /**
     * Sets the value of the idAcademicAttestationCaseSatusHistoryType property.
     * 
     */
    public void setIdAcademicAttestationCaseSatusHistoryType(int value) {
        this.idAcademicAttestationCaseSatusHistoryType = value;
    }

    /**
     * Gets the value of the idAcademicAttestationCase property.
     * 
     */
    public int getIdAcademicAttestationCase() {
        return idAcademicAttestationCase;
    }

    /**
     * Sets the value of the idAcademicAttestationCase property.
     * 
     */
    public void setIdAcademicAttestationCase(int value) {
        this.idAcademicAttestationCase = value;
    }

    /**
     * Gets the value of the academicAttestationCaseIsActive property.
     * 
     */
    public int getAcademicAttestationCaseIsActive() {
        return academicAttestationCaseIsActive;
    }

    /**
     * Sets the value of the academicAttestationCaseIsActive property.
     * 
     */
    public void setAcademicAttestationCaseIsActive(int value) {
        this.academicAttestationCaseIsActive = value;
    }

    /**
     * Gets the value of the idUser property.
     * 
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * Sets the value of the idUser property.
     * 
     */
    public void setIdUser(int value) {
        this.idUser = value;
    }

    /**
     * Gets the value of the academicAttestationCaseDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicAttestationCaseDateLastChange() {
        return academicAttestationCaseDateLastChange;
    }

    /**
     * Sets the value of the academicAttestationCaseDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicAttestationCaseDateLastChange(XMLGregorianCalendar value) {
        this.academicAttestationCaseDateLastChange = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the operatorFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorFIO() {
        return operatorFIO;
    }

    /**
     * Sets the value of the operatorFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorFIO(String value) {
        this.operatorFIO = value;
    }

    /**
     * Gets the value of the academicAttestationCaseSatusHistoryTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicAttestationCaseSatusHistoryTypeName() {
        return academicAttestationCaseSatusHistoryTypeName;
    }

    /**
     * Sets the value of the academicAttestationCaseSatusHistoryTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicAttestationCaseSatusHistoryTypeName(String value) {
        this.academicAttestationCaseSatusHistoryTypeName = value;
    }

}
