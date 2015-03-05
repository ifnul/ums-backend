
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
 *         &lt;element name="UniversityFacultetEdit2Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityFacultetEdit2Result"
})
@XmlRootElement(name = "UniversityFacultetEdit2Response")
public class UniversityFacultetEdit2Response {

    @XmlElement(name = "UniversityFacultetEdit2Result")
    protected int universityFacultetEdit2Result;

    /**
     * Gets the value of the universityFacultetEdit2Result property.
     * 
     */
    public int getUniversityFacultetEdit2Result() {
        return universityFacultetEdit2Result;
    }

    /**
     * Sets the value of the universityFacultetEdit2Result property.
     * 
     */
    public void setUniversityFacultetEdit2Result(int value) {
        this.universityFacultetEdit2Result = value;
    }

}
