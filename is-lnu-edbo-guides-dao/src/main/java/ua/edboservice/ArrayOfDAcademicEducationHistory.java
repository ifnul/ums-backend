
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDAcademicEducationHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAcademicEducationHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAcademicEducationHistory" type="{http://edboservice.ua/}dAcademicEducationHistory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAcademicEducationHistory", propOrder = {
    "dAcademicEducationHistory"
})
public class ArrayOfDAcademicEducationHistory {

    @XmlElement(nillable = true)
    protected List<DAcademicEducationHistory> dAcademicEducationHistory;

    /**
     * Gets the value of the dAcademicEducationHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAcademicEducationHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAcademicEducationHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAcademicEducationHistory }
     * 
     * 
     */
    public List<DAcademicEducationHistory> getDAcademicEducationHistory() {
        if (dAcademicEducationHistory == null) {
            dAcademicEducationHistory = new ArrayList<DAcademicEducationHistory>();
        }
        return this.dAcademicEducationHistory;
    }

}
