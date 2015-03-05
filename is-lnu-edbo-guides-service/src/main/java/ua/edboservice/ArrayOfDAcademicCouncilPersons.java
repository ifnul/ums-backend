
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDAcademicCouncilPersons complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAcademicCouncilPersons">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAcademicCouncilPersons" type="{http://edboservice.ua/}dAcademicCouncilPersons" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAcademicCouncilPersons", propOrder = {
    "dAcademicCouncilPersons"
})
public class ArrayOfDAcademicCouncilPersons {

    @XmlElement(nillable = true)
    protected List<DAcademicCouncilPersons> dAcademicCouncilPersons;

    /**
     * Gets the value of the dAcademicCouncilPersons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAcademicCouncilPersons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAcademicCouncilPersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAcademicCouncilPersons }
     * 
     * 
     */
    public List<DAcademicCouncilPersons> getDAcademicCouncilPersons() {
        if (dAcademicCouncilPersons == null) {
            dAcademicCouncilPersons = new ArrayList<DAcademicCouncilPersons>();
        }
        return this.dAcademicCouncilPersons;
    }

}
