
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPerformanceIndicatorSubcategories complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPerformanceIndicatorSubcategories">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPerformanceIndicatorSubcategories" type="{http://edboservice.ua/}dPerformanceIndicatorSubcategories" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPerformanceIndicatorSubcategories", propOrder = {
    "dPerformanceIndicatorSubcategories"
})
public class ArrayOfDPerformanceIndicatorSubcategories {

    @XmlElement(nillable = true)
    protected List<DPerformanceIndicatorSubcategories> dPerformanceIndicatorSubcategories;

    /**
     * Gets the value of the dPerformanceIndicatorSubcategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPerformanceIndicatorSubcategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPerformanceIndicatorSubcategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPerformanceIndicatorSubcategories }
     * 
     * 
     */
    public List<DPerformanceIndicatorSubcategories> getDPerformanceIndicatorSubcategories() {
        if (dPerformanceIndicatorSubcategories == null) {
            dPerformanceIndicatorSubcategories = new ArrayList<DPerformanceIndicatorSubcategories>();
        }
        return this.dPerformanceIndicatorSubcategories;
    }

}
