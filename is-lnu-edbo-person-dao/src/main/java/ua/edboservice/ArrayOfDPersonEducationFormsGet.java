
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonEducationFormsGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonEducationFormsGet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonEducationFormsGet" type="{http://edboservice.ua/}dPersonEducationFormsGet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonEducationFormsGet", propOrder = {
    "dPersonEducationFormsGet"
})
public class ArrayOfDPersonEducationFormsGet {

    @XmlElement(nillable = true)
    protected List<DPersonEducationFormsGet> dPersonEducationFormsGet;

    /**
     * Gets the value of the dPersonEducationFormsGet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonEducationFormsGet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonEducationFormsGet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonEducationFormsGet }
     * 
     * 
     */
    public List<DPersonEducationFormsGet> getDPersonEducationFormsGet() {
        if (dPersonEducationFormsGet == null) {
            dPersonEducationFormsGet = new ArrayList<DPersonEducationFormsGet>();
        }
        return this.dPersonEducationFormsGet;
    }

}
