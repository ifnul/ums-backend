
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
 *         &lt;element name="UniversityBossScanGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityBossScan" minOccurs="0"/>
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
    "universityBossScanGetResult"
})
@XmlRootElement(name = "UniversityBossScanGetResponse")
public class UniversityBossScanGetResponse {

    @XmlElement(name = "UniversityBossScanGetResult")
    protected ArrayOfDUniversityBossScan universityBossScanGetResult;

    /**
     * Gets the value of the universityBossScanGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityBossScan }
     *     
     */
    public ArrayOfDUniversityBossScan getUniversityBossScanGetResult() {
        return universityBossScanGetResult;
    }

    /**
     * Sets the value of the universityBossScanGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityBossScan }
     *     
     */
    public void setUniversityBossScanGetResult(ArrayOfDUniversityBossScan value) {
        this.universityBossScanGetResult = value;
    }

}
