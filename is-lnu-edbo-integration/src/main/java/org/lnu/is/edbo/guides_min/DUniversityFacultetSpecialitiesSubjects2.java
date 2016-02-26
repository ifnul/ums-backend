
package org.lnu.is.edbo.guides_min;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityFacultetSpecialitiesSubjects2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityFacultetSpecialitiesSubjects2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversitySpecialitiesSubject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Subject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsProfiled" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitySpecialitiesSubjectsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesSubjectsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversitySpecialitiesSubjectParent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Detalization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Koeficient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityFacultetSpecialitiesSubjects2", propOrder = {
    "idUniversitySpecialitiesSubject",
    "idSubject",
    "subjectName",
    "universitySpecialitiesKode",
    "dateLastChange",
    "isProfiled",
    "inGroup",
    "universitySpecialitiesSubjectsName",
    "universitySpecialitiesSubjectsDescription",
    "idUniversitySpecialitiesSubjectParent",
    "detalization",
    "koeficient"
})
public class DUniversityFacultetSpecialitiesSubjects2 {

    @XmlElement(name = "Id_UniversitySpecialitiesSubject")
    protected int idUniversitySpecialitiesSubject;
    @XmlElement(name = "Id_Subject")
    protected int idSubject;
    @XmlElement(name = "SubjectName")
    protected String subjectName;
    @XmlElement(name = "UniversitySpecialitiesKode")
    protected String universitySpecialitiesKode;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "IsProfiled")
    protected int isProfiled;
    @XmlElement(name = "InGroup")
    protected int inGroup;
    @XmlElement(name = "UniversitySpecialitiesSubjectsName")
    protected String universitySpecialitiesSubjectsName;
    @XmlElement(name = "UniversitySpecialitiesSubjectsDescription")
    protected String universitySpecialitiesSubjectsDescription;
    @XmlElement(name = "Id_UniversitySpecialitiesSubjectParent")
    protected int idUniversitySpecialitiesSubjectParent;
    @XmlElement(name = "Detalization")
    protected String detalization;
    @XmlElement(name = "Koeficient")
    protected String koeficient;

    /**
     * Gets the value of the idUniversitySpecialitiesSubject property.
     * 
     */
    public int getIdUniversitySpecialitiesSubject() {
        return idUniversitySpecialitiesSubject;
    }

    /**
     * Sets the value of the idUniversitySpecialitiesSubject property.
     * 
     */
    public void setIdUniversitySpecialitiesSubject(int value) {
        this.idUniversitySpecialitiesSubject = value;
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
     * Gets the value of the universitySpecialitiesKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesKode() {
        return universitySpecialitiesKode;
    }

    /**
     * Sets the value of the universitySpecialitiesKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesKode(String value) {
        this.universitySpecialitiesKode = value;
    }

    /**
     * Gets the value of the dateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastChange() {
        return dateLastChange;
    }

    /**
     * Sets the value of the dateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastChange(XMLGregorianCalendar value) {
        this.dateLastChange = value;
    }

    /**
     * Gets the value of the isProfiled property.
     * 
     */
    public int getIsProfiled() {
        return isProfiled;
    }

    /**
     * Sets the value of the isProfiled property.
     * 
     */
    public void setIsProfiled(int value) {
        this.isProfiled = value;
    }

    /**
     * Gets the value of the inGroup property.
     * 
     */
    public int getInGroup() {
        return inGroup;
    }

    /**
     * Sets the value of the inGroup property.
     * 
     */
    public void setInGroup(int value) {
        this.inGroup = value;
    }

    /**
     * Gets the value of the universitySpecialitiesSubjectsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesSubjectsName() {
        return universitySpecialitiesSubjectsName;
    }

    /**
     * Sets the value of the universitySpecialitiesSubjectsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesSubjectsName(String value) {
        this.universitySpecialitiesSubjectsName = value;
    }

    /**
     * Gets the value of the universitySpecialitiesSubjectsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesSubjectsDescription() {
        return universitySpecialitiesSubjectsDescription;
    }

    /**
     * Sets the value of the universitySpecialitiesSubjectsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesSubjectsDescription(String value) {
        this.universitySpecialitiesSubjectsDescription = value;
    }

    /**
     * Gets the value of the idUniversitySpecialitiesSubjectParent property.
     * 
     */
    public int getIdUniversitySpecialitiesSubjectParent() {
        return idUniversitySpecialitiesSubjectParent;
    }

    /**
     * Sets the value of the idUniversitySpecialitiesSubjectParent property.
     * 
     */
    public void setIdUniversitySpecialitiesSubjectParent(int value) {
        this.idUniversitySpecialitiesSubjectParent = value;
    }

    /**
     * Gets the value of the detalization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalization() {
        return detalization;
    }

    /**
     * Sets the value of the detalization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalization(String value) {
        this.detalization = value;
    }

    /**
     * Gets the value of the koeficient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeficient() {
        return koeficient;
    }

    /**
     * Sets the value of the koeficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeficient(String value) {
        this.koeficient = value;
    }

}
