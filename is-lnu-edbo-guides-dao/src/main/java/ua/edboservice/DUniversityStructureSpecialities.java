
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityStructureSpecialities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityStructureSpecialities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityStructureSpecCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityStructureSpecCodeDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityStructureSpecCodeDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityStructureSpecCodeLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityStructureSpecCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityFacultetType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecIndastryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecializationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityStructureSpecialities", propOrder = {
    "idUniversityStructureSpecCode",
    "specCode",
    "universityKode",
    "universityFacultetKode",
    "universityStructureSpecCodeDateBegin",
    "universityStructureSpecCodeDateEnd",
    "universityStructureSpecCodeLastChange",
    "universityStructureSpecCodeDescription",
    "universityFacultetFullName",
    "universityFacultetShortName",
    "idUniversityFacultetType",
    "universityFacultetTypeName",
    "specIndastryName",
    "specDirectionName",
    "specSpecialityName",
    "specSpecializationName",
    "specClasifierCode"
})
public class DUniversityStructureSpecialities {

    @XmlElement(name = "Id_UniversityStructureSpecCode")
    protected int idUniversityStructureSpecCode;
    @XmlElement(name = "SpecCode")
    protected String specCode;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "UniversityStructureSpecCodeDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityStructureSpecCodeDateBegin;
    @XmlElement(name = "UniversityStructureSpecCodeDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityStructureSpecCodeDateEnd;
    @XmlElement(name = "UniversityStructureSpecCodeLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityStructureSpecCodeLastChange;
    @XmlElement(name = "UniversityStructureSpecCodeDescription")
    protected String universityStructureSpecCodeDescription;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "UniversityFacultetShortName")
    protected String universityFacultetShortName;
    @XmlElement(name = "Id_UniversityFacultetType")
    protected int idUniversityFacultetType;
    @XmlElement(name = "UniversityFacultetTypeName")
    protected String universityFacultetTypeName;
    @XmlElement(name = "SpecIndastryName")
    protected String specIndastryName;
    @XmlElement(name = "SpecDirectionName")
    protected String specDirectionName;
    @XmlElement(name = "SpecSpecialityName")
    protected String specSpecialityName;
    @XmlElement(name = "SpecSpecializationName")
    protected String specSpecializationName;
    @XmlElement(name = "SpecClasifierCode")
    protected String specClasifierCode;

    /**
     * Gets the value of the idUniversityStructureSpecCode property.
     * 
     */
    public int getIdUniversityStructureSpecCode() {
        return idUniversityStructureSpecCode;
    }

    /**
     * Sets the value of the idUniversityStructureSpecCode property.
     * 
     */
    public void setIdUniversityStructureSpecCode(int value) {
        this.idUniversityStructureSpecCode = value;
    }

    /**
     * Gets the value of the specCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecCode() {
        return specCode;
    }

    /**
     * Sets the value of the specCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecCode(String value) {
        this.specCode = value;
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
     * Gets the value of the universityFacultetKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetKode() {
        return universityFacultetKode;
    }

    /**
     * Sets the value of the universityFacultetKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetKode(String value) {
        this.universityFacultetKode = value;
    }

    /**
     * Gets the value of the universityStructureSpecCodeDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityStructureSpecCodeDateBegin() {
        return universityStructureSpecCodeDateBegin;
    }

    /**
     * Sets the value of the universityStructureSpecCodeDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityStructureSpecCodeDateBegin(XMLGregorianCalendar value) {
        this.universityStructureSpecCodeDateBegin = value;
    }

    /**
     * Gets the value of the universityStructureSpecCodeDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityStructureSpecCodeDateEnd() {
        return universityStructureSpecCodeDateEnd;
    }

    /**
     * Sets the value of the universityStructureSpecCodeDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityStructureSpecCodeDateEnd(XMLGregorianCalendar value) {
        this.universityStructureSpecCodeDateEnd = value;
    }

    /**
     * Gets the value of the universityStructureSpecCodeLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityStructureSpecCodeLastChange() {
        return universityStructureSpecCodeLastChange;
    }

    /**
     * Sets the value of the universityStructureSpecCodeLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityStructureSpecCodeLastChange(XMLGregorianCalendar value) {
        this.universityStructureSpecCodeLastChange = value;
    }

    /**
     * Gets the value of the universityStructureSpecCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityStructureSpecCodeDescription() {
        return universityStructureSpecCodeDescription;
    }

    /**
     * Sets the value of the universityStructureSpecCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityStructureSpecCodeDescription(String value) {
        this.universityStructureSpecCodeDescription = value;
    }

    /**
     * Gets the value of the universityFacultetFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetFullName() {
        return universityFacultetFullName;
    }

    /**
     * Sets the value of the universityFacultetFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetFullName(String value) {
        this.universityFacultetFullName = value;
    }

    /**
     * Gets the value of the universityFacultetShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetShortName() {
        return universityFacultetShortName;
    }

    /**
     * Sets the value of the universityFacultetShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetShortName(String value) {
        this.universityFacultetShortName = value;
    }

    /**
     * Gets the value of the idUniversityFacultetType property.
     * 
     */
    public int getIdUniversityFacultetType() {
        return idUniversityFacultetType;
    }

    /**
     * Sets the value of the idUniversityFacultetType property.
     * 
     */
    public void setIdUniversityFacultetType(int value) {
        this.idUniversityFacultetType = value;
    }

    /**
     * Gets the value of the universityFacultetTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetTypeName() {
        return universityFacultetTypeName;
    }

    /**
     * Sets the value of the universityFacultetTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetTypeName(String value) {
        this.universityFacultetTypeName = value;
    }

    /**
     * Gets the value of the specIndastryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecIndastryName() {
        return specIndastryName;
    }

    /**
     * Sets the value of the specIndastryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecIndastryName(String value) {
        this.specIndastryName = value;
    }

    /**
     * Gets the value of the specDirectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionName() {
        return specDirectionName;
    }

    /**
     * Sets the value of the specDirectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionName(String value) {
        this.specDirectionName = value;
    }

    /**
     * Gets the value of the specSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityName() {
        return specSpecialityName;
    }

    /**
     * Sets the value of the specSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityName(String value) {
        this.specSpecialityName = value;
    }

    /**
     * Gets the value of the specSpecializationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecializationName() {
        return specSpecializationName;
    }

    /**
     * Sets the value of the specSpecializationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecializationName(String value) {
        this.specSpecializationName = value;
    }

    /**
     * Gets the value of the specClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecClasifierCode() {
        return specClasifierCode;
    }

    /**
     * Sets the value of the specClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecClasifierCode(String value) {
        this.specClasifierCode = value;
    }

}
