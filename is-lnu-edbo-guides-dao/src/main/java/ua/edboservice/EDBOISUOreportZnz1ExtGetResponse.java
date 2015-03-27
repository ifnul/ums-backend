
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
 *         &lt;element name="EDBOISUOreport_znz1_extGetResult" type="{http://edboservice.ua/}ArrayOfDEDBOISUOreport_znz1_ext" minOccurs="0"/>
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
    "edboisuOreportZnz1ExtGetResult"
})
@XmlRootElement(name = "EDBOISUOreport_znz1_extGetResponse")
public class EDBOISUOreportZnz1ExtGetResponse {

    @XmlElement(name = "EDBOISUOreport_znz1_extGetResult")
    protected ArrayOfDEDBOISUOreportZnz1Ext edboisuOreportZnz1ExtGetResult;

    /**
     * Gets the value of the edboisuOreportZnz1ExtGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEDBOISUOreportZnz1Ext }
     *     
     */
    public ArrayOfDEDBOISUOreportZnz1Ext getEDBOISUOreportZnz1ExtGetResult() {
        return edboisuOreportZnz1ExtGetResult;
    }

    /**
     * Sets the value of the edboisuOreportZnz1ExtGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEDBOISUOreportZnz1Ext }
     *     
     */
    public void setEDBOISUOreportZnz1ExtGetResult(ArrayOfDEDBOISUOreportZnz1Ext value) {
        this.edboisuOreportZnz1ExtGetResult = value;
    }

}
