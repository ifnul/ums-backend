
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversitiesActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversitiesActivity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversitiesActivity" type="{http://edboservice.ua/}dUniversitiesActivity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversitiesActivity", propOrder = {
    "dUniversitiesActivity"
})
public class ArrayOfDUniversitiesActivity {

    @XmlElement(nillable = true)
    protected List<DUniversitiesActivity> dUniversitiesActivity;

    /**
     * Gets the value of the dUniversitiesActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversitiesActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversitiesActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversitiesActivity }
     * 
     * 
     */
    public List<DUniversitiesActivity> getDUniversitiesActivity() {
        if (dUniversitiesActivity == null) {
            dUniversitiesActivity = new ArrayList<DUniversitiesActivity>();
        }
        return this.dUniversitiesActivity;
    }

}
