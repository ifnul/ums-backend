
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dForeignStudentsStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dForeignStudentsStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ForeignStudentsStatusType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ForeignStudentsStatusTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dForeignStudentsStatusType", propOrder = {
    "idForeignStudentsStatusType",
    "foreignStudentsStatusTypeName"
})
public class DForeignStudentsStatusType {

    @XmlElement(name = "Id_ForeignStudentsStatusType")
    protected int idForeignStudentsStatusType;
    @XmlElement(name = "ForeignStudentsStatusTypeName")
    protected String foreignStudentsStatusTypeName;

    /**
     * Gets the value of the idForeignStudentsStatusType property.
     * 
     */
    public int getIdForeignStudentsStatusType() {
        return idForeignStudentsStatusType;
    }

    /**
     * Sets the value of the idForeignStudentsStatusType property.
     * 
     */
    public void setIdForeignStudentsStatusType(int value) {
        this.idForeignStudentsStatusType = value;
    }

    /**
     * Gets the value of the foreignStudentsStatusTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignStudentsStatusTypeName() {
        return foreignStudentsStatusTypeName;
    }

    /**
     * Sets the value of the foreignStudentsStatusTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignStudentsStatusTypeName(String value) {
        this.foreignStudentsStatusTypeName = value;
    }

}
