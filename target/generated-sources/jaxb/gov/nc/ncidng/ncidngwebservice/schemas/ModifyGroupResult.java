//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.07 at 04:37:11 PM EDT 
//


package gov.nc.ncidng.ncidngwebservice.schemas;

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
 *         &lt;element ref="{http://ncidng.nc.gov/NCIDNGWebService/schemas}MessageArray" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "messageArray",
    "error"
})
@XmlRootElement(name = "modifyGroupResult")
public class ModifyGroupResult {

    @XmlElement(name = "MessageArray")
    protected MessageArray messageArray;
    @XmlElement(name = "Error")
    protected String error;

    /**
     * Gets the value of the messageArray property.
     * 
     * @return
     *     possible object is
     *     {@link MessageArray }
     *     
     */
    public MessageArray getMessageArray() {
        return messageArray;
    }

    /**
     * Sets the value of the messageArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageArray }
     *     
     */
    public void setMessageArray(MessageArray value) {
        this.messageArray = value;
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
