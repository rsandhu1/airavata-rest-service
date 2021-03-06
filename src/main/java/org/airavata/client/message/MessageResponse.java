//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.18 at 02:07:40 PM EDT 
//


package org.airavata.client.message;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{}experimentid" minOccurs="0"/>
 *         &lt;element ref="{}status" minOccurs="0"/>
 *         &lt;element ref="{}hostname" minOccurs="0"/>
 *         &lt;element ref="{}message" minOccurs="0"/>
 *         &lt;element ref="{}outputlocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}stdoutlocation" minOccurs="0"/>
 *         &lt;element ref="{}stderrlocation" minOccurs="0"/>
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
    "experimentid",
    "status",
    "hostname",
    "message",
    "outputlocation",
    "stdoutlocation",
    "stderrlocation"
})
@XmlRootElement(name = "MessageResponse")
public class MessageResponse {

    protected String experimentid;
    protected String status;
    protected String hostname;
    protected String message;
    protected List<String> outputlocation;
    protected String stdoutlocation;
    protected String stderrlocation;

    /**
     * Gets the value of the experimentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperimentid() {
        return experimentid;
    }

    /**
     * Sets the value of the experimentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperimentid(String value) {
        this.experimentid = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the hostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostname(String value) {
        this.hostname = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the outputlocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputlocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputlocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOutputlocation() {
        if (outputlocation == null) {
            outputlocation = new ArrayList<String>();
        }
        return this.outputlocation;
    }

    /**
     * Gets the value of the stdoutlocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdoutlocation() {
        return stdoutlocation;
    }

    /**
     * Sets the value of the stdoutlocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdoutlocation(String value) {
        this.stdoutlocation = value;
    }

    /**
     * Gets the value of the stderrlocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStderrlocation() {
        return stderrlocation;
    }

    /**
     * Sets the value of the stderrlocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStderrlocation(String value) {
        this.stderrlocation = value;
    }

}
