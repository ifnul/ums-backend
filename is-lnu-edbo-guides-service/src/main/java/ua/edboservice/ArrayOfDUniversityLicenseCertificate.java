
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityLicenseCertificate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityLicenseCertificate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityLicenseCertificate" type="{http://edboservice.ua/}dUniversityLicenseCertificate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityLicenseCertificate", propOrder = {
    "dUniversityLicenseCertificate"
})
public class ArrayOfDUniversityLicenseCertificate {

    @XmlElement(nillable = true)
    protected List<DUniversityLicenseCertificate> dUniversityLicenseCertificate;

    /**
     * Gets the value of the dUniversityLicenseCertificate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityLicenseCertificate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityLicenseCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityLicenseCertificate }
     * 
     * 
     */
    public List<DUniversityLicenseCertificate> getDUniversityLicenseCertificate() {
        if (dUniversityLicenseCertificate == null) {
            dUniversityLicenseCertificate = new ArrayList<DUniversityLicenseCertificate>();
        }
        return this.dUniversityLicenseCertificate;
    }

}
