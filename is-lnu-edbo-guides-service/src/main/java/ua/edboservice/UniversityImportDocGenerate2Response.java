
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
 *         &lt;element name="UniversityImportDocGenerate2Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityImportDocGenerate2Result"
})
@XmlRootElement(name = "UniversityImportDocGenerate2Response")
public class UniversityImportDocGenerate2Response {

    @XmlElement(name = "UniversityImportDocGenerate2Result")
    protected int universityImportDocGenerate2Result;

    /**
     * Gets the value of the universityImportDocGenerate2Result property.
     * 
     */
    public int getUniversityImportDocGenerate2Result() {
        return universityImportDocGenerate2Result;
    }

    /**
     * Sets the value of the universityImportDocGenerate2Result property.
     * 
     */
    public void setUniversityImportDocGenerate2Result(int value) {
        this.universityImportDocGenerate2Result = value;
    }

}
