
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityOrderRequestsDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityOrderRequestsDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityOrderRequestsDataType" type="{http://edboservice.ua/}dUniversityOrderRequestsDataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityOrderRequestsDataType", propOrder = {
    "dUniversityOrderRequestsDataType"
})
public class ArrayOfDUniversityOrderRequestsDataType {

    @XmlElement(nillable = true)
    protected List<DUniversityOrderRequestsDataType> dUniversityOrderRequestsDataType;

    /**
     * Gets the value of the dUniversityOrderRequestsDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityOrderRequestsDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityOrderRequestsDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityOrderRequestsDataType }
     * 
     * 
     */
    public List<DUniversityOrderRequestsDataType> getDUniversityOrderRequestsDataType() {
        if (dUniversityOrderRequestsDataType == null) {
            dUniversityOrderRequestsDataType = new ArrayList<DUniversityOrderRequestsDataType>();
        }
        return this.dUniversityOrderRequestsDataType;
    }

}
