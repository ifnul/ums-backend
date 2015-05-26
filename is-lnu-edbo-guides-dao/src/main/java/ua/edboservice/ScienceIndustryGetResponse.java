
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
 *         &lt;element name="ScienceIndustryGetResult" type="{http://edboservice.ua/}ArrayOfDScienceIndustry" minOccurs="0"/>
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
    "scienceIndustryGetResult"
})
@XmlRootElement(name = "ScienceIndustryGetResponse")
public class ScienceIndustryGetResponse {

    @XmlElement(name = "ScienceIndustryGetResult")
    protected ArrayOfDScienceIndustry scienceIndustryGetResult;

    /**
     * Gets the value of the scienceIndustryGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDScienceIndustry }
     *     
     */
    public ArrayOfDScienceIndustry getScienceIndustryGetResult() {
        return scienceIndustryGetResult;
    }

    /**
     * Sets the value of the scienceIndustryGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDScienceIndustry }
     *     
     */
    public void setScienceIndustryGetResult(ArrayOfDScienceIndustry value) {
        this.scienceIndustryGetResult = value;
    }

}
