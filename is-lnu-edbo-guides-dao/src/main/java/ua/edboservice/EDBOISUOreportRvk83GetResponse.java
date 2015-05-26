
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
 *         &lt;element name="EDBOISUOreport_rvk83GetResult" type="{http://edboservice.ua/}ArrayOfDEDBOISUOreport_rvk83" minOccurs="0"/>
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
    "edboisuOreportRvk83GetResult"
})
@XmlRootElement(name = "EDBOISUOreport_rvk83GetResponse")
public class EDBOISUOreportRvk83GetResponse {

    @XmlElement(name = "EDBOISUOreport_rvk83GetResult")
    protected ArrayOfDEDBOISUOreportRvk83 edboisuOreportRvk83GetResult;

    /**
     * Gets the value of the edboisuOreportRvk83GetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEDBOISUOreportRvk83 }
     *     
     */
    public ArrayOfDEDBOISUOreportRvk83 getEDBOISUOreportRvk83GetResult() {
        return edboisuOreportRvk83GetResult;
    }

    /**
     * Sets the value of the edboisuOreportRvk83GetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEDBOISUOreportRvk83 }
     *     
     */
    public void setEDBOISUOreportRvk83GetResult(ArrayOfDEDBOISUOreportRvk83 value) {
        this.edboisuOreportRvk83GetResult = value;
    }

}
