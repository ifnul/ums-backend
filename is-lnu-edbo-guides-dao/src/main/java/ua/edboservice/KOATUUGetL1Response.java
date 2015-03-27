
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
 *         &lt;element name="KOATUUGetL1Result" type="{http://edboservice.ua/}ArrayOfDKOATUU" minOccurs="0"/>
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
    "koatuuGetL1Result"
})
@XmlRootElement(name = "KOATUUGetL1Response")
public class KOATUUGetL1Response {

    @XmlElement(name = "KOATUUGetL1Result")
    protected ArrayOfDKOATUU koatuuGetL1Result;

    /**
     * Gets the value of the koatuuGetL1Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDKOATUU }
     *     
     */
    public ArrayOfDKOATUU getKOATUUGetL1Result() {
        return koatuuGetL1Result;
    }

    /**
     * Sets the value of the koatuuGetL1Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDKOATUU }
     *     
     */
    public void setKOATUUGetL1Result(ArrayOfDKOATUU value) {
        this.koatuuGetL1Result = value;
    }

}
