

package com.docuware.dev._public.intellix;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Candidate", propOrder = {
    "type",
    "originalValue",
    "foundValue",
    "l",
    "t",
    "w",
    "h",
    "line",
    "index",
    "length",
    "item",
    "foundWithLanguages",
    "correctLanguageTo",
    "impliesCultures"
})
public class Candidate  {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "OriginalValue", required = true)
    protected String originalValue;
    @XmlElement(name = "FoundValue", required = true)
    protected String foundValue;
    @XmlElement(name = "L")
    protected int l;
    @XmlElement(name = "T")
    protected int t;
    @XmlElement(name = "W")
    protected int w;
    @XmlElement(name = "H")
    protected int h;
    @XmlElement(name = "Line")
    protected int line;
    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "Length")
    protected int length;
    @XmlElements({
        @XmlElement(name = "Decimal", type = BigDecimal.class),
        @XmlElement(name = "Date", type = GregorianCalendar.class),
        @XmlElement(name = "Text", type = String.class)
    })
    protected Object item;
    @XmlElement(name = "FoundWithLanguages")
    protected List<String> foundWithLanguages;
    @XmlElement(name = "CorrectLanguageTo")
    protected List<String> correctLanguageTo;
    @XmlElement(name = "ImpliesCultures")
    protected List<String> impliesCultures;

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public String getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(String value) {
        this.originalValue = value;
    }

    public String getFoundValue() {
        return foundValue;
    }

    public void setFoundValue(String value) {
        this.foundValue = value;
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

    public int getLine() {
        return line;
    }

    public void setLine(int value) {
        this.line = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int value) {
        this.index = value;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int value) {
        this.length = value;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object value) {
        this.item = value;
    }

    /**ArrayList is required for the XML-Marshalling */
    public void setFoundWithLanguages(ArrayList<String> value) {
        foundWithLanguages=value;
    }

    public List<String> getFoundWithLanguages() {
        if (foundWithLanguages == null) {
            foundWithLanguages = new ArrayList<String>();
        }
        return this.foundWithLanguages;
    }

    /**ArrayList is required for the XML-Marshalling */
    public void setCorrectLanguageTo(ArrayList<String> value) {
        correctLanguageTo=value;
    }

    public List<String> getCorrectLanguageTo() {
        if (correctLanguageTo == null) {
            correctLanguageTo = new ArrayList<String>();
        }
        return this.correctLanguageTo;
    }

    /**ArrayList is required for the XML-Marshalling */
    public void setImpliesCultures(ArrayList<String> value) {
        impliesCultures=value;
    }

    public List<String> getImpliesCultures() {
        if (impliesCultures == null) {
            impliesCultures = new ArrayList<String>();
        }
        return this.impliesCultures;
    }



}
