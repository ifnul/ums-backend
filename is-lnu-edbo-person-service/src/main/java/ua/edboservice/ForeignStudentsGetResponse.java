
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ForeignStudentsGetResult" type="{http://edboservice.ua/}ArrayOfDForeignStudents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "foreignStudentsGetResult"
})
@XmlRootElement(name = "ForeignStudentsGetResponse")
public class ForeignStudentsGetResponse {

    @XmlElement(name = "ForeignStudentsGetResult")
    protected ArrayOfDForeignStudents foreignStudentsGetResult;

    /**
     * Gets the value of the foreignStudentsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDForeignStudents }
     *     
     */
    public ArrayOfDForeignStudents getForeignStudentsGetResult() {
        return foreignStudentsGetResult;
    }

    /**
     * Sets the value of the foreignStudentsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDForeignStudents }
     *     
     */
    public void setForeignStudentsGetResult(ArrayOfDForeignStudents value) {
        this.foreignStudentsGetResult = value;
    }

}
