

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldMappings", propOrder = {
    "mapping"
})
public class FieldMappings  {

    @XmlElement(name = "Mapping")
    protected List<FieldMapping> mapping;

    /**ArrayList is required for the XML-Marshalling */
    public void setMapping(ArrayList<FieldMapping> value) {
        mapping=value;
    }

    /**Gets or sets field mappings.*/
    public List<FieldMapping> getMapping() {
        if (mapping == null) {
            mapping = new ArrayList<FieldMapping>();
        }
        return this.mapping;
    }



}
