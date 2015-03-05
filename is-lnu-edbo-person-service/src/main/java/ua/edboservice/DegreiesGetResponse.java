
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
 *         &lt;element name="DegreiesGetResult" type="{http://edboservice.ua/}ArrayOfDDegree" minOccurs="0"/>
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
    "degreiesGetResult"
})
@XmlRootElement(name = "DegreiesGetResponse")
public class DegreiesGetResponse {

    @XmlElement(name = "DegreiesGetResult")
    protected ArrayOfDDegree degreiesGetResult;

    /**
     * Gets the value of the degreiesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDDegree }
     *     
     */
    public ArrayOfDDegree getDegreiesGetResult() {
        return degreiesGetResult;
    }

    /**
     * Sets the value of the degreiesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDDegree }
     *     
     */
    public void setDegreiesGetResult(ArrayOfDDegree value) {
        this.degreiesGetResult = value;
    }

}
