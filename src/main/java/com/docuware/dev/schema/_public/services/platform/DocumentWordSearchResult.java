

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.*;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.Links;
import java8.util.concurrent.CompletableFuture;

import javax.xml.bind.annotation.*;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentWordSearchResult", propOrder = {
"proxy",
    "search",
    "sectionHits",
    "links"
})
public class DocumentWordSearchResult  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Search", required = true)
    protected String search;
    @XmlElement(name = "SectionHits")
    protected List<DocumentWordSearchResult.SectionHits> sectionHits;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;

    /**Contains the search query leading to this result.*/
    public String getSearch() {
        return search;
    }

    /**Contains the search query leading to this result.*/
    public void setSearch(String value) {
        this.search = value;
    }

    /**ArrayList is required for the XML-Marshalling */
    public void setSectionHits(ArrayList<DocumentWordSearchResult.SectionHits> value) {
        sectionHits=value;
    }

    /**Define a a set of words and locations where they are found in a section*/
    public List<DocumentWordSearchResult.SectionHits> getSectionHits() {
        if (sectionHits == null) {
            sectionHits = new ArrayList<DocumentWordSearchResult.SectionHits>();
        }
        return this.sectionHits;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pageHits"
    })
    public static class SectionHits {

        @XmlElement(name = "PageHits", required = true)
        protected PageHits pageHits;
        @XmlAttribute(name = "SectionId")
        protected String sectionId;

    /**Contains a set pages where of words are found*/
        public PageHits getPageHits() {
            return pageHits;
        }

        public void setPageHits(PageHits value) {
            this.pageHits = value;
        }

    /**The id of the section containing a hit.*/
        public String getSectionId() {
            return sectionId;
        }

    /**The id of the section containing a hit.*/
        public void setSectionId(String value) {
            this.sectionId = value;
        }

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
    * Gets the Uri of the Link for the relation "Next".
    * Returns the Uri of the Link for the relation "Next", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getNextRelationLink() {
        return MethodInvocation.getLink(this, links, "next");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Next".
    */
    public DocumentWordSearchResult getDocumentWordSearchResultFromNextRelation() {
        return MethodInvocation.<DocumentWordSearchResult>get(this, links, "next", DocumentWordSearchResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Next" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentWordSearchResult>> getDocumentWordSearchResultFromNextRelationAsync() {
        return MethodInvocation.<DocumentWordSearchResult>getAsync(this, links, "next", DocumentWordSearchResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Next" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentWordSearchResult>> getDocumentWordSearchResultFromNextRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentWordSearchResult>getAsync(this, links, "next", DocumentWordSearchResult.class, ct);
    }



}
