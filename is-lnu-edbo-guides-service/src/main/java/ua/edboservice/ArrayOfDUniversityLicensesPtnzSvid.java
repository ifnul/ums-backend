
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityLicensesPtnzSvid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityLicensesPtnzSvid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityLicensesPtnzSvid" type="{http://edboservice.ua/}dUniversityLicensesPtnzSvid" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityLicensesPtnzSvid", propOrder = {
    "dUniversityLicensesPtnzSvid"
})
public class ArrayOfDUniversityLicensesPtnzSvid {

    @XmlElement(nillable = true)
    protected List<DUniversityLicensesPtnzSvid> dUniversityLicensesPtnzSvid;

    /**
     * Gets the value of the dUniversityLicensesPtnzSvid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityLicensesPtnzSvid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityLicensesPtnzSvid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityLicensesPtnzSvid }
     * 
     * 
     */
    public List<DUniversityLicensesPtnzSvid> getDUniversityLicensesPtnzSvid() {
        if (dUniversityLicensesPtnzSvid == null) {
            dUniversityLicensesPtnzSvid = new ArrayList<DUniversityLicensesPtnzSvid>();
        }
        return this.dUniversityLicensesPtnzSvid;
    }

}
