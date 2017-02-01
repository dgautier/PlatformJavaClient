

package com.docuware.dev._public.intellix;

import com.docuware.dev.Extensions.Extension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Word")
public class Word
    extends SimpleWord
 {
private boolean boldSpecified;//test

private boolean fontSizeSpecified;//test


    @XmlAttribute(name = "bold")
    protected Boolean bold;
    @XmlAttribute(name = "fontSize")
    protected Integer fontSize;

    public Boolean isBold() {
        return bold;
    }

    public void setBold(Boolean value) {
        this.bold = value;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public void setFontSize(Integer value) {
        this.fontSize = value;
    }

    @Extension
    public boolean isBoldSpecified() {
	return boldSpecified;
    }

    @Extension
    public void setBoldSpecified(boolean boldSpecified) {
	this.boldSpecified = boldSpecified;
    }

    @Extension
    public boolean isFontSizeSpecified() {
	return fontSizeSpecified;
    }

    @Extension
    public void setFontSizeSpecified(boolean fontSizeSpecified) {
	this.fontSizeSpecified = fontSizeSpecified;
    }



}
