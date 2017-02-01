

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "SelectListType")
@XmlEnum
public enum SelectListType {


    @XmlEnumValue("Standard")
    STANDARD("Standard"),

    @XmlEnumValue("Multifield")
    MULTIFIELD("Multifield");
    private final String value;

    SelectListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SelectListType fromValue(String v) {
        for (SelectListType c: SelectListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
