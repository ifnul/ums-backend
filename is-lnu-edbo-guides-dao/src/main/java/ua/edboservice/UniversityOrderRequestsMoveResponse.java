
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
 *         &lt;element name="UniversityOrderRequestsMoveResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityOrderRequestsMoveResult"
})
@XmlRootElement(name = "UniversityOrderRequestsMoveResponse")
public class UniversityOrderRequestsMoveResponse {

    @XmlElement(name = "UniversityOrderRequestsMoveResult")
    protected int universityOrderRequestsMoveResult;

    /**
     * Gets the value of the universityOrderRequestsMoveResult property.
     * 
     */
    public int getUniversityOrderRequestsMoveResult() {
        return universityOrderRequestsMoveResult;
    }

    /**
     * Sets the value of the universityOrderRequestsMoveResult property.
     * 
     */
    public void setUniversityOrderRequestsMoveResult(int value) {
        this.universityOrderRequestsMoveResult = value;
    }

}
