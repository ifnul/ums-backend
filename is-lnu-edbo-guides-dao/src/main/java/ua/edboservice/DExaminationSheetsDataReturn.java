
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dExaminationSheetsDataReturn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dExaminationSheetsDataReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ret" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ExaminationSheet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dExaminationSheetsDataReturn", propOrder = {
    "ret",
    "idExaminationSheet",
    "error"
})
public class DExaminationSheetsDataReturn {

    @XmlElement(name = "Ret")
    protected int ret;
    @XmlElement(name = "Id_ExaminationSheet")
    protected int idExaminationSheet;
    @XmlElement(name = "Error")
    protected String error;

    /**
     * Gets the value of the ret property.
     * 
     */
    public int getRet() {
        return ret;
    }

    /**
     * Sets the value of the ret property.
     * 
     */
    public void setRet(int value) {
        this.ret = value;
    }

    /**
     * Gets the value of the idExaminationSheet property.
     * 
     */
    public int getIdExaminationSheet() {
        return idExaminationSheet;
    }

    /**
     * Sets the value of the idExaminationSheet property.
     * 
     */
    public void setIdExaminationSheet(int value) {
        this.idExaminationSheet = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

}
