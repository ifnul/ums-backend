
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
 *         &lt;element name="GraduatesAdditionalInfoGetResult" type="{http://edboservice.ua/}ArrayOfDGraduatesAdditionalInfo" minOccurs="0"/>
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
    "graduatesAdditionalInfoGetResult"
})
@XmlRootElement(name = "GraduatesAdditionalInfoGetResponse")
public class GraduatesAdditionalInfoGetResponse {

    @XmlElement(name = "GraduatesAdditionalInfoGetResult")
    protected ArrayOfDGraduatesAdditionalInfo graduatesAdditionalInfoGetResult;

    /**
     * Gets the value of the graduatesAdditionalInfoGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDGraduatesAdditionalInfo }
     *     
     */
    public ArrayOfDGraduatesAdditionalInfo getGraduatesAdditionalInfoGetResult() {
        return graduatesAdditionalInfoGetResult;
    }

    /**
     * Sets the value of the graduatesAdditionalInfoGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDGraduatesAdditionalInfo }
     *     
     */
    public void setGraduatesAdditionalInfoGetResult(ArrayOfDGraduatesAdditionalInfo value) {
        this.graduatesAdditionalInfoGetResult = value;
    }

}
