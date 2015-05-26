
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPerformanceIndicatorCategories complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPerformanceIndicatorCategories">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPerformanceIndicatorCategories" type="{http://edboservice.ua/}dPerformanceIndicatorCategories" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPerformanceIndicatorCategories", propOrder = {
    "dPerformanceIndicatorCategories"
})
public class ArrayOfDPerformanceIndicatorCategories {

    @XmlElement(nillable = true)
    protected List<DPerformanceIndicatorCategories> dPerformanceIndicatorCategories;

    /**
     * Gets the value of the dPerformanceIndicatorCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPerformanceIndicatorCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPerformanceIndicatorCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPerformanceIndicatorCategories }
     * 
     * 
     */
    public List<DPerformanceIndicatorCategories> getDPerformanceIndicatorCategories() {
        if (dPerformanceIndicatorCategories == null) {
            dPerformanceIndicatorCategories = new ArrayList<DPerformanceIndicatorCategories>();
        }
        return this.dPerformanceIndicatorCategories;
    }

}
