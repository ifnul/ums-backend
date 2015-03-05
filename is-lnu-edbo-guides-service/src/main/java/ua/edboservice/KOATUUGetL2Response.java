
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
 *         &lt;element name="KOATUUGetL2Result" type="{http://edboservice.ua/}ArrayOfDKOATUU" minOccurs="0"/>
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
    "koatuuGetL2Result"
})
@XmlRootElement(name = "KOATUUGetL2Response")
public class KOATUUGetL2Response {

    @XmlElement(name = "KOATUUGetL2Result")
    protected ArrayOfDKOATUU koatuuGetL2Result;

    /**
     * Gets the value of the koatuuGetL2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDKOATUU }
     *     
     */
    public ArrayOfDKOATUU getKOATUUGetL2Result() {
        return koatuuGetL2Result;
    }

    /**
     * Sets the value of the koatuuGetL2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDKOATUU }
     *     
     */
    public void setKOATUUGetL2Result(ArrayOfDKOATUU value) {
        this.koatuuGetL2Result = value;
    }

}
