
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
 *         &lt;element name="Id_GraduatesData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdditionalIInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalIInfoEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idGraduatesData",
    "additionalIInfo",
    "additionalIInfoEn"
})
@XmlRootElement(name = "GraduatesDataAdditionalInfoEdit")
public class GraduatesDataAdditionalInfoEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_GraduatesData")
    protected int idGraduatesData;
    @XmlElement(name = "AdditionalIInfo")
    protected String additionalIInfo;
    @XmlElement(name = "AdditionalIInfoEn")
    protected String additionalIInfoEn;

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
     * Gets the value of the idGraduatesData property.
     * 
     */
    public int getIdGraduatesData() {
        return idGraduatesData;
    }

    /**
     * Sets the value of the idGraduatesData property.
     * 
     */
    public void setIdGraduatesData(int value) {
        this.idGraduatesData = value;
    }

    /**
     * Gets the value of the additionalIInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalIInfo() {
        return additionalIInfo;
    }

    /**
     * Sets the value of the additionalIInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalIInfo(String value) {
        this.additionalIInfo = value;
    }

    /**
     * Gets the value of the additionalIInfoEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalIInfoEn() {
        return additionalIInfoEn;
    }

    /**
     * Sets the value of the additionalIInfoEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalIInfoEn(String value) {
        this.additionalIInfoEn = value;
    }

}
