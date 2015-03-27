
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonDeleteRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonDeleteRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonDeleteRequest" type="{http://edboservice.ua/}dPersonDeleteRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonDeleteRequest", propOrder = {
    "dPersonDeleteRequest"
})
public class ArrayOfDPersonDeleteRequest {

    @XmlElement(nillable = true)
    protected List<DPersonDeleteRequest> dPersonDeleteRequest;

    /**
     * Gets the value of the dPersonDeleteRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonDeleteRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonDeleteRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonDeleteRequest }
     * 
     * 
     */
    public List<DPersonDeleteRequest> getDPersonDeleteRequest() {
        if (dPersonDeleteRequest == null) {
            dPersonDeleteRequest = new ArrayList<DPersonDeleteRequest>();
        }
        return this.dPersonDeleteRequest;
    }

}
