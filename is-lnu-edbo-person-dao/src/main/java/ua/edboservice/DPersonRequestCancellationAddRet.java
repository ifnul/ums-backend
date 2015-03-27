
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonRequestCancellationAddRet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonRequestCancellationAddRet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ret" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestCancellation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonRequestCancellationAddRet", propOrder = {
    "ret",
    "idPersonRequestCancellation",
    "error"
})
public class DPersonRequestCancellationAddRet {

    protected int ret;
    @XmlElement(name = "Id_PersonRequestCancellation")
    protected int idPersonRequestCancellation;
    protected String error;

    /**
     * Gets the value of the ret property.
     * 
     */
    public int getRet() {
        return ret;
    }

    /**
     * Sets the value of the ret property.
     * 
     */
    public void setRet(int value) {
        this.ret = value;
    }

    /**
     * Gets the value of the idPersonRequestCancellation property.
     * 
     */
    public int getIdPersonRequestCancellation() {
        return idPersonRequestCancellation;
    }

    /**
     * Sets the value of the idPersonRequestCancellation property.
     * 
     */
    public void setIdPersonRequestCancellation(int value) {
        this.idPersonRequestCancellation = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

}
