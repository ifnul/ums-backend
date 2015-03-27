
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDAcademicAttestationCaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAcademicAttestationCaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAcademicAttestationCaseType" type="{http://edboservice.ua/}dAcademicAttestationCaseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAcademicAttestationCaseType", propOrder = {
    "dAcademicAttestationCaseType"
})
public class ArrayOfDAcademicAttestationCaseType {

    @XmlElement(nillable = true)
    protected List<DAcademicAttestationCaseType> dAcademicAttestationCaseType;

    /**
     * Gets the value of the dAcademicAttestationCaseType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAcademicAttestationCaseType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAcademicAttestationCaseType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAcademicAttestationCaseType }
     * 
     * 
     */
    public List<DAcademicAttestationCaseType> getDAcademicAttestationCaseType() {
        if (dAcademicAttestationCaseType == null) {
            dAcademicAttestationCaseType = new ArrayList<DAcademicAttestationCaseType>();
        }
        return this.dAcademicAttestationCaseType;
    }

}
