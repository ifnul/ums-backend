
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityMemorandums complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityMemorandums">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityMemorandums" type="{http://edboservice.ua/}dUniversityMemorandums" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityMemorandums", propOrder = {
    "dUniversityMemorandums"
})
public class ArrayOfDUniversityMemorandums {

    @XmlElement(nillable = true)
    protected List<DUniversityMemorandums> dUniversityMemorandums;

    /**
     * Gets the value of the dUniversityMemorandums property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityMemorandums property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityMemorandums().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityMemorandums }
     * 
     * 
     */
    public List<DUniversityMemorandums> getDUniversityMemorandums() {
        if (dUniversityMemorandums == null) {
            dUniversityMemorandums = new ArrayList<DUniversityMemorandums>();
        }
        return this.dUniversityMemorandums;
    }

}
