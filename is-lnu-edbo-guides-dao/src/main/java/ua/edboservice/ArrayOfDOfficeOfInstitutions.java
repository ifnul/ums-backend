
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDOfficeOfInstitutions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDOfficeOfInstitutions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dOfficeOfInstitutions" type="{http://edboservice.ua/}dOfficeOfInstitutions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDOfficeOfInstitutions", propOrder = {
    "dOfficeOfInstitutions"
})
public class ArrayOfDOfficeOfInstitutions {

    @XmlElement(nillable = true)
    protected List<DOfficeOfInstitutions> dOfficeOfInstitutions;

    /**
     * Gets the value of the dOfficeOfInstitutions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dOfficeOfInstitutions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOfficeOfInstitutions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOfficeOfInstitutions }
     * 
     * 
     */
    public List<DOfficeOfInstitutions> getDOfficeOfInstitutions() {
        if (dOfficeOfInstitutions == null) {
            dOfficeOfInstitutions = new ArrayList<DOfficeOfInstitutions>();
        }
        return this.dOfficeOfInstitutions;
    }

}
