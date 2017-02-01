

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.CompareIgnore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FavoriteItems", propOrder = {
    "disabled",
    "order"
})
@CompareIgnore
public class FavoriteItems  {

    @XmlElement(name = "Disabled")
    protected List<String> disabled;
    @XmlElement(name = "Order")
    protected List<String> order;

    /**ArrayList is required for the XML-Marshalling */
    public void setDisabled(ArrayList<String> value) {
        disabled=value;
    }

    public List<String> getDisabled() {
        if (disabled == null) {
            disabled = new ArrayList<String>();
        }
        return this.disabled;
    }

    /**ArrayList is required for the XML-Marshalling */
    public void setOrder(ArrayList<String> value) {
        order=value;
    }

    public List<String> getOrder() {
        if (order == null) {
            order = new ArrayList<String>();
        }
        return this.order;
    }



}
