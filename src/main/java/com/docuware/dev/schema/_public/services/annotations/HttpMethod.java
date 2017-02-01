

package com.docuware.dev.schema._public.services.annotations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "HttpMethod")
@XmlEnum
public enum HttpMethod {

    @XmlEnumValue("Get")
    GET("Get"),
    @XmlEnumValue("Put")
    PUT("Put"),
    @XmlEnumValue("Post")
    POST("Post"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Head")
    HEAD("Head");
    private final String value;

    HttpMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HttpMethod fromValue(String v) {
        for (HttpMethod c: HttpMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
