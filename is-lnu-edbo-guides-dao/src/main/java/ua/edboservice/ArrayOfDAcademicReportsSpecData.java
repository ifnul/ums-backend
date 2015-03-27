
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDAcademicReportsSpecData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAcademicReportsSpecData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAcademicReportsSpecData" type="{http://edboservice.ua/}dAcademicReportsSpecData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAcademicReportsSpecData", propOrder = {
    "dAcademicReportsSpecData"
})
public class ArrayOfDAcademicReportsSpecData {

    @XmlElement(nillable = true)
    protected List<DAcademicReportsSpecData> dAcademicReportsSpecData;

    /**
     * Gets the value of the dAcademicReportsSpecData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAcademicReportsSpecData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAcademicReportsSpecData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAcademicReportsSpecData }
     * 
     * 
     */
    public List<DAcademicReportsSpecData> getDAcademicReportsSpecData() {
        if (dAcademicReportsSpecData == null) {
            dAcademicReportsSpecData = new ArrayList<DAcademicReportsSpecData>();
        }
        return this.dAcademicReportsSpecData;
    }

}
