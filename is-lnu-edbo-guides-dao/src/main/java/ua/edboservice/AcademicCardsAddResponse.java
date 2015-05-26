
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
 *         &lt;element name="AcademicCardsAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "academicCardsAddResult"
})
@XmlRootElement(name = "AcademicCardsAddResponse")
public class AcademicCardsAddResponse {

    @XmlElement(name = "AcademicCardsAddResult")
    protected int academicCardsAddResult;

    /**
     * Gets the value of the academicCardsAddResult property.
     * 
     */
    public int getAcademicCardsAddResult() {
        return academicCardsAddResult;
    }

    /**
     * Sets the value of the academicCardsAddResult property.
     * 
     */
    public void setAcademicCardsAddResult(int value) {
        this.academicCardsAddResult = value;
    }

}
