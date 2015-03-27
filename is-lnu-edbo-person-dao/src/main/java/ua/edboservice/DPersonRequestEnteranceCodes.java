
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonRequestEnteranceCodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonRequestEnteranceCodes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonRequestEnteranceCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_RequestEnteranceCodes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonRequestEnteranceCodeDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RequestEnteranceCodes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestEnteranceCodesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonRequestEnteranceCodes", propOrder = {
    "idPersonRequestEnteranceCode",
    "idPersonRequest",
    "idRequestEnteranceCodes",
    "personRequestEnteranceCodeDateLastChange",
    "requestEnteranceCodes",
    "requestEnteranceCodesName"
})
public class DPersonRequestEnteranceCodes {

    @XmlElement(name = "Id_PersonRequestEnteranceCode")
    protected int idPersonRequestEnteranceCode;
    @XmlElement(name = "Id_PersonRequest")
    protected int idPersonRequest;
    @XmlElement(name = "id_RequestEnteranceCodes")
    protected int idRequestEnteranceCodes;
    @XmlElement(name = "PersonRequestEnteranceCodeDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personRequestEnteranceCodeDateLastChange;
    @XmlElement(name = "RequestEnteranceCodes")
    protected String requestEnteranceCodes;
    @XmlElement(name = "RequestEnteranceCodesName")
    protected String requestEnteranceCodesName;

    /**
     * Gets the value of the idPersonRequestEnteranceCode property.
     * 
     */
    public int getIdPersonRequestEnteranceCode() {
        return idPersonRequestEnteranceCode;
    }

    /**
     * Sets the value of the idPersonRequestEnteranceCode property.
     * 
     */
    public void setIdPersonRequestEnteranceCode(int value) {
        this.idPersonRequestEnteranceCode = value;
    }

    /**
     * Gets the value of the idPersonRequest property.
     * 
     */
    public int getIdPersonRequest() {
        return idPersonRequest;
    }

    /**
     * Sets the value of the idPersonRequest property.
     * 
     */
    public void setIdPersonRequest(int value) {
        this.idPersonRequest = value;
    }

    /**
     * Gets the value of the idRequestEnteranceCodes property.
     * 
     */
    public int getIdRequestEnteranceCodes() {
        return idRequestEnteranceCodes;
    }

    /**
     * Sets the value of the idRequestEnteranceCodes property.
     * 
     */
    public void setIdRequestEnteranceCodes(int value) {
        this.idRequestEnteranceCodes = value;
    }

    /**
     * Gets the value of the personRequestEnteranceCodeDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonRequestEnteranceCodeDateLastChange() {
        return personRequestEnteranceCodeDateLastChange;
    }

    /**
     * Sets the value of the personRequestEnteranceCodeDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonRequestEnteranceCodeDateLastChange(XMLGregorianCalendar value) {
        this.personRequestEnteranceCodeDateLastChange = value;
    }

    /**
     * Gets the value of the requestEnteranceCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestEnteranceCodes() {
        return requestEnteranceCodes;
    }

    /**
     * Sets the value of the requestEnteranceCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestEnteranceCodes(String value) {
        this.requestEnteranceCodes = value;
    }

    /**
     * Gets the value of the requestEnteranceCodesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestEnteranceCodesName() {
        return requestEnteranceCodesName;
    }

    /**
     * Sets the value of the requestEnteranceCodesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestEnteranceCodesName(String value) {
        this.requestEnteranceCodesName = value;
    }

}
