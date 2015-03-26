
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dEducationalCycles_UseKnowledge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dEducationalCycles_UseKnowledge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_EducationalCycles_UseKnowledge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Global_EducationalCycles_UseKnowledge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCycles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationalCycles_UseKnowledgeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationalCycles_UseKnowledgeTextEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dEducationalCycles_UseKnowledge", propOrder = {
    "idEducationalCyclesUseKnowledge",
    "idGlobalEducationalCyclesUseKnowledge",
    "idEducationalCycles",
    "educationalCyclesUseKnowledgeText",
    "educationalCyclesUseKnowledgeTextEn",
    "idUserAdd",
    "dateCreate",
    "dateLastChange"
})
public class DEducationalCyclesUseKnowledge {

    @XmlElement(name = "Id_EducationalCycles_UseKnowledge")
    protected int idEducationalCyclesUseKnowledge;
    @XmlElement(name = "Id_Global_EducationalCycles_UseKnowledge")
    protected int idGlobalEducationalCyclesUseKnowledge;
    @XmlElement(name = "Id_EducationalCycles")
    protected int idEducationalCycles;
    @XmlElement(name = "EducationalCycles_UseKnowledgeText")
    protected String educationalCyclesUseKnowledgeText;
    @XmlElement(name = "EducationalCycles_UseKnowledgeTextEn")
    protected String educationalCyclesUseKnowledgeTextEn;
    @XmlElement(name = "Id_UserAdd")
    protected int idUserAdd;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;

    /**
     * Gets the value of the idEducationalCyclesUseKnowledge property.
     * 
     */
    public int getIdEducationalCyclesUseKnowledge() {
        return idEducationalCyclesUseKnowledge;
    }

    /**
     * Sets the value of the idEducationalCyclesUseKnowledge property.
     * 
     */
    public void setIdEducationalCyclesUseKnowledge(int value) {
        this.idEducationalCyclesUseKnowledge = value;
    }

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
     * Gets the value of the educationalCyclesUseKnowledgeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesUseKnowledgeText() {
        return educationalCyclesUseKnowledgeText;
    }

    /**
     * Sets the value of the educationalCyclesUseKnowledgeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesUseKnowledgeText(String value) {
        this.educationalCyclesUseKnowledgeText = value;
    }

    /**
     * Gets the value of the educationalCyclesUseKnowledgeTextEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesUseKnowledgeTextEn() {
        return educationalCyclesUseKnowledgeTextEn;
    }

    /**
     * Sets the value of the educationalCyclesUseKnowledgeTextEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesUseKnowledgeTextEn(String value) {
        this.educationalCyclesUseKnowledgeTextEn = value;
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
