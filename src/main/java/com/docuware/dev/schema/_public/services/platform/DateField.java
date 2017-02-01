

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateField", propOrder = {
    "localValue"
})
public class DateField
    extends WebFormField
 {

    @XmlElement(name = "LocalValue", required = true)
    protected String localValue;

    public String getLocalValue() {
        return localValue;
    }

    public void setLocalValue(String value) {
        this.localValue = value;
    }



}
