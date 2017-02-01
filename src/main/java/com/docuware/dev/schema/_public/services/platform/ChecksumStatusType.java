

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ChecksumStatusType")
@XmlEnum
public enum ChecksumStatusType {


    @XmlEnumValue("NotChecked")
    NOT_CHECKED("NotChecked"),

    @XmlEnumValue("Ok")
    OK("Ok"),

    @XmlEnumValue("NoChecksum")
    NO_CHECKSUM("NoChecksum"),

    @XmlEnumValue("WrongChecksum")
    WRONG_CHECKSUM("WrongChecksum"),

    @XmlEnumValue("FailedToCheck")
    FAILED_TO_CHECK("FailedToCheck");
    private final String value;

    ChecksumStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChecksumStatusType fromValue(String v) {
        for (ChecksumStatusType c: ChecksumStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
