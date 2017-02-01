

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "IntellixTrust")
@XmlEnum
public enum IntellixTrust {


    @XmlEnumValue("None")
    NONE("None"),

    @XmlEnumValue("Failed")
    FAILED("Failed"),

    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),

    @XmlEnumValue("Red")
    RED("Red"),

    @XmlEnumValue("Yellow")
    YELLOW("Yellow"),

    @XmlEnumValue("Green")
    GREEN("Green");
    private final String value;

    IntellixTrust(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IntellixTrust fromValue(String v) {
        for (IntellixTrust c: IntellixTrust.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
