
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonSOAPPhoto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonSOAPPhoto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonSOAPPhoto" type="{http://edboservice.ua/}dPersonSOAPPhoto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonSOAPPhoto", propOrder = {
    "dPersonSOAPPhoto"
})
public class ArrayOfDPersonSOAPPhoto {

    @XmlElement(nillable = true)
    protected List<DPersonSOAPPhoto> dPersonSOAPPhoto;

    /**
     * Gets the value of the dPersonSOAPPhoto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonSOAPPhoto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonSOAPPhoto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonSOAPPhoto }
     * 
     * 
     */
    public List<DPersonSOAPPhoto> getDPersonSOAPPhoto() {
        if (dPersonSOAPPhoto == null) {
            dPersonSOAPPhoto = new ArrayList<DPersonSOAPPhoto>();
        }
        return this.dPersonSOAPPhoto;
    }

}
