
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityLicensesDataPtnzDetailedSubTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityLicensesDataPtnzDetailedSubTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityLicensesDataPtnzDetailedSubTypes" type="{http://edboservice.ua/}dUniversityLicensesDataPtnzDetailedSubTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityLicensesDataPtnzDetailedSubTypes", propOrder = {
    "dUniversityLicensesDataPtnzDetailedSubTypes"
})
public class ArrayOfDUniversityLicensesDataPtnzDetailedSubTypes {

    @XmlElement(nillable = true)
    protected List<DUniversityLicensesDataPtnzDetailedSubTypes> dUniversityLicensesDataPtnzDetailedSubTypes;

    /**
     * Gets the value of the dUniversityLicensesDataPtnzDetailedSubTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityLicensesDataPtnzDetailedSubTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityLicensesDataPtnzDetailedSubTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityLicensesDataPtnzDetailedSubTypes }
     * 
     * 
     */
    public List<DUniversityLicensesDataPtnzDetailedSubTypes> getDUniversityLicensesDataPtnzDetailedSubTypes() {
        if (dUniversityLicensesDataPtnzDetailedSubTypes == null) {
            dUniversityLicensesDataPtnzDetailedSubTypes = new ArrayList<DUniversityLicensesDataPtnzDetailedSubTypes>();
        }
        return this.dUniversityLicensesDataPtnzDetailedSubTypes;
    }

}
