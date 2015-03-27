
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPerformanceIndicatorGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPerformanceIndicatorGroups">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPerformanceIndicatorGroups" type="{http://edboservice.ua/}dPerformanceIndicatorGroups" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPerformanceIndicatorGroups", propOrder = {
    "dPerformanceIndicatorGroups"
})
public class ArrayOfDPerformanceIndicatorGroups {

    @XmlElement(nillable = true)
    protected List<DPerformanceIndicatorGroups> dPerformanceIndicatorGroups;

    /**
     * Gets the value of the dPerformanceIndicatorGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPerformanceIndicatorGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPerformanceIndicatorGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPerformanceIndicatorGroups }
     * 
     * 
     */
    public List<DPerformanceIndicatorGroups> getDPerformanceIndicatorGroups() {
        if (dPerformanceIndicatorGroups == null) {
            dPerformanceIndicatorGroups = new ArrayList<DPerformanceIndicatorGroups>();
        }
        return this.dPerformanceIndicatorGroups;
    }

}
