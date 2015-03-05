
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
 *         &lt;element name="SessionGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_23nkmain" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p12_A" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="p12_B" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="p12_V" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="p12_1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p12_2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p12_3" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "sessionGUID",
    "id23Nkmain",
    "p12A",
    "p12B",
    "p12V",
    "p121",
    "p122",
    "p123"
})
@XmlRootElement(name = "m23nkAdd_12")
public class M23NkAdd12 {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_23nkmain")
    protected int id23Nkmain;
    @XmlElement(name = "p12_A")
    protected String p12A;
    @XmlElement(name = "p12_B")
    protected String p12B;
    @XmlElement(name = "p12_V")
    protected String p12V;
    @XmlElement(name = "p12_1")
    protected int p121;
    @XmlElement(name = "p12_2")
    protected int p122;
    @XmlElement(name = "p12_3")
    protected int p123;

    /**
     * Gets the value of the sessionGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionGUID() {
        return sessionGUID;
    }

    /**
     * Sets the value of the sessionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionGUID(String value) {
        this.sessionGUID = value;
    }

    /**
     * Gets the value of the id23Nkmain property.
     * 
     */
    public int getId23Nkmain() {
        return id23Nkmain;
    }

    /**
     * Sets the value of the id23Nkmain property.
     * 
     */
    public void setId23Nkmain(int value) {
        this.id23Nkmain = value;
    }

    /**
     * Gets the value of the p12A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP12A() {
        return p12A;
    }

    /**
     * Sets the value of the p12A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP12A(String value) {
        this.p12A = value;
    }

    /**
     * Gets the value of the p12B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP12B() {
        return p12B;
    }

    /**
     * Sets the value of the p12B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP12B(String value) {
        this.p12B = value;
    }

    /**
     * Gets the value of the p12V property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP12V() {
        return p12V;
    }

    /**
     * Sets the value of the p12V property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP12V(String value) {
        this.p12V = value;
    }

    /**
     * Gets the value of the p121 property.
     * 
     */
    public int getP121() {
        return p121;
    }

    /**
     * Sets the value of the p121 property.
     * 
     */
    public void setP121(int value) {
        this.p121 = value;
    }

    /**
     * Gets the value of the p122 property.
     * 
     */
    public int getP122() {
        return p122;
    }

    /**
     * Sets the value of the p122 property.
     * 
     */
    public void setP122(int value) {
        this.p122 = value;
    }

    /**
     * Gets the value of the p123 property.
     * 
     */
    public int getP123() {
        return p123;
    }

    /**
     * Sets the value of the p123 property.
     * 
     */
    public void setP123(int value) {
        this.p123 = value;
    }

}
