
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dAcademicDegreies complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicDegreies">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicDegree" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicDegreeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dAcademicDegreies", propOrder = {
    "idAcademicDegree",
    "academicDegreeName",
    "dateLastChange"
})
public class DAcademicDegreies {

    @XmlElement(name = "Id_AcademicDegree")
    protected int idAcademicDegree;
    @XmlElement(name = "AcademicDegreeName")
    protected String academicDegreeName;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;

    /**
     * Gets the value of the idAcademicDegree property.
     * 
     */
    public int getIdAcademicDegree() {
        return idAcademicDegree;
    }

    /**
     * Sets the value of the idAcademicDegree property.
     * 
     */
    public void setIdAcademicDegree(int value) {
        this.idAcademicDegree = value;
    }

    /**
     * Gets the value of the academicDegreeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicDegreeName() {
        return academicDegreeName;
    }

    /**
     * Sets the value of the academicDegreeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicDegreeName(String value) {
        this.academicDegreeName = value;
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
