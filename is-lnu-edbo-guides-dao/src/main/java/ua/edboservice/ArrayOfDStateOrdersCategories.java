
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDStateOrdersCategories complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDStateOrdersCategories">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dStateOrdersCategories" type="{http://edboservice.ua/}dStateOrdersCategories" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDStateOrdersCategories", propOrder = {
    "dStateOrdersCategories"
})
public class ArrayOfDStateOrdersCategories {

    @XmlElement(nillable = true)
    protected List<DStateOrdersCategories> dStateOrdersCategories;

    /**
     * Gets the value of the dStateOrdersCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dStateOrdersCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDStateOrdersCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DStateOrdersCategories }
     * 
     * 
     */
    public List<DStateOrdersCategories> getDStateOrdersCategories() {
        if (dStateOrdersCategories == null) {
            dStateOrdersCategories = new ArrayList<DStateOrdersCategories>();
        }
        return this.dStateOrdersCategories;
    }

}
