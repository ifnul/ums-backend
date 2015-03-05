
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPerformanceIndicatorDataTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPerformanceIndicatorDataTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPerformanceIndicatorDataTypes" type="{http://edboservice.ua/}dPerformanceIndicatorDataTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPerformanceIndicatorDataTypes", propOrder = {
    "dPerformanceIndicatorDataTypes"
})
public class ArrayOfDPerformanceIndicatorDataTypes {

    @XmlElement(nillable = true)
    protected List<DPerformanceIndicatorDataTypes> dPerformanceIndicatorDataTypes;

    /**
     * Gets the value of the dPerformanceIndicatorDataTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPerformanceIndicatorDataTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPerformanceIndicatorDataTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPerformanceIndicatorDataTypes }
     * 
     * 
     */
    public List<DPerformanceIndicatorDataTypes> getDPerformanceIndicatorDataTypes() {
        if (dPerformanceIndicatorDataTypes == null) {
            dPerformanceIndicatorDataTypes = new ArrayList<DPerformanceIndicatorDataTypes>();
        }
        return this.dPerformanceIndicatorDataTypes;
    }

}
