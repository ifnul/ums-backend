
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonRequestSeasons complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonRequestSeasons">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonRequestSeasons" type="{http://edboservice.ua/}dPersonRequestSeasons" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonRequestSeasons", propOrder = {
    "dPersonRequestSeasons"
})
public class ArrayOfDPersonRequestSeasons {

    @XmlElement(nillable = true)
    protected List<DPersonRequestSeasons> dPersonRequestSeasons;

    /**
     * Gets the value of the dPersonRequestSeasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonRequestSeasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonRequestSeasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonRequestSeasons }
     * 
     * 
     */
    public List<DPersonRequestSeasons> getDPersonRequestSeasons() {
        if (dPersonRequestSeasons == null) {
            dPersonRequestSeasons = new ArrayList<DPersonRequestSeasons>();
        }
        return this.dPersonRequestSeasons;
    }

}
