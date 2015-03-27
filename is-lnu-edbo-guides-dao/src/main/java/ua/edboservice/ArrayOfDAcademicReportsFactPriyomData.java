
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDAcademicReportsFactPriyomData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAcademicReportsFactPriyomData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAcademicReportsFactPriyomData" type="{http://edboservice.ua/}dAcademicReportsFactPriyomData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAcademicReportsFactPriyomData", propOrder = {
    "dAcademicReportsFactPriyomData"
})
public class ArrayOfDAcademicReportsFactPriyomData {

    @XmlElement(nillable = true)
    protected List<DAcademicReportsFactPriyomData> dAcademicReportsFactPriyomData;

    /**
     * Gets the value of the dAcademicReportsFactPriyomData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAcademicReportsFactPriyomData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAcademicReportsFactPriyomData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAcademicReportsFactPriyomData }
     * 
     * 
     */
    public List<DAcademicReportsFactPriyomData> getDAcademicReportsFactPriyomData() {
        if (dAcademicReportsFactPriyomData == null) {
            dAcademicReportsFactPriyomData = new ArrayList<DAcademicReportsFactPriyomData>();
        }
        return this.dAcademicReportsFactPriyomData;
    }

}
