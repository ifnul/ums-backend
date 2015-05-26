
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dGloabalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dGloabalInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MajorVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MinorVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dGloabalInfo", propOrder = {
    "majorVersion",
    "minorVersion"
})
public class DGloabalInfo {

    @XmlElement(name = "MajorVersion")
    protected int majorVersion;
    @XmlElement(name = "MinorVersion")
    protected int minorVersion;

    /**
     * Gets the value of the majorVersion property.
     * 
     */
    public int getMajorVersion() {
        return majorVersion;
    }

    /**
     * Sets the value of the majorVersion property.
     * 
     */
    public void setMajorVersion(int value) {
        this.majorVersion = value;
    }

    /**
     * Gets the value of the minorVersion property.
     * 
     */
    public int getMinorVersion() {
        return minorVersion;
    }

    /**
     * Sets the value of the minorVersion property.
     * 
     */
    public void setMinorVersion(int value) {
        this.minorVersion = value;
    }

}
