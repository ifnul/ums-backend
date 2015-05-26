
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
 *         &lt;element name="PersonSubjectsOrdersDataGetResult" type="{http://edboservice.ua/}ArrayOfDPersonSubjectsOrdersData" minOccurs="0"/>
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
    "personSubjectsOrdersDataGetResult"
})
@XmlRootElement(name = "PersonSubjectsOrdersDataGetResponse")
public class PersonSubjectsOrdersDataGetResponse {

    @XmlElement(name = "PersonSubjectsOrdersDataGetResult")
    protected ArrayOfDPersonSubjectsOrdersData personSubjectsOrdersDataGetResult;

    /**
     * Gets the value of the personSubjectsOrdersDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonSubjectsOrdersData }
     *     
     */
    public ArrayOfDPersonSubjectsOrdersData getPersonSubjectsOrdersDataGetResult() {
        return personSubjectsOrdersDataGetResult;
    }

    /**
     * Sets the value of the personSubjectsOrdersDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonSubjectsOrdersData }
     *     
     */
    public void setPersonSubjectsOrdersDataGetResult(ArrayOfDPersonSubjectsOrdersData value) {
        this.personSubjectsOrdersDataGetResult = value;
    }

}
