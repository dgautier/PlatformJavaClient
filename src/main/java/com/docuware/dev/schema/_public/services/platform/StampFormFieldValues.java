

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StampFormFieldValues", propOrder = {
    "field"
})
public class StampFormFieldValues  {

    @XmlElement(name = "Field")
    protected List<FormFieldValue> field;
    @XmlAttribute(name = "StampId")
    @XmlSchemaType(name = "anySimpleType")
    protected String stampId;

    /**ArrayList is required for the XML-Marshalling */
    public void setField(ArrayList<FormFieldValue> value) {
        field=value;
    }

    /**The form field values which are applied when placing the stamp.*/
    public List<FormFieldValue> getField() {
        if (field == null) {
            field = new ArrayList<FormFieldValue>();
        }
        return this.field;
    }

    /**The Id of the stamp to place.*/
    public String getStampId() {
        return stampId;
    }

    /**The Id of the stamp to place.*/
    public void setStampId(String value) {
        this.stampId = value;
    }



}
