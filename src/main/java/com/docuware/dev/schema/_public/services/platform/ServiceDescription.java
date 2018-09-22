

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.*;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.Links;
import com.docuware.dev.schema._public.services.LogMessages;
import com.docuware.dev.schema._public.services.UriTemplateDescriptions;
import java8.util.concurrent.CompletableFuture;

import javax.xml.bind.annotation.*;
import java.io.InputStream;
import java.net.URI;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDescription", propOrder = {
"proxy",
    "links",
    "tests",
    "documentation",
    "resources",
    "statistics"
})
public class ServiceDescription  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlElement(name = "Tests", required = true)
    protected ServiceDescriptionTests tests;
    @XmlElement(name = "Documentation", required = true)
    protected ServiceDescriptionDocumentation documentation;
    @XmlElement(name = "Resources", required = true)
    protected UriTemplateDescriptions resources;
    @XmlElement(name = "Statistics", required = true)
    protected ServiceDescriptionStatistics statistics;
    @XmlAttribute(name = "Version")
    protected String version;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    /**Test applications for platform.*/
    public ServiceDescriptionTests getTests() {
        return tests;
    }

    /**Test applications for platform.*/
    public void setTests(ServiceDescriptionTests value) {
        this.tests = value;
    }

    /**Documentation links for platform.*/
    public ServiceDescriptionDocumentation getDocumentation() {
        return documentation;
    }

    /**Documentation links for platform.*/
    public void setDocumentation(ServiceDescriptionDocumentation value) {
        this.documentation = value;
    }

    /**Resource definitions/templates.*/
    public UriTemplateDescriptions getResources() {
        return resources;
    }

    /**Resource definitions/templates.*/
    public void setResources(UriTemplateDescriptions value) {
        this.resources = value;
    }

    /**Test applications for platform.*/
    public ServiceDescriptionStatistics getStatistics() {
        return statistics;
    }

    /**Test applications for platform.*/
    public void setStatistics(ServiceDescriptionStatistics value) {
        this.statistics = value;
    }

    /**Contains the product version of DocuWare.*/
    @Dolphin
    public String getVersion() {
        return version;
    }

    /**Contains the product version of DocuWare.*/
    @Dolphin
    public void setVersion(String value) {
        this.version = value;
    }


	/**
	* Gets the proxy.
	* 
	* @return	The proxy
	*/
    @Extension
    public HttpClientProxy getProxy() { return this.proxy; 
    }


	/**
	* Sets the HTTP Communication Proxy which is used in futher HTTP communication.
	* 
	* @param proxy	The new proxy
	*/
    @Extension
    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
    if ((tests != null)) {
        tests.setProxy(proxy);
    }
    if ((documentation != null)) {
        documentation.setProxy(proxy);
    }
    if ((statistics != null)) {
        statistics.setProxy(proxy);
    }	
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
    * Gets the Uri of the Link for the relation "Organizations".
    * Returns the Uri of the Link for the relation "Organizations", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getOrganizationsRelationLink() {
        return MethodInvocation.getLink(this, links, "organizations");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Organizations".
    */
    public Organizations getOrganizationsFromOrganizationsRelation() {
        return MethodInvocation.get(this, links, "organizations", Organizations.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Organizations" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Organizations>> getOrganizationsFromOrganizationsRelationAsync() {
        return MethodInvocation.getAsync(this, links, "organizations", Organizations.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Organizations" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Organizations>> getOrganizationsFromOrganizationsRelationAsync(CancellationToken ct) {
        return MethodInvocation.getAsync(this, links, "organizations", Organizations.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Login".
    * Returns the Uri of the Link for the relation "Login", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getLoginRelationLink() {
        return MethodInvocation.getLink(this, links, "login");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Login".
    */
    public InputStream getInputStreamFromLoginRelation() {
        return MethodInvocation.get(this, links, "login", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Login" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromLoginRelationAsync() {
        return MethodInvocation.getAsync(this, links, "login", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Login" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromLoginRelationAsync(CancellationToken ct) {
        return MethodInvocation.getAsync(this, links, "login", InputStream.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Login".
    */
    public InputStream postToLoginRelationForInputStream(InputStream data) { 
        return MethodInvocation.post(this, links, "login", InputStream.class, data, "application/x-www-form-urlencoded", "application/xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "Login" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToLoginRelationForInputStreamAsync(InputStream data) { 
        return MethodInvocation.postAsync(this, links, "login", InputStream.class, data, "application/x-www-form-urlencoded", "application/xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "Login" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToLoginRelationForInputStreamAsync(CancellationToken ct, InputStream data) { 
        return MethodInvocation.postAsync(this, links, "login", InputStream.class, data, "application/x-www-form-urlencoded", "application/xml", ct);
}

    /**
    * Gets the Uri of the Link for the relation "GuestLogin".
    * Returns the Uri of the Link for the relation "GuestLogin", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getGuestLoginRelationLink() {
        return MethodInvocation.getLink(this, links, "guestLogin");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "GuestLogin".
    */
    public InputStream getInputStreamFromGuestLoginRelation() {
        return MethodInvocation.get(this, links, "guestLogin", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "GuestLogin" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromGuestLoginRelationAsync() {
        return MethodInvocation.getAsync(this, links, "guestLogin", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "GuestLogin" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromGuestLoginRelationAsync(CancellationToken ct) {
        return MethodInvocation.getAsync(this, links, "guestLogin", InputStream.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "GuestLogin".
    */
    public InputStream postToGuestLoginRelationForInputStream(InputStream data) { 
        return MethodInvocation.post(this, links, "guestLogin", InputStream.class, data, "application/x-www-form-urlencoded", "application/xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "GuestLogin" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToGuestLoginRelationForInputStreamAsync(InputStream data) { 
        return MethodInvocation.postAsync(this, links, "guestLogin", InputStream.class, data, "application/x-www-form-urlencoded", "application/xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "GuestLogin" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToGuestLoginRelationForInputStreamAsync(CancellationToken ct, InputStream data) { 
        return MethodInvocation.postAsync(this, links, "guestLogin", InputStream.class, data, "application/x-www-form-urlencoded", "application/xml", ct);
}

    /**
    * Gets the Uri of the Link for the relation "WindowsLogin".
    * Returns the Uri of the Link for the relation "WindowsLogin", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getWindowsLoginRelationLink() {
        return MethodInvocation.getLink(this, links, "windowsLogin");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "WindowsLogin".
    */
    public String getStringFromWindowsLoginRelation() {
        return MethodInvocation.get(this, links, "windowsLogin", String.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "WindowsLogin" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<String>> getStringFromWindowsLoginRelationAsync() {
        return MethodInvocation.getAsync(this, links, "windowsLogin", String.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "WindowsLogin" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<String>> getStringFromWindowsLoginRelationAsync(CancellationToken ct) {
        return MethodInvocation.getAsync(this, links, "windowsLogin", String.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "WindowsLogin".
    */
    public String postToWindowsLoginRelationForString(InputStream data) { 
        return MethodInvocation.post(this, links, "windowsLogin", String.class, data, "application/x-www-form-urlencoded", "text/plain");
}

    /**
    * Calls the HTTP post Method on the link for the relation "WindowsLogin" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<String>> postToWindowsLoginRelationForStringAsync(InputStream data) { 
        return MethodInvocation.postAsync(this, links, "windowsLogin", String.class, data, "application/x-www-form-urlencoded", "text/plain");
}

    /**
    * Calls the HTTP post Method on the link for the relation "WindowsLogin" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<String>> postToWindowsLoginRelationForStringAsync(CancellationToken ct, InputStream data) { 
        return MethodInvocation.postAsync(this, links, "windowsLogin", String.class, data, "application/x-www-form-urlencoded", "text/plain", ct);
}

    /**
    * Gets the Uri of the Link for the relation "ChangePassword".
    * Returns the Uri of the Link for the relation "ChangePassword", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getChangePasswordRelationLink() {
        return MethodInvocation.getLink(this, links, "changePassword");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ChangePassword".
    */
    public InputStream getInputStreamFromChangePasswordRelation() {
        return MethodInvocation.get(this, links, "changePassword", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ChangePassword" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromChangePasswordRelationAsync() {
        return MethodInvocation.getAsync(this, links, "changePassword", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ChangePassword" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromChangePasswordRelationAsync(CancellationToken ct) {
        return MethodInvocation.getAsync(this, links, "changePassword", InputStream.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ChangePassword".
    */
    public InputStream postToChangePasswordRelationForInputStream(InputStream data) { 
        return MethodInvocation.post(this, links, "changePassword", InputStream.class, data, "application/x-www-form-urlencoded", "application/xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "ChangePassword" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToChangePasswordRelationForInputStreamAsync(InputStream data) { 
        return MethodInvocation.postAsync(this, links, "changePassword", InputStream.class, data, "application/x-www-form-urlencoded", "application/xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "ChangePassword" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToChangePasswordRelationForInputStreamAsync(CancellationToken ct, InputStream data) { 
        return MethodInvocation.postAsync(this, links, "changePassword", InputStream.class, data, "application/x-www-form-urlencoded", "application/xml", ct);
}

    /**
    * Gets the Uri of the Link for the relation "ResetPassword".
    * Returns the Uri of the Link for the relation "ResetPassword", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getResetPasswordRelationLink() {
        return MethodInvocation.getLink(this, links, "resetPassword");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResetPassword".
    */
    public InputStream getInputStreamFromResetPasswordRelation() {
        return MethodInvocation.get(this, links, "resetPassword", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResetPassword" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromResetPasswordRelationAsync() {
        return MethodInvocation.getAsync(this, links, "resetPassword", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResetPassword" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromResetPasswordRelationAsync(CancellationToken ct) {
        return MethodInvocation.getAsync(this, links, "resetPassword", InputStream.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ResetPassword".
    */
    public InputStream postToResetPasswordRelationForInputStream(InputStream data) { 
        return MethodInvocation.post(this, links, "resetPassword", InputStream.class, data, "application/x-www-form-urlencoded", "application/xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "ResetPassword" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToResetPasswordRelationForInputStreamAsync(InputStream data) { 
        return MethodInvocation.postAsync(this, links, "resetPassword", InputStream.class, data, "application/x-www-form-urlencoded", "application/xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "ResetPassword" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToResetPasswordRelationForInputStreamAsync(CancellationToken ct, InputStream data) { 
        return MethodInvocation.postAsync(this, links, "resetPassword", InputStream.class, data, "application/x-www-form-urlencoded", "application/xml", ct);
}

    /**
    * Gets the Uri of the Link for the relation "TokenLogin".
    * Returns the Uri of the Link for the relation "TokenLogin", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getTokenLoginRelationLink() {
        return MethodInvocation.getLink(this, links, "tokenLogin");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TokenLogin".
    */
    public InputStream getInputStreamFromTokenLoginRelation() {
        return MethodInvocation.get(this, links, "tokenLogin", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TokenLogin" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromTokenLoginRelationAsync() {
        return MethodInvocation.getAsync(this, links, "tokenLogin", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TokenLogin" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromTokenLoginRelationAsync(CancellationToken ct) {
        return MethodInvocation.getAsync(this, links, "tokenLogin", InputStream.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "TokenLogin".
    */
    public InputStream postToTokenLoginRelationForInputStream(InputStream data) { 
        return MethodInvocation.post(this, links, "tokenLogin", InputStream.class, data, "application/x-www-form-urlencoded", "application/xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "TokenLogin" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToTokenLoginRelationForInputStreamAsync(InputStream data) { 
        return MethodInvocation.postAsync(this, links, "tokenLogin", InputStream.class, data, "application/x-www-form-urlencoded", "application/xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "TokenLogin" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToTokenLoginRelationForInputStreamAsync(CancellationToken ct, InputStream data) { 
        return MethodInvocation.postAsync(this, links, "tokenLogin", InputStream.class, data, "application/x-www-form-urlencoded", "application/xml", ct);
}

    /**
    * Gets the Uri of the Link for the relation "TrustedLogin".
    * Returns the Uri of the Link for the relation "TrustedLogin", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getTrustedLoginRelationLink() {
        return MethodInvocation.getLink(this, links, "trustedLogin");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TrustedLogin".
    */
    public InputStream getInputStreamFromTrustedLoginRelation() {
        return MethodInvocation.get(this, links, "trustedLogin", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TrustedLogin" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromTrustedLoginRelationAsync() {
        return MethodInvocation.getAsync(this, links, "trustedLogin", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TrustedLogin" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromTrustedLoginRelationAsync(CancellationToken ct) {
        return MethodInvocation.getAsync(this, links, "trustedLogin", InputStream.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "TrustedLogin".
    */
    public InputStream postToTrustedLoginRelationForInputStream(InputStream data) { 
        return MethodInvocation.post(this, links, "trustedLogin", InputStream.class, data, "application/x-www-form-urlencoded", "application/xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "TrustedLogin" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToTrustedLoginRelationForInputStreamAsync(InputStream data) { 
        return MethodInvocation.postAsync(this, links, "trustedLogin", InputStream.class, data, "application/x-www-form-urlencoded", "application/xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "TrustedLogin" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToTrustedLoginRelationForInputStreamAsync(CancellationToken ct, InputStream data) { 
        return MethodInvocation.postAsync(this, links, "trustedLogin", InputStream.class, data, "application/x-www-form-urlencoded", "application/xml", ct);
}

    /**
    * Gets the Uri of the Link for the relation "Logout".
    * Returns the Uri of the Link for the relation "Logout", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getLogoutRelationLink() {
        return MethodInvocation.getLink(this, links, "logout");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Logout".
    */
    public InputStream getInputStreamFromLogoutRelation() {
        return MethodInvocation.get(this, links, "logout", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Logout" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromLogoutRelationAsync() {
        return MethodInvocation.getAsync(this, links, "logout", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Logout" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromLogoutRelationAsync(CancellationToken ct) {
        return MethodInvocation.getAsync(this, links, "logout", InputStream.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Disconnect".
    * Returns the Uri of the Link for the relation "Disconnect", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getDisconnectRelationLink() {
        return MethodInvocation.getLink(this, links, "disconnect");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Disconnect".
    */
    public InputStream getInputStreamFromDisconnectRelation() {
        return MethodInvocation.get(this, links, "disconnect", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Disconnect" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromDisconnectRelationAsync() {
        return MethodInvocation.getAsync(this, links, "disconnect", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Disconnect" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromDisconnectRelationAsync(CancellationToken ct) {
        return MethodInvocation.getAsync(this, links, "disconnect", InputStream.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "LoginCookie".
    * Returns the Uri of the Link for the relation "LoginCookie", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getLoginCookieRelationLink() {
        return MethodInvocation.getLink(this, links, "loginCookie");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LoginCookie".
    */
    public String getStringFromLoginCookieRelation() {
        return MethodInvocation.get(this, links, "loginCookie", String.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LoginCookie" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<String>> getStringFromLoginCookieRelationAsync() {
        return MethodInvocation.getAsync(this, links, "loginCookie", String.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LoginCookie" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<String>> getStringFromLoginCookieRelationAsync(CancellationToken ct) {
        return MethodInvocation.getAsync(this, links, "loginCookie", String.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "UriTemplates".
    * Returns the Uri of the Link for the relation "UriTemplates", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getUriTemplatesRelationLink() {
        return MethodInvocation.getLink(this, links, "uriTemplates");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "UriTemplates".
    */
    public UriTemplateDescriptions getUriTemplateDescriptionsFromUriTemplatesRelation() {
        return MethodInvocation.get(this, links, "uriTemplates", UriTemplateDescriptions.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "UriTemplates" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<UriTemplateDescriptions>> getUriTemplateDescriptionsFromUriTemplatesRelationAsync() {
        return MethodInvocation.getAsync(this, links, "uriTemplates", UriTemplateDescriptions.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "UriTemplates" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<UriTemplateDescriptions>> getUriTemplateDescriptionsFromUriTemplatesRelationAsync(CancellationToken ct) {
        return MethodInvocation.getAsync(this, links, "uriTemplates", UriTemplateDescriptions.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "AdhocRendering".
    * Returns the Uri of the Link for the relation "AdhocRendering", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getAdhocRenderingRelationLink() {
        return MethodInvocation.getLink(this, links, "adhocRendering");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AdhocRendering".
    */
    public AdhocRenderingFiles getAdhocRenderingFilesFromAdhocRenderingRelation() {
        return MethodInvocation.get(this, links, "adhocRendering", AdhocRenderingFiles.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AdhocRendering" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<AdhocRenderingFiles>> getAdhocRenderingFilesFromAdhocRenderingRelationAsync() {
        return MethodInvocation.getAsync(this, links, "adhocRendering", AdhocRenderingFiles.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AdhocRendering" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<AdhocRenderingFiles>> getAdhocRenderingFilesFromAdhocRenderingRelationAsync(CancellationToken ct) {
        return MethodInvocation.getAsync(this, links, "adhocRendering", AdhocRenderingFiles.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "AdhocRendering".
    */
    public AdhocRenderingFile postToAdhocRenderingRelationForAdhocRenderingFile(String bodyContentType, InputStream data) { 
        return MethodInvocation.post(this, links, "adhocRendering", AdhocRenderingFile.class, data, bodyContentType, "application/vnd.docuware.platform.adhocrenderingfile+xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "AdhocRendering" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<AdhocRenderingFile>> postToAdhocRenderingRelationForAdhocRenderingFileAsync(String bodyContentType, InputStream data) { 
        return MethodInvocation.postAsync(this, links, "adhocRendering", AdhocRenderingFile.class, data, bodyContentType, "application/vnd.docuware.platform.adhocrenderingfile+xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "AdhocRendering" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<AdhocRenderingFile>> postToAdhocRenderingRelationForAdhocRenderingFileAsync(CancellationToken ct, String bodyContentType, InputStream data) { 
        return MethodInvocation.postAsync(this, links, "adhocRendering", AdhocRenderingFile.class, data, bodyContentType, "application/vnd.docuware.platform.adhocrenderingfile+xml", ct);
}

    /**
    * Gets the Uri of the Link for the relation "RootSchema".
    * Returns the Uri of the Link for the relation "RootSchema", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getRootSchemaRelationLink() {
        return MethodInvocation.getLink(this, links, "rootSchema");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "RootSchema".
    */
    public InputStream getInputStreamFromRootSchemaRelation() {
        return MethodInvocation.get(this, links, "rootSchema", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "RootSchema" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromRootSchemaRelationAsync() {
        return MethodInvocation.getAsync(this, links, "rootSchema", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "RootSchema" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromRootSchemaRelationAsync(CancellationToken ct) {
        return MethodInvocation.getAsync(this, links, "rootSchema", InputStream.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Log".
    * Returns the Uri of the Link for the relation "Log", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getLogRelationLink() {
        return MethodInvocation.getLink(this, links, "log");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Log".
    */
    public LogMessages getLogMessagesFromLogRelation() {
        return MethodInvocation.get(this, links, "log", LogMessages.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Log" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<LogMessages>> getLogMessagesFromLogRelationAsync() {
        return MethodInvocation.getAsync(this, links, "log", LogMessages.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Log" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<LogMessages>> getLogMessagesFromLogRelationAsync(CancellationToken ct) {
        return MethodInvocation.getAsync(this, links, "log", LogMessages.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "PermanentUrl".
    * Returns the Uri of the Link for the relation "PermanentUrl", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getPermanentUrlRelationLink() {
        return MethodInvocation.getLink(this, links, "permanentUrl");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "PermanentUrl".
    */
    public String getStringFromPermanentUrlRelation() {
        return MethodInvocation.get(this, links, "permanentUrl", String.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "PermanentUrl" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<String>> getStringFromPermanentUrlRelationAsync() {
        return MethodInvocation.getAsync(this, links, "permanentUrl", String.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "PermanentUrl" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<String>> getStringFromPermanentUrlRelationAsync(CancellationToken ct) {
        return MethodInvocation.getAsync(this, links, "permanentUrl", String.class, ct);
    }



}
