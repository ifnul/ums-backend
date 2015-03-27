
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonEducationHistory2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonEducationHistory2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonEducationHistory2" type="{http://edboservice.ua/}dPersonEducationHistory2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonEducationHistory2", propOrder = {
    "dPersonEducationHistory2"
})
public class ArrayOfDPersonEducationHistory2 {

    @XmlElement(nillable = true)
    protected List<DPersonEducationHistory2> dPersonEducationHistory2;

    /**
     * Gets the value of the dPersonEducationHistory2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonEducationHistory2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonEducationHistory2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonEducationHistory2 }
     * 
     * 
     */
    public List<DPersonEducationHistory2> getDPersonEducationHistory2() {
        if (dPersonEducationHistory2 == null) {
            dPersonEducationHistory2 = new ArrayList<DPersonEducationHistory2>();
        }
        return this.dPersonEducationHistory2;
    }

}
