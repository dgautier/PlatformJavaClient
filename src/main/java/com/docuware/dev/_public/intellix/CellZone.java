

package com.docuware.dev._public.intellix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellZone", propOrder = {
    "textZone"
})
public class CellZone
    extends RectangleBase
 {

    @XmlElement(name = "TextZone")
    protected TextZone textZone;

    public TextZone getTextZone() {
        return textZone;
    }

    public void setTextZone(TextZone value) {
        this.textZone = value;
    }



}
