
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
 *         &lt;element name="PersonAcademicRankGetResult" type="{http://edboservice.ua/}ArrayOfDPersonAcademicRank" minOccurs="0"/>
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
    "personAcademicRankGetResult"
})
@XmlRootElement(name = "PersonAcademicRankGetResponse")
public class PersonAcademicRankGetResponse {

    @XmlElement(name = "PersonAcademicRankGetResult")
    protected ArrayOfDPersonAcademicRank personAcademicRankGetResult;

    /**
     * Gets the value of the personAcademicRankGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonAcademicRank }
     *     
     */
    public ArrayOfDPersonAcademicRank getPersonAcademicRankGetResult() {
        return personAcademicRankGetResult;
    }

    /**
     * Sets the value of the personAcademicRankGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonAcademicRank }
     *     
     */
    public void setPersonAcademicRankGetResult(ArrayOfDPersonAcademicRank value) {
        this.personAcademicRankGetResult = value;
    }

}
