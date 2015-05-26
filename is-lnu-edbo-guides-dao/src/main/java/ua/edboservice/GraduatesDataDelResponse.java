
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
 *         &lt;element name="GraduatesDataDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "graduatesDataDelResult"
})
@XmlRootElement(name = "GraduatesDataDelResponse")
public class GraduatesDataDelResponse {

    @XmlElement(name = "GraduatesDataDelResult")
    protected int graduatesDataDelResult;

    /**
     * Gets the value of the graduatesDataDelResult property.
     * 
     */
    public int getGraduatesDataDelResult() {
        return graduatesDataDelResult;
    }

    /**
     * Sets the value of the graduatesDataDelResult property.
     * 
     */
    public void setGraduatesDataDelResult(int value) {
        this.graduatesDataDelResult = value;
    }

}
