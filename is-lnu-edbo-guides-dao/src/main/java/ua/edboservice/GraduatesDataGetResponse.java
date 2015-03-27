
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
 *         &lt;element name="GraduatesDataGetResult" type="{http://edboservice.ua/}ArrayOfDGraduatesData" minOccurs="0"/>
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
    "graduatesDataGetResult"
})
@XmlRootElement(name = "GraduatesDataGetResponse")
public class GraduatesDataGetResponse {

    @XmlElement(name = "GraduatesDataGetResult")
    protected ArrayOfDGraduatesData graduatesDataGetResult;

    /**
     * Gets the value of the graduatesDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDGraduatesData }
     *     
     */
    public ArrayOfDGraduatesData getGraduatesDataGetResult() {
        return graduatesDataGetResult;
    }

    /**
     * Sets the value of the graduatesDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDGraduatesData }
     *     
     */
    public void setGraduatesDataGetResult(ArrayOfDGraduatesData value) {
        this.graduatesDataGetResult = value;
    }

}
