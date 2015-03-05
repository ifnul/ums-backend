
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
 *         &lt;element name="WebBooksAndPublicationsGetResult" type="{http://edboservice.ua/}ArrayOfDWebBooksAndPublications" minOccurs="0"/>
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
    "webBooksAndPublicationsGetResult"
})
@XmlRootElement(name = "WebBooksAndPublicationsGetResponse")
public class WebBooksAndPublicationsGetResponse {

    @XmlElement(name = "WebBooksAndPublicationsGetResult")
    protected ArrayOfDWebBooksAndPublications webBooksAndPublicationsGetResult;

    /**
     * Gets the value of the webBooksAndPublicationsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDWebBooksAndPublications }
     *     
     */
    public ArrayOfDWebBooksAndPublications getWebBooksAndPublicationsGetResult() {
        return webBooksAndPublicationsGetResult;
    }

    /**
     * Sets the value of the webBooksAndPublicationsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDWebBooksAndPublications }
     *     
     */
    public void setWebBooksAndPublicationsGetResult(ArrayOfDWebBooksAndPublications value) {
        this.webBooksAndPublicationsGetResult = value;
    }

}
