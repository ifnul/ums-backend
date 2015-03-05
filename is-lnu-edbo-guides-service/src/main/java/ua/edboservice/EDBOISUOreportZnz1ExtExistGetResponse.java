
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
 *         &lt;element name="EDBOISUOreport_znz1_extExistGetResult" type="{http://edboservice.ua/}ArrayOfDEDBOISUOreport_znz1_extExist" minOccurs="0"/>
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
    "edboisuOreportZnz1ExtExistGetResult"
})
@XmlRootElement(name = "EDBOISUOreport_znz1_extExistGetResponse")
public class EDBOISUOreportZnz1ExtExistGetResponse {

    @XmlElement(name = "EDBOISUOreport_znz1_extExistGetResult")
    protected ArrayOfDEDBOISUOreportZnz1ExtExist edboisuOreportZnz1ExtExistGetResult;

    /**
     * Gets the value of the edboisuOreportZnz1ExtExistGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEDBOISUOreportZnz1ExtExist }
     *     
     */
    public ArrayOfDEDBOISUOreportZnz1ExtExist getEDBOISUOreportZnz1ExtExistGetResult() {
        return edboisuOreportZnz1ExtExistGetResult;
    }

    /**
     * Sets the value of the edboisuOreportZnz1ExtExistGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEDBOISUOreportZnz1ExtExist }
     *     
     */
    public void setEDBOISUOreportZnz1ExtExistGetResult(ArrayOfDEDBOISUOreportZnz1ExtExist value) {
        this.edboisuOreportZnz1ExtExistGetResult = value;
    }

}
