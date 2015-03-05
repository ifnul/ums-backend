
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityTypesOfFinansing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityTypesOfFinansing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityTypesOfFinansing" type="{http://edboservice.ua/}dUniversityTypesOfFinansing" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityTypesOfFinansing", propOrder = {
    "dUniversityTypesOfFinansing"
})
public class ArrayOfDUniversityTypesOfFinansing {

    @XmlElement(nillable = true)
    protected List<DUniversityTypesOfFinansing> dUniversityTypesOfFinansing;

    /**
     * Gets the value of the dUniversityTypesOfFinansing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityTypesOfFinansing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityTypesOfFinansing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityTypesOfFinansing }
     * 
     * 
     */
    public List<DUniversityTypesOfFinansing> getDUniversityTypesOfFinansing() {
        if (dUniversityTypesOfFinansing == null) {
            dUniversityTypesOfFinansing = new ArrayList<DUniversityTypesOfFinansing>();
        }
        return this.dUniversityTypesOfFinansing;
    }

}
