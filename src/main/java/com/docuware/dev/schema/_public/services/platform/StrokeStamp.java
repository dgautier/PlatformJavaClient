

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrokeStamp")
public class StrokeStamp  {

    @XmlAttribute(name = "StrokeWidth", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long strokeWidth;
    @XmlAttribute(name = "StrokeColor", required = true)
    protected String strokeColor;

    /**The line weight of the handwritten signature.*/
    public long getStrokeWidth() {
        return strokeWidth;
    }

    /**The line weight of the handwritten signature.*/
    public void setStrokeWidth(long value) {
        this.strokeWidth = value;
    }

    /**Color of the line of the handwritten signature.*/
    public String getStrokeColor() {
        return strokeColor;
    }

    /**Color of the line of the handwritten signature.*/
    public void setStrokeColor(String value) {
        this.strokeColor = value;
    }



}
