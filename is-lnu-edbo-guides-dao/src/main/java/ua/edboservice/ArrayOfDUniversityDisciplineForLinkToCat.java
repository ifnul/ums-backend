
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityDisciplineForLinkToCat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityDisciplineForLinkToCat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityDisciplineForLinkToCat" type="{http://edboservice.ua/}dUniversityDisciplineForLinkToCat" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityDisciplineForLinkToCat", propOrder = {
    "dUniversityDisciplineForLinkToCat"
})
public class ArrayOfDUniversityDisciplineForLinkToCat {

    @XmlElement(nillable = true)
    protected List<DUniversityDisciplineForLinkToCat> dUniversityDisciplineForLinkToCat;

    /**
     * Gets the value of the dUniversityDisciplineForLinkToCat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityDisciplineForLinkToCat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityDisciplineForLinkToCat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityDisciplineForLinkToCat }
     * 
     * 
     */
    public List<DUniversityDisciplineForLinkToCat> getDUniversityDisciplineForLinkToCat() {
        if (dUniversityDisciplineForLinkToCat == null) {
            dUniversityDisciplineForLinkToCat = new ArrayList<DUniversityDisciplineForLinkToCat>();
        }
        return this.dUniversityDisciplineForLinkToCat;
    }

}
