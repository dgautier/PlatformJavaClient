

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.Eagle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentAnnotations", propOrder = {
    "annotations"
})
public class DocumentAnnotations  {

    @XmlElement(name = "Annotations")
    protected List<SectionAnnotation> annotations;

    /**ArrayList is required for the XML-Marshalling */
    public void setAnnotations(ArrayList<SectionAnnotation> value) {
        annotations=value;
    }

    /**List of SectionAnnotation items.*/
    @Eagle
    public List<SectionAnnotation> getAnnotations() {
        if (annotations == null) {
            annotations = new ArrayList<SectionAnnotation>();
        }
        return this.annotations;
    }



}
