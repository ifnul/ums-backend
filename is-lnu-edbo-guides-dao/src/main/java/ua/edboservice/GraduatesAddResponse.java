
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
 *         &lt;element name="GraduatesAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "graduatesAddResult"
})
@XmlRootElement(name = "GraduatesAddResponse")
public class GraduatesAddResponse {

    @XmlElement(name = "GraduatesAddResult")
    protected int graduatesAddResult;

    /**
     * Gets the value of the graduatesAddResult property.
     * 
     */
    public int getGraduatesAddResult() {
        return graduatesAddResult;
    }

    /**
     * Sets the value of the graduatesAddResult property.
     * 
     */
    public void setGraduatesAddResult(int value) {
        this.graduatesAddResult = value;
    }

}
