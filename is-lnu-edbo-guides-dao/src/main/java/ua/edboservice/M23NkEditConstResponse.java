
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
 *         &lt;element name="m23nkEdit_constResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "m23NkEditConstResult"
})
@XmlRootElement(name = "m23nkEdit_constResponse")
public class M23NkEditConstResponse {

    @XmlElement(name = "m23nkEdit_constResult")
    protected int m23NkEditConstResult;

    /**
     * Gets the value of the m23NkEditConstResult property.
     * 
     */
    public int getM23NkEditConstResult() {
        return m23NkEditConstResult;
    }

    /**
     * Sets the value of the m23NkEditConstResult property.
     * 
     */
    public void setM23NkEditConstResult(int value) {
        this.m23NkEditConstResult = value;
    }

}
