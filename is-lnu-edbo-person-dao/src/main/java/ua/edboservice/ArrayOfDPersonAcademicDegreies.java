
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonAcademicDegreies complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonAcademicDegreies">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonAcademicDegreies" type="{http://edboservice.ua/}dPersonAcademicDegreies" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonAcademicDegreies", propOrder = {
    "dPersonAcademicDegreies"
})
public class ArrayOfDPersonAcademicDegreies {

    @XmlElement(nillable = true)
    protected List<DPersonAcademicDegreies> dPersonAcademicDegreies;

    /**
     * Gets the value of the dPersonAcademicDegreies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonAcademicDegreies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonAcademicDegreies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonAcademicDegreies }
     * 
     * 
     */
    public List<DPersonAcademicDegreies> getDPersonAcademicDegreies() {
        if (dPersonAcademicDegreies == null) {
            dPersonAcademicDegreies = new ArrayList<DPersonAcademicDegreies>();
        }
        return this.dPersonAcademicDegreies;
    }

}
