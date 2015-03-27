
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversitiesFindLite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversitiesFindLite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversitiesFindLite" type="{http://edboservice.ua/}dUniversitiesFindLite" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversitiesFindLite", propOrder = {
    "dUniversitiesFindLite"
})
public class ArrayOfDUniversitiesFindLite {

    @XmlElement(nillable = true)
    protected List<DUniversitiesFindLite> dUniversitiesFindLite;

    /**
     * Gets the value of the dUniversitiesFindLite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversitiesFindLite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversitiesFindLite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversitiesFindLite }
     * 
     * 
     */
    public List<DUniversitiesFindLite> getDUniversitiesFindLite() {
        if (dUniversitiesFindLite == null) {
            dUniversitiesFindLite = new ArrayList<DUniversitiesFindLite>();
        }
        return this.dUniversitiesFindLite;
    }

}
