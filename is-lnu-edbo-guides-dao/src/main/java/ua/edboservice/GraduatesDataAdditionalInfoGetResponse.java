
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
 *         &lt;element name="GraduatesDataAdditionalInfoGetResult" type="{http://edboservice.ua/}ArrayOfDGraduatesDataAdditionalInfo" minOccurs="0"/>
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
    "graduatesDataAdditionalInfoGetResult"
})
@XmlRootElement(name = "GraduatesDataAdditionalInfoGetResponse")
public class GraduatesDataAdditionalInfoGetResponse {

    @XmlElement(name = "GraduatesDataAdditionalInfoGetResult")
    protected ArrayOfDGraduatesDataAdditionalInfo graduatesDataAdditionalInfoGetResult;

    /**
     * Gets the value of the graduatesDataAdditionalInfoGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDGraduatesDataAdditionalInfo }
     *     
     */
    public ArrayOfDGraduatesDataAdditionalInfo getGraduatesDataAdditionalInfoGetResult() {
        return graduatesDataAdditionalInfoGetResult;
    }

    /**
     * Sets the value of the graduatesDataAdditionalInfoGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDGraduatesDataAdditionalInfo }
     *     
     */
    public void setGraduatesDataAdditionalInfoGetResult(ArrayOfDGraduatesDataAdditionalInfo value) {
        this.graduatesDataAdditionalInfoGetResult = value;
    }

}
