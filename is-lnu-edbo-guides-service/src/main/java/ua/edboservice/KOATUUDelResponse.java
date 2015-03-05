
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
 *         &lt;element name="KOATUUDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "koatuuDelResult"
})
@XmlRootElement(name = "KOATUUDelResponse")
public class KOATUUDelResponse {

    @XmlElement(name = "KOATUUDelResult")
    protected int koatuuDelResult;

    /**
     * Gets the value of the koatuuDelResult property.
     * 
     */
    public int getKOATUUDelResult() {
        return koatuuDelResult;
    }

    /**
     * Sets the value of the koatuuDelResult property.
     * 
     */
    public void setKOATUUDelResult(int value) {
        this.koatuuDelResult = value;
    }

}
