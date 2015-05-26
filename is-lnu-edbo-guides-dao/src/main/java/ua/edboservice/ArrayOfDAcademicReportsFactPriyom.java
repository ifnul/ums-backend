
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDAcademicReportsFactPriyom complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAcademicReportsFactPriyom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAcademicReportsFactPriyom" type="{http://edboservice.ua/}dAcademicReportsFactPriyom" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAcademicReportsFactPriyom", propOrder = {
    "dAcademicReportsFactPriyom"
})
public class ArrayOfDAcademicReportsFactPriyom {

    @XmlElement(nillable = true)
    protected List<DAcademicReportsFactPriyom> dAcademicReportsFactPriyom;

    /**
     * Gets the value of the dAcademicReportsFactPriyom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAcademicReportsFactPriyom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAcademicReportsFactPriyom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAcademicReportsFactPriyom }
     * 
     * 
     */
    public List<DAcademicReportsFactPriyom> getDAcademicReportsFactPriyom() {
        if (dAcademicReportsFactPriyom == null) {
            dAcademicReportsFactPriyom = new ArrayList<DAcademicReportsFactPriyom>();
        }
        return this.dAcademicReportsFactPriyom;
    }

}
