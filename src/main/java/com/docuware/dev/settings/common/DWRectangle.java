

package com.docuware.dev.settings.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DWRectangle")
public class DWRectangle  {

    @XmlAttribute(name = "Left", required = true)
    protected double left;
    @XmlAttribute(name = "Top", required = true)
    protected double top;
    @XmlAttribute(name = "Width", required = true)
    protected double width;
    @XmlAttribute(name = "Height", required = true)
    protected double height;

    /**The left coordinate of the rectangle.*/
    public double getLeft() {
        return left;
    }

    /**The left coordinate of the rectangle.*/
    public void setLeft(double value) {
        this.left = value;
    }

    /**The top coordinate of the rectangle.*/
    public double getTop() {
        return top;
    }

    /**The top coordinate of the rectangle.*/
    public void setTop(double value) {
        this.top = value;
    }

    /**The width of the rectangle in coordinates.*/
    public double getWidth() {
        return width;
    }

    /**The width of the rectangle in coordinates.*/
    public void setWidth(double value) {
        this.width = value;
    }

    /**The height of the rectangle in coordinates.*/
    public double getHeight() {
        return height;
    }

    /**The height of the rectangle in coordinates.*/
    public void setHeight(double value) {
        this.height = value;
    }



}
