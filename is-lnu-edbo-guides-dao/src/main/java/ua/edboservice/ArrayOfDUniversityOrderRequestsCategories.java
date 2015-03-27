
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityOrderRequestsCategories complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityOrderRequestsCategories">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityOrderRequestsCategories" type="{http://edboservice.ua/}dUniversityOrderRequestsCategories" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityOrderRequestsCategories", propOrder = {
    "dUniversityOrderRequestsCategories"
})
public class ArrayOfDUniversityOrderRequestsCategories {

    @XmlElement(nillable = true)
    protected List<DUniversityOrderRequestsCategories> dUniversityOrderRequestsCategories;

    /**
     * Gets the value of the dUniversityOrderRequestsCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityOrderRequestsCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityOrderRequestsCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityOrderRequestsCategories }
     * 
     * 
     */
    public List<DUniversityOrderRequestsCategories> getDUniversityOrderRequestsCategories() {
        if (dUniversityOrderRequestsCategories == null) {
            dUniversityOrderRequestsCategories = new ArrayList<DUniversityOrderRequestsCategories>();
        }
        return this.dUniversityOrderRequestsCategories;
    }

}
