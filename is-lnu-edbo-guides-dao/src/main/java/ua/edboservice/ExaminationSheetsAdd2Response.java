
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
 *         &lt;element name="ExaminationSheetsAdd2Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "examinationSheetsAdd2Result"
})
@XmlRootElement(name = "ExaminationSheetsAdd2Response")
public class ExaminationSheetsAdd2Response {

    @XmlElement(name = "ExaminationSheetsAdd2Result")
    protected int examinationSheetsAdd2Result;

    /**
     * Gets the value of the examinationSheetsAdd2Result property.
     * 
     */
    public int getExaminationSheetsAdd2Result() {
        return examinationSheetsAdd2Result;
    }

    /**
     * Sets the value of the examinationSheetsAdd2Result property.
     * 
     */
    public void setExaminationSheetsAdd2Result(int value) {
        this.examinationSheetsAdd2Result = value;
    }

}
