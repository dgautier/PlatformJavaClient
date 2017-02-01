

package com.docuware.dev._public.intellix;

import com.docuware.dev.Extensions.ObjectToXElementWrapperAdapter;
import com.docuware.dev.Extensions.XElementWrapper;
import com.docuware.dev.settings.common.KeyValuePairs;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentContent", propOrder = {
    "metadata",
    "embedded",
    "pages"
})
public class DocumentContent  {

    protected KeyValuePairs metadata;
    @XmlElement(name = "Embedded")
    protected List<DocumentContent.Embedded> embedded;
    @XmlElement(name = "Pages")
    protected DocumentContent.Pages pages;

    public KeyValuePairs getMetadata() {
        return metadata;
    }

    public void setMetadata(KeyValuePairs value) {
        this.metadata = value;
    }

    /**ArrayList is required for the XML-Marshalling */
    public void setEmbedded(ArrayList<DocumentContent.Embedded> value) {
        embedded=value;
    }

    /**For internal use: Embedded data.*/
    public List<DocumentContent.Embedded> getEmbedded() {
        if (embedded == null) {
            embedded = new ArrayList<DocumentContent.Embedded>();
        }
        return this.embedded;
    }

    public DocumentContent.Pages getPages() {
        return pages;
    }

    public void setPages(DocumentContent.Pages value) {
        this.pages = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Embedded {

        @XmlAnyElement(lax = true)
        @XmlJavaTypeAdapter(ObjectToXElementWrapperAdapter.class)
        protected XElementWrapper any;

        public XElementWrapper getAny() {
            return any;
        }

        public void setAny(XElementWrapper value) {
            this.any = value;
        }

    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "page"
    })
    public static class Pages {

        @XmlElement(name = "Page", required = true)
        protected List<PageContent> page;

    /**ArrayList is required for the XML-Marshalling */
    public void setPage(ArrayList<PageContent> value) {
        page=value;
    }
        public List<PageContent> getPage() {
            if (page == null) {
                page = new ArrayList<PageContent>();
            }
            return this.page;
        }
    }



}
