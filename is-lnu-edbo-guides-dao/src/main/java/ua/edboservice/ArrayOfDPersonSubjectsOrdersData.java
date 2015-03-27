
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonSubjectsOrdersData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonSubjectsOrdersData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonSubjectsOrdersData" type="{http://edboservice.ua/}dPersonSubjectsOrdersData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonSubjectsOrdersData", propOrder = {
    "dPersonSubjectsOrdersData"
})
public class ArrayOfDPersonSubjectsOrdersData {

    @XmlElement(nillable = true)
    protected List<DPersonSubjectsOrdersData> dPersonSubjectsOrdersData;

    /**
     * Gets the value of the dPersonSubjectsOrdersData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonSubjectsOrdersData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonSubjectsOrdersData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonSubjectsOrdersData }
     * 
     * 
     */
    public List<DPersonSubjectsOrdersData> getDPersonSubjectsOrdersData() {
        if (dPersonSubjectsOrdersData == null) {
            dPersonSubjectsOrdersData = new ArrayList<DPersonSubjectsOrdersData>();
        }
        return this.dPersonSubjectsOrdersData;
    }

}
