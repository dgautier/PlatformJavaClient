

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
@XmlType(name = "Organizations", propOrder = {
"proxy",
    "organization"
})
public class Organizations  implements IHttpClientProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Organization")
    protected List<Organization> organization;

    /**ArrayList is required for the XML-Marshalling */
    public void setOrganization(ArrayList<Organization> value) {
        organization=value;
    }

    /**List of organizations*/
    public List<Organization> getOrganization() {
        if (organization == null) {
            organization = new ArrayList<Organization>();
        }
        return this.organization;
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
	if(this.organization!=null) { 
		for (int i = 0; (i < this.organization.size()); i = (i + 1)) { 
            this.organization.get(i).setProxy(proxy);
        }
	}
    }



}
