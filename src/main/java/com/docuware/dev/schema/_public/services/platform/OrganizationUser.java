

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.Extension;
import com.docuware.dev.Extensions.HttpClientProxy;
import com.docuware.dev.Extensions.IHttpClientProxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationUser", propOrder = {
"proxy",
    "organizationId",
    "info"
})
public class OrganizationUser  implements IHttpClientProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "OrganizationId")
    protected String organizationId;
    @XmlElement(name = "Info")
    protected UserInfo info;

    /**Organization identity*/
    public String getOrganizationId() {
        return organizationId;
    }

    /**Organization identity*/
    public void setOrganizationId(String value) {
        this.organizationId = value;
    }

    /**Information related to a user*/
    public UserInfo getInfo() {
        return info;
    }

    /**Information related to a user*/
    public void setInfo(UserInfo value) {
        this.info = value;
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
    if ((info != null)) {
        info.setProxy(proxy);
    }
    }



}
