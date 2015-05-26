
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
 *         &lt;element name="EDBOISUOreport_znz1GetResult" type="{http://edboservice.ua/}ArrayOfDEDBOISUOreport_znz1" minOccurs="0"/>
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
    "edboisuOreportZnz1GetResult"
})
@XmlRootElement(name = "EDBOISUOreport_znz1GetResponse")
public class EDBOISUOreportZnz1GetResponse {

    @XmlElement(name = "EDBOISUOreport_znz1GetResult")
    protected ArrayOfDEDBOISUOreportZnz1 edboisuOreportZnz1GetResult;

    /**
     * Gets the value of the edboisuOreportZnz1GetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEDBOISUOreportZnz1 }
     *     
     */
    public ArrayOfDEDBOISUOreportZnz1 getEDBOISUOreportZnz1GetResult() {
        return edboisuOreportZnz1GetResult;
    }

    /**
     * Sets the value of the edboisuOreportZnz1GetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEDBOISUOreportZnz1 }
     *     
     */
    public void setEDBOISUOreportZnz1GetResult(ArrayOfDEDBOISUOreportZnz1 value) {
        this.edboisuOreportZnz1GetResult = value;
    }

}
