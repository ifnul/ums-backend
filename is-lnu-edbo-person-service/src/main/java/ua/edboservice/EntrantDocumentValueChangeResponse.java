
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
 *         &lt;element name="EntrantDocumentValueChangeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "entrantDocumentValueChangeResult"
})
@XmlRootElement(name = "EntrantDocumentValueChangeResponse")
public class EntrantDocumentValueChangeResponse {

    @XmlElement(name = "EntrantDocumentValueChangeResult")
    protected int entrantDocumentValueChangeResult;

    /**
     * Gets the value of the entrantDocumentValueChangeResult property.
     * 
     */
    public int getEntrantDocumentValueChangeResult() {
        return entrantDocumentValueChangeResult;
    }

    /**
     * Sets the value of the entrantDocumentValueChangeResult property.
     * 
     */
    public void setEntrantDocumentValueChangeResult(int value) {
        this.entrantDocumentValueChangeResult = value;
    }

}
