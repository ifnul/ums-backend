
package org.lnu.is.edbo.person_min;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonRequestQuotas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonRequestQuotas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonRequestQuotas" type="{http://edboservice.ua/}dPersonRequestQuotas" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonRequestQuotas", propOrder = {
    "dPersonRequestQuotas"
})
public class ArrayOfDPersonRequestQuotas {

    @XmlElement(nillable = true)
    protected List<DPersonRequestQuotas> dPersonRequestQuotas;

    /**
     * Gets the value of the dPersonRequestQuotas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonRequestQuotas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonRequestQuotas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonRequestQuotas }
     * 
     * 
     */
    public List<DPersonRequestQuotas> getDPersonRequestQuotas() {
        if (dPersonRequestQuotas == null) {
            dPersonRequestQuotas = new ArrayList<DPersonRequestQuotas>();
        }
        return this.dPersonRequestQuotas;
    }

}
