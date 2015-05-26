
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
 *         &lt;element name="EDBOISUOreport_rvk83ExistGetResult" type="{http://edboservice.ua/}ArrayOfDEDBOISUOreport_rvk83Exist" minOccurs="0"/>
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
    "edboisuOreportRvk83ExistGetResult"
})
@XmlRootElement(name = "EDBOISUOreport_rvk83ExistGetResponse")
public class EDBOISUOreportRvk83ExistGetResponse {

    @XmlElement(name = "EDBOISUOreport_rvk83ExistGetResult")
    protected ArrayOfDEDBOISUOreportRvk83Exist edboisuOreportRvk83ExistGetResult;

    /**
     * Gets the value of the edboisuOreportRvk83ExistGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEDBOISUOreportRvk83Exist }
     *     
     */
    public ArrayOfDEDBOISUOreportRvk83Exist getEDBOISUOreportRvk83ExistGetResult() {
        return edboisuOreportRvk83ExistGetResult;
    }

    /**
     * Sets the value of the edboisuOreportRvk83ExistGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEDBOISUOreportRvk83Exist }
     *     
     */
    public void setEDBOISUOreportRvk83ExistGetResult(ArrayOfDEDBOISUOreportRvk83Exist value) {
        this.edboisuOreportRvk83ExistGetResult = value;
    }

}
