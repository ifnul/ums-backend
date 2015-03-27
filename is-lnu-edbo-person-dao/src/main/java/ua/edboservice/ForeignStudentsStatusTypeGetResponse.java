
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
 *         &lt;element name="ForeignStudentsStatusTypeGetResult" type="{http://edboservice.ua/}ArrayOfDForeignStudentsStatusType" minOccurs="0"/>
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
    "foreignStudentsStatusTypeGetResult"
})
@XmlRootElement(name = "ForeignStudentsStatusTypeGetResponse")
public class ForeignStudentsStatusTypeGetResponse {

    @XmlElement(name = "ForeignStudentsStatusTypeGetResult")
    protected ArrayOfDForeignStudentsStatusType foreignStudentsStatusTypeGetResult;

    /**
     * Gets the value of the foreignStudentsStatusTypeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDForeignStudentsStatusType }
     *     
     */
    public ArrayOfDForeignStudentsStatusType getForeignStudentsStatusTypeGetResult() {
        return foreignStudentsStatusTypeGetResult;
    }

    /**
     * Sets the value of the foreignStudentsStatusTypeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDForeignStudentsStatusType }
     *     
     */
    public void setForeignStudentsStatusTypeGetResult(ArrayOfDForeignStudentsStatusType value) {
        this.foreignStudentsStatusTypeGetResult = value;
    }

}
