
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonRequestSeasonRequestAddCustomUniversitySetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonRequestSeasonRequestAddCustomUniversitySetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonRequestSeasonRequestAddCustomUniversitySetting" type="{http://edboservice.ua/}dPersonRequestSeasonRequestAddCustomUniversitySetting" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonRequestSeasonRequestAddCustomUniversitySetting", propOrder = {
    "dPersonRequestSeasonRequestAddCustomUniversitySetting"
})
public class ArrayOfDPersonRequestSeasonRequestAddCustomUniversitySetting {

    @XmlElement(nillable = true)
    protected List<DPersonRequestSeasonRequestAddCustomUniversitySetting> dPersonRequestSeasonRequestAddCustomUniversitySetting;

    /**
     * Gets the value of the dPersonRequestSeasonRequestAddCustomUniversitySetting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonRequestSeasonRequestAddCustomUniversitySetting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonRequestSeasonRequestAddCustomUniversitySetting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonRequestSeasonRequestAddCustomUniversitySetting }
     * 
     * 
     */
    public List<DPersonRequestSeasonRequestAddCustomUniversitySetting> getDPersonRequestSeasonRequestAddCustomUniversitySetting() {
        if (dPersonRequestSeasonRequestAddCustomUniversitySetting == null) {
            dPersonRequestSeasonRequestAddCustomUniversitySetting = new ArrayList<DPersonRequestSeasonRequestAddCustomUniversitySetting>();
        }
        return this.dPersonRequestSeasonRequestAddCustomUniversitySetting;
    }

}
