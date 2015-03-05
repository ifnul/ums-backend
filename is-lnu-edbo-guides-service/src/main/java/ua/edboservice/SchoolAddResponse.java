
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
 *         &lt;element name="SchoolAddResult" type="{http://edboservice.ua/}ArrayOfDSchoolAddRet" minOccurs="0"/>
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
    "schoolAddResult"
})
@XmlRootElement(name = "SchoolAddResponse")
public class SchoolAddResponse {

    @XmlElement(name = "SchoolAddResult")
    protected ArrayOfDSchoolAddRet schoolAddResult;

    /**
     * Gets the value of the schoolAddResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDSchoolAddRet }
     *     
     */
    public ArrayOfDSchoolAddRet getSchoolAddResult() {
        return schoolAddResult;
    }

    /**
     * Sets the value of the schoolAddResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDSchoolAddRet }
     *     
     */
    public void setSchoolAddResult(ArrayOfDSchoolAddRet value) {
        this.schoolAddResult = value;
    }

}
