

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.*;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.Links;
import java8.util.concurrent.CompletableFuture;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import java.io.InputStream;
import java.net.URI;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDescriptionTests", propOrder = {
"proxy",
    "links"
})
public class ServiceDescriptionTests  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
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
    * Gets the Uri of the Link for the relation "HtmlTestClient".
    * Returns the Uri of the Link for the relation "HtmlTestClient", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getHtmlTestClientRelationLink() {
        return MethodInvocation.getLink(this, links, "htmlTestClient");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "HtmlTestClient".
    */
    public InputStream getInputStreamFromHtmlTestClientRelation() {
        return MethodInvocation.get(this, links, "htmlTestClient", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "HtmlTestClient" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromHtmlTestClientRelationAsync() {
        return MethodInvocation.getAsync(this, links, "htmlTestClient", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "HtmlTestClient" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromHtmlTestClientRelationAsync(CancellationToken ct) {
        return MethodInvocation.getAsync(this, links, "htmlTestClient", InputStream.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "ReflectStampPlacement".
    * Returns the Uri of the Link for the relation "ReflectStampPlacement", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getReflectStampPlacementRelationLink() {
        return MethodInvocation.getLink(this, links, "reflectStampPlacement");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ReflectStampPlacement".
    */
    public StampPlacement postToReflectStampPlacementRelationForStampPlacement(StampPlacement data) {
        return MethodInvocation.<StampPlacement, StampPlacement> post(this, links, "reflectStampPlacement", StampPlacement.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampPlacement"), StampPlacement.class, null, data), "application/vnd.docuware.platform.stampplacement+xml", "application/vnd.docuware.platform.stampplacement+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ReflectStampPlacement" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<StampPlacement>> postToReflectStampPlacementRelationForStampPlacementAsync(StampPlacement data) {
        return MethodInvocation.<StampPlacement, StampPlacement >postAsync(this, links, "reflectStampPlacement", StampPlacement.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampPlacement"), StampPlacement.class, null, data), "application/vnd.docuware.platform.stampplacement+xml", "application/vnd.docuware.platform.stampplacement+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ReflectStampPlacement" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<StampPlacement>> postToReflectStampPlacementRelationForStampPlacementAsync(CancellationToken ct, StampPlacement data) {
        return MethodInvocation.<StampPlacement, StampPlacement >postAsync(this, links, "reflectStampPlacement", StampPlacement.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampPlacement"), StampPlacement.class, null, data), "application/vnd.docuware.platform.stampplacement+xml", "application/vnd.docuware.platform.stampplacement+xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "ReflectDialogQuery".
    * Returns the Uri of the Link for the relation "ReflectDialogQuery", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getReflectDialogQueryRelationLink() {
        return MethodInvocation.getLink(this, links, "reflectDialogQuery");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ReflectDialogQuery".
    */
    public DialogExpression postToReflectDialogQueryRelationForDialogExpression(DialogExpression data) {
        return MethodInvocation.<DialogExpression, DialogExpression> post(this, links, "reflectDialogQuery", DialogExpression.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DialogExpression"), DialogExpression.class, null, data), "application/vnd.docuware.platform.dialogexpression+xml", "application/vnd.docuware.platform.dialogexpression+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ReflectDialogQuery" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DialogExpression>> postToReflectDialogQueryRelationForDialogExpressionAsync(DialogExpression data) {
        return MethodInvocation.<DialogExpression, DialogExpression >postAsync(this, links, "reflectDialogQuery", DialogExpression.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DialogExpression"), DialogExpression.class, null, data), "application/vnd.docuware.platform.dialogexpression+xml", "application/vnd.docuware.platform.dialogexpression+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ReflectDialogQuery" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DialogExpression>> postToReflectDialogQueryRelationForDialogExpressionAsync(CancellationToken ct, DialogExpression data) {
        return MethodInvocation.<DialogExpression, DialogExpression >postAsync(this, links, "reflectDialogQuery", DialogExpression.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DialogExpression"), DialogExpression.class, null, data), "application/vnd.docuware.platform.dialogexpression+xml", "application/vnd.docuware.platform.dialogexpression+xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "QueryString".
    * Returns the Uri of the Link for the relation "QueryString", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getQueryStringRelationLink() {
        return MethodInvocation.getLink(this, links, "queryString");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "QueryString".
    */
    public InputStream getInputStreamFromQueryStringRelation() {
        return MethodInvocation.get(this, links, "queryString", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "QueryString" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromQueryStringRelationAsync() {
        return MethodInvocation.getAsync(this, links, "queryString", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "QueryString" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromQueryStringRelationAsync(CancellationToken ct) {
        return MethodInvocation.getAsync(this, links, "queryString", InputStream.class, ct);
    }



}
