
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDLanguagesEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDLanguagesEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dLanguagesEx" type="{http://edboservice.ua/}dLanguagesEx" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDLanguagesEx", propOrder = {
    "dLanguagesEx"
})
public class ArrayOfDLanguagesEx {

    @XmlElement(nillable = true)
    protected List<DLanguagesEx> dLanguagesEx;

    /**
     * Gets the value of the dLanguagesEx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dLanguagesEx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDLanguagesEx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DLanguagesEx }
     * 
     * 
     */
    public List<DLanguagesEx> getDLanguagesEx() {
        if (dLanguagesEx == null) {
            dLanguagesEx = new ArrayList<DLanguagesEx>();
        }
        return this.dLanguagesEx;
    }

}
