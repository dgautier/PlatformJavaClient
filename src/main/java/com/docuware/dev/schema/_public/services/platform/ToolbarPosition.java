

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.CompareIgnore;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ToolbarPosition")
@XmlEnum
@CompareIgnore
public enum ToolbarPosition {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Left")
    LEFT("Left"),
    @XmlEnumValue("Right")
    RIGHT("Right");
    private final String value;

    ToolbarPosition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ToolbarPosition fromValue(String v) {
        for (ToolbarPosition c: ToolbarPosition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
