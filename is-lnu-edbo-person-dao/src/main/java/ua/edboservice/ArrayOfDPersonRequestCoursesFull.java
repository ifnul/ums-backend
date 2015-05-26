
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonRequestCoursesFull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonRequestCoursesFull">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonRequestCoursesFull" type="{http://edboservice.ua/}dPersonRequestCoursesFull" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonRequestCoursesFull", propOrder = {
    "dPersonRequestCoursesFull"
})
public class ArrayOfDPersonRequestCoursesFull {

    @XmlElement(nillable = true)
    protected List<DPersonRequestCoursesFull> dPersonRequestCoursesFull;

    /**
     * Gets the value of the dPersonRequestCoursesFull property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonRequestCoursesFull property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonRequestCoursesFull().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonRequestCoursesFull }
     * 
     * 
     */
    public List<DPersonRequestCoursesFull> getDPersonRequestCoursesFull() {
        if (dPersonRequestCoursesFull == null) {
            dPersonRequestCoursesFull = new ArrayList<DPersonRequestCoursesFull>();
        }
        return this.dPersonRequestCoursesFull;
    }

}
