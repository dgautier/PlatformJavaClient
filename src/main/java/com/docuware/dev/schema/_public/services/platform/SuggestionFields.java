

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
@XmlType(name = "SuggestionFields", propOrder = {
    "field"
})
public class SuggestionFields  {

    @XmlElement(name = "Field")
    protected List<SuggestionField> field;

    /**ArrayList is required for the XML-Marshalling */
    public void setField(ArrayList<SuggestionField> value) {
        field=value;
    }

    public List<SuggestionField> getField() {
        if (field == null) {
            field = new ArrayList<SuggestionField>();
        }
        return this.field;
    }



}
