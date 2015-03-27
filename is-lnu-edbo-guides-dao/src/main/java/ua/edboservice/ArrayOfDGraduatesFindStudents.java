
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDGraduatesFindStudents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDGraduatesFindStudents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dGraduatesFindStudents" type="{http://edboservice.ua/}dGraduatesFindStudents" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDGraduatesFindStudents", propOrder = {
    "dGraduatesFindStudents"
})
public class ArrayOfDGraduatesFindStudents {

    @XmlElement(nillable = true)
    protected List<DGraduatesFindStudents> dGraduatesFindStudents;

    /**
     * Gets the value of the dGraduatesFindStudents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dGraduatesFindStudents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDGraduatesFindStudents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DGraduatesFindStudents }
     * 
     * 
     */
    public List<DGraduatesFindStudents> getDGraduatesFindStudents() {
        if (dGraduatesFindStudents == null) {
            dGraduatesFindStudents = new ArrayList<DGraduatesFindStudents>();
        }
        return this.dGraduatesFindStudents;
    }

}
