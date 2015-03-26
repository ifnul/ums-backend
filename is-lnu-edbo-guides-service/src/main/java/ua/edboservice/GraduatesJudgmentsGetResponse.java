
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
 *         &lt;element name="GraduatesJudgmentsGetResult" type="{http://edboservice.ua/}ArrayOfDGraduatesJudgments" minOccurs="0"/>
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
    "graduatesJudgmentsGetResult"
})
@XmlRootElement(name = "GraduatesJudgmentsGetResponse")
public class GraduatesJudgmentsGetResponse {

    @XmlElement(name = "GraduatesJudgmentsGetResult")
    protected ArrayOfDGraduatesJudgments graduatesJudgmentsGetResult;

    /**
     * Gets the value of the graduatesJudgmentsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDGraduatesJudgments }
     *     
     */
    public ArrayOfDGraduatesJudgments getGraduatesJudgmentsGetResult() {
        return graduatesJudgmentsGetResult;
    }

    /**
     * Sets the value of the graduatesJudgmentsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDGraduatesJudgments }
     *     
     */
    public void setGraduatesJudgmentsGetResult(ArrayOfDGraduatesJudgments value) {
        this.graduatesJudgmentsGetResult = value;
    }

}
