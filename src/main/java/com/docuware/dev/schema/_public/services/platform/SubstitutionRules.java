

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.CompareIgnore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstitutionRules", propOrder = {
    "item"
})
@CompareIgnore
public class SubstitutionRules  {

    @XmlElement(name = "Item")
    protected List<SubstitutionRule> item;

    /**ArrayList is required for the XML-Marshalling */
    public void setItem(ArrayList<SubstitutionRule> value) {
        item=value;
    }

    public List<SubstitutionRule> getItem() {
        if (item == null) {
            item = new ArrayList<SubstitutionRule>();
        }
        return this.item;
    }



}
