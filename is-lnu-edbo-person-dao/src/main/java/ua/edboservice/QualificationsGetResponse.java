
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
 *         &lt;element name="QualificationsGetResult" type="{http://edboservice.ua/}ArrayOfDQualification" minOccurs="0"/>
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
    "qualificationsGetResult"
})
@XmlRootElement(name = "QualificationsGetResponse")
public class QualificationsGetResponse {

    @XmlElement(name = "QualificationsGetResult")
    protected ArrayOfDQualification qualificationsGetResult;

    /**
     * Gets the value of the qualificationsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDQualification }
     *     
     */
    public ArrayOfDQualification getQualificationsGetResult() {
        return qualificationsGetResult;
    }

    /**
     * Sets the value of the qualificationsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDQualification }
     *     
     */
    public void setQualificationsGetResult(ArrayOfDQualification value) {
        this.qualificationsGetResult = value;
    }

}
