
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDForeignStudentsStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDForeignStudentsStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dForeignStudentsStatusType" type="{http://edboservice.ua/}dForeignStudentsStatusType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDForeignStudentsStatusType", propOrder = {
    "dForeignStudentsStatusType"
})
public class ArrayOfDForeignStudentsStatusType {

    @XmlElement(nillable = true)
    protected List<DForeignStudentsStatusType> dForeignStudentsStatusType;

    /**
     * Gets the value of the dForeignStudentsStatusType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dForeignStudentsStatusType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDForeignStudentsStatusType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DForeignStudentsStatusType }
     * 
     * 
     */
    public List<DForeignStudentsStatusType> getDForeignStudentsStatusType() {
        if (dForeignStudentsStatusType == null) {
            dForeignStudentsStatusType = new ArrayList<DForeignStudentsStatusType>();
        }
        return this.dForeignStudentsStatusType;
    }

}
