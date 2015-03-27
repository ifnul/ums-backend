
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
 *         &lt;element name="PersonDocumentsEdit2Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personDocumentsEdit2Result"
})
@XmlRootElement(name = "PersonDocumentsEdit2Response")
public class PersonDocumentsEdit2Response {

    @XmlElement(name = "PersonDocumentsEdit2Result")
    protected int personDocumentsEdit2Result;

    /**
     * Gets the value of the personDocumentsEdit2Result property.
     * 
     */
    public int getPersonDocumentsEdit2Result() {
        return personDocumentsEdit2Result;
    }

    /**
     * Sets the value of the personDocumentsEdit2Result property.
     * 
     */
    public void setPersonDocumentsEdit2Result(int value) {
        this.personDocumentsEdit2Result = value;
    }

}
