
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityGovernanceTypesForEdit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityGovernanceTypesForEdit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityGovernanceTypesForEdit" type="{http://edboservice.ua/}dUniversityGovernanceTypesForEdit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityGovernanceTypesForEdit", propOrder = {
    "dUniversityGovernanceTypesForEdit"
})
public class ArrayOfDUniversityGovernanceTypesForEdit {

    @XmlElement(nillable = true)
    protected List<DUniversityGovernanceTypesForEdit> dUniversityGovernanceTypesForEdit;

    /**
     * Gets the value of the dUniversityGovernanceTypesForEdit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityGovernanceTypesForEdit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityGovernanceTypesForEdit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityGovernanceTypesForEdit }
     * 
     * 
     */
    public List<DUniversityGovernanceTypesForEdit> getDUniversityGovernanceTypesForEdit() {
        if (dUniversityGovernanceTypesForEdit == null) {
            dUniversityGovernanceTypesForEdit = new ArrayList<DUniversityGovernanceTypesForEdit>();
        }
        return this.dUniversityGovernanceTypesForEdit;
    }

}
