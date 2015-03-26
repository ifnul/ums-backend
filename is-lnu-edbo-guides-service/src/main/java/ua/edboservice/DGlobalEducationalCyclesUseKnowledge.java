
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dGlobal_EducationalCycles_UseKnowledge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dGlobal_EducationalCycles_UseKnowledge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Global_EducationalCycles_UseKnowledge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Global_EducationalCycles_UseKnowledge_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_EducationalCycles_UseKnowledge_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_EducationalCycles_UseKnowledgeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_EducationalCycles_UseKnowledgeTextEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_QualificationGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecDirectionsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UserAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fdel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QualificationGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirClasifierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dGlobal_EducationalCycles_UseKnowledge", propOrder = {
    "idGlobalEducationalCyclesUseKnowledge",
    "globalEducationalCyclesUseKnowledgeName",
    "globalEducationalCyclesUseKnowledgeDescription",
    "globalEducationalCyclesUseKnowledgeText",
    "globalEducationalCyclesUseKnowledgeTextEn",
    "idQualificationGroup",
    "specDirectionsCode",
    "specSpecialityCode",
    "idUserAdd",
    "dateCreate",
    "dateLastChange",
    "universityKode",
    "fdel",
    "qualificationGroupName",
    "specDirClasifierCode",
    "specDirClasifierName"
})
public class DGlobalEducationalCyclesUseKnowledge {

    @XmlElement(name = "Id_Global_EducationalCycles_UseKnowledge")
    protected int idGlobalEducationalCyclesUseKnowledge;
    @XmlElement(name = "Global_EducationalCycles_UseKnowledge_Name")
    protected String globalEducationalCyclesUseKnowledgeName;
    @XmlElement(name = "Global_EducationalCycles_UseKnowledge_Description")
    protected String globalEducationalCyclesUseKnowledgeDescription;
    @XmlElement(name = "Global_EducationalCycles_UseKnowledgeText")
    protected String globalEducationalCyclesUseKnowledgeText;
    @XmlElement(name = "Global_EducationalCycles_UseKnowledgeTextEn")
    protected String globalEducationalCyclesUseKnowledgeTextEn;
    @XmlElement(name = "Id_QualificationGroup")
    protected int idQualificationGroup;
    @XmlElement(name = "SpecDirectionsCode")
    protected String specDirectionsCode;
    @XmlElement(name = "SpecSpecialityCode")
    protected String specSpecialityCode;
    @XmlElement(name = "Id_UserAdd")
    protected int idUserAdd;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    protected int fdel;
    @XmlElement(name = "QualificationGroupName")
    protected String qualificationGroupName;
    @XmlElement(name = "SpecDirClasifierCode")
    protected String specDirClasifierCode;
    @XmlElement(name = "SpecDirClasifierName")
    protected String specDirClasifierName;

    /**
     * Gets the value of the idGlobalEducationalCyclesUseKnowledge property.
     * 
     */
    public int getIdGlobalEducationalCyclesUseKnowledge() {
        return idGlobalEducationalCyclesUseKnowledge;
    }

    /**
     * Sets the value of the idGlobalEducationalCyclesUseKnowledge property.
     * 
     */
    public void setIdGlobalEducationalCyclesUseKnowledge(int value) {
        this.idGlobalEducationalCyclesUseKnowledge = value;
    }

    /**
     * Gets the value of the globalEducationalCyclesUseKnowledgeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalEducationalCyclesUseKnowledgeName() {
        return globalEducationalCyclesUseKnowledgeName;
    }

    /**
     * Sets the value of the globalEducationalCyclesUseKnowledgeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalEducationalCyclesUseKnowledgeName(String value) {
        this.globalEducationalCyclesUseKnowledgeName = value;
    }

    /**
     * Gets the value of the globalEducationalCyclesUseKnowledgeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalEducationalCyclesUseKnowledgeDescription() {
        return globalEducationalCyclesUseKnowledgeDescription;
    }

    /**
     * Sets the value of the globalEducationalCyclesUseKnowledgeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalEducationalCyclesUseKnowledgeDescription(String value) {
        this.globalEducationalCyclesUseKnowledgeDescription = value;
    }

    /**
     * Gets the value of the globalEducationalCyclesUseKnowledgeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalEducationalCyclesUseKnowledgeText() {
        return globalEducationalCyclesUseKnowledgeText;
    }

    /**
     * Sets the value of the globalEducationalCyclesUseKnowledgeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalEducationalCyclesUseKnowledgeText(String value) {
        this.globalEducationalCyclesUseKnowledgeText = value;
    }

    /**
     * Gets the value of the globalEducationalCyclesUseKnowledgeTextEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalEducationalCyclesUseKnowledgeTextEn() {
        return globalEducationalCyclesUseKnowledgeTextEn;
    }

    /**
     * Sets the value of the globalEducationalCyclesUseKnowledgeTextEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalEducationalCyclesUseKnowledgeTextEn(String value) {
        this.globalEducationalCyclesUseKnowledgeTextEn = value;
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
     * Gets the value of the specDirectionsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionsCode() {
        return specDirectionsCode;
    }

    /**
     * Sets the value of the specDirectionsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionsCode(String value) {
        this.specDirectionsCode = value;
    }

    /**
     * Gets the value of the specSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityCode() {
        return specSpecialityCode;
    }

    /**
     * Sets the value of the specSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityCode(String value) {
        this.specSpecialityCode = value;
    }

    /**
     * Gets the value of the idUserAdd property.
     * 
     */
    public int getIdUserAdd() {
        return idUserAdd;
    }

    /**
     * Sets the value of the idUserAdd property.
     * 
     */
    public void setIdUserAdd(int value) {
        this.idUserAdd = value;
    }

    /**
     * Gets the value of the dateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreate() {
        return dateCreate;
    }

    /**
     * Sets the value of the dateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreate(XMLGregorianCalendar value) {
        this.dateCreate = value;
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
     * Gets the value of the fdel property.
     * 
     */
    public int getFdel() {
        return fdel;
    }

    /**
     * Sets the value of the fdel property.
     * 
     */
    public void setFdel(int value) {
        this.fdel = value;
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

    /**
     * Gets the value of the specDirClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirClasifierCode() {
        return specDirClasifierCode;
    }

    /**
     * Sets the value of the specDirClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirClasifierCode(String value) {
        this.specDirClasifierCode = value;
    }

    /**
     * Gets the value of the specDirClasifierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirClasifierName() {
        return specDirClasifierName;
    }

    /**
     * Sets the value of the specDirClasifierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirClasifierName(String value) {
        this.specDirClasifierName = value;
    }

}
