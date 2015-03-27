
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonEducationProgressControlCapasity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonEducationProgressControlCapasity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonEducationProgressControlCapasity" type="{http://edboservice.ua/}dPersonEducationProgressControlCapasity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonEducationProgressControlCapasity", propOrder = {
    "dPersonEducationProgressControlCapasity"
})
public class ArrayOfDPersonEducationProgressControlCapasity {

    @XmlElement(nillable = true)
    protected List<DPersonEducationProgressControlCapasity> dPersonEducationProgressControlCapasity;

    /**
     * Gets the value of the dPersonEducationProgressControlCapasity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonEducationProgressControlCapasity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonEducationProgressControlCapasity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonEducationProgressControlCapasity }
     * 
     * 
     */
    public List<DPersonEducationProgressControlCapasity> getDPersonEducationProgressControlCapasity() {
        if (dPersonEducationProgressControlCapasity == null) {
            dPersonEducationProgressControlCapasity = new ArrayList<DPersonEducationProgressControlCapasity>();
        }
        return this.dPersonEducationProgressControlCapasity;
    }

}
