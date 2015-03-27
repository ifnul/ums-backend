
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonPersonDegreiesGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonPersonDegreiesGet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonPersonDegreiesGet" type="{http://edboservice.ua/}dPersonPersonDegreiesGet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonPersonDegreiesGet", propOrder = {
    "dPersonPersonDegreiesGet"
})
public class ArrayOfDPersonPersonDegreiesGet {

    @XmlElement(nillable = true)
    protected List<DPersonPersonDegreiesGet> dPersonPersonDegreiesGet;

    /**
     * Gets the value of the dPersonPersonDegreiesGet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonPersonDegreiesGet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonPersonDegreiesGet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonPersonDegreiesGet }
     * 
     * 
     */
    public List<DPersonPersonDegreiesGet> getDPersonPersonDegreiesGet() {
        if (dPersonPersonDegreiesGet == null) {
            dPersonPersonDegreiesGet = new ArrayList<DPersonPersonDegreiesGet>();
        }
        return this.dPersonPersonDegreiesGet;
    }

}
