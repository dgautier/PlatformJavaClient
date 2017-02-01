

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
@XmlType(name = "DialogFields", propOrder = {
"proxy",
    "field"
})
public class DialogFields  implements IHttpClientProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Field")
    protected List<DialogField> field;

    /**ArrayList is required for the XML-Marshalling */
    public void setField(ArrayList<DialogField> value) {
        field=value;
    }

    /**List of dialog fields.*/
    public List<DialogField> getField() {
        if (field == null) {
            field = new ArrayList<DialogField>();
        }
        return this.field;
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
	if(this.field!=null) { 
        for (int i = 0; (i < this.field.size()); i = (i + 1)) {
            this.field.get(i).setProxy(proxy);
        }
	}
    }



}
