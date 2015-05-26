
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDAcademicCouncilSpecDecision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAcademicCouncilSpecDecision">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAcademicCouncilSpecDecision" type="{http://edboservice.ua/}dAcademicCouncilSpecDecision" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAcademicCouncilSpecDecision", propOrder = {
    "dAcademicCouncilSpecDecision"
})
public class ArrayOfDAcademicCouncilSpecDecision {

    @XmlElement(nillable = true)
    protected List<DAcademicCouncilSpecDecision> dAcademicCouncilSpecDecision;

    /**
     * Gets the value of the dAcademicCouncilSpecDecision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAcademicCouncilSpecDecision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAcademicCouncilSpecDecision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAcademicCouncilSpecDecision }
     * 
     * 
     */
    public List<DAcademicCouncilSpecDecision> getDAcademicCouncilSpecDecision() {
        if (dAcademicCouncilSpecDecision == null) {
            dAcademicCouncilSpecDecision = new ArrayList<DAcademicCouncilSpecDecision>();
        }
        return this.dAcademicCouncilSpecDecision;
    }

}
