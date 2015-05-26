
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
 *         &lt;element name="UniversityImportDocGenerateResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityImportDocGenerateResult"
})
@XmlRootElement(name = "UniversityImportDocGenerateResponse")
public class UniversityImportDocGenerateResponse {

    @XmlElement(name = "UniversityImportDocGenerateResult")
    protected int universityImportDocGenerateResult;

    /**
     * Gets the value of the universityImportDocGenerateResult property.
     * 
     */
    public int getUniversityImportDocGenerateResult() {
        return universityImportDocGenerateResult;
    }

    /**
     * Sets the value of the universityImportDocGenerateResult property.
     * 
     */
    public void setUniversityImportDocGenerateResult(int value) {
        this.universityImportDocGenerateResult = value;
    }

}
