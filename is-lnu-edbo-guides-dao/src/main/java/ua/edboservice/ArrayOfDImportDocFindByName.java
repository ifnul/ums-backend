
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDImportDocFindByName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDImportDocFindByName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dImportDocFindByName" type="{http://edboservice.ua/}dImportDocFindByName" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDImportDocFindByName", propOrder = {
    "dImportDocFindByName"
})
public class ArrayOfDImportDocFindByName {

    @XmlElement(nillable = true)
    protected List<DImportDocFindByName> dImportDocFindByName;

    /**
     * Gets the value of the dImportDocFindByName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dImportDocFindByName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDImportDocFindByName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DImportDocFindByName }
     * 
     * 
     */
    public List<DImportDocFindByName> getDImportDocFindByName() {
        if (dImportDocFindByName == null) {
            dImportDocFindByName = new ArrayList<DImportDocFindByName>();
        }
        return this.dImportDocFindByName;
    }

}
