
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dStateOrdersCategories complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dStateOrdersCategories">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_StateOrdersCategorie" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StateOrdersCategorie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dStateOrdersCategories", propOrder = {
    "idStateOrdersCategorie",
    "stateOrdersCategorie"
})
public class DStateOrdersCategories {

    @XmlElement(name = "Id_StateOrdersCategorie")
    protected int idStateOrdersCategorie;
    @XmlElement(name = "StateOrdersCategorie")
    protected String stateOrdersCategorie;

    /**
     * Gets the value of the idStateOrdersCategorie property.
     * 
     */
    public int getIdStateOrdersCategorie() {
        return idStateOrdersCategorie;
    }

    /**
     * Sets the value of the idStateOrdersCategorie property.
     * 
     */
    public void setIdStateOrdersCategorie(int value) {
        this.idStateOrdersCategorie = value;
    }

    /**
     * Gets the value of the stateOrdersCategorie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrdersCategorie() {
        return stateOrdersCategorie;
    }

    /**
     * Sets the value of the stateOrdersCategorie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrdersCategorie(String value) {
        this.stateOrdersCategorie = value;
    }

}
