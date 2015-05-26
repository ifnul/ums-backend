
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
 *         &lt;element name="GraduatesKnowledgeGetResult" type="{http://edboservice.ua/}ArrayOfDGraduatesKnowledge" minOccurs="0"/>
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
    "graduatesKnowledgeGetResult"
})
@XmlRootElement(name = "GraduatesKnowledgeGetResponse")
public class GraduatesKnowledgeGetResponse {

    @XmlElement(name = "GraduatesKnowledgeGetResult")
    protected ArrayOfDGraduatesKnowledge graduatesKnowledgeGetResult;

    /**
     * Gets the value of the graduatesKnowledgeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDGraduatesKnowledge }
     *     
     */
    public ArrayOfDGraduatesKnowledge getGraduatesKnowledgeGetResult() {
        return graduatesKnowledgeGetResult;
    }

    /**
     * Sets the value of the graduatesKnowledgeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDGraduatesKnowledge }
     *     
     */
    public void setGraduatesKnowledgeGetResult(ArrayOfDGraduatesKnowledge value) {
        this.graduatesKnowledgeGetResult = value;
    }

}
