
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityBossOrderOrganisation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityBossOrderOrganisation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityBossOrderOrganisation" type="{http://edboservice.ua/}dUniversityBossOrderOrganisation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityBossOrderOrganisation", propOrder = {
    "dUniversityBossOrderOrganisation"
})
public class ArrayOfDUniversityBossOrderOrganisation {

    @XmlElement(nillable = true)
    protected List<DUniversityBossOrderOrganisation> dUniversityBossOrderOrganisation;

    /**
     * Gets the value of the dUniversityBossOrderOrganisation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityBossOrderOrganisation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityBossOrderOrganisation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityBossOrderOrganisation }
     * 
     * 
     */
    public List<DUniversityBossOrderOrganisation> getDUniversityBossOrderOrganisation() {
        if (dUniversityBossOrderOrganisation == null) {
            dUniversityBossOrderOrganisation = new ArrayList<DUniversityBossOrderOrganisation>();
        }
        return this.dUniversityBossOrderOrganisation;
    }

}
