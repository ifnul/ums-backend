
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
 *         &lt;element name="UniversityEntrantWavesAdd2Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityEntrantWavesAdd2Result"
})
@XmlRootElement(name = "UniversityEntrantWavesAdd2Response")
public class UniversityEntrantWavesAdd2Response {

    @XmlElement(name = "UniversityEntrantWavesAdd2Result")
    protected int universityEntrantWavesAdd2Result;

    /**
     * Gets the value of the universityEntrantWavesAdd2Result property.
     * 
     */
    public int getUniversityEntrantWavesAdd2Result() {
        return universityEntrantWavesAdd2Result;
    }

    /**
     * Sets the value of the universityEntrantWavesAdd2Result property.
     * 
     */
    public void setUniversityEntrantWavesAdd2Result(int value) {
        this.universityEntrantWavesAdd2Result = value;
    }

}
