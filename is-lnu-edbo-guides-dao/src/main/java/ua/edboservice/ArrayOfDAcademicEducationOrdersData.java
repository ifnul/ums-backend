
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDAcademicEducationOrdersData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAcademicEducationOrdersData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAcademicEducationOrdersData" type="{http://edboservice.ua/}dAcademicEducationOrdersData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAcademicEducationOrdersData", propOrder = {
    "dAcademicEducationOrdersData"
})
public class ArrayOfDAcademicEducationOrdersData {

    @XmlElement(nillable = true)
    protected List<DAcademicEducationOrdersData> dAcademicEducationOrdersData;

    /**
     * Gets the value of the dAcademicEducationOrdersData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAcademicEducationOrdersData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAcademicEducationOrdersData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAcademicEducationOrdersData }
     * 
     * 
     */
    public List<DAcademicEducationOrdersData> getDAcademicEducationOrdersData() {
        if (dAcademicEducationOrdersData == null) {
            dAcademicEducationOrdersData = new ArrayList<DAcademicEducationOrdersData>();
        }
        return this.dAcademicEducationOrdersData;
    }

}
