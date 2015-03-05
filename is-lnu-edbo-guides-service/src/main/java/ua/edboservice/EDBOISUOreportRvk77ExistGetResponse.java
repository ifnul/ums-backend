
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
 *         &lt;element name="EDBOISUOreport_rvk77ExistGetResult" type="{http://edboservice.ua/}ArrayOfDEDBOISUOreport_rvk77Exist" minOccurs="0"/>
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
    "edboisuOreportRvk77ExistGetResult"
})
@XmlRootElement(name = "EDBOISUOreport_rvk77ExistGetResponse")
public class EDBOISUOreportRvk77ExistGetResponse {

    @XmlElement(name = "EDBOISUOreport_rvk77ExistGetResult")
    protected ArrayOfDEDBOISUOreportRvk77Exist edboisuOreportRvk77ExistGetResult;

    /**
     * Gets the value of the edboisuOreportRvk77ExistGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEDBOISUOreportRvk77Exist }
     *     
     */
    public ArrayOfDEDBOISUOreportRvk77Exist getEDBOISUOreportRvk77ExistGetResult() {
        return edboisuOreportRvk77ExistGetResult;
    }

    /**
     * Sets the value of the edboisuOreportRvk77ExistGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEDBOISUOreportRvk77Exist }
     *     
     */
    public void setEDBOISUOreportRvk77ExistGetResult(ArrayOfDEDBOISUOreportRvk77Exist value) {
        this.edboisuOreportRvk77ExistGetResult = value;
    }

}
