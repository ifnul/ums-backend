
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
 *         &lt;element name="ForeignStudentsOrderGetResult" type="{http://edboservice.ua/}ArrayOfDForeignStudentsOrder" minOccurs="0"/>
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
    "foreignStudentsOrderGetResult"
})
@XmlRootElement(name = "ForeignStudentsOrderGetResponse")
public class ForeignStudentsOrderGetResponse {

    @XmlElement(name = "ForeignStudentsOrderGetResult")
    protected ArrayOfDForeignStudentsOrder foreignStudentsOrderGetResult;

    /**
     * Gets the value of the foreignStudentsOrderGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDForeignStudentsOrder }
     *     
     */
    public ArrayOfDForeignStudentsOrder getForeignStudentsOrderGetResult() {
        return foreignStudentsOrderGetResult;
    }

    /**
     * Sets the value of the foreignStudentsOrderGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDForeignStudentsOrder }
     *     
     */
    public void setForeignStudentsOrderGetResult(ArrayOfDForeignStudentsOrder value) {
        this.foreignStudentsOrderGetResult = value;
    }

}
