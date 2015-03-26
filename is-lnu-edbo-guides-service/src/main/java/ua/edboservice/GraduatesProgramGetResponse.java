
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
 *         &lt;element name="GraduatesProgramGetResult" type="{http://edboservice.ua/}ArrayOfDGraduatesProgram" minOccurs="0"/>
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
    "graduatesProgramGetResult"
})
@XmlRootElement(name = "GraduatesProgramGetResponse")
public class GraduatesProgramGetResponse {

    @XmlElement(name = "GraduatesProgramGetResult")
    protected ArrayOfDGraduatesProgram graduatesProgramGetResult;

    /**
     * Gets the value of the graduatesProgramGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDGraduatesProgram }
     *     
     */
    public ArrayOfDGraduatesProgram getGraduatesProgramGetResult() {
        return graduatesProgramGetResult;
    }

    /**
     * Sets the value of the graduatesProgramGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDGraduatesProgram }
     *     
     */
    public void setGraduatesProgramGetResult(ArrayOfDGraduatesProgram value) {
        this.graduatesProgramGetResult = value;
    }

}
