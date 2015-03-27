
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonRequestExaminations2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonRequestExaminations2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonRequestExaminations2" type="{http://edboservice.ua/}dPersonRequestExaminations2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonRequestExaminations2", propOrder = {
    "dPersonRequestExaminations2"
})
public class ArrayOfDPersonRequestExaminations2 {

    @XmlElement(nillable = true)
    protected List<DPersonRequestExaminations2> dPersonRequestExaminations2;

    /**
     * Gets the value of the dPersonRequestExaminations2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonRequestExaminations2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonRequestExaminations2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonRequestExaminations2 }
     * 
     * 
     */
    public List<DPersonRequestExaminations2> getDPersonRequestExaminations2() {
        if (dPersonRequestExaminations2 == null) {
            dPersonRequestExaminations2 = new ArrayList<DPersonRequestExaminations2>();
        }
        return this.dPersonRequestExaminations2;
    }

}
