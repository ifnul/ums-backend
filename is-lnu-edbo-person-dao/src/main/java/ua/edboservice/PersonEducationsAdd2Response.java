
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
 *         &lt;element name="PersonEducationsAdd2Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personEducationsAdd2Result"
})
@XmlRootElement(name = "PersonEducationsAdd2Response")
public class PersonEducationsAdd2Response {

    @XmlElement(name = "PersonEducationsAdd2Result")
    protected int personEducationsAdd2Result;

    /**
     * Gets the value of the personEducationsAdd2Result property.
     * 
     */
    public int getPersonEducationsAdd2Result() {
        return personEducationsAdd2Result;
    }

    /**
     * Sets the value of the personEducationsAdd2Result property.
     * 
     */
    public void setPersonEducationsAdd2Result(int value) {
        this.personEducationsAdd2Result = value;
    }

}
