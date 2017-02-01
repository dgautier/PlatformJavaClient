

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceRequest")
public class SequenceRequest  {

    @XmlAttribute(name = "SequenceId", required = true)
    protected String sequenceId;

    /**The global unique identifier of the sequence.*/
    public String getSequenceId() {
        return sequenceId;
    }

    /**The global unique identifier of the sequence.*/
    public void setSequenceId(String value) {
        this.sequenceId = value;
    }



}
