
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAlertsClientCount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAlertsClientCount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NewMessage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AllActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SumPopered" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SumUwaga" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SumPovid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAlertsClientCount", propOrder = {
    "newMessage",
    "allActive",
    "sumPopered",
    "sumUwaga",
    "sumPovid"
})
public class DAlertsClientCount {

    @XmlElement(name = "NewMessage")
    protected int newMessage;
    @XmlElement(name = "AllActive")
    protected int allActive;
    @XmlElement(name = "SumPopered")
    protected int sumPopered;
    @XmlElement(name = "SumUwaga")
    protected int sumUwaga;
    @XmlElement(name = "SumPovid")
    protected int sumPovid;

    /**
     * Gets the value of the newMessage property.
     * 
     */
    public int getNewMessage() {
        return newMessage;
    }

    /**
     * Sets the value of the newMessage property.
     * 
     */
    public void setNewMessage(int value) {
        this.newMessage = value;
    }

    /**
     * Gets the value of the allActive property.
     * 
     */
    public int getAllActive() {
        return allActive;
    }

    /**
     * Sets the value of the allActive property.
     * 
     */
    public void setAllActive(int value) {
        this.allActive = value;
    }

    /**
     * Gets the value of the sumPopered property.
     * 
     */
    public int getSumPopered() {
        return sumPopered;
    }

    /**
     * Sets the value of the sumPopered property.
     * 
     */
    public void setSumPopered(int value) {
        this.sumPopered = value;
    }

    /**
     * Gets the value of the sumUwaga property.
     * 
     */
    public int getSumUwaga() {
        return sumUwaga;
    }

    /**
     * Sets the value of the sumUwaga property.
     * 
     */
    public void setSumUwaga(int value) {
        this.sumUwaga = value;
    }

    /**
     * Gets the value of the sumPovid property.
     * 
     */
    public int getSumPovid() {
        return sumPovid;
    }

    /**
     * Sets the value of the sumPovid property.
     * 
     */
    public void setSumPovid(int value) {
        this.sumPovid = value;
    }

}
