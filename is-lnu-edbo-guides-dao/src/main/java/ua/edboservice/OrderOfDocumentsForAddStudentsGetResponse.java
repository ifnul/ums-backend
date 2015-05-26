
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
 *         &lt;element name="OrderOfDocumentsForAddStudentsGetResult" type="{http://edboservice.ua/}ArrayOfDOrderOfDocumentsForAddStudents" minOccurs="0"/>
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
    "orderOfDocumentsForAddStudentsGetResult"
})
@XmlRootElement(name = "OrderOfDocumentsForAddStudentsGetResponse")
public class OrderOfDocumentsForAddStudentsGetResponse {

    @XmlElement(name = "OrderOfDocumentsForAddStudentsGetResult")
    protected ArrayOfDOrderOfDocumentsForAddStudents orderOfDocumentsForAddStudentsGetResult;

    /**
     * Gets the value of the orderOfDocumentsForAddStudentsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOrderOfDocumentsForAddStudents }
     *     
     */
    public ArrayOfDOrderOfDocumentsForAddStudents getOrderOfDocumentsForAddStudentsGetResult() {
        return orderOfDocumentsForAddStudentsGetResult;
    }

    /**
     * Sets the value of the orderOfDocumentsForAddStudentsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOrderOfDocumentsForAddStudents }
     *     
     */
    public void setOrderOfDocumentsForAddStudentsGetResult(ArrayOfDOrderOfDocumentsForAddStudents value) {
        this.orderOfDocumentsForAddStudentsGetResult = value;
    }

}
