
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDAcademicEducationDegreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAcademicEducationDegreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAcademicEducationDegreType" type="{http://edboservice.ua/}dAcademicEducationDegreType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAcademicEducationDegreType", propOrder = {
    "dAcademicEducationDegreType"
})
public class ArrayOfDAcademicEducationDegreType {

    @XmlElement(nillable = true)
    protected List<DAcademicEducationDegreType> dAcademicEducationDegreType;

    /**
     * Gets the value of the dAcademicEducationDegreType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAcademicEducationDegreType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAcademicEducationDegreType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAcademicEducationDegreType }
     * 
     * 
     */
    public List<DAcademicEducationDegreType> getDAcademicEducationDegreType() {
        if (dAcademicEducationDegreType == null) {
            dAcademicEducationDegreType = new ArrayList<DAcademicEducationDegreType>();
        }
        return this.dAcademicEducationDegreType;
    }

}
