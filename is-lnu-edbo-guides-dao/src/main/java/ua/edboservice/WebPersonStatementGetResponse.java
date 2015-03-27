
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
 *         &lt;element name="WebPersonStatementGetResult" type="{http://edboservice.ua/}ArrayOfDWebPersonStatement" minOccurs="0"/>
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
    "webPersonStatementGetResult"
})
@XmlRootElement(name = "WebPersonStatementGetResponse")
public class WebPersonStatementGetResponse {

    @XmlElement(name = "WebPersonStatementGetResult")
    protected ArrayOfDWebPersonStatement webPersonStatementGetResult;

    /**
     * Gets the value of the webPersonStatementGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDWebPersonStatement }
     *     
     */
    public ArrayOfDWebPersonStatement getWebPersonStatementGetResult() {
        return webPersonStatementGetResult;
    }

    /**
     * Sets the value of the webPersonStatementGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDWebPersonStatement }
     *     
     */
    public void setWebPersonStatementGetResult(ArrayOfDWebPersonStatement value) {
        this.webPersonStatementGetResult = value;
    }

}
