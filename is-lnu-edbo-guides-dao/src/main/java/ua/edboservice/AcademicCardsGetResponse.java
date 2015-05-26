
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
 *         &lt;element name="AcademicCardsGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicCards" minOccurs="0"/>
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
    "academicCardsGetResult"
})
@XmlRootElement(name = "AcademicCardsGetResponse")
public class AcademicCardsGetResponse {

    @XmlElement(name = "AcademicCardsGetResult")
    protected ArrayOfDAcademicCards academicCardsGetResult;

    /**
     * Gets the value of the academicCardsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicCards }
     *     
     */
    public ArrayOfDAcademicCards getAcademicCardsGetResult() {
        return academicCardsGetResult;
    }

    /**
     * Sets the value of the academicCardsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicCards }
     *     
     */
    public void setAcademicCardsGetResult(ArrayOfDAcademicCards value) {
        this.academicCardsGetResult = value;
    }

}
