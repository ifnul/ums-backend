
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dEducationalCycles_Knowledge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dEducationalCycles_Knowledge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_EducationalCycles_Knowledge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Global_EducationalCycles_Knowledge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCycles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationalCycles_KnowledgeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationalCycles_KnowledgeTextEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UserAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dEducationalCycles_Knowledge", propOrder = {
    "idEducationalCyclesKnowledge",
    "idGlobalEducationalCyclesKnowledge",
    "idEducationalCycles",
    "educationalCyclesKnowledgeText",
    "educationalCyclesKnowledgeTextEn",
    "idUserAdd",
    "dateCreate",
    "dateLastChange"
})
public class DEducationalCyclesKnowledge {

    @XmlElement(name = "Id_EducationalCycles_Knowledge")
    protected int idEducationalCyclesKnowledge;
    @XmlElement(name = "Id_Global_EducationalCycles_Knowledge")
    protected int idGlobalEducationalCyclesKnowledge;
    @XmlElement(name = "Id_EducationalCycles")
    protected int idEducationalCycles;
    @XmlElement(name = "EducationalCycles_KnowledgeText")
    protected String educationalCyclesKnowledgeText;
    @XmlElement(name = "EducationalCycles_KnowledgeTextEn")
    protected String educationalCyclesKnowledgeTextEn;
    @XmlElement(name = "Id_UserAdd")
    protected int idUserAdd;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;

    /**
     * Gets the value of the idEducationalCyclesKnowledge property.
     * 
     */
    public int getIdEducationalCyclesKnowledge() {
        return idEducationalCyclesKnowledge;
    }

    /**
     * Sets the value of the idEducationalCyclesKnowledge property.
     * 
     */
    public void setIdEducationalCyclesKnowledge(int value) {
        this.idEducationalCyclesKnowledge = value;
    }

    /**
     * Gets the value of the idGlobalEducationalCyclesKnowledge property.
     * 
     */
    public int getIdGlobalEducationalCyclesKnowledge() {
        return idGlobalEducationalCyclesKnowledge;
    }

    /**
     * Sets the value of the idGlobalEducationalCyclesKnowledge property.
     * 
     */
    public void setIdGlobalEducationalCyclesKnowledge(int value) {
        this.idGlobalEducationalCyclesKnowledge = value;
    }

    /**
     * Gets the value of the idEducationalCycles property.
     * 
     */
    public int getIdEducationalCycles() {
        return idEducationalCycles;
    }

    /**
     * Sets the value of the idEducationalCycles property.
     * 
     */
    public void setIdEducationalCycles(int value) {
        this.idEducationalCycles = value;
    }

    /**
     * Gets the value of the educationalCyclesKnowledgeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesKnowledgeText() {
        return educationalCyclesKnowledgeText;
    }

    /**
     * Sets the value of the educationalCyclesKnowledgeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesKnowledgeText(String value) {
        this.educationalCyclesKnowledgeText = value;
    }

    /**
     * Gets the value of the educationalCyclesKnowledgeTextEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesKnowledgeTextEn() {
        return educationalCyclesKnowledgeTextEn;
    }

    /**
     * Sets the value of the educationalCyclesKnowledgeTextEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesKnowledgeTextEn(String value) {
        this.educationalCyclesKnowledgeTextEn = value;
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

}
