
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonRequestDocumentSubjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonRequestDocumentSubjects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonRequestDocumentSubjects" type="{http://edboservice.ua/}dPersonRequestDocumentSubjects" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonRequestDocumentSubjects", propOrder = {
    "dPersonRequestDocumentSubjects"
})
public class ArrayOfDPersonRequestDocumentSubjects {

    @XmlElement(nillable = true)
    protected List<DPersonRequestDocumentSubjects> dPersonRequestDocumentSubjects;

    /**
     * Gets the value of the dPersonRequestDocumentSubjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonRequestDocumentSubjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonRequestDocumentSubjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonRequestDocumentSubjects }
     * 
     * 
     */
    public List<DPersonRequestDocumentSubjects> getDPersonRequestDocumentSubjects() {
        if (dPersonRequestDocumentSubjects == null) {
            dPersonRequestDocumentSubjects = new ArrayList<DPersonRequestDocumentSubjects>();
        }
        return this.dPersonRequestDocumentSubjects;
    }

}
