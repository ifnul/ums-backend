
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityLicenseCertificateData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityLicenseCertificateData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityLicenseCertificateData" type="{http://edboservice.ua/}dUniversityLicenseCertificateData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityLicenseCertificateData", propOrder = {
    "dUniversityLicenseCertificateData"
})
public class ArrayOfDUniversityLicenseCertificateData {

    @XmlElement(nillable = true)
    protected List<DUniversityLicenseCertificateData> dUniversityLicenseCertificateData;

    /**
     * Gets the value of the dUniversityLicenseCertificateData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityLicenseCertificateData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityLicenseCertificateData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityLicenseCertificateData }
     * 
     * 
     */
    public List<DUniversityLicenseCertificateData> getDUniversityLicenseCertificateData() {
        if (dUniversityLicenseCertificateData == null) {
            dUniversityLicenseCertificateData = new ArrayList<DUniversityLicenseCertificateData>();
        }
        return this.dUniversityLicenseCertificateData;
    }

}
