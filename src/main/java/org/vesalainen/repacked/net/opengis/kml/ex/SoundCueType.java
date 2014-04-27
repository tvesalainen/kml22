//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.19 at 11:15:43 AM EEST 
//


package org.vesalainen.repacked.net.opengis.kml.ex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoundCueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoundCueType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.google.com/kml/ext/2.2}AbstractTourPrimitiveType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}href" minOccurs="0"/>
 *         &lt;element ref="{http://www.google.com/kml/ext/2.2}delayedStart" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoundCueType", propOrder = {
    "href",
    "delayedStart"
})
public class SoundCueType
    extends AbstractTourPrimitiveType
{

    @XmlElement(namespace = "http://www.opengis.net/kml/2.2")
    protected String href;
    @XmlElement(defaultValue = "0.0")
    protected Double delayedStart;

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the delayedStart property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDelayedStart() {
        return delayedStart;
    }

    /**
     * Sets the value of the delayedStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDelayedStart(Double value) {
        this.delayedStart = value;
    }

}