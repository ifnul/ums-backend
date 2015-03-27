
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
 *         &lt;element name="OrderOfDocumentsSendPackageStatusChangeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "orderOfDocumentsSendPackageStatusChangeResult"
})
@XmlRootElement(name = "OrderOfDocumentsSendPackageStatusChangeResponse")
public class OrderOfDocumentsSendPackageStatusChangeResponse {

    @XmlElement(name = "OrderOfDocumentsSendPackageStatusChangeResult")
    protected int orderOfDocumentsSendPackageStatusChangeResult;

    /**
     * Gets the value of the orderOfDocumentsSendPackageStatusChangeResult property.
     * 
     */
    public int getOrderOfDocumentsSendPackageStatusChangeResult() {
        return orderOfDocumentsSendPackageStatusChangeResult;
    }

    /**
     * Sets the value of the orderOfDocumentsSendPackageStatusChangeResult property.
     * 
     */
    public void setOrderOfDocumentsSendPackageStatusChangeResult(int value) {
        this.orderOfDocumentsSendPackageStatusChangeResult = value;
    }

}
