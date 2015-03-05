
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityManagmentOrganisations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityManagmentOrganisations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityManagmentOrganisations" type="{http://edboservice.ua/}dUniversityManagmentOrganisations" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityManagmentOrganisations", propOrder = {
    "dUniversityManagmentOrganisations"
})
public class ArrayOfDUniversityManagmentOrganisations {

    @XmlElement(nillable = true)
    protected List<DUniversityManagmentOrganisations> dUniversityManagmentOrganisations;

    /**
     * Gets the value of the dUniversityManagmentOrganisations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityManagmentOrganisations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityManagmentOrganisations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityManagmentOrganisations }
     * 
     * 
     */
    public List<DUniversityManagmentOrganisations> getDUniversityManagmentOrganisations() {
        if (dUniversityManagmentOrganisations == null) {
            dUniversityManagmentOrganisations = new ArrayList<DUniversityManagmentOrganisations>();
        }
        return this.dUniversityManagmentOrganisations;
    }

}
