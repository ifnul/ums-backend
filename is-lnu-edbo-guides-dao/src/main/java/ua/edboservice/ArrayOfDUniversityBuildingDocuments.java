
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityBuildingDocuments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityBuildingDocuments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityBuildingDocuments" type="{http://edboservice.ua/}dUniversityBuildingDocuments" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityBuildingDocuments", propOrder = {
    "dUniversityBuildingDocuments"
})
public class ArrayOfDUniversityBuildingDocuments {

    @XmlElement(nillable = true)
    protected List<DUniversityBuildingDocuments> dUniversityBuildingDocuments;

    /**
     * Gets the value of the dUniversityBuildingDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityBuildingDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityBuildingDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityBuildingDocuments }
     * 
     * 
     */
    public List<DUniversityBuildingDocuments> getDUniversityBuildingDocuments() {
        if (dUniversityBuildingDocuments == null) {
            dUniversityBuildingDocuments = new ArrayList<DUniversityBuildingDocuments>();
        }
        return this.dUniversityBuildingDocuments;
    }

}
