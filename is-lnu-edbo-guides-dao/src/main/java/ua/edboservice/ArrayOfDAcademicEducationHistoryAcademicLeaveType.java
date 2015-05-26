
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDAcademicEducationHistoryAcademicLeaveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAcademicEducationHistoryAcademicLeaveType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAcademicEducationHistoryAcademicLeaveType" type="{http://edboservice.ua/}dAcademicEducationHistoryAcademicLeaveType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAcademicEducationHistoryAcademicLeaveType", propOrder = {
    "dAcademicEducationHistoryAcademicLeaveType"
})
public class ArrayOfDAcademicEducationHistoryAcademicLeaveType {

    @XmlElement(nillable = true)
    protected List<DAcademicEducationHistoryAcademicLeaveType> dAcademicEducationHistoryAcademicLeaveType;

    /**
     * Gets the value of the dAcademicEducationHistoryAcademicLeaveType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAcademicEducationHistoryAcademicLeaveType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAcademicEducationHistoryAcademicLeaveType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAcademicEducationHistoryAcademicLeaveType }
     * 
     * 
     */
    public List<DAcademicEducationHistoryAcademicLeaveType> getDAcademicEducationHistoryAcademicLeaveType() {
        if (dAcademicEducationHistoryAcademicLeaveType == null) {
            dAcademicEducationHistoryAcademicLeaveType = new ArrayList<DAcademicEducationHistoryAcademicLeaveType>();
        }
        return this.dAcademicEducationHistoryAcademicLeaveType;
    }

}
