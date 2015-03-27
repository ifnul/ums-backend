
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDWebAcademicRank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDWebAcademicRank">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dWebAcademicRank" type="{http://edboservice.ua/}dWebAcademicRank" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDWebAcademicRank", propOrder = {
    "dWebAcademicRank"
})
public class ArrayOfDWebAcademicRank {

    @XmlElement(nillable = true)
    protected List<DWebAcademicRank> dWebAcademicRank;

    /**
     * Gets the value of the dWebAcademicRank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dWebAcademicRank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDWebAcademicRank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DWebAcademicRank }
     * 
     * 
     */
    public List<DWebAcademicRank> getDWebAcademicRank() {
        if (dWebAcademicRank == null) {
            dWebAcademicRank = new ArrayList<DWebAcademicRank>();
        }
        return this.dWebAcademicRank;
    }

}
