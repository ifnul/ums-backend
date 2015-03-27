
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityLicensesSubTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityLicensesSubTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityLicensesSubTypes" type="{http://edboservice.ua/}dUniversityLicensesSubTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityLicensesSubTypes", propOrder = {
    "dUniversityLicensesSubTypes"
})
public class ArrayOfDUniversityLicensesSubTypes {

    @XmlElement(nillable = true)
    protected List<DUniversityLicensesSubTypes> dUniversityLicensesSubTypes;

    /**
     * Gets the value of the dUniversityLicensesSubTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityLicensesSubTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityLicensesSubTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityLicensesSubTypes }
     * 
     * 
     */
    public List<DUniversityLicensesSubTypes> getDUniversityLicensesSubTypes() {
        if (dUniversityLicensesSubTypes == null) {
            dUniversityLicensesSubTypes = new ArrayList<DUniversityLicensesSubTypes>();
        }
        return this.dUniversityLicensesSubTypes;
    }

}
