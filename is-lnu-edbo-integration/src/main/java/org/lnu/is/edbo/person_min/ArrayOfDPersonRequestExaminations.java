
package org.lnu.is.edbo.person_min;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonRequestExaminations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonRequestExaminations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonRequestExaminations" type="{http://edboservice.ua/}dPersonRequestExaminations" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonRequestExaminations", propOrder = {
    "dPersonRequestExaminations"
})
public class ArrayOfDPersonRequestExaminations {

    @XmlElement(nillable = true)
    protected List<DPersonRequestExaminations> dPersonRequestExaminations;

    /**
     * Gets the value of the dPersonRequestExaminations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonRequestExaminations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonRequestExaminations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonRequestExaminations }
     * 
     * 
     */
    public List<DPersonRequestExaminations> getDPersonRequestExaminations() {
        if (dPersonRequestExaminations == null) {
            dPersonRequestExaminations = new ArrayList<DPersonRequestExaminations>();
        }
        return this.dPersonRequestExaminations;
    }

}
