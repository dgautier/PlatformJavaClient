

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BitmapStampEntry", propOrder = {
    "pngData"
})
public class BitmapStampEntry
    extends StampBase
 {

    @XmlElement(name = "PngData", required = true)
    protected byte[] pngData;
    @XmlAttribute(name = "DpiX", required = true)
    protected int dpiX;
    @XmlAttribute(name = "DpiY", required = true)
    protected int dpiY;

    /**Base 64 encoded data of the bitmap.*/
    public byte[] getPngData() {
        return pngData;
    }

    /**Base 64 encoded data of the bitmap.*/
    public void setPngData(byte[] value) {
        this.pngData = value;
    }

    /**Horizontal device point per inch of the image.*/
    public int getDpiX() {
        return dpiX;
    }

    /**Horizontal device point per inch of the image.*/
    public void setDpiX(int value) {
        this.dpiX = value;
    }

    /**Vertical device point per inch of the image.*/
    public int getDpiY() {
        return dpiY;
    }

    /**Vertical device point per inch of the image.*/
    public void setDpiY(int value) {
        this.dpiY = value;
    }



}
