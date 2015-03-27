
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDAcademicReportsSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAcademicReportsSpec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAcademicReportsSpec" type="{http://edboservice.ua/}dAcademicReportsSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAcademicReportsSpec", propOrder = {
    "dAcademicReportsSpec"
})
public class ArrayOfDAcademicReportsSpec {

    @XmlElement(nillable = true)
    protected List<DAcademicReportsSpec> dAcademicReportsSpec;

    /**
     * Gets the value of the dAcademicReportsSpec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAcademicReportsSpec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAcademicReportsSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAcademicReportsSpec }
     * 
     * 
     */
    public List<DAcademicReportsSpec> getDAcademicReportsSpec() {
        if (dAcademicReportsSpec == null) {
            dAcademicReportsSpec = new ArrayList<DAcademicReportsSpec>();
        }
        return this.dAcademicReportsSpec;
    }

}
