

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.Extension;
import com.docuware.dev.Extensions.HttpClientProxy;
import com.docuware.dev.Extensions.IHttpClientProxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlSchemas", propOrder = {
"proxy",
    "schema"
})
public class XmlSchemas  implements IHttpClientProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Schema")
    protected List<XmlSchema> schema;

    /**ArrayList is required for the XML-Marshalling */
    public void setSchema(ArrayList<XmlSchema> value) {
        schema=value;
    }

    public List<XmlSchema> getSchema() {
        if (schema == null) {
            schema = new ArrayList<XmlSchema>();
        }
        return this.schema;
    }


	/**
	* Gets the proxy.
	* 
	* @return	The proxy
	*/
    @Extension
    public HttpClientProxy getProxy() {
	return this.proxy;
    }


	/**
	* Sets the HTTP Communication Proxy which is used in futher HTTP communication.
	* 
	* @param proxy	The new proxy
	*/
    @Extension
    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
	if(this.schema!=null) { 
        for (int i = 0; (i < this.schema.size()); i = (i + 1)) {
            this.schema.get(i).setProxy(proxy);
        }
	}
    }



}
