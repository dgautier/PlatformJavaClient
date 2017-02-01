

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "FileCabinetFieldScope")
@XmlEnum
public enum FileCabinetFieldScope {


    @XmlEnumValue("User")
    USER("User"),

    @XmlEnumValue("System")
    SYSTEM("System");
    private final String value;

    FileCabinetFieldScope(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileCabinetFieldScope fromValue(String v) {
        for (FileCabinetFieldScope c: FileCabinetFieldScope.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
