

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.*;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.Links;
import java8.util.concurrent.CompletableFuture;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stamp", propOrder = {
"proxy",
    "formField",
    "fields",
    "headFont",
    "item",
    "links"
})
public class Stamp  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "FormField")
    protected List<StampFormField> formField;
    @XmlElement(name = "Fields")
    protected List<StampField> fields;
    @XmlElement(name = "HeadFont", required = true)
    protected Font headFont;
    @XmlElements({
        @XmlElement(name = "TextStamp", type = TextStamp.class),
        @XmlElement(name = "StrokeStamp", type = StrokeStamp.class),
        @XmlElement(name = "BitmapStamp", type = BitmapStamp.class)
    })
    protected Object item;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlAttribute(name = "PasswordProtected", required = true)
    protected boolean passwordProtected;
    @XmlAttribute(name = "Signature", required = true)
    protected StampSignatureType signature;
    @XmlAttribute(name = "Color", required = true)
    protected String color;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "DisplayName", required = true)
    protected String displayName;
    @XmlAttribute(name = "Overwrite")
    protected Boolean overwrite;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "IsHidden")
    protected Boolean isHidden;
    @XmlAttribute(name = "Autosave")
    protected Integer autosave;
    @XmlAttribute(name = "CloseAfterStampSet")
    protected Boolean closeAfterStampSet;
    @XmlAttribute(name = "AutomaticallyOpenNextDocument")
    protected Boolean automaticallyOpenNextDocument;
    @XmlAttribute(name = "KeepStampActive")
    protected Boolean keepStampActive;

    /**ArrayList is required for the XML-Marshalling */
    public void setFormField(ArrayList<StampFormField> value) {
        formField=value;
    }

    /**List of the stamp form fields.*/
    public List<StampFormField> getFormField() {
        if (formField == null) {
            formField = new ArrayList<StampFormField>();
        }
        return this.formField;
    }

    /**ArrayList is required for the XML-Marshalling */
    public void setFields(ArrayList<StampField> value) {
        fields=value;
    }

    /**List of the stamp fields.*/
    public List<StampField> getFields() {
        if (fields == null) {
            fields = new ArrayList<StampField>();
        }
        return this.fields;
    }

    /**Font for the additional items of information.*/
    public Font getHeadFont() {
        return headFont;
    }

    /**Font for the additional items of information.*/
    public void setHeadFont(Font value) {
        this.headFont = value;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object value) {
        this.item = value;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    /**If this flag is true password is needed to place the stamp.*/
    @Dolphin
    public boolean isPasswordProtected() {
        return passwordProtected;
    }

    /**If this flag is true password is needed to place the stamp.*/
    @Dolphin
    public void setPasswordProtected(boolean value) {
        this.passwordProtected = value;
    }

    /**The type of the stamp signature if there is any.*/
    public StampSignatureType getSignature() {
        return signature;
    }

    /**The type of the stamp signature if there is any.*/
    public void setSignature(StampSignatureType value) {
        this.signature = value;
    }

    /**The color of the stamp content*/
    public String getColor() {
        return color;
    }

    /**The color of the stamp content*/
    public void setColor(String value) {
        this.color = value;
    }

    /**The name of the stamp.*/
    public String getName() {
        return name;
    }

    /**The name of the stamp.*/
    public void setName(String value) {
        this.name = value;
    }

    /**The display name of the stamp.*/
    public String getDisplayName() {
        return displayName;
    }

    /**The display name of the stamp.*/
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**If this flag is true the system will overwrite existing database entries with the stamp entries.*/
    public boolean isOverwrite() {
        if (overwrite == null) {
            return false;
        } else {
            return overwrite;
        }
    }

    /**If this flag is true the system will overwrite existing database entries with the stamp entries.*/
    public void setOverwrite(Boolean value) {
        this.overwrite = value;
    }

    /**The id of the stamp, which is a GUID usually.*/
    public String getId() {
        return id;
    }

    /**The id of the stamp, which is a GUID usually.*/
    public void setId(String value) {
        this.id = value;
    }

    /**Determines whether the stamp is visible.*/
    public boolean isIsHidden() {
        if (isHidden == null) {
            return false;
        } else {
            return isHidden;
        }
    }

    /**Determines whether the stamp is visible.*/
    public void setIsHidden(Boolean value) {
        this.isHidden = value;
    }

    /**Automatically save the stamp after specified period in seconds. Value -1 mean the stamp have to be saved on user action.*/
    public int getAutosave() {
        if (autosave == null) {
            return -1;
        } else {
            return autosave;
        }
    }

    /**Automatically save the stamp after specified period in seconds. Value -1 mean the stamp have to be saved on user action.*/
    public void setAutosave(Integer value) {
        this.autosave = value;
    }

    /**Automatically close the window after stamp is placed in a document*/
    public boolean isCloseAfterStampSet() {
        if (closeAfterStampSet == null) {
            return false;
        } else {
            return closeAfterStampSet;
        }
    }

    /**Automatically close the window after stamp is placed in a document*/
    public void setCloseAfterStampSet(Boolean value) {
        this.closeAfterStampSet = value;
    }

    /**Determines whether the stamp remains active after being stored.*/
    @Dolphin
    public boolean isAutomaticallyOpenNextDocument() {
        if (automaticallyOpenNextDocument == null) {
            return false;
        } else {
            return automaticallyOpenNextDocument;
        }
    }

    /**Determines whether the stamp remains active after being stored.*/
    @Dolphin
    public void setAutomaticallyOpenNextDocument(Boolean value) {
        this.automaticallyOpenNextDocument = value;
    }

    /**Determines whether next document is opened automatically after the stamp is stored.*/
    @Dolphin
    public boolean isKeepStampActive() {
        if (keepStampActive == null) {
            return false;
        } else {
            return keepStampActive;
        }
    }

    /**Determines whether next document is opened automatically after the stamp is stored.*/
    @Dolphin
    public void setKeepStampActive(Boolean value) {
        this.keepStampActive = value;
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
	if(this.proxy!=null) { 
        for (int i = 0; (i < this.formField.size()); i = (i + 1)) {
            this.formField.get(i).setProxy(proxy);
        }
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
    * Gets the Uri of the Link for the relation "AsBitmap".
    * Returns the Uri of the Link for the relation "AsBitmap", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getAsBitmapRelationLink() {
        return MethodInvocation.getLink(this, links, "asBitmap");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AsBitmap".
    */
    public InputStream getInputStreamFromAsBitmapRelation() {
        return MethodInvocation.get(this, links, "asBitmap", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AsBitmap" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromAsBitmapRelationAsync() {
        return MethodInvocation.getAsync(this, links, "asBitmap", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AsBitmap" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromAsBitmapRelationAsync(CancellationToken ct) {
        return MethodInvocation.getAsync(this, links, "asBitmap", InputStream.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "AsBitmap".
    */
    public InputStream postToAsBitmapRelationForInputStream(FormFieldValues data) {
        return MethodInvocation.<InputStream, FormFieldValues> post(this, links, "asBitmap", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFields"), FormFieldValues.class, null, data), "application/vnd.docuware.platform.formfieldvalues+xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "AsBitmap" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToAsBitmapRelationForInputStreamAsync(FormFieldValues data) {
        return MethodInvocation.<InputStream, FormFieldValues >postAsync(this, links, "asBitmap", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFields"), FormFieldValues.class, null, data), "application/vnd.docuware.platform.formfieldvalues+xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "AsBitmap" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToAsBitmapRelationForInputStreamAsync(CancellationToken ct, FormFieldValues data) {
        return MethodInvocation.<InputStream, FormFieldValues >postAsync(this, links, "asBitmap", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFields"), FormFieldValues.class, null, data), "application/vnd.docuware.platform.formfieldvalues+xml", "application/xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "AsSvg".
    * Returns the Uri of the Link for the relation "AsSvg", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getAsSvgRelationLink() {
        return MethodInvocation.getLink(this, links, "asSvg");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AsSvg".
    */
    public InputStream getInputStreamFromAsSvgRelation() {
        return MethodInvocation.get(this, links, "asSvg", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AsSvg" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromAsSvgRelationAsync() {
        return MethodInvocation.getAsync(this, links, "asSvg", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AsSvg" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromAsSvgRelationAsync(CancellationToken ct) {
        return MethodInvocation.getAsync(this, links, "asSvg", InputStream.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "AsSvg".
    */
    public InputStream postToAsSvgRelationForInputStream(FormFieldValues data) {
        return MethodInvocation.<InputStream, FormFieldValues> post(this, links, "asSvg", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFields"), FormFieldValues.class, null, data), "application/vnd.docuware.platform.formfieldvalues+xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "AsSvg" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToAsSvgRelationForInputStreamAsync(FormFieldValues data) {
        return MethodInvocation.<InputStream, FormFieldValues >postAsync(this, links, "asSvg", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFields"), FormFieldValues.class, null, data), "application/vnd.docuware.platform.formfieldvalues+xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "AsSvg" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToAsSvgRelationForInputStreamAsync(CancellationToken ct, FormFieldValues data) {
        return MethodInvocation.<InputStream, FormFieldValues >postAsync(this, links, "asSvg", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFields"), FormFieldValues.class, null, data), "application/vnd.docuware.platform.formfieldvalues+xml", "application/xml", ct);
    }



}
