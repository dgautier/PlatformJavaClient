

package com.docuware.dev.schema._public.services;

import com.docuware.dev.Extensions.ObjectToXElementWrapperAdapter;
import com.docuware.dev.Extensions.XElementWrapper;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UriTemplateDescription", propOrder = {
    "parameter",
    "invoke",
    "htmlDescription"
})
public class UriTemplateDescription  {

    @XmlElement(name = "Parameter")
    protected List<UriTemplateParameter> parameter;
    @XmlElement(name = "Invoke", required = true)
    protected List<UriInvocation> invoke;
    @XmlElement(name = "HtmlDescription")
    protected UriTemplateDescription.HtmlDescription htmlDescription;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "UriPattern")
    protected String uriPattern;
    @XmlAttribute(name = "FurtherReading")
    @XmlSchemaType(name = "anyURI")
    protected String furtherReading;

    /**ArrayList is required for the XML-Marshalling */
    public void setParameter(ArrayList<UriTemplateParameter> value) {
        parameter=value;
    }

    public List<UriTemplateParameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<UriTemplateParameter>();
        }
        return this.parameter;
    }

    /**ArrayList is required for the XML-Marshalling */
    public void setInvoke(ArrayList<UriInvocation> value) {
        invoke=value;
    }

    public List<UriInvocation> getInvoke() {
        if (invoke == null) {
            invoke = new ArrayList<UriInvocation>();
        }
        return this.invoke;
    }

    /**Describes the Uri.*/
    public UriTemplateDescription.HtmlDescription getHtmlDescription() {
        return htmlDescription;
    }

    /**Describes the Uri.*/
    public void setHtmlDescription(UriTemplateDescription.HtmlDescription value) {
        this.htmlDescription = value;
    }

    /**The name of this template.*/
    public String getName() {
        return name;
    }

    /**The name of this template.*/
    public void setName(String value) {
        this.name = value;
    }

    /**The URI template.*/
    public String getUriPattern() {
        return uriPattern;
    }

    /**The URI template.*/
    public void setUriPattern(String value) {
        this.uriPattern = value;
    }

    /**Gets a link for further readings.*/
    public String getFurtherReading() {
        return furtherReading;
    }

    /**Gets a link for further readings.*/
    public void setFurtherReading(String value) {
        this.furtherReading = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class HtmlDescription {

        @XmlAnyElement
        @XmlJavaTypeAdapter(ObjectToXElementWrapperAdapter.class)
        protected XElementWrapper any;

        public XElementWrapper getAny() {
            return any;
        }

        public void setAny(XElementWrapper value) {
            this.any = value;
        }

    }



}
