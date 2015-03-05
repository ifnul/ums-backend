
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPerformanceIndicatorsAdditionalValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPerformanceIndicatorsAdditionalValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPerformanceIndicatorsAdditionalValues" type="{http://edboservice.ua/}dPerformanceIndicatorsAdditionalValues" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPerformanceIndicatorsAdditionalValues", propOrder = {
    "dPerformanceIndicatorsAdditionalValues"
})
public class ArrayOfDPerformanceIndicatorsAdditionalValues {

    @XmlElement(nillable = true)
    protected List<DPerformanceIndicatorsAdditionalValues> dPerformanceIndicatorsAdditionalValues;

    /**
     * Gets the value of the dPerformanceIndicatorsAdditionalValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPerformanceIndicatorsAdditionalValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPerformanceIndicatorsAdditionalValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPerformanceIndicatorsAdditionalValues }
     * 
     * 
     */
    public List<DPerformanceIndicatorsAdditionalValues> getDPerformanceIndicatorsAdditionalValues() {
        if (dPerformanceIndicatorsAdditionalValues == null) {
            dPerformanceIndicatorsAdditionalValues = new ArrayList<DPerformanceIndicatorsAdditionalValues>();
        }
        return this.dPerformanceIndicatorsAdditionalValues;
    }

}
