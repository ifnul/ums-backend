
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonEducationProgressPeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonEducationProgressPeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonEducationProgressPeriodType" type="{http://edboservice.ua/}dPersonEducationProgressPeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonEducationProgressPeriodType", propOrder = {
    "dPersonEducationProgressPeriodType"
})
public class ArrayOfDPersonEducationProgressPeriodType {

    @XmlElement(nillable = true)
    protected List<DPersonEducationProgressPeriodType> dPersonEducationProgressPeriodType;

    /**
     * Gets the value of the dPersonEducationProgressPeriodType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonEducationProgressPeriodType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonEducationProgressPeriodType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonEducationProgressPeriodType }
     * 
     * 
     */
    public List<DPersonEducationProgressPeriodType> getDPersonEducationProgressPeriodType() {
        if (dPersonEducationProgressPeriodType == null) {
            dPersonEducationProgressPeriodType = new ArrayList<DPersonEducationProgressPeriodType>();
        }
        return this.dPersonEducationProgressPeriodType;
    }

}
