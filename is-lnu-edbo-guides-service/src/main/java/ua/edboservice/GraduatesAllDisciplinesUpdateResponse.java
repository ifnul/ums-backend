
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
 *         &lt;element name="GraduatesAllDisciplinesUpdateResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "graduatesAllDisciplinesUpdateResult"
})
@XmlRootElement(name = "GraduatesAllDisciplinesUpdateResponse")
public class GraduatesAllDisciplinesUpdateResponse {

    @XmlElement(name = "GraduatesAllDisciplinesUpdateResult")
    protected int graduatesAllDisciplinesUpdateResult;

    /**
     * Gets the value of the graduatesAllDisciplinesUpdateResult property.
     * 
     */
    public int getGraduatesAllDisciplinesUpdateResult() {
        return graduatesAllDisciplinesUpdateResult;
    }

    /**
     * Sets the value of the graduatesAllDisciplinesUpdateResult property.
     * 
     */
    public void setGraduatesAllDisciplinesUpdateResult(int value) {
        this.graduatesAllDisciplinesUpdateResult = value;
    }

}
