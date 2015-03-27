
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
 *         &lt;element name="QuotasAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "quotasAddResult"
})
@XmlRootElement(name = "QuotasAddResponse")
public class QuotasAddResponse {

    @XmlElement(name = "QuotasAddResult")
    protected int quotasAddResult;

    /**
     * Gets the value of the quotasAddResult property.
     * 
     */
    public int getQuotasAddResult() {
        return quotasAddResult;
    }

    /**
     * Sets the value of the quotasAddResult property.
     * 
     */
    public void setQuotasAddResult(int value) {
        this.quotasAddResult = value;
    }

}
