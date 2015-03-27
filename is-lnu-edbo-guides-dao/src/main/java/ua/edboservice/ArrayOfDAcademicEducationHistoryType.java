
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDAcademicEducationHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAcademicEducationHistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAcademicEducationHistoryType" type="{http://edboservice.ua/}dAcademicEducationHistoryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAcademicEducationHistoryType", propOrder = {
    "dAcademicEducationHistoryType"
})
public class ArrayOfDAcademicEducationHistoryType {

    @XmlElement(nillable = true)
    protected List<DAcademicEducationHistoryType> dAcademicEducationHistoryType;

    /**
     * Gets the value of the dAcademicEducationHistoryType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAcademicEducationHistoryType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAcademicEducationHistoryType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAcademicEducationHistoryType }
     * 
     * 
     */
    public List<DAcademicEducationHistoryType> getDAcademicEducationHistoryType() {
        if (dAcademicEducationHistoryType == null) {
            dAcademicEducationHistoryType = new ArrayList<DAcademicEducationHistoryType>();
        }
        return this.dAcademicEducationHistoryType;
    }

}
