
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
 *         &lt;element name="PersonDocumentCancellationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDocumentCancellationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonDocumentCancellation" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personDocumentCancellationDate",
    "personDocumentCancellationNumber",
    "idPersonDocumentCancellation"
})
@XmlRootElement(name = "PersonDocumentCancellationEdit")
public class PersonDocumentCancellationEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "PersonDocumentCancellationDate")
    protected String personDocumentCancellationDate;
    @XmlElement(name = "PersonDocumentCancellationNumber")
    protected String personDocumentCancellationNumber;
    @XmlElement(name = "Id_PersonDocumentCancellation")
    protected int idPersonDocumentCancellation;

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
     * Gets the value of the personDocumentCancellationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonDocumentCancellationDate() {
        return personDocumentCancellationDate;
    }

    /**
     * Sets the value of the personDocumentCancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonDocumentCancellationDate(String value) {
        this.personDocumentCancellationDate = value;
    }

    /**
     * Gets the value of the personDocumentCancellationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonDocumentCancellationNumber() {
        return personDocumentCancellationNumber;
    }

    /**
     * Sets the value of the personDocumentCancellationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonDocumentCancellationNumber(String value) {
        this.personDocumentCancellationNumber = value;
    }

    /**
     * Gets the value of the idPersonDocumentCancellation property.
     * 
     */
    public int getIdPersonDocumentCancellation() {
        return idPersonDocumentCancellation;
    }

    /**
     * Sets the value of the idPersonDocumentCancellation property.
     * 
     */
    public void setIdPersonDocumentCancellation(int value) {
        this.idPersonDocumentCancellation = value;
    }

}
