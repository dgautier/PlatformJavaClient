

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WordSearchResultWordHits", propOrder = {
    "wd"
})
public class WordSearchResultWordHits  {

    @XmlElement(name = "Wd")
    protected List<WordSearchResultWordHit> wd;

    /**ArrayList is required for the XML-Marshalling */
    public void setWd(ArrayList<WordSearchResultWordHit> value) {
        wd=value;
    }

    /**Define a a set of words and locations where they are found*/
    public List<WordSearchResultWordHit> getWd() {
        if (wd == null) {
            wd = new ArrayList<WordSearchResultWordHit>();
        }
        return this.wd;
    }



}
