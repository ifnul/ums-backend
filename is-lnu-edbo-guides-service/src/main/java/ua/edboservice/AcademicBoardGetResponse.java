
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
 *         &lt;element name="AcademicBoardGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicBoard" minOccurs="0"/>
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
    "academicBoardGetResult"
})
@XmlRootElement(name = "AcademicBoardGetResponse")
public class AcademicBoardGetResponse {

    @XmlElement(name = "AcademicBoardGetResult")
    protected ArrayOfDAcademicBoard academicBoardGetResult;

    /**
     * Gets the value of the academicBoardGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicBoard }
     *     
     */
    public ArrayOfDAcademicBoard getAcademicBoardGetResult() {
        return academicBoardGetResult;
    }

    /**
     * Sets the value of the academicBoardGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicBoard }
     *     
     */
    public void setAcademicBoardGetResult(ArrayOfDAcademicBoard value) {
        this.academicBoardGetResult = value;
    }

}
