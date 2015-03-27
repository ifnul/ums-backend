
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
 *         &lt;element name="PersonEducationsGet2Result" type="{http://edboservice.ua/}ArrayOfDPersonEducations2" minOccurs="0"/>
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
    "personEducationsGet2Result"
})
@XmlRootElement(name = "PersonEducationsGet2Response")
public class PersonEducationsGet2Response {

    @XmlElement(name = "PersonEducationsGet2Result")
    protected ArrayOfDPersonEducations2 personEducationsGet2Result;

    /**
     * Gets the value of the personEducationsGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducations2 }
     *     
     */
    public ArrayOfDPersonEducations2 getPersonEducationsGet2Result() {
        return personEducationsGet2Result;
    }

    /**
     * Sets the value of the personEducationsGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducations2 }
     *     
     */
    public void setPersonEducationsGet2Result(ArrayOfDPersonEducations2 value) {
        this.personEducationsGet2Result = value;
    }

}
