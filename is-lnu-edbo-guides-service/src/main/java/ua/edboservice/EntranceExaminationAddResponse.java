
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
 *         &lt;element name="EntranceExaminationAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "entranceExaminationAddResult"
})
@XmlRootElement(name = "EntranceExaminationAddResponse")
public class EntranceExaminationAddResponse {

    @XmlElement(name = "EntranceExaminationAddResult")
    protected int entranceExaminationAddResult;

    /**
     * Gets the value of the entranceExaminationAddResult property.
     * 
     */
    public int getEntranceExaminationAddResult() {
        return entranceExaminationAddResult;
    }

    /**
     * Sets the value of the entranceExaminationAddResult property.
     * 
     */
    public void setEntranceExaminationAddResult(int value) {
        this.entranceExaminationAddResult = value;
    }

}
