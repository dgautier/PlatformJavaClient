

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.CompareIgnore;
import com.docuware.dev.Extensions.Eagle;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiFCSearches", propOrder = {
    "configurations"
})
@CompareIgnore
public class MultiFCSearches  {

    @XmlElement(name = "Configurations")
    protected List<MultiFCSearchConfiguration> configurations;
    @XmlAttribute(name = "_ignore_me")
    protected Boolean ignoreMe;

    /**ArrayList is required for the XML-Marshalling */
    public void setConfigurations(ArrayList<MultiFCSearchConfiguration> value) {
        configurations=value;
    }

    @Eagle
    public List<MultiFCSearchConfiguration> getConfigurations() {
        if (configurations == null) {
            configurations = new ArrayList<MultiFCSearchConfiguration>();
        }
        return this.configurations;
    }

    public boolean isIgnoreMe() {
        if (ignoreMe == null) {
            return false;
        } else {
            return ignoreMe;
        }
    }

    public void setIgnoreMe(Boolean value) {
        this.ignoreMe = value;
    }



}
