
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonLoginsGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonLoginsGet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonLoginsGet" type="{http://edboservice.ua/}dPersonLoginsGet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonLoginsGet", propOrder = {
    "dPersonLoginsGet"
})
public class ArrayOfDPersonLoginsGet {

    @XmlElement(nillable = true)
    protected List<DPersonLoginsGet> dPersonLoginsGet;

    /**
     * Gets the value of the dPersonLoginsGet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonLoginsGet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonLoginsGet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonLoginsGet }
     * 
     * 
     */
    public List<DPersonLoginsGet> getDPersonLoginsGet() {
        if (dPersonLoginsGet == null) {
            dPersonLoginsGet = new ArrayList<DPersonLoginsGet>();
        }
        return this.dPersonLoginsGet;
    }

}
