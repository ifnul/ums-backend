
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
 *         &lt;element name="RisksDatasCorrectResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "risksDatasCorrectResult"
})
@XmlRootElement(name = "RisksDatasCorrectResponse")
public class RisksDatasCorrectResponse {

    @XmlElement(name = "RisksDatasCorrectResult")
    protected int risksDatasCorrectResult;

    /**
     * Gets the value of the risksDatasCorrectResult property.
     * 
     */
    public int getRisksDatasCorrectResult() {
        return risksDatasCorrectResult;
    }

    /**
     * Sets the value of the risksDatasCorrectResult property.
     * 
     */
    public void setRisksDatasCorrectResult(int value) {
        this.risksDatasCorrectResult = value;
    }

}
