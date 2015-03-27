
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_ForeignStudentsOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForeignStudentInviteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForeignStudentInviteDateGive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForeignStudentInviteDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionGUID",
    "idForeignStudentsOrder",
    "personCodeU",
    "foreignStudentInviteNumber",
    "foreignStudentInviteDateGive",
    "foreignStudentInviteDateEnd"
})
@XmlRootElement(name = "ForeignStudentsAdd")
public class ForeignStudentsAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_ForeignStudentsOrder")
    protected int idForeignStudentsOrder;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "ForeignStudentInviteNumber")
    protected String foreignStudentInviteNumber;
    @XmlElement(name = "ForeignStudentInviteDateGive")
    protected String foreignStudentInviteDateGive;
    @XmlElement(name = "ForeignStudentInviteDateEnd")
    protected String foreignStudentInviteDateEnd;

    /**
     * Gets the value of the sessionGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionGUID() {
        return sessionGUID;
    }

    /**
     * Sets the value of the sessionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionGUID(String value) {
        this.sessionGUID = value;
    }

    /**
     * Gets the value of the idForeignStudentsOrder property.
     * 
     */
    public int getIdForeignStudentsOrder() {
        return idForeignStudentsOrder;
    }

    /**
     * Sets the value of the idForeignStudentsOrder property.
     * 
     */
    public void setIdForeignStudentsOrder(int value) {
        this.idForeignStudentsOrder = value;
    }

    /**
     * Gets the value of the personCodeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeU() {
        return personCodeU;
    }

    /**
     * Sets the value of the personCodeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeU(String value) {
        this.personCodeU = value;
    }

    /**
     * Gets the value of the foreignStudentInviteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignStudentInviteNumber() {
        return foreignStudentInviteNumber;
    }

    /**
     * Sets the value of the foreignStudentInviteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignStudentInviteNumber(String value) {
        this.foreignStudentInviteNumber = value;
    }

    /**
     * Gets the value of the foreignStudentInviteDateGive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignStudentInviteDateGive() {
        return foreignStudentInviteDateGive;
    }

    /**
     * Sets the value of the foreignStudentInviteDateGive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignStudentInviteDateGive(String value) {
        this.foreignStudentInviteDateGive = value;
    }

    /**
     * Gets the value of the foreignStudentInviteDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignStudentInviteDateEnd() {
        return foreignStudentInviteDateEnd;
    }

    /**
     * Sets the value of the foreignStudentInviteDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignStudentInviteDateEnd(String value) {
        this.foreignStudentInviteDateEnd = value;
    }

}
