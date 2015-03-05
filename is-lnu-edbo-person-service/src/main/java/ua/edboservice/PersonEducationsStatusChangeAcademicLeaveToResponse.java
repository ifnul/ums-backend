
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
 *         &lt;element name="PersonEducationsStatusChangeAcademicLeaveToResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "personEducationsStatusChangeAcademicLeaveToResult"
})
@XmlRootElement(name = "PersonEducationsStatusChangeAcademicLeaveToResponse")
public class PersonEducationsStatusChangeAcademicLeaveToResponse {

    @XmlElement(name = "PersonEducationsStatusChangeAcademicLeaveToResult")
    protected String personEducationsStatusChangeAcademicLeaveToResult;

    /**
     * Gets the value of the personEducationsStatusChangeAcademicLeaveToResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationsStatusChangeAcademicLeaveToResult() {
        return personEducationsStatusChangeAcademicLeaveToResult;
    }

    /**
     * Sets the value of the personEducationsStatusChangeAcademicLeaveToResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationsStatusChangeAcademicLeaveToResult(String value) {
        this.personEducationsStatusChangeAcademicLeaveToResult = value;
    }

}
