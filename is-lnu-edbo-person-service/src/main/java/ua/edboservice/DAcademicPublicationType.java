
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dAcademicPublicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicPublicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicPublicationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicPublicationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicPublicationTypeDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicPublicationType", propOrder = {
    "idAcademicPublicationType",
    "academicPublicationTypeName",
    "academicPublicationTypeDateLastChange"
})
public class DAcademicPublicationType {

    @XmlElement(name = "Id_AcademicPublicationType")
    protected int idAcademicPublicationType;
    @XmlElement(name = "AcademicPublicationTypeName")
    protected String academicPublicationTypeName;
    @XmlElement(name = "AcademicPublicationTypeDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar academicPublicationTypeDateLastChange;

    /**
     * Gets the value of the idAcademicPublicationType property.
     * 
     */
    public int getIdAcademicPublicationType() {
        return idAcademicPublicationType;
    }

    /**
     * Sets the value of the idAcademicPublicationType property.
     * 
     */
    public void setIdAcademicPublicationType(int value) {
        this.idAcademicPublicationType = value;
    }

    /**
     * Gets the value of the academicPublicationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicPublicationTypeName() {
        return academicPublicationTypeName;
    }

    /**
     * Sets the value of the academicPublicationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicPublicationTypeName(String value) {
        this.academicPublicationTypeName = value;
    }

    /**
     * Gets the value of the academicPublicationTypeDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicPublicationTypeDateLastChange() {
        return academicPublicationTypeDateLastChange;
    }

    /**
     * Sets the value of the academicPublicationTypeDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicPublicationTypeDateLastChange(XMLGregorianCalendar value) {
        this.academicPublicationTypeDateLastChange = value;
    }

}
