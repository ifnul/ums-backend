
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
 *         &lt;element name="QualificationGroupsGetResult" type="{http://edboservice.ua/}ArrayOfDQualificationGroups" minOccurs="0"/>
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
    "qualificationGroupsGetResult"
})
@XmlRootElement(name = "QualificationGroupsGetResponse")
public class QualificationGroupsGetResponse {

    @XmlElement(name = "QualificationGroupsGetResult")
    protected ArrayOfDQualificationGroups qualificationGroupsGetResult;

    /**
     * Gets the value of the qualificationGroupsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDQualificationGroups }
     *     
     */
    public ArrayOfDQualificationGroups getQualificationGroupsGetResult() {
        return qualificationGroupsGetResult;
    }

    /**
     * Sets the value of the qualificationGroupsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDQualificationGroups }
     *     
     */
    public void setQualificationGroupsGetResult(ArrayOfDQualificationGroups value) {
        this.qualificationGroupsGetResult = value;
    }

}
