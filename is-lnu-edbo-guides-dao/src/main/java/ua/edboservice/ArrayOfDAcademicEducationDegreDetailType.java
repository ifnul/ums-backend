
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDAcademicEducationDegreDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAcademicEducationDegreDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAcademicEducationDegreDetailType" type="{http://edboservice.ua/}dAcademicEducationDegreDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAcademicEducationDegreDetailType", propOrder = {
    "dAcademicEducationDegreDetailType"
})
public class ArrayOfDAcademicEducationDegreDetailType {

    @XmlElement(nillable = true)
    protected List<DAcademicEducationDegreDetailType> dAcademicEducationDegreDetailType;

    /**
     * Gets the value of the dAcademicEducationDegreDetailType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAcademicEducationDegreDetailType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAcademicEducationDegreDetailType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAcademicEducationDegreDetailType }
     * 
     * 
     */
    public List<DAcademicEducationDegreDetailType> getDAcademicEducationDegreDetailType() {
        if (dAcademicEducationDegreDetailType == null) {
            dAcademicEducationDegreDetailType = new ArrayList<DAcademicEducationDegreDetailType>();
        }
        return this.dAcademicEducationDegreDetailType;
    }

}
