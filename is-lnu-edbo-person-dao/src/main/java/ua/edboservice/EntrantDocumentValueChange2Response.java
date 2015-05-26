
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
 *         &lt;element name="EntrantDocumentValueChange2Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "entrantDocumentValueChange2Result"
})
@XmlRootElement(name = "EntrantDocumentValueChange2Response")
public class EntrantDocumentValueChange2Response {

    @XmlElement(name = "EntrantDocumentValueChange2Result")
    protected int entrantDocumentValueChange2Result;

    /**
     * Gets the value of the entrantDocumentValueChange2Result property.
     * 
     */
    public int getEntrantDocumentValueChange2Result() {
        return entrantDocumentValueChange2Result;
    }

    /**
     * Sets the value of the entrantDocumentValueChange2Result property.
     * 
     */
    public void setEntrantDocumentValueChange2Result(int value) {
        this.entrantDocumentValueChange2Result = value;
    }

}
