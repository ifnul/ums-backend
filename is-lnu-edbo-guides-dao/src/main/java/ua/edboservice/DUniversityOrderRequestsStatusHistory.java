
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityOrderRequestsStatusHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityOrderRequestsStatusHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityOrderRequestsStatusHistory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityOrderRequestsStatusTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatorFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityOrderRequestsStatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityOrderRequestsStatusIsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityOrderRequestsStatusHistory", propOrder = {
    "idUniversityOrderRequestsStatusHistory",
    "universityOrderRequestsStatusTypeName",
    "operatorFIO",
    "dateLastChange",
    "universityOrderRequestsStatusDescription",
    "universityOrderRequestsStatusIsActive"
})
public class DUniversityOrderRequestsStatusHistory {

    @XmlElement(name = "Id_UniversityOrderRequestsStatusHistory")
    protected int idUniversityOrderRequestsStatusHistory;
    @XmlElement(name = "UniversityOrderRequestsStatusTypeName")
    protected String universityOrderRequestsStatusTypeName;
    @XmlElement(name = "OperatorFIO")
    protected String operatorFIO;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "UniversityOrderRequestsStatusDescription")
    protected String universityOrderRequestsStatusDescription;
    @XmlElement(name = "UniversityOrderRequestsStatusIsActive")
    protected int universityOrderRequestsStatusIsActive;

    /**
     * Gets the value of the idUniversityOrderRequestsStatusHistory property.
     * 
     */
    public int getIdUniversityOrderRequestsStatusHistory() {
        return idUniversityOrderRequestsStatusHistory;
    }

    /**
     * Sets the value of the idUniversityOrderRequestsStatusHistory property.
     * 
     */
    public void setIdUniversityOrderRequestsStatusHistory(int value) {
        this.idUniversityOrderRequestsStatusHistory = value;
    }

    /**
     * Gets the value of the universityOrderRequestsStatusTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityOrderRequestsStatusTypeName() {
        return universityOrderRequestsStatusTypeName;
    }

    /**
     * Sets the value of the universityOrderRequestsStatusTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityOrderRequestsStatusTypeName(String value) {
        this.universityOrderRequestsStatusTypeName = value;
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
     * Gets the value of the universityOrderRequestsStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityOrderRequestsStatusDescription() {
        return universityOrderRequestsStatusDescription;
    }

    /**
     * Sets the value of the universityOrderRequestsStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityOrderRequestsStatusDescription(String value) {
        this.universityOrderRequestsStatusDescription = value;
    }

    /**
     * Gets the value of the universityOrderRequestsStatusIsActive property.
     * 
     */
    public int getUniversityOrderRequestsStatusIsActive() {
        return universityOrderRequestsStatusIsActive;
    }

    /**
     * Sets the value of the universityOrderRequestsStatusIsActive property.
     * 
     */
    public void setUniversityOrderRequestsStatusIsActive(int value) {
        this.universityOrderRequestsStatusIsActive = value;
    }

}
