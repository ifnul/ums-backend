
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dDeliveryOfDocumentsErrors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dDeliveryOfDocumentsErrors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_DeliveryOfDocuments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DataCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DataErrorCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dDeliveryOfDocumentsErrors", propOrder = {
    "idDeliveryOfDocuments",
    "dataCount",
    "dataErrorCount"
})
public class DDeliveryOfDocumentsErrors {

    @XmlElement(name = "Id_DeliveryOfDocuments")
    protected int idDeliveryOfDocuments;
    @XmlElement(name = "DataCount")
    protected int dataCount;
    @XmlElement(name = "DataErrorCount")
    protected int dataErrorCount;

    /**
     * Gets the value of the idDeliveryOfDocuments property.
     * 
     */
    public int getIdDeliveryOfDocuments() {
        return idDeliveryOfDocuments;
    }

    /**
     * Sets the value of the idDeliveryOfDocuments property.
     * 
     */
    public void setIdDeliveryOfDocuments(int value) {
        this.idDeliveryOfDocuments = value;
    }

    /**
     * Gets the value of the dataCount property.
     * 
     */
    public int getDataCount() {
        return dataCount;
    }

    /**
     * Sets the value of the dataCount property.
     * 
     */
    public void setDataCount(int value) {
        this.dataCount = value;
    }

    /**
     * Gets the value of the dataErrorCount property.
     * 
     */
    public int getDataErrorCount() {
        return dataErrorCount;
    }

    /**
     * Sets the value of the dataErrorCount property.
     * 
     */
    public void setDataErrorCount(int value) {
        this.dataErrorCount = value;
    }

}
