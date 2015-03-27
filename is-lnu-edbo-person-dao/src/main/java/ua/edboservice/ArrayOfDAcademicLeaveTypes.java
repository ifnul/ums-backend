
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDAcademicLeaveTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAcademicLeaveTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAcademicLeaveTypes" type="{http://edboservice.ua/}dAcademicLeaveTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAcademicLeaveTypes", propOrder = {
    "dAcademicLeaveTypes"
})
public class ArrayOfDAcademicLeaveTypes {

    @XmlElement(nillable = true)
    protected List<DAcademicLeaveTypes> dAcademicLeaveTypes;

    /**
     * Gets the value of the dAcademicLeaveTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAcademicLeaveTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAcademicLeaveTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAcademicLeaveTypes }
     * 
     * 
     */
    public List<DAcademicLeaveTypes> getDAcademicLeaveTypes() {
        if (dAcademicLeaveTypes == null) {
            dAcademicLeaveTypes = new ArrayList<DAcademicLeaveTypes>();
        }
        return this.dAcademicLeaveTypes;
    }

}
