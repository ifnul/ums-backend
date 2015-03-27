
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
 *         &lt;element name="QualificationsExGetResult" type="{http://edboservice.ua/}ArrayOfDQualificationsEx" minOccurs="0"/>
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
    "qualificationsExGetResult"
})
@XmlRootElement(name = "QualificationsExGetResponse")
public class QualificationsExGetResponse {

    @XmlElement(name = "QualificationsExGetResult")
    protected ArrayOfDQualificationsEx qualificationsExGetResult;

    /**
     * Gets the value of the qualificationsExGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDQualificationsEx }
     *     
     */
    public ArrayOfDQualificationsEx getQualificationsExGetResult() {
        return qualificationsExGetResult;
    }

    /**
     * Sets the value of the qualificationsExGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDQualificationsEx }
     *     
     */
    public void setQualificationsExGetResult(ArrayOfDQualificationsEx value) {
        this.qualificationsExGetResult = value;
    }

}
