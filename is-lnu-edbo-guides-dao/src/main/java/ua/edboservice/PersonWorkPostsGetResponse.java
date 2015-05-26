
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
 *         &lt;element name="PersonWorkPostsGetResult" type="{http://edboservice.ua/}ArrayOfDPersonWorkPosts" minOccurs="0"/>
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
    "personWorkPostsGetResult"
})
@XmlRootElement(name = "PersonWorkPostsGetResponse")
public class PersonWorkPostsGetResponse {

    @XmlElement(name = "PersonWorkPostsGetResult")
    protected ArrayOfDPersonWorkPosts personWorkPostsGetResult;

    /**
     * Gets the value of the personWorkPostsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonWorkPosts }
     *     
     */
    public ArrayOfDPersonWorkPosts getPersonWorkPostsGetResult() {
        return personWorkPostsGetResult;
    }

    /**
     * Sets the value of the personWorkPostsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonWorkPosts }
     *     
     */
    public void setPersonWorkPostsGetResult(ArrayOfDPersonWorkPosts value) {
        this.personWorkPostsGetResult = value;
    }

}
