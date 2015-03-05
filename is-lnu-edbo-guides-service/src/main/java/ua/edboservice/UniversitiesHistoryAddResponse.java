
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
 *         &lt;element name="UniversitiesHistoryAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universitiesHistoryAddResult"
})
@XmlRootElement(name = "UniversitiesHistoryAddResponse")
public class UniversitiesHistoryAddResponse {

    @XmlElement(name = "UniversitiesHistoryAddResult")
    protected int universitiesHistoryAddResult;

    /**
     * Gets the value of the universitiesHistoryAddResult property.
     * 
     */
    public int getUniversitiesHistoryAddResult() {
        return universitiesHistoryAddResult;
    }

    /**
     * Sets the value of the universitiesHistoryAddResult property.
     * 
     */
    public void setUniversitiesHistoryAddResult(int value) {
        this.universitiesHistoryAddResult = value;
    }

}
