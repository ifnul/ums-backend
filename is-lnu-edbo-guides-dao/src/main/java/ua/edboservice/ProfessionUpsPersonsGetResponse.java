
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
 *         &lt;element name="ProfessionUpsPersonsGetResult" type="{http://edboservice.ua/}ArrayOfDProfessionUpsPersons" minOccurs="0"/>
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
    "professionUpsPersonsGetResult"
})
@XmlRootElement(name = "ProfessionUpsPersonsGetResponse")
public class ProfessionUpsPersonsGetResponse {

    @XmlElement(name = "ProfessionUpsPersonsGetResult")
    protected ArrayOfDProfessionUpsPersons professionUpsPersonsGetResult;

    /**
     * Gets the value of the professionUpsPersonsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDProfessionUpsPersons }
     *     
     */
    public ArrayOfDProfessionUpsPersons getProfessionUpsPersonsGetResult() {
        return professionUpsPersonsGetResult;
    }

    /**
     * Sets the value of the professionUpsPersonsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDProfessionUpsPersons }
     *     
     */
    public void setProfessionUpsPersonsGetResult(ArrayOfDProfessionUpsPersons value) {
        this.professionUpsPersonsGetResult = value;
    }

}
