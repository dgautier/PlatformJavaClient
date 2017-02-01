

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegerList", propOrder = {
    "_int"
})
public class IntegerList  {

    @XmlElement(name = "Int", type = Integer.class)
    protected List<Integer> _int;

    /**ArrayList is required for the XML-Marshalling */
    public void setInt(ArrayList<Integer> value) {
        _int=value;
    }

    /**A list of integers values*/
    public List<Integer> getInt() {
        if (_int == null) {
            _int = new ArrayList<Integer>();
        }
        return this._int;
    }



}
