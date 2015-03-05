
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityLicensesRegNumbers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityLicensesRegNumbers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityLicensesRegNumbers" type="{http://edboservice.ua/}dUniversityLicensesRegNumbers" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityLicensesRegNumbers", propOrder = {
    "dUniversityLicensesRegNumbers"
})
public class ArrayOfDUniversityLicensesRegNumbers {

    @XmlElement(nillable = true)
    protected List<DUniversityLicensesRegNumbers> dUniversityLicensesRegNumbers;

    /**
     * Gets the value of the dUniversityLicensesRegNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityLicensesRegNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityLicensesRegNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityLicensesRegNumbers }
     * 
     * 
     */
    public List<DUniversityLicensesRegNumbers> getDUniversityLicensesRegNumbers() {
        if (dUniversityLicensesRegNumbers == null) {
            dUniversityLicensesRegNumbers = new ArrayList<DUniversityLicensesRegNumbers>();
        }
        return this.dUniversityLicensesRegNumbers;
    }

}
