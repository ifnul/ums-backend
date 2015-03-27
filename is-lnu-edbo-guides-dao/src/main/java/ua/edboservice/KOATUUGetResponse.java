
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
 *         &lt;element name="KOATUUGetResult" type="{http://edboservice.ua/}ArrayOfDKOATUU" minOccurs="0"/>
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
    "koatuuGetResult"
})
@XmlRootElement(name = "KOATUUGetResponse")
public class KOATUUGetResponse {

    @XmlElement(name = "KOATUUGetResult")
    protected ArrayOfDKOATUU koatuuGetResult;

    /**
     * Gets the value of the koatuuGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDKOATUU }
     *     
     */
    public ArrayOfDKOATUU getKOATUUGetResult() {
        return koatuuGetResult;
    }

    /**
     * Sets the value of the koatuuGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDKOATUU }
     *     
     */
    public void setKOATUUGetResult(ArrayOfDKOATUU value) {
        this.koatuuGetResult = value;
    }

}
