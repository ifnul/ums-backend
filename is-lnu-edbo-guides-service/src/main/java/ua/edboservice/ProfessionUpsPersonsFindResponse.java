
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
 *         &lt;element name="ProfessionUpsPersonsFindResult" type="{http://edboservice.ua/}ArrayOfDProfessionUpsPersonsFind" minOccurs="0"/>
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
    "professionUpsPersonsFindResult"
})
@XmlRootElement(name = "ProfessionUpsPersonsFindResponse")
public class ProfessionUpsPersonsFindResponse {

    @XmlElement(name = "ProfessionUpsPersonsFindResult")
    protected ArrayOfDProfessionUpsPersonsFind professionUpsPersonsFindResult;

    /**
     * Gets the value of the professionUpsPersonsFindResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDProfessionUpsPersonsFind }
     *     
     */
    public ArrayOfDProfessionUpsPersonsFind getProfessionUpsPersonsFindResult() {
        return professionUpsPersonsFindResult;
    }

    /**
     * Sets the value of the professionUpsPersonsFindResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDProfessionUpsPersonsFind }
     *     
     */
    public void setProfessionUpsPersonsFindResult(ArrayOfDProfessionUpsPersonsFind value) {
        this.professionUpsPersonsFindResult = value;
    }

}
