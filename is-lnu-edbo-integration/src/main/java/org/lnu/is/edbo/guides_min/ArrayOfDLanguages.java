
package org.lnu.is.edbo.guides_min;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDLanguages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDLanguages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dLanguages" type="{http://edboservice.ua/}dLanguages" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDLanguages", propOrder = {
    "dLanguages"
})
public class ArrayOfDLanguages {

    @XmlElement(nillable = true)
    protected List<DLanguages> dLanguages;

    /**
     * Gets the value of the dLanguages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dLanguages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DLanguages }
     * 
     * 
     */
    public List<DLanguages> getDLanguages() {
        if (dLanguages == null) {
            dLanguages = new ArrayList<DLanguages>();
        }
        return this.dLanguages;
    }

}
