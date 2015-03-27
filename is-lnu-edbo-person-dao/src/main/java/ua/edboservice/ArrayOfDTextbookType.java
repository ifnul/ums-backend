
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDTextbookType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDTextbookType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dTextbookType" type="{http://edboservice.ua/}dTextbookType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDTextbookType", propOrder = {
    "dTextbookType"
})
public class ArrayOfDTextbookType {

    @XmlElement(nillable = true)
    protected List<DTextbookType> dTextbookType;

    /**
     * Gets the value of the dTextbookType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dTextbookType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDTextbookType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTextbookType }
     * 
     * 
     */
    public List<DTextbookType> getDTextbookType() {
        if (dTextbookType == null) {
            dTextbookType = new ArrayList<DTextbookType>();
        }
        return this.dTextbookType;
    }

}
