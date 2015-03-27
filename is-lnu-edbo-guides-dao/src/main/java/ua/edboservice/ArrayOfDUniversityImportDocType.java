
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityImportDocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityImportDocType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityImportDocType" type="{http://edboservice.ua/}dUniversityImportDocType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityImportDocType", propOrder = {
    "dUniversityImportDocType"
})
public class ArrayOfDUniversityImportDocType {

    @XmlElement(nillable = true)
    protected List<DUniversityImportDocType> dUniversityImportDocType;

    /**
     * Gets the value of the dUniversityImportDocType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityImportDocType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityImportDocType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityImportDocType }
     * 
     * 
     */
    public List<DUniversityImportDocType> getDUniversityImportDocType() {
        if (dUniversityImportDocType == null) {
            dUniversityImportDocType = new ArrayList<DUniversityImportDocType>();
        }
        return this.dUniversityImportDocType;
    }

}
