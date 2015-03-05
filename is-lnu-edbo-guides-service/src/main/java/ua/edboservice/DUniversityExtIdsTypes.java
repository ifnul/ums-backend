
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityExtIdsTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityExtIdsTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityExtIdsType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityExtIdsTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityExtIdsTypes", propOrder = {
    "idUniversityExtIdsType",
    "universityExtIdsTypeName"
})
public class DUniversityExtIdsTypes {

    @XmlElement(name = "Id_UniversityExtIdsType")
    protected int idUniversityExtIdsType;
    @XmlElement(name = "UniversityExtIdsTypeName")
    protected String universityExtIdsTypeName;

    /**
     * Gets the value of the idUniversityExtIdsType property.
     * 
     */
    public int getIdUniversityExtIdsType() {
        return idUniversityExtIdsType;
    }

    /**
     * Sets the value of the idUniversityExtIdsType property.
     * 
     */
    public void setIdUniversityExtIdsType(int value) {
        this.idUniversityExtIdsType = value;
    }

    /**
     * Gets the value of the universityExtIdsTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityExtIdsTypeName() {
        return universityExtIdsTypeName;
    }

    /**
     * Sets the value of the universityExtIdsTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityExtIdsTypeName(String value) {
        this.universityExtIdsTypeName = value;
    }

}
