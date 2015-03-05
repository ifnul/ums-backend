
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityManagmentOrganisationsTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityManagmentOrganisationsTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityManagmentOrganisationsTypes" type="{http://edboservice.ua/}dUniversityManagmentOrganisationsTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityManagmentOrganisationsTypes", propOrder = {
    "dUniversityManagmentOrganisationsTypes"
})
public class ArrayOfDUniversityManagmentOrganisationsTypes {

    @XmlElement(nillable = true)
    protected List<DUniversityManagmentOrganisationsTypes> dUniversityManagmentOrganisationsTypes;

    /**
     * Gets the value of the dUniversityManagmentOrganisationsTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityManagmentOrganisationsTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityManagmentOrganisationsTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityManagmentOrganisationsTypes }
     * 
     * 
     */
    public List<DUniversityManagmentOrganisationsTypes> getDUniversityManagmentOrganisationsTypes() {
        if (dUniversityManagmentOrganisationsTypes == null) {
            dUniversityManagmentOrganisationsTypes = new ArrayList<DUniversityManagmentOrganisationsTypes>();
        }
        return this.dUniversityManagmentOrganisationsTypes;
    }

}
