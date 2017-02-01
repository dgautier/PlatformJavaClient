

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Annotation", propOrder = {
    "layer"
})
public class Annotation  {

    @XmlElement(name = "Layer")
    protected List<Layer> layer;

    /**ArrayList is required for the XML-Marshalling */
    public void setLayer(ArrayList<Layer> value) {
        layer=value;
    }

    /**List of layers that contains annotations in a specific layer. Annotation can have up to 5 layers.*/
    public List<Layer> getLayer() {
        if (layer == null) {
            layer = new ArrayList<Layer>();
        }
        return this.layer;
    }



}
