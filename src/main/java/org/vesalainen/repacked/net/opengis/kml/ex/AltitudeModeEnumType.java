//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.19 at 11:15:43 AM EEST 
//


package org.vesalainen.repacked.net.opengis.kml.ex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for altitudeModeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="altitudeModeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="clampToSeaFloor"/&gt;
 *     &lt;enumeration value="relativeToSeaFloor"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "altitudeModeEnumType")
@XmlEnum
public enum AltitudeModeEnumType {

    @XmlEnumValue("clampToSeaFloor")
    CLAMP_TO_SEA_FLOOR("clampToSeaFloor"),
    @XmlEnumValue("relativeToSeaFloor")
    RELATIVE_TO_SEA_FLOOR("relativeToSeaFloor");
    private final String value;

    AltitudeModeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AltitudeModeEnumType fromValue(String v) {
        for (AltitudeModeEnumType c: AltitudeModeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
