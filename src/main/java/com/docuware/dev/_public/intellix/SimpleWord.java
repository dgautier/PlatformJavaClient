

package com.docuware.dev._public.intellix;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleWord", propOrder = {
    "value"
})
@XmlSeeAlso({
    Word.class
})
public class SimpleWord  {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "L", required = true)
    protected int l;
    @XmlAttribute(name = "T", required = true)
    protected int t;
    @XmlAttribute(name = "W", required = true)
    protected int w;
    @XmlAttribute(name = "H", required = true)
    protected int h;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getL() {
        return l;
    }

    public void setL(int value) {
        this.l = value;
    }

    public int getT() {
        return t;
    }

    public void setT(int value) {
        this.t = value;
    }

    public int getW() {
        return w;
    }

    public void setW(int value) {
        this.w = value;
    }

    public int getH() {
        return h;
    }

    public void setH(int value) {
        this.h = value;
    }



}
