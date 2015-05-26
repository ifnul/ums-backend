
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityBuildingOwnerForms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityBuildingOwnerForms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityBuildingOwnerForms" type="{http://edboservice.ua/}dUniversityBuildingOwnerForms" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityBuildingOwnerForms", propOrder = {
    "dUniversityBuildingOwnerForms"
})
public class ArrayOfDUniversityBuildingOwnerForms {

    @XmlElement(nillable = true)
    protected List<DUniversityBuildingOwnerForms> dUniversityBuildingOwnerForms;

    /**
     * Gets the value of the dUniversityBuildingOwnerForms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityBuildingOwnerForms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityBuildingOwnerForms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityBuildingOwnerForms }
     * 
     * 
     */
    public List<DUniversityBuildingOwnerForms> getDUniversityBuildingOwnerForms() {
        if (dUniversityBuildingOwnerForms == null) {
            dUniversityBuildingOwnerForms = new ArrayList<DUniversityBuildingOwnerForms>();
        }
        return this.dUniversityBuildingOwnerForms;
    }

}
