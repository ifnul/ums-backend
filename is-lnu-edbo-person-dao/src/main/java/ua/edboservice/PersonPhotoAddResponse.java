
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
 *         &lt;element name="PersonPhotoAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personPhotoAddResult"
})
@XmlRootElement(name = "PersonPhotoAddResponse")
public class PersonPhotoAddResponse {

    @XmlElement(name = "PersonPhotoAddResult")
    protected int personPhotoAddResult;

    /**
     * Gets the value of the personPhotoAddResult property.
     * 
     */
    public int getPersonPhotoAddResult() {
        return personPhotoAddResult;
    }

    /**
     * Sets the value of the personPhotoAddResult property.
     * 
     */
    public void setPersonPhotoAddResult(int value) {
        this.personPhotoAddResult = value;
    }

}
