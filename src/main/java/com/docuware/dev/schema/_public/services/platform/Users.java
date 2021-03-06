

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
@XmlType(name = "Users", propOrder = {
"proxy",
    "user"
})
public class Users  implements IHttpClientProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "User")
    protected List<User> user;

    /**ArrayList is required for the XML-Marshalling */
    public void setUser(ArrayList<User> value) {
        user=value;
    }

    /**Defines a list of users*/
    public List<User> getUser() {
        if (user == null) {
            user = new ArrayList<User>();
        }
        return this.user;
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
	if(this.user!=null) {
		for (int i = 0; (i < this.user.size()); i = (i + 1)) {
            this.user.get(i).setProxy(proxy);
        }
	}
    }



}
