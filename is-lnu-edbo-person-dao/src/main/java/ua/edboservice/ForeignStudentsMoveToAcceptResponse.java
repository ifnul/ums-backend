
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
 *         &lt;element name="ForeignStudentsMoveToAcceptResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "foreignStudentsMoveToAcceptResult"
})
@XmlRootElement(name = "ForeignStudentsMoveToAcceptResponse")
public class ForeignStudentsMoveToAcceptResponse {

    @XmlElement(name = "ForeignStudentsMoveToAcceptResult")
    protected int foreignStudentsMoveToAcceptResult;

    /**
     * Gets the value of the foreignStudentsMoveToAcceptResult property.
     * 
     */
    public int getForeignStudentsMoveToAcceptResult() {
        return foreignStudentsMoveToAcceptResult;
    }

    /**
     * Sets the value of the foreignStudentsMoveToAcceptResult property.
     * 
     */
    public void setForeignStudentsMoveToAcceptResult(int value) {
        this.foreignStudentsMoveToAcceptResult = value;
    }

}
