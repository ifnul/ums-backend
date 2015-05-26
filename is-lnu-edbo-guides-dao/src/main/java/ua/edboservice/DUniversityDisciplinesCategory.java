
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityDisciplinesCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityDisciplinesCategory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversitiesDisciplinesCategory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitiesDisciplinesCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitiesDisciplinesCategoryDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_QualificationGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QualificationGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityDisciplinesCategory", propOrder = {
    "idUniversitiesDisciplinesCategory",
    "universityKode",
    "universitiesDisciplinesCategoryName",
    "universitiesDisciplinesCategoryDateLastChange",
    "idQualificationGroup",
    "qualificationGroupName"
})
public class DUniversityDisciplinesCategory {

    @XmlElement(name = "Id_UniversitiesDisciplinesCategory")
    protected int idUniversitiesDisciplinesCategory;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversitiesDisciplinesCategoryName")
    protected String universitiesDisciplinesCategoryName;
    @XmlElement(name = "UniversitiesDisciplinesCategoryDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universitiesDisciplinesCategoryDateLastChange;
    @XmlElement(name = "Id_QualificationGroup")
    protected int idQualificationGroup;
    @XmlElement(name = "QualificationGroupName")
    protected String qualificationGroupName;

    /**
     * Gets the value of the idUniversitiesDisciplinesCategory property.
     * 
     */
    public int getIdUniversitiesDisciplinesCategory() {
        return idUniversitiesDisciplinesCategory;
    }

    /**
     * Sets the value of the idUniversitiesDisciplinesCategory property.
     * 
     */
    public void setIdUniversitiesDisciplinesCategory(int value) {
        this.idUniversitiesDisciplinesCategory = value;
    }

    /**
     * Gets the value of the universityKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKode() {
        return universityKode;
    }

    /**
     * Sets the value of the universityKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKode(String value) {
        this.universityKode = value;
    }

    /**
     * Gets the value of the universitiesDisciplinesCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesDisciplinesCategoryName() {
        return universitiesDisciplinesCategoryName;
    }

    /**
     * Sets the value of the universitiesDisciplinesCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesDisciplinesCategoryName(String value) {
        this.universitiesDisciplinesCategoryName = value;
    }

    /**
     * Gets the value of the universitiesDisciplinesCategoryDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversitiesDisciplinesCategoryDateLastChange() {
        return universitiesDisciplinesCategoryDateLastChange;
    }

    /**
     * Sets the value of the universitiesDisciplinesCategoryDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversitiesDisciplinesCategoryDateLastChange(XMLGregorianCalendar value) {
        this.universitiesDisciplinesCategoryDateLastChange = value;
    }

    /**
     * Gets the value of the idQualificationGroup property.
     * 
     */
    public int getIdQualificationGroup() {
        return idQualificationGroup;
    }

    /**
     * Sets the value of the idQualificationGroup property.
     * 
     */
    public void setIdQualificationGroup(int value) {
        this.idQualificationGroup = value;
    }

    /**
     * Gets the value of the qualificationGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationGroupName() {
        return qualificationGroupName;
    }

    /**
     * Sets the value of the qualificationGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationGroupName(String value) {
        this.qualificationGroupName = value;
    }

}
