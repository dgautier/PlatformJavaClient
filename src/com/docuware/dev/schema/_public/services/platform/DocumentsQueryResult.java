//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.16 um 09:04:54 AM CEST 
//


package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.DocumentsQueryResult;
import com.docuware.dev.schema._public.services.platform.BatchUpdateIndexFieldsResult;
import com.docuware.dev.schema._public.services.platform.BatchUpdateProcessData;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.docuware.dev.schema._public.services.platform.Dialog;
import com.docuware.dev.schema._public.services.platform.UserDefinedSearchInfo;
import com.docuware.dev.schema._public.services.platform.ExportSettings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.docuware.dev.schema._public.services.Links;


/**
 * Define a result from document query
 * 
 * <p>Java-Klasse f�r DocumentsQueryResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DocumentsQueryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Count" type="{http://dev.docuware.com/schema/public/services/platform}CountPlusValue" minOccurs="0"/>
 *         &lt;element name="Items">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Item" type="{http://dev.docuware.com/schema/public/services/platform}Document" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeStamp" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentsQueryResult", propOrder = {
"proxy",
    "count",
    "items",
    "links"
})
public class DocumentsQueryResult  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Count")
    protected CountPlusValue count;
    @XmlElement(name = "Items", required = true)
    protected DocumentsQueryResult.Items items;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlAttribute(name = "Title")
    protected String title;
    @XmlAttribute(name = "TimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

    /**
     * Ruft den Wert der count-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountPlusValue }
     *     
     */
    public CountPlusValue getCount() {
        return count;
    }

    /**
     * Legt den Wert der count-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountPlusValue }
     *     
     */
    public void setCount(CountPlusValue value) {
        this.count = value;
    }

    /**
     * Ruft den Wert der items-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentsQueryResult.Items }
     *     
     */
    public DocumentsQueryResult.Items getItems() {
        return items;
    }

    /**
     * Legt den Wert der items-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentsQueryResult.Items }
     *     
     */
    public void setItems(DocumentsQueryResult.Items value) {
        this.items = value;
    }

    /**
     * Ruft den Wert der links-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Links }
     *     
     */
    public Links getLinks() {
        return links;
    }

    /**
     * Legt den Wert der links-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Links }
     *     
     */
    public void setLinks(Links value) {
        this.links = value;
    }

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Ruft den Wert der timeStamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Legt den Wert der timeStamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Item" type="{http://dev.docuware.com/schema/public/services/platform}Document" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class Items {

        @XmlElement(name = "Item")
        protected List<Document> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document }
         * 
         * 
         */
        public List<Document> getItem() {
            if (item == null) {
                item = new ArrayList<Document>();
            }
            return this.item;
        }

    }

    public HttpClientProxy getProxy() {
	return this.proxy;	
    }

    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
	if(this.items!=null) {  
        for (int i = 0; (i < this.items.getItem().size()); i = (i + 1)) {
            this.items.getItem().get(i).setProxy(proxy);
        }
	}
    }

    public URI getBaseUri() {
	return RelationsWithProxyExtensions.getBaseUri(this);
    }

    public Link getLink(String relationName) {
	return RelationExtension.getLink(this, relationName);
    }

    public String getRelationUri(String relationName) {
	return RelationExtension.getRelationUri(this, relationName);
    }

    public String getRelationUriOrThrow(String relationName) {
	return RelationExtension.getRelationUriOrThrow(this, relationName);
    }

    public boolean hasRelationUri(String relationName) {
	return RelationExtension.hasRelationUri(this, relationName);
    }

    public URI getNextRelationLink() {
        return MethodInvocation.getLink(this, links, "next");
    }

    public DocumentsQueryResult getDocumentsQueryResultFromNextRelation() {
        return MethodInvocation.<DocumentsQueryResult>get(this, links, "next", DocumentsQueryResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromNextRelationAsync() {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "next", DocumentsQueryResult.class);
    }

    public URI getPrevRelationLink() {
        return MethodInvocation.getLink(this, links, "prev");
    }

    public DocumentsQueryResult getDocumentsQueryResultFromPrevRelation() {
        return MethodInvocation.<DocumentsQueryResult>get(this, links, "prev", DocumentsQueryResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromPrevRelationAsync() {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "prev", DocumentsQueryResult.class);
    }

    public URI getSelfRelationLink() {
        return MethodInvocation.getLink(this, links, "self");
    }

    public DocumentsQueryResult getDocumentsQueryResultFromSelfRelation() {
        return MethodInvocation.<DocumentsQueryResult>get(this, links, "self", DocumentsQueryResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromSelfRelationAsync() {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "self", DocumentsQueryResult.class);
    }

    public URI getFirstRelationLink() {
        return MethodInvocation.getLink(this, links, "first");
    }

    public DocumentsQueryResult getDocumentsQueryResultFromFirstRelation() {
        return MethodInvocation.<DocumentsQueryResult>get(this, links, "first", DocumentsQueryResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromFirstRelationAsync() {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "first", DocumentsQueryResult.class);
    }

    public URI getFeedRelationLink() {
        return MethodInvocation.getLink(this, links, "feed");
    }

    public URI getURIFromFeedRelation() {
        return MethodInvocation.<URI>get(this, links, "feed", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromFeedRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "feed", URI.class);
    }

    public URI getDownloadRelationLink() {
        return MethodInvocation.getLink(this, links, "download");
    }

    public DocumentsQueryResult getDocumentsQueryResultFromDownloadRelation() {
        return MethodInvocation.<DocumentsQueryResult>get(this, links, "download", DocumentsQueryResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromDownloadRelationAsync() {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "download", DocumentsQueryResult.class);
    }

    public URI getBatchUpdateRelationLink() {
        return MethodInvocation.getLink(this, links, "batchUpdate");
    }

    public BatchUpdateIndexFieldsResult postToBatchUpdateRelationForBatchUpdateIndexFieldsResult(BatchUpdateProcessData data) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult,BatchUpdateProcessData>post(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcessData"), BatchUpdateProcessData.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>> postToBatchUpdateRelationForBatchUpdateIndexFieldsResultAsync(BatchUpdateProcessData data) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult, BatchUpdateProcessData >postAsync(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcessData"), BatchUpdateProcessData.class, null, data));
    }

    public URI getCreateUserDefinedSearchRelationLink() {
        return MethodInvocation.getLink(this, links, "createUserDefinedSearch");
    }

    public Dialog postToCreateUserDefinedSearchRelationForDialog(UserDefinedSearchInfo data) {
        return MethodInvocation.<Dialog,UserDefinedSearchInfo>post(this, links, "createUserDefinedSearch", Dialog.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserDefinedSearchInfo"), UserDefinedSearchInfo.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<Dialog>> postToCreateUserDefinedSearchRelationForDialogAsync(UserDefinedSearchInfo data) {
        return MethodInvocation.<Dialog, UserDefinedSearchInfo >postAsync(this, links, "createUserDefinedSearch", Dialog.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserDefinedSearchInfo"), UserDefinedSearchInfo.class, null, data));
    }

    public URI getExportDocumentsRelationLink() {
        return MethodInvocation.getLink(this, links, "exportDocuments");
    }

    public String postToExportDocumentsRelationForString(ExportSettings data) {
        return MethodInvocation.<String,ExportSettings>post(this, links, "exportDocuments", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ExportSettings"), ExportSettings.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<String>> postToExportDocumentsRelationForStringAsync(ExportSettings data) {
        return MethodInvocation.<String, ExportSettings >postAsync(this, links, "exportDocuments", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ExportSettings"), ExportSettings.class, null, data));
    }



}