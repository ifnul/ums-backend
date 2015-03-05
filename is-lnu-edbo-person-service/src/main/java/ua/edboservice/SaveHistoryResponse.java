
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
 *         &lt;element name="SaveHistoryResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "saveHistoryResult"
})
@XmlRootElement(name = "SaveHistoryResponse")
public class SaveHistoryResponse {

    @XmlElement(name = "SaveHistoryResult")
    protected int saveHistoryResult;

    /**
     * Gets the value of the saveHistoryResult property.
     * 
     */
    public int getSaveHistoryResult() {
        return saveHistoryResult;
    }

    /**
     * Sets the value of the saveHistoryResult property.
     * 
     */
    public void setSaveHistoryResult(int value) {
        this.saveHistoryResult = value;
    }

}
