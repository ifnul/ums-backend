
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
 *         &lt;element name="PersonEducationsHistoryLastDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personEducationsHistoryLastDelResult"
})
@XmlRootElement(name = "PersonEducationsHistoryLastDelResponse")
public class PersonEducationsHistoryLastDelResponse {

    @XmlElement(name = "PersonEducationsHistoryLastDelResult")
    protected int personEducationsHistoryLastDelResult;

    /**
     * Gets the value of the personEducationsHistoryLastDelResult property.
     * 
     */
    public int getPersonEducationsHistoryLastDelResult() {
        return personEducationsHistoryLastDelResult;
    }

    /**
     * Sets the value of the personEducationsHistoryLastDelResult property.
     * 
     */
    public void setPersonEducationsHistoryLastDelResult(int value) {
        this.personEducationsHistoryLastDelResult = value;
    }

}
