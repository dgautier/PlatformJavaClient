

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.SubstitutionRules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstitutionList", propOrder = {
"proxy",
    "links"
})
@CompareIgnore
public class SubstitutionList  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Active", required = true)
    protected boolean active;
    @XmlAttribute(name = "Guid", required = true)
    protected String guid;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    /**Gets the name of the list.*/
    public String getName() {
        return name;
    }

    /**Gets the name of the list.*/
    public void setName(String value) {
        this.name = value;
    }

    /**Gets a value indicating whether the list is active.*/
    public boolean isActive() {
        return active;
    }

    /**Gets a value indicating whether the list is active.*/
    public void setActive(boolean value) {
        this.active = value;
    }

    /**Gets the Guid of the list.*/
    public String getGuid() {
        return guid;
    }

    /**Gets the Guid of the list.*/
    public void setGuid(String value) {
        this.guid = value;
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
    }


	/**
	* Gets the base URI of the specified relations instance.
	* 
	* @return	The base URI of the specified relations instance.
	*/
    @Extension
    public URI getBaseUri() {
	return RelationsWithProxyExtensions.getBaseUri(this);
    }


	/**
	* Gets the link by its name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists; null otherwise.
	*/
    @Extension
    public Link getLink(String relationName) {
	return RelationExtension.getLink(this, relationName);
    }


	/**
	* Gets the URI of the relation specified by the name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists; null otherwise.
	*/
    @Extension
    public String getRelationUri(String relationName) {
	return RelationExtension.getRelationUri(this, relationName);
    }


	/**
	* Gets the URI of the relation specified by the name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists.
	* @throws	RuntimeException: The specified Link is not found
	*/
    @Extension
    public String getRelationUriOrThrow(String relationName) {
	return RelationExtension.getRelationUriOrThrow(this, relationName);
    }


	/**
	* Determines whether the specified link exists.
	* 
	* @param relationName	Name of the relation
	* @return	 True, if the specified link exists; otherwise, False.
	*/
    @Extension
    public boolean hasRelationUri(String relationName) {
	return RelationExtension.hasRelationUri(this, relationName);
    }

    /**
    * Gets the Uri of the Link for the relation "SubstitutionRules".
    * Returns the Uri of the Link for the relation "SubstitutionRules", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getSubstitutionRulesRelationLink() {
        return MethodInvocation.getLink(this, links, "substitutionRules");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "SubstitutionRules".
    */
    public SubstitutionRules getSubstitutionRulesFromSubstitutionRulesRelation() {
        return MethodInvocation.<SubstitutionRules>get(this, links, "substitutionRules", SubstitutionRules.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "SubstitutionRules" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SubstitutionRules>> getSubstitutionRulesFromSubstitutionRulesRelationAsync() {
        return MethodInvocation.<SubstitutionRules>getAsync(this, links, "substitutionRules", SubstitutionRules.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "SubstitutionRules" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SubstitutionRules>> getSubstitutionRulesFromSubstitutionRulesRelationAsync(CancellationToken ct) {
        return MethodInvocation.<SubstitutionRules>getAsync(this, links, "substitutionRules", SubstitutionRules.class, ct);
    }



}
