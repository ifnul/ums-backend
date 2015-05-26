
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityGovernanceTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityGovernanceTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityGovernanceTypes" type="{http://edboservice.ua/}dUniversityGovernanceTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityGovernanceTypes", propOrder = {
    "dUniversityGovernanceTypes"
})
public class ArrayOfDUniversityGovernanceTypes {

    @XmlElement(nillable = true)
    protected List<DUniversityGovernanceTypes> dUniversityGovernanceTypes;

    /**
     * Gets the value of the dUniversityGovernanceTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityGovernanceTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityGovernanceTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityGovernanceTypes }
     * 
     * 
     */
    public List<DUniversityGovernanceTypes> getDUniversityGovernanceTypes() {
        if (dUniversityGovernanceTypes == null) {
            dUniversityGovernanceTypes = new ArrayList<DUniversityGovernanceTypes>();
        }
        return this.dUniversityGovernanceTypes;
    }

}
