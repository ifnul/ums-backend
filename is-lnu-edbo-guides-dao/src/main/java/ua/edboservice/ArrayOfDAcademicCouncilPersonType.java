
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDAcademicCouncilPersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAcademicCouncilPersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAcademicCouncilPersonType" type="{http://edboservice.ua/}dAcademicCouncilPersonType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAcademicCouncilPersonType", propOrder = {
    "dAcademicCouncilPersonType"
})
public class ArrayOfDAcademicCouncilPersonType {

    @XmlElement(nillable = true)
    protected List<DAcademicCouncilPersonType> dAcademicCouncilPersonType;

    /**
     * Gets the value of the dAcademicCouncilPersonType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAcademicCouncilPersonType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAcademicCouncilPersonType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAcademicCouncilPersonType }
     * 
     * 
     */
    public List<DAcademicCouncilPersonType> getDAcademicCouncilPersonType() {
        if (dAcademicCouncilPersonType == null) {
            dAcademicCouncilPersonType = new ArrayList<DAcademicCouncilPersonType>();
        }
        return this.dAcademicCouncilPersonType;
    }

}
