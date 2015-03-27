
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonRequestsBulkStatusChangeRet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonRequestsBulkStatusChangeRet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Errors" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ErrorId_Requests" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonRequestsBulkStatusChangeRet", propOrder = {
    "success",
    "errors",
    "errorIdRequests"
})
public class DPersonRequestsBulkStatusChangeRet {

    @XmlElement(name = "Success")
    protected int success;
    @XmlElement(name = "Errors")
    protected int errors;
    @XmlElement(name = "ErrorId_Requests")
    protected String errorIdRequests;

    /**
     * Gets the value of the success property.
     * 
     */
    public int getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     */
    public void setSuccess(int value) {
        this.success = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     */
    public int getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     */
    public void setErrors(int value) {
        this.errors = value;
    }

    /**
     * Gets the value of the errorIdRequests property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorIdRequests() {
        return errorIdRequests;
    }

    /**
     * Sets the value of the errorIdRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorIdRequests(String value) {
        this.errorIdRequests = value;
    }

}
