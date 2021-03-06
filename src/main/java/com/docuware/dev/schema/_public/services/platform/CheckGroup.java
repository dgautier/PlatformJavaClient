

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckGroup", propOrder = {
    "options"
})
public class CheckGroup
    extends WebFormField
 {

    @XmlElement(name = "Options", required = true)
    protected WebFormOptions options;

    public WebFormOptions getOptions() {
        return options;
    }

    public void setOptions(WebFormOptions value) {
        this.options = value;
    }



}
