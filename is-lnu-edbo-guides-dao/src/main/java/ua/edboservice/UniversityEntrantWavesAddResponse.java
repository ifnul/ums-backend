
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
 *         &lt;element name="UniversityEntrantWavesAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityEntrantWavesAddResult"
})
@XmlRootElement(name = "UniversityEntrantWavesAddResponse")
public class UniversityEntrantWavesAddResponse {

    @XmlElement(name = "UniversityEntrantWavesAddResult")
    protected int universityEntrantWavesAddResult;

    /**
     * Gets the value of the universityEntrantWavesAddResult property.
     * 
     */
    public int getUniversityEntrantWavesAddResult() {
        return universityEntrantWavesAddResult;
    }

    /**
     * Sets the value of the universityEntrantWavesAddResult property.
     * 
     */
    public void setUniversityEntrantWavesAddResult(int value) {
        this.universityEntrantWavesAddResult = value;
    }

}
