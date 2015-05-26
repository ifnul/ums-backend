
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
 *         &lt;element name="SpecDirectionsSubjectsGetResult" type="{http://edboservice.ua/}ArrayOfDSpecDirectionsSubjects" minOccurs="0"/>
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
    "specDirectionsSubjectsGetResult"
})
@XmlRootElement(name = "SpecDirectionsSubjectsGetResponse")
public class SpecDirectionsSubjectsGetResponse {

    @XmlElement(name = "SpecDirectionsSubjectsGetResult")
    protected ArrayOfDSpecDirectionsSubjects specDirectionsSubjectsGetResult;

    /**
     * Gets the value of the specDirectionsSubjectsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDSpecDirectionsSubjects }
     *     
     */
    public ArrayOfDSpecDirectionsSubjects getSpecDirectionsSubjectsGetResult() {
        return specDirectionsSubjectsGetResult;
    }

    /**
     * Sets the value of the specDirectionsSubjectsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDSpecDirectionsSubjects }
     *     
     */
    public void setSpecDirectionsSubjectsGetResult(ArrayOfDSpecDirectionsSubjects value) {
        this.specDirectionsSubjectsGetResult = value;
    }

}
