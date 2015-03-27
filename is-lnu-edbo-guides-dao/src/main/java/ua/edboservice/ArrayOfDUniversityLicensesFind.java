
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityLicensesFind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityLicensesFind">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityLicensesFind" type="{http://edboservice.ua/}dUniversityLicensesFind" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityLicensesFind", propOrder = {
    "dUniversityLicensesFind"
})
public class ArrayOfDUniversityLicensesFind {

    @XmlElement(nillable = true)
    protected List<DUniversityLicensesFind> dUniversityLicensesFind;

    /**
     * Gets the value of the dUniversityLicensesFind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityLicensesFind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityLicensesFind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityLicensesFind }
     * 
     * 
     */
    public List<DUniversityLicensesFind> getDUniversityLicensesFind() {
        if (dUniversityLicensesFind == null) {
            dUniversityLicensesFind = new ArrayList<DUniversityLicensesFind>();
        }
        return this.dUniversityLicensesFind;
    }

}
