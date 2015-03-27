
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
 *         &lt;element name="SchoolEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "schoolEditResult"
})
@XmlRootElement(name = "SchoolEditResponse")
public class SchoolEditResponse {

    @XmlElement(name = "SchoolEditResult")
    protected int schoolEditResult;

    /**
     * Gets the value of the schoolEditResult property.
     * 
     */
    public int getSchoolEditResult() {
        return schoolEditResult;
    }

    /**
     * Sets the value of the schoolEditResult property.
     * 
     */
    public void setSchoolEditResult(int value) {
        this.schoolEditResult = value;
    }

}
