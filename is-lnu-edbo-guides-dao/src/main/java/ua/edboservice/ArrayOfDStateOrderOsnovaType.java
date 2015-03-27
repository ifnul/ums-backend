
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDStateOrderOsnovaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDStateOrderOsnovaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dStateOrderOsnovaType" type="{http://edboservice.ua/}dStateOrderOsnovaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDStateOrderOsnovaType", propOrder = {
    "dStateOrderOsnovaType"
})
public class ArrayOfDStateOrderOsnovaType {

    @XmlElement(nillable = true)
    protected List<DStateOrderOsnovaType> dStateOrderOsnovaType;

    /**
     * Gets the value of the dStateOrderOsnovaType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dStateOrderOsnovaType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDStateOrderOsnovaType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DStateOrderOsnovaType }
     * 
     * 
     */
    public List<DStateOrderOsnovaType> getDStateOrderOsnovaType() {
        if (dStateOrderOsnovaType == null) {
            dStateOrderOsnovaType = new ArrayList<DStateOrderOsnovaType>();
        }
        return this.dStateOrderOsnovaType;
    }

}
