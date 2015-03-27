
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dSupportRequestTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dSupportRequestTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_SupportRequestType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SupportRequestTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dSupportRequestTypes", propOrder = {
    "idSupportRequestType",
    "supportRequestTypeName"
})
public class DSupportRequestTypes {

    @XmlElement(name = "Id_SupportRequestType")
    protected int idSupportRequestType;
    @XmlElement(name = "SupportRequestTypeName")
    protected String supportRequestTypeName;

    /**
     * Gets the value of the idSupportRequestType property.
     * 
     */
    public int getIdSupportRequestType() {
        return idSupportRequestType;
    }

    /**
     * Sets the value of the idSupportRequestType property.
     * 
     */
    public void setIdSupportRequestType(int value) {
        this.idSupportRequestType = value;
    }

    /**
     * Gets the value of the supportRequestTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportRequestTypeName() {
        return supportRequestTypeName;
    }

    /**
     * Sets the value of the supportRequestTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportRequestTypeName(String value) {
        this.supportRequestTypeName = value;
    }

}
