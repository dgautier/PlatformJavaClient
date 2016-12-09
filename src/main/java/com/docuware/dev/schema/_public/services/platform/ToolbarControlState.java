

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ToolbarControlState")
@XmlEnum
@CompareIgnore
public enum ToolbarControlState {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Toggled")
    TOGGLED("Toggled");
    private final String value;

    ToolbarControlState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ToolbarControlState fromValue(String v) {
        for (ToolbarControlState c: ToolbarControlState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
