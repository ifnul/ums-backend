
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tabs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ViewType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Info2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Info3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonInfo", propOrder = {
    "personType",
    "dataType",
    "info",
    "universityKode",
    "tabs",
    "viewType",
    "info2",
    "info3"
})
public class DPersonInfo {

    @XmlElement(name = "PersonType")
    protected String personType;
    @XmlElement(name = "DataType")
    protected int dataType;
    @XmlElement(name = "Info")
    protected String info;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Tabs")
    protected String tabs;
    @XmlElement(name = "ViewType")
    protected int viewType;
    @XmlElement(name = "Info2")
    protected String info2;
    @XmlElement(name = "Info3")
    protected String info3;

    /**
     * Gets the value of the personType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonType() {
        return personType;
    }

    /**
     * Sets the value of the personType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonType(String value) {
        this.personType = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     */
    public int getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     */
    public void setDataType(int value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo(String value) {
        this.info = value;
    }

    /**
     * Gets the value of the universityKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKode() {
        return universityKode;
    }

    /**
     * Sets the value of the universityKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKode(String value) {
        this.universityKode = value;
    }

    /**
     * Gets the value of the tabs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTabs() {
        return tabs;
    }

    /**
     * Sets the value of the tabs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabs(String value) {
        this.tabs = value;
    }

    /**
     * Gets the value of the viewType property.
     * 
     */
    public int getViewType() {
        return viewType;
    }

    /**
     * Sets the value of the viewType property.
     * 
     */
    public void setViewType(int value) {
        this.viewType = value;
    }

    /**
     * Gets the value of the info2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo2() {
        return info2;
    }

    /**
     * Sets the value of the info2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo2(String value) {
        this.info2 = value;
    }

    /**
     * Gets the value of the info3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo3() {
        return info3;
    }

    /**
     * Sets the value of the info3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo3(String value) {
        this.info3 = value;
    }

}
