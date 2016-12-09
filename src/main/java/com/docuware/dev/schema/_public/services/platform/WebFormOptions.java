

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebFormOptions", propOrder = {
    "webFormOption"
})
public class WebFormOptions  {

    @XmlElement(name = "WebFormOption", required = true)
    protected List<WebFormOption> webFormOption;

    /**ArrayList is required for the XML-Marshalling */
    public void setWebFormOption(ArrayList<WebFormOption> value) {
        webFormOption=value;
    }

    public List<WebFormOption> getWebFormOption() {
        if (webFormOption == null) {
            webFormOption = new ArrayList<WebFormOption>();
        }
        return this.webFormOption;
    }



}
