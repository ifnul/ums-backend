
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
 *         &lt;element name="UniversityOrderRequestsUnRegisterResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityOrderRequestsUnRegisterResult"
})
@XmlRootElement(name = "UniversityOrderRequestsUnRegisterResponse")
public class UniversityOrderRequestsUnRegisterResponse {

    @XmlElement(name = "UniversityOrderRequestsUnRegisterResult")
    protected int universityOrderRequestsUnRegisterResult;

    /**
     * Gets the value of the universityOrderRequestsUnRegisterResult property.
     * 
     */
    public int getUniversityOrderRequestsUnRegisterResult() {
        return universityOrderRequestsUnRegisterResult;
    }

    /**
     * Sets the value of the universityOrderRequestsUnRegisterResult property.
     * 
     */
    public void setUniversityOrderRequestsUnRegisterResult(int value) {
        this.universityOrderRequestsUnRegisterResult = value;
    }

}
