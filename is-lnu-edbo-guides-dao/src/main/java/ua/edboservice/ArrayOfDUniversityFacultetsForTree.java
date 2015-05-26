
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityFacultetsForTree complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityFacultetsForTree">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityFacultetsForTree" type="{http://edboservice.ua/}dUniversityFacultetsForTree" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityFacultetsForTree", propOrder = {
    "dUniversityFacultetsForTree"
})
public class ArrayOfDUniversityFacultetsForTree {

    @XmlElement(nillable = true)
    protected List<DUniversityFacultetsForTree> dUniversityFacultetsForTree;

    /**
     * Gets the value of the dUniversityFacultetsForTree property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityFacultetsForTree property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityFacultetsForTree().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityFacultetsForTree }
     * 
     * 
     */
    public List<DUniversityFacultetsForTree> getDUniversityFacultetsForTree() {
        if (dUniversityFacultetsForTree == null) {
            dUniversityFacultetsForTree = new ArrayList<DUniversityFacultetsForTree>();
        }
        return this.dUniversityFacultetsForTree;
    }

}
