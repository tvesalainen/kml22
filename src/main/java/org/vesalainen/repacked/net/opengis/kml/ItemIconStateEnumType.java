//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.19 at 11:15:43 AM EEST 
//


package org.vesalainen.repacked.net.opengis.kml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemIconStateEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="itemIconStateEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="open"/&gt;
 *     &lt;enumeration value="closed"/&gt;
 *     &lt;enumeration value="error"/&gt;
 *     &lt;enumeration value="fetching0"/&gt;
 *     &lt;enumeration value="fetching1"/&gt;
 *     &lt;enumeration value="fetching2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "itemIconStateEnumType")
@XmlEnum
public enum ItemIconStateEnumType {

    @XmlEnumValue("open")
    OPEN("open"),
    @XmlEnumValue("closed")
    CLOSED("closed"),
    @XmlEnumValue("error")
    ERROR("error"),
    @XmlEnumValue("fetching0")
    FETCHING_0("fetching0"),
    @XmlEnumValue("fetching1")
    FETCHING_1("fetching1"),
    @XmlEnumValue("fetching2")
    FETCHING_2("fetching2");
    private final String value;

    ItemIconStateEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemIconStateEnumType fromValue(String v) {
        for (ItemIconStateEnumType c: ItemIconStateEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
