
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="tUniversityLicensesDataPtnzAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "tUniversityLicensesDataPtnzAddResult"
})
@XmlRootElement(name = "tUniversityLicensesDataPtnzAddResponse")
public class TUniversityLicensesDataPtnzAddResponse {

    protected int tUniversityLicensesDataPtnzAddResult;

    /**
     * Gets the value of the tUniversityLicensesDataPtnzAddResult property.
     * 
     */
    public int getTUniversityLicensesDataPtnzAddResult() {
        return tUniversityLicensesDataPtnzAddResult;
    }

    /**
     * Sets the value of the tUniversityLicensesDataPtnzAddResult property.
     * 
     */
    public void setTUniversityLicensesDataPtnzAddResult(int value) {
        this.tUniversityLicensesDataPtnzAddResult = value;
    }

}
