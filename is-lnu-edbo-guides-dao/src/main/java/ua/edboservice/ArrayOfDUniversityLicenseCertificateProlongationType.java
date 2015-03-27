
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityLicenseCertificateProlongationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityLicenseCertificateProlongationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityLicenseCertificateProlongationType" type="{http://edboservice.ua/}dUniversityLicenseCertificateProlongationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityLicenseCertificateProlongationType", propOrder = {
    "dUniversityLicenseCertificateProlongationType"
})
public class ArrayOfDUniversityLicenseCertificateProlongationType {

    @XmlElement(nillable = true)
    protected List<DUniversityLicenseCertificateProlongationType> dUniversityLicenseCertificateProlongationType;

    /**
     * Gets the value of the dUniversityLicenseCertificateProlongationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityLicenseCertificateProlongationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityLicenseCertificateProlongationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityLicenseCertificateProlongationType }
     * 
     * 
     */
    public List<DUniversityLicenseCertificateProlongationType> getDUniversityLicenseCertificateProlongationType() {
        if (dUniversityLicenseCertificateProlongationType == null) {
            dUniversityLicenseCertificateProlongationType = new ArrayList<DUniversityLicenseCertificateProlongationType>();
        }
        return this.dUniversityLicenseCertificateProlongationType;
    }

}
