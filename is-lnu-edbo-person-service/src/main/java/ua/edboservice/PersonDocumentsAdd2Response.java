
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
 *         &lt;element name="PersonDocumentsAdd2Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personDocumentsAdd2Result"
})
@XmlRootElement(name = "PersonDocumentsAdd2Response")
public class PersonDocumentsAdd2Response {

    @XmlElement(name = "PersonDocumentsAdd2Result")
    protected int personDocumentsAdd2Result;

    /**
     * Gets the value of the personDocumentsAdd2Result property.
     * 
     */
    public int getPersonDocumentsAdd2Result() {
        return personDocumentsAdd2Result;
    }

    /**
     * Sets the value of the personDocumentsAdd2Result property.
     * 
     */
    public void setPersonDocumentsAdd2Result(int value) {
        this.personDocumentsAdd2Result = value;
    }

}
