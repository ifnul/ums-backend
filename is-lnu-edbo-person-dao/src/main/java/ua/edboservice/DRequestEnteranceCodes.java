
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dRequestEnteranceCodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dRequestEnteranceCodes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_RequestEnteranceCodes" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "dRequestEnteranceCodes", propOrder = {
    "idRequestEnteranceCodes",
    "requestEnteranceCodes",
    "requestEnteranceCodesName"
})
public class DRequestEnteranceCodes {

    @XmlElement(name = "id_RequestEnteranceCodes")
    protected int idRequestEnteranceCodes;
    @XmlElement(name = "RequestEnteranceCodes")
    protected String requestEnteranceCodes;
    @XmlElement(name = "RequestEnteranceCodesName")
    protected String requestEnteranceCodesName;

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
