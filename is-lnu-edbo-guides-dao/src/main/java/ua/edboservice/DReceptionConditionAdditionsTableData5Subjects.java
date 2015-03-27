
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dReceptionConditionAdditionsTableData5Subjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dReceptionConditionAdditionsTableData5Subjects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ReceptionConditionAdditionsTableData5Subject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ReceptionConditionAdditionsTableData5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Subject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectPosition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Choose" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsProfile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubjectAdditianalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Koeficient" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ForeignIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForeignNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dReceptionConditionAdditionsTableData5Subjects", propOrder = {
    "idReceptionConditionAdditionsTableData5Subject",
    "idReceptionConditionAdditionsTableData5",
    "idSubject",
    "subjectPosition",
    "choose",
    "isProfile",
    "minValue",
    "subjectName",
    "subjectAdditianalName",
    "koeficient",
    "foreignIds",
    "foreignNames"
})
public class DReceptionConditionAdditionsTableData5Subjects {

    @XmlElement(name = "Id_ReceptionConditionAdditionsTableData5Subject")
    protected int idReceptionConditionAdditionsTableData5Subject;
    @XmlElement(name = "Id_ReceptionConditionAdditionsTableData5")
    protected int idReceptionConditionAdditionsTableData5;
    @XmlElement(name = "Id_Subject")
    protected int idSubject;
    @XmlElement(name = "SubjectPosition")
    protected int subjectPosition;
    @XmlElement(name = "Choose")
    protected int choose;
    @XmlElement(name = "IsProfile")
    protected int isProfile;
    @XmlElement(name = "MinValue")
    protected String minValue;
    @XmlElement(name = "SubjectName")
    protected String subjectName;
    @XmlElement(name = "SubjectAdditianalName")
    protected String subjectAdditianalName;
    @XmlElement(name = "Koeficient", required = true)
    protected BigDecimal koeficient;
    @XmlElement(name = "ForeignIds")
    protected String foreignIds;
    @XmlElement(name = "ForeignNames")
    protected String foreignNames;

    /**
     * Gets the value of the idReceptionConditionAdditionsTableData5Subject property.
     * 
     */
    public int getIdReceptionConditionAdditionsTableData5Subject() {
        return idReceptionConditionAdditionsTableData5Subject;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsTableData5Subject property.
     * 
     */
    public void setIdReceptionConditionAdditionsTableData5Subject(int value) {
        this.idReceptionConditionAdditionsTableData5Subject = value;
    }

    /**
     * Gets the value of the idReceptionConditionAdditionsTableData5 property.
     * 
     */
    public int getIdReceptionConditionAdditionsTableData5() {
        return idReceptionConditionAdditionsTableData5;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsTableData5 property.
     * 
     */
    public void setIdReceptionConditionAdditionsTableData5(int value) {
        this.idReceptionConditionAdditionsTableData5 = value;
    }

    /**
     * Gets the value of the idSubject property.
     * 
     */
    public int getIdSubject() {
        return idSubject;
    }

    /**
     * Sets the value of the idSubject property.
     * 
     */
    public void setIdSubject(int value) {
        this.idSubject = value;
    }

    /**
     * Gets the value of the subjectPosition property.
     * 
     */
    public int getSubjectPosition() {
        return subjectPosition;
    }

    /**
     * Sets the value of the subjectPosition property.
     * 
     */
    public void setSubjectPosition(int value) {
        this.subjectPosition = value;
    }

    /**
     * Gets the value of the choose property.
     * 
     */
    public int getChoose() {
        return choose;
    }

    /**
     * Sets the value of the choose property.
     * 
     */
    public void setChoose(int value) {
        this.choose = value;
    }

    /**
     * Gets the value of the isProfile property.
     * 
     */
    public int getIsProfile() {
        return isProfile;
    }

    /**
     * Sets the value of the isProfile property.
     * 
     */
    public void setIsProfile(int value) {
        this.isProfile = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinValue(String value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the subjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * Sets the value of the subjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName(String value) {
        this.subjectName = value;
    }

    /**
     * Gets the value of the subjectAdditianalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectAdditianalName() {
        return subjectAdditianalName;
    }

    /**
     * Sets the value of the subjectAdditianalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectAdditianalName(String value) {
        this.subjectAdditianalName = value;
    }

    /**
     * Gets the value of the koeficient property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKoeficient() {
        return koeficient;
    }

    /**
     * Sets the value of the koeficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKoeficient(BigDecimal value) {
        this.koeficient = value;
    }

    /**
     * Gets the value of the foreignIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignIds() {
        return foreignIds;
    }

    /**
     * Sets the value of the foreignIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignIds(String value) {
        this.foreignIds = value;
    }

    /**
     * Gets the value of the foreignNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignNames() {
        return foreignNames;
    }

    /**
     * Sets the value of the foreignNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignNames(String value) {
        this.foreignNames = value;
    }

}
