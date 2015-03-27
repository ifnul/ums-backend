
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonAcademicPublicationsGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonAcademicPublicationsGet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonAcademicPublicationsGet" type="{http://edboservice.ua/}dPersonAcademicPublicationsGet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonAcademicPublicationsGet", propOrder = {
    "dPersonAcademicPublicationsGet"
})
public class ArrayOfDPersonAcademicPublicationsGet {

    @XmlElement(nillable = true)
    protected List<DPersonAcademicPublicationsGet> dPersonAcademicPublicationsGet;

    /**
     * Gets the value of the dPersonAcademicPublicationsGet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonAcademicPublicationsGet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonAcademicPublicationsGet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonAcademicPublicationsGet }
     * 
     * 
     */
    public List<DPersonAcademicPublicationsGet> getDPersonAcademicPublicationsGet() {
        if (dPersonAcademicPublicationsGet == null) {
            dPersonAcademicPublicationsGet = new ArrayList<DPersonAcademicPublicationsGet>();
        }
        return this.dPersonAcademicPublicationsGet;
    }

}
