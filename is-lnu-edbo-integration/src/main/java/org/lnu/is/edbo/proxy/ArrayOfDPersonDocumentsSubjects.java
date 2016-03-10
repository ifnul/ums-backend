
package org.lnu.is.edbo.proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonDocumentsSubjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonDocumentsSubjects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonDocumentsSubjects" type="{http://edboservice.ua/}dPersonDocumentsSubjects" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonDocumentsSubjects", propOrder = {
    "dPersonDocumentsSubjects"
})
public class ArrayOfDPersonDocumentsSubjects {

    @XmlElement(nillable = true)
    protected List<DPersonDocumentsSubjects> dPersonDocumentsSubjects;

    /**
     * Gets the value of the dPersonDocumentsSubjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonDocumentsSubjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonDocumentsSubjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonDocumentsSubjects }
     * 
     * 
     */
    public List<DPersonDocumentsSubjects> getDPersonDocumentsSubjects() {
        if (dPersonDocumentsSubjects == null) {
            dPersonDocumentsSubjects = new ArrayList<DPersonDocumentsSubjects>();
        }
        return this.dPersonDocumentsSubjects;
    }

}
