
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
 *         &lt;element name="Id_RegulationDocumentsFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentsFileBase64String" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idRegulationDocumentsFile",
    "regulationDocumentsFileBase64String"
})
@XmlRootElement(name = "RegulationDocumentsFilePagesChane")
public class RegulationDocumentsFilePagesChane {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_RegulationDocumentsFile")
    protected int idRegulationDocumentsFile;
    @XmlElement(name = "RegulationDocumentsFileBase64String")
    protected String regulationDocumentsFileBase64String;

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
     * Gets the value of the idRegulationDocumentsFile property.
     * 
     */
    public int getIdRegulationDocumentsFile() {
        return idRegulationDocumentsFile;
    }

    /**
     * Sets the value of the idRegulationDocumentsFile property.
     * 
     */
    public void setIdRegulationDocumentsFile(int value) {
        this.idRegulationDocumentsFile = value;
    }

    /**
     * Gets the value of the regulationDocumentsFileBase64String property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentsFileBase64String() {
        return regulationDocumentsFileBase64String;
    }

    /**
     * Sets the value of the regulationDocumentsFileBase64String property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentsFileBase64String(String value) {
        this.regulationDocumentsFileBase64String = value;
    }

}
