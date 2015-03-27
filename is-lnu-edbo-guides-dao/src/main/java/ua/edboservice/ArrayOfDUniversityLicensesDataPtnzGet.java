
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityLicensesDataPtnzGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityLicensesDataPtnzGet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityLicensesDataPtnzGet" type="{http://edboservice.ua/}dUniversityLicensesDataPtnzGet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityLicensesDataPtnzGet", propOrder = {
    "dUniversityLicensesDataPtnzGet"
})
public class ArrayOfDUniversityLicensesDataPtnzGet {

    @XmlElement(nillable = true)
    protected List<DUniversityLicensesDataPtnzGet> dUniversityLicensesDataPtnzGet;

    /**
     * Gets the value of the dUniversityLicensesDataPtnzGet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityLicensesDataPtnzGet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityLicensesDataPtnzGet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityLicensesDataPtnzGet }
     * 
     * 
     */
    public List<DUniversityLicensesDataPtnzGet> getDUniversityLicensesDataPtnzGet() {
        if (dUniversityLicensesDataPtnzGet == null) {
            dUniversityLicensesDataPtnzGet = new ArrayList<DUniversityLicensesDataPtnzGet>();
        }
        return this.dUniversityLicensesDataPtnzGet;
    }

}
