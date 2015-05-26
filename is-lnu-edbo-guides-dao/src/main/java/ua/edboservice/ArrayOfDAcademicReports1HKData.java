
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDAcademicReports1HKData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAcademicReports1HKData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAcademicReports1HKData" type="{http://edboservice.ua/}dAcademicReports1HKData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAcademicReports1HKData", propOrder = {
    "dAcademicReports1HKData"
})
public class ArrayOfDAcademicReports1HKData {

    @XmlElement(nillable = true)
    protected List<DAcademicReports1HKData> dAcademicReports1HKData;

    /**
     * Gets the value of the dAcademicReports1HKData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAcademicReports1HKData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAcademicReports1HKData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAcademicReports1HKData }
     * 
     * 
     */
    public List<DAcademicReports1HKData> getDAcademicReports1HKData() {
        if (dAcademicReports1HKData == null) {
            dAcademicReports1HKData = new ArrayList<DAcademicReports1HKData>();
        }
        return this.dAcademicReports1HKData;
    }

}
