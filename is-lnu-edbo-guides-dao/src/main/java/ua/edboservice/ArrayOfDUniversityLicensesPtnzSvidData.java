
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityLicensesPtnzSvidData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityLicensesPtnzSvidData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityLicensesPtnzSvidData" type="{http://edboservice.ua/}dUniversityLicensesPtnzSvidData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityLicensesPtnzSvidData", propOrder = {
    "dUniversityLicensesPtnzSvidData"
})
public class ArrayOfDUniversityLicensesPtnzSvidData {

    @XmlElement(nillable = true)
    protected List<DUniversityLicensesPtnzSvidData> dUniversityLicensesPtnzSvidData;

    /**
     * Gets the value of the dUniversityLicensesPtnzSvidData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityLicensesPtnzSvidData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityLicensesPtnzSvidData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityLicensesPtnzSvidData }
     * 
     * 
     */
    public List<DUniversityLicensesPtnzSvidData> getDUniversityLicensesPtnzSvidData() {
        if (dUniversityLicensesPtnzSvidData == null) {
            dUniversityLicensesPtnzSvidData = new ArrayList<DUniversityLicensesPtnzSvidData>();
        }
        return this.dUniversityLicensesPtnzSvidData;
    }

}
