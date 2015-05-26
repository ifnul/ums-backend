
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
 *         &lt;element name="Id_UniversityFacultet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Block" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BlockDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idUniversityFacultet",
    "block",
    "blockDescription"
})
@XmlRootElement(name = "UniversityFacultetsBlockChange")
public class UniversityFacultetsBlockChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversityFacultet")
    protected int idUniversityFacultet;
    @XmlElement(name = "Block")
    protected int block;
    @XmlElement(name = "BlockDescription")
    protected String blockDescription;

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
     * Gets the value of the idUniversityFacultet property.
     * 
     */
    public int getIdUniversityFacultet() {
        return idUniversityFacultet;
    }

    /**
     * Sets the value of the idUniversityFacultet property.
     * 
     */
    public void setIdUniversityFacultet(int value) {
        this.idUniversityFacultet = value;
    }

    /**
     * Gets the value of the block property.
     * 
     */
    public int getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     */
    public void setBlock(int value) {
        this.block = value;
    }

    /**
     * Gets the value of the blockDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockDescription() {
        return blockDescription;
    }

    /**
     * Sets the value of the blockDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockDescription(String value) {
        this.blockDescription = value;
    }

}
