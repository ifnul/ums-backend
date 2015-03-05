
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDSpecSpecialityClasifierForRequestDP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDSpecSpecialityClasifierForRequestDP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dSpecSpecialityClasifierForRequestDP" type="{http://edboservice.ua/}dSpecSpecialityClasifierForRequestDP" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDSpecSpecialityClasifierForRequestDP", propOrder = {
    "dSpecSpecialityClasifierForRequestDP"
})
public class ArrayOfDSpecSpecialityClasifierForRequestDP {

    @XmlElement(nillable = true)
    protected List<DSpecSpecialityClasifierForRequestDP> dSpecSpecialityClasifierForRequestDP;

    /**
     * Gets the value of the dSpecSpecialityClasifierForRequestDP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dSpecSpecialityClasifierForRequestDP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSpecSpecialityClasifierForRequestDP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSpecSpecialityClasifierForRequestDP }
     * 
     * 
     */
    public List<DSpecSpecialityClasifierForRequestDP> getDSpecSpecialityClasifierForRequestDP() {
        if (dSpecSpecialityClasifierForRequestDP == null) {
            dSpecSpecialityClasifierForRequestDP = new ArrayList<DSpecSpecialityClasifierForRequestDP>();
        }
        return this.dSpecSpecialityClasifierForRequestDP;
    }

}
