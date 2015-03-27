
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
 *         &lt;element name="OfficeOfInstitutionsGetResult" type="{http://edboservice.ua/}ArrayOfDOfficeOfInstitutions" minOccurs="0"/>
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
    "officeOfInstitutionsGetResult"
})
@XmlRootElement(name = "OfficeOfInstitutionsGetResponse")
public class OfficeOfInstitutionsGetResponse {

    @XmlElement(name = "OfficeOfInstitutionsGetResult")
    protected ArrayOfDOfficeOfInstitutions officeOfInstitutionsGetResult;

    /**
     * Gets the value of the officeOfInstitutionsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOfficeOfInstitutions }
     *     
     */
    public ArrayOfDOfficeOfInstitutions getOfficeOfInstitutionsGetResult() {
        return officeOfInstitutionsGetResult;
    }

    /**
     * Sets the value of the officeOfInstitutionsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOfficeOfInstitutions }
     *     
     */
    public void setOfficeOfInstitutionsGetResult(ArrayOfDOfficeOfInstitutions value) {
        this.officeOfInstitutionsGetResult = value;
    }

}
