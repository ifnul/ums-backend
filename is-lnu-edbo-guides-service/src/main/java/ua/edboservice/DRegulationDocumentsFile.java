
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dRegulationDocumentsFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dRegulationDocumentsFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_RegulationDocumentFormat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentFormatCodes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentFormatName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentBase64String" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dRegulationDocumentsFile", propOrder = {
    "idRegulationDocumentFormat",
    "regulationDocumentFormatCodes",
    "regulationDocumentFormatName",
    "regulationDocumentBase64String"
})
public class DRegulationDocumentsFile {

    @XmlElement(name = "Id_RegulationDocumentFormat")
    protected int idRegulationDocumentFormat;
    @XmlElement(name = "RegulationDocumentFormatCodes")
    protected String regulationDocumentFormatCodes;
    @XmlElement(name = "RegulationDocumentFormatName")
    protected String regulationDocumentFormatName;
    @XmlElement(name = "RegulationDocumentBase64String")
    protected String regulationDocumentBase64String;

    /**
     * Gets the value of the idRegulationDocumentFormat property.
     * 
     */
    public int getIdRegulationDocumentFormat() {
        return idRegulationDocumentFormat;
    }

    /**
     * Sets the value of the idRegulationDocumentFormat property.
     * 
     */
    public void setIdRegulationDocumentFormat(int value) {
        this.idRegulationDocumentFormat = value;
    }

    /**
     * Gets the value of the regulationDocumentFormatCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentFormatCodes() {
        return regulationDocumentFormatCodes;
    }

    /**
     * Sets the value of the regulationDocumentFormatCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentFormatCodes(String value) {
        this.regulationDocumentFormatCodes = value;
    }

    /**
     * Gets the value of the regulationDocumentFormatName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentFormatName() {
        return regulationDocumentFormatName;
    }

    /**
     * Sets the value of the regulationDocumentFormatName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentFormatName(String value) {
        this.regulationDocumentFormatName = value;
    }

    /**
     * Gets the value of the regulationDocumentBase64String property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentBase64String() {
        return regulationDocumentBase64String;
    }

    /**
     * Sets the value of the regulationDocumentBase64String property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentBase64String(String value) {
        this.regulationDocumentBase64String = value;
    }

}
