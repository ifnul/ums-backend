
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
 *         &lt;element name="ExaminationSheetsEdit2Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "examinationSheetsEdit2Result"
})
@XmlRootElement(name = "ExaminationSheetsEdit2Response")
public class ExaminationSheetsEdit2Response {

    @XmlElement(name = "ExaminationSheetsEdit2Result")
    protected int examinationSheetsEdit2Result;

    /**
     * Gets the value of the examinationSheetsEdit2Result property.
     * 
     */
    public int getExaminationSheetsEdit2Result() {
        return examinationSheetsEdit2Result;
    }

    /**
     * Sets the value of the examinationSheetsEdit2Result property.
     * 
     */
    public void setExaminationSheetsEdit2Result(int value) {
        this.examinationSheetsEdit2Result = value;
    }

}
