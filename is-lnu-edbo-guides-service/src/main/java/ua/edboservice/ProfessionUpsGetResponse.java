
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
 *         &lt;element name="ProfessionUpsGetResult" type="{http://edboservice.ua/}ArrayOfDProfessionUps" minOccurs="0"/>
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
    "professionUpsGetResult"
})
@XmlRootElement(name = "ProfessionUpsGetResponse")
public class ProfessionUpsGetResponse {

    @XmlElement(name = "ProfessionUpsGetResult")
    protected ArrayOfDProfessionUps professionUpsGetResult;

    /**
     * Gets the value of the professionUpsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDProfessionUps }
     *     
     */
    public ArrayOfDProfessionUps getProfessionUpsGetResult() {
        return professionUpsGetResult;
    }

    /**
     * Sets the value of the professionUpsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDProfessionUps }
     *     
     */
    public void setProfessionUpsGetResult(ArrayOfDProfessionUps value) {
        this.professionUpsGetResult = value;
    }

}
