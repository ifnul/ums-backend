
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityLicensesOrganisationsRishen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityLicensesOrganisationsRishen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityLicensesOrganisationsRishen" type="{http://edboservice.ua/}dUniversityLicensesOrganisationsRishen" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityLicensesOrganisationsRishen", propOrder = {
    "dUniversityLicensesOrganisationsRishen"
})
public class ArrayOfDUniversityLicensesOrganisationsRishen {

    @XmlElement(nillable = true)
    protected List<DUniversityLicensesOrganisationsRishen> dUniversityLicensesOrganisationsRishen;

    /**
     * Gets the value of the dUniversityLicensesOrganisationsRishen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityLicensesOrganisationsRishen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityLicensesOrganisationsRishen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityLicensesOrganisationsRishen }
     * 
     * 
     */
    public List<DUniversityLicensesOrganisationsRishen> getDUniversityLicensesOrganisationsRishen() {
        if (dUniversityLicensesOrganisationsRishen == null) {
            dUniversityLicensesOrganisationsRishen = new ArrayList<DUniversityLicensesOrganisationsRishen>();
        }
        return this.dUniversityLicensesOrganisationsRishen;
    }

}
