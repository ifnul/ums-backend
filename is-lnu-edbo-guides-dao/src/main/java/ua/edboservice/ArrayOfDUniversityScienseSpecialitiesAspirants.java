
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityScienseSpecialitiesAspirants complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityScienseSpecialitiesAspirants">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityScienseSpecialitiesAspirants" type="{http://edboservice.ua/}dUniversityScienseSpecialitiesAspirants" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityScienseSpecialitiesAspirants", propOrder = {
    "dUniversityScienseSpecialitiesAspirants"
})
public class ArrayOfDUniversityScienseSpecialitiesAspirants {

    @XmlElement(nillable = true)
    protected List<DUniversityScienseSpecialitiesAspirants> dUniversityScienseSpecialitiesAspirants;

    /**
     * Gets the value of the dUniversityScienseSpecialitiesAspirants property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityScienseSpecialitiesAspirants property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityScienseSpecialitiesAspirants().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityScienseSpecialitiesAspirants }
     * 
     * 
     */
    public List<DUniversityScienseSpecialitiesAspirants> getDUniversityScienseSpecialitiesAspirants() {
        if (dUniversityScienseSpecialitiesAspirants == null) {
            dUniversityScienseSpecialitiesAspirants = new ArrayList<DUniversityScienseSpecialitiesAspirants>();
        }
        return this.dUniversityScienseSpecialitiesAspirants;
    }

}
