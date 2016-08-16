/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.Links;
import com.docuware.dev.schema._public.services.platform.CountExpression;
import com.docuware.dev.schema._public.services.platform.DialogInfo;
import com.docuware.dev.schema._public.services.platform.Document;
import com.docuware.dev.schema._public.services.platform.FileCabinet;
import com.docuware.dev.schema._public.services.platform.ImportResult;
import com.docuware.dev.schema._public.services.platform.ImportSettings;
import com.docuware.dev.schema._public.services.platform.ObjectFactory;
import com.docuware.dev.schema._public.services.platform.SearchPositionQuery;
import com.docuware.dev.schema._public.services.platform.Section;
import com.docuware.dev.schema._public.services.platform.SynchronizationSettings;
import com.sun.jersey.api.client.AsyncWebResource;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientRequest;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.ClientFilter;
import com.sun.jersey.core.header.ContentDisposition;
import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.BodyPart;
import com.sun.jersey.multipart.FormDataBodyPart;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.MultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.URI;
import java.nio.file.Files;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;

/**
 *
 * @author Patrick
 */
    /// <summary>
/// Extensions for the file cabinet.
/// </summary>
public class FileCabinetExtensionsBase {

    private static String findRelFromLink(URI uri, Links links) {
        for (Link l : links.getLink()) {
            if (uri.toString().trim().endsWith(l.getHref())) {
                return l.getRel();
            }
        }
        return null;
    }

        /// <summary>
    /// Imports asynchronously an archive in Docuware.
    /// </summary>
    /// <param name="fileCabinet">The file cabinet in which the document will be imported.</param>
    /// <param name="settings">The settings of the import.</param>
    /// <param name="file">The file which represnets the archive.</param>
    /// <returns>Returns an import result information.</returns>
    public static Future<DeserializedHttpResponseGen<ImportResult>> importArchiveAsync(FileCabinet fileCabinet, ImportSettings settings, IFileUploadInfo file) {
        String rel = findRelFromLink(fileCabinet.getImportDocumentsRelationLink(), fileCabinet.getLinks());
        MultiPart mul = getMultipart(settings, file);
        return MethodInvocation.<ImportResult, MultiPart>postMultipartAsync(fileCabinet, fileCabinet.getLinks(), rel, ImportResult.class, mul);

    }

    public static ImportResult importArchive(FileCabinet fileCabinet, ImportSettings settings, IFileUploadInfo file) {
        String rel = findRelFromLink(fileCabinet.getImportDocumentsRelationLink(), fileCabinet.getLinks());
        MultiPart mul = getMultipart(settings, file);
        return MethodInvocation.<ImportResult, MultiPart>postMultipart(fileCabinet, fileCabinet.getLinks(), rel, ImportResult.class, mul);
    }

        /// <summary>
    /// Synchronizes a document with external version.
    /// </summary>
    /// <param name="fileCabinet">The file cabinet which contains the document that will be synchronized.</param>
    /// <param name="settings">The settings of the synchronization.</param>
    /// <param name="file">The file which represnets the archive.</param>
    /// <returns>Returns an import result information from the synchronization.</returns>
    public static ImportResult synchronize(FileCabinet fileCabinet, SynchronizationSettings settings, IFileUploadInfo file) {
        String rel = findRelFromLink(fileCabinet.getImportDocumentsRelationLink(), fileCabinet.getLinks());
        MultiPart mul = getMultipart(settings, file);
        return MethodInvocation.<ImportResult, MultiPart>postMultipart(fileCabinet, fileCabinet.getLinks(), rel, ImportResult.class, mul);
    }

        /// <summary>
    /// Synchronizes a document with external version.
    /// </summary>
    /// <param name="fileCabinet">The file cabinet which contains the document that will be synchronized.</param>
    /// <param name="settings">The settings of the synchronization.</param>
    /// <param name="file">The file which represnets the archive.</param>
    /// <returns>Returns an import result information from the synchronization.</returns>
    public static Future<DeserializedHttpResponseGen<ImportResult>> synchronizeAsync(FileCabinet fileCabinet, SynchronizationSettings settings, IFileUploadInfo file) {
        String rel = findRelFromLink(fileCabinet.getImportDocumentsRelationLink(), fileCabinet.getLinks());
        MultiPart mul = getMultipart(settings, file);
        return MethodInvocation.<ImportResult, MultiPart>postMultipartAsync(fileCabinet, fileCabinet.getLinks(), rel, ImportResult.class, mul);
    }

        /// <summary>
    /// Uploads the document asynchronously.
    /// </summary>
    /// <param name="fileCabinet">The file cabinet.</param>
    /// <param name="document">The document.</param>
    /// <param name="file">The file.</param>
    /// <returns>A task which uploads the document and returns the uploaded document's metadata.</returns>
    public static Future<DeserializedHttpResponseGen<Document>> uploadDocumentAsync(FileCabinet fileCabinet, Document document, IFileUploadInfo[] file) {

        String rel = findRelFromLink(fileCabinet.getDocumentsRelationLink(), fileCabinet.getLinks());
        MultiPart mul = getMultipart(document, file);
        return MethodInvocation.<Document, MultiPart>postMultipartAsync(fileCabinet, fileCabinet.getLinks(), rel, Document.class, mul);
    }

        /// <summary>
    /// Uploads the specified document.
    /// </summary>
    /// <param name="fileCabinet">The file cabinet.</param>
    /// <param name="document">The document.</param>
    /// <param name="file">The file.</param>
    /// <returns>The uploaded document's metadata.</returns>
    public static Document uploadDocument(FileCabinet fileCabinet, Document document, IFileUploadInfo[] file) {
        String rel = findRelFromLink(fileCabinet.getDocumentsRelationLink(), fileCabinet.getLinks());
        MultiPart mul = getMultipart(document, file);
        return MethodInvocation.<Document, MultiPart>postMultipart(fileCabinet, fileCabinet.getLinks(), rel, Document.class, mul);
    }

        /// <summary>
    /// Uploads the specified document asynchronously.
    /// </summary>
    /// <param name="fileCabinet">The file cabinet.</param>
    /// <param name="file">The file.</param>
    /// <returns>A task which uploads the document and returns the uploaded document's metadata.</returns>
    public static Future<DeserializedHttpResponseGen<Document>> uploadDocumentAsync(FileCabinet fileCabinet, IFileUploadInfo[] file) {
        String rel = findRelFromLink(fileCabinet.getDocumentsRelationLink(), fileCabinet.getLinks());
        MultiPart mul = getMultipart(null, file);
        return MethodInvocation.<Document, MultiPart>postMultipartAsync(fileCabinet, fileCabinet.getLinks(), rel, Document.class, mul);

    }

        /// <summary>
    /// Uploads the specified document.
    /// </summary>
    /// <param name="fileCabinet">The file cabinet.</param>
    /// <param name="file">The file.</param>
    /// <returns>The uploaded document's metadata.</returns>
    public static Document uploadDocument(FileCabinet fileCabinet, IFileUploadInfo[] file) {
        String rel = findRelFromLink(fileCabinet.getDocumentsRelationLink(), fileCabinet.getLinks());
        MultiPart mul = getMultipart(null, file);
        return MethodInvocation.<Document, MultiPart>postMultipart(fileCabinet, fileCabinet.getLinks(), rel, Document.class, mul);

    }

        /// <summary>
    /// Uploads the document.
    /// </summary>
    /// <param name="dialog">The store dialog which is used to fill index data.</param>
    /// <param name="document">The document.</param>
    /// <param name="file">The file.</param>
    /// <returns>The uploaded document's metadata.</returns>
    public static Document uploadDocument(DialogInfo dialog, Document document, IFileUploadInfo[] file) {
        String rel = findRelFromLink(dialog.getStoreDocumentRelationLink(), dialog.getLinks());
        MultiPart mul = getMultipart(document, file);
        return MethodInvocation.<Document, MultiPart>postMultipart(dialog, dialog.getLinks(), rel, Document.class, mul);

    }

        /// <summary>
    /// Uploads the document asynchronous.
    /// </summary>
    /// <param name="dialog">The store dialog which is used to fill index data.</param>
    /// <param name="document">The document.</param>
    /// <param name="file">The file.</param>
    /// <returns>A task which uploads the document and returns the uploaded document's metadata.</returns>
    public static Future<DeserializedHttpResponseGen<Document>> uploadDocumentAsync(DialogInfo dialog, Document document, IFileUploadInfo[] file) {
        String rel = findRelFromLink(dialog.getStoreDocumentRelationLink(), dialog.getLinks());
        MultiPart mul = getMultipart(document, file);
        return MethodInvocation.<Document, MultiPart>postMultipartAsync(dialog, dialog.getLinks(), rel, Document.class, mul);

    }

    private static MultiPart getMultipart(IStringContent stringContent, IFileUploadInfo... file) {
        MultiPart multipartForm = new MultiPart();

        FormDataBodyPart stringContentFormData = new FormDataBodyPart();
        if (stringContent != null) {
            try {
                if (stringContent instanceof Document) {
                    stringContentFormData.setFormDataContentDisposition(new FormDataContentDisposition("form-data; name=\"document\"; filename=\"document.xml\""));
                    JAXBElement<Document> jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Document"), Document.class, null, (Document) stringContent);
                    stringContentFormData.setEntity(jax);
                    stringContentFormData.setMediaType(MediaType.APPLICATION_XML_TYPE);
                }
                if (stringContent instanceof SynchronizationSettings) {
                    stringContentFormData.setFormDataContentDisposition(new FormDataContentDisposition("form-data; name=\"synchronizationSettings\"; filename=\"synchronizationSettings.xml\""));
                    JAXBElement<SynchronizationSettings> jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SynchronizationSettings"), SynchronizationSettings.class, null, (SynchronizationSettings) stringContent);
                    stringContentFormData.setEntity(jax);
                    stringContentFormData.setMediaType(MediaType.APPLICATION_XML_TYPE);
                }
                if (stringContent instanceof ImportSettings) {
                    stringContentFormData.setFormDataContentDisposition(new FormDataContentDisposition("form-data; name=\"importSettings\"; filename=\"importSettings.xml\""));
                    JAXBElement<ImportSettings> jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ImportSettings"), ImportSettings.class, null, (ImportSettings) stringContent);
                    stringContentFormData.setEntity(jax);
                    stringContentFormData.setMediaType(MediaType.APPLICATION_XML_TYPE);
                }
            } catch (Exception e) {
            }

            multipartForm.bodyPart(stringContentFormData);
        }

        addMultipartFiles(multipartForm, file);

        return multipartForm;
    }

    static public FormDataBodyPart toStringContent(Document document) throws JAXBException {
        try {
            FormDataBodyPart stringContentFormData = new FormDataBodyPart();
            stringContentFormData.setFormDataContentDisposition(new FormDataContentDisposition("form-data; name=\"document\"; filename=\"document.xml\""));
            JAXBElement<Document> jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Document"), Document.class, null, document);
            stringContentFormData.setEntity(jax);
            stringContentFormData.setMediaType(MediaType.APPLICATION_XML_TYPE);
            return stringContentFormData;
        } catch (ParseException ex) {
            throw new RuntimeException(ex.getCause());
        }
    }

    static FormDataBodyPart toStringContent(ImportSettings importSettings) throws JAXBException {
        try {
            FormDataBodyPart stringContentFormData = new FormDataBodyPart();
            stringContentFormData.setFormDataContentDisposition(new FormDataContentDisposition("form-data; name=\"importSettings\"; filename=\"importSettings.xml\""));
            JAXBElement<ImportSettings> jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "importSettings"), ImportSettings.class, null, importSettings);
            stringContentFormData.setEntity(jax);
            stringContentFormData.setMediaType(MediaType.APPLICATION_XML_TYPE);
            return stringContentFormData;
        } catch (ParseException ex) {
            throw new RuntimeException(ex.getCause());
        }
    }

    static FormDataBodyPart toStringContent(SynchronizationSettings synchronizationSettings) throws JAXBException {
        try {
            FormDataBodyPart stringContentFormData = new FormDataBodyPart();
            stringContentFormData.setFormDataContentDisposition(new FormDataContentDisposition("form-data; name=\"synchronizationSettings\"; filename=\"synchronizationSettings.xml\""));
            JAXBElement<SynchronizationSettings> jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "synchronizationSettings"), SynchronizationSettings.class, null, synchronizationSettings);
            stringContentFormData.setEntity(jax);
            stringContentFormData.setMediaType(MediaType.APPLICATION_XML_TYPE);
            return stringContentFormData;
        } catch (ParseException ex) {
            throw new RuntimeException(ex.getCause());
        }
    }

    private static void addMultipartFiles(MultiPart multipartForm, IFileUploadInfo[] files) {
        LinkedList<String> l = new LinkedList();
        if (files.length > 0) {
            multipartForm.getHeaders().putSingle("X-File-ModifiedDate", files[0].getLastWriteTimeUtc().toString());
        }

        for (int i = 0; i < files.length; ++i) {

            //TarFileUploadInfo not supported yet
            if (files[i] instanceof FileWrapper) {
                File file = ((FileWrapper) files[i]).getFile();
                FileDataBodyPart f = new FileDataBodyPart("content", file);
                FormDataContentDisposition fdcd = null;
                l.add(files[i].getName());
                try {
                    fdcd = new FormDataContentDisposition("form-data; name=\"" + files[i].getName() + "\"; filename=\"" + files[i].getName() + "\"");
                } catch (ParseException ex) {
                }
                f.setContentDisposition(fdcd);
                multipartForm.bodyPart(f);
            } else {
                InputStream is = files[i].createStream();
                byte[] buffer = new byte[1024];
                try {
                    File temp = File.createTempFile("tempfile" + i, null);
                    FileOutputStream fos = new FileOutputStream(temp);
                    while (is.read(buffer) != -1) {
                        fos.write(buffer);
                    }
                    FileDataBodyPart f = new FileDataBodyPart("content", temp);
                    FormDataContentDisposition fdcd = null;
                    l.add(files[i].getName());
                    try {
                        fdcd = new FormDataContentDisposition("form-data; name=\"" + files[i].getName() + "\"; filename=\"" + files[i].getName() + "\"");
                    } catch (ParseException ex) {
                        throw new RuntimeException(ex.getCause());
                    }
                    f.setContentDisposition(fdcd);
                    multipartForm.bodyPart(f);

                } catch (Exception e) {
                    throw new RuntimeException(e.getLocalizedMessage() + e.getCause());
                }
            }
        }
    }

        /// <summary>
    /// Appends one or more new sections to the specified document.
    /// </summary>
    /// <param name="document">The document.</param>
    /// <param name="file">The file.</param>
    /// <returns>The modified document.</returns>
    public static Document addDocumentSections(Document document, IFileUploadInfo[] file) {
        String rel = findRelFromLink(document.getSelfRelationLink(), document.getLinks());
        MultiPart mul = getMultipart(null, file);
        return MethodInvocation.<Document, MultiPart>postMultipart(document, document.getLinks(), rel, Document.class, mul);
    }

        /// <summary>
    /// Appends one or more new sections to the specified document asynchronously.
    /// </summary>
    /// <param name="document">The document.</param>
    /// <param name="file">The file.</param>
    /// <returns>
    /// A task which uploads the document and returns the uploaded document's metadata.
    /// </returns>
    public static Future<DeserializedHttpResponseGen<Document>> addDocumentSectionsAsync(Document document, IFileUploadInfo[] file) {
        String rel = findRelFromLink(document.getSelfRelationLink(), document.getLinks());
        MultiPart mul = getMultipart(null, file);
        return MethodInvocation.<Document, MultiPart>postMultipartAsync(document, document.getLinks(), rel, Document.class, mul);
    }

        /// <summary>
    /// Appends one section to the specified document asynchronously.
    /// </summary>
    /// <param name="document">The document.</param>
    /// <param name="file">The file.</param>
    /// <returns>
    /// A task which uploads the document and returns the uploaded section's metadata.
    /// </returns>
    public static Future<DeserializedHttpResponseGen<Section>> uploadSectionAsync(Document document, IFileUploadInfo file) {
        String rel = findRelFromLink(document.getSectionsRelationLink(), document.getLinks());
        MultiPart mul = getMultipart(null, file);
        return MethodInvocation.<Section, MultiPart>postMultipartAsync(document, document.getLinks(), rel, Section.class, mul);
    }

        /// <summary>
    /// Uploads the specified document asynchronously in chunks.
    /// </summary>
    /// <param name="fileCabinet">The file cabinet.</param>
    /// <param name="file">The file.</param>
    /// <param name="chunkSize">Size of the chunk.</param>
    /// <returns>The uploaded document's metadata.</returns>
    public static Future<DeserializedHttpResponseGen<Document>> chunkUploadDocumentAsync(FileCabinet fileCabinet, IFileUploadInfo file, int chunkSize) {
        return FileCabinetExtensionsBase.<Document>chunkUploadFileAsync(fileCabinet.getDocumentsRelationLink(), ((IRelationsWithProxy) fileCabinet), file, chunkSize, null, Document.class);
    }

        /// <summary>
    /// Uploads the specified document in chunks.
    /// </summary>
    /// <param name="fileCabinet">The file cabinet.</param>
    /// <param name="file">The file.</param>
    /// <param name="chunkSize">Size of the chunk.</param>
    /// <returns>The uploaded document's metadata.</returns>
    public static Document chunkUploadDocument(FileCabinet fileCabinet, IFileUploadInfo file, int chunkSize) {
        return FileCabinetExtensionsBase.<Document>chunkUploadFile(fileCabinet.getDocumentsRelationLink(), ((IRelationsWithProxy) fileCabinet), file, chunkSize, null, Document.class);
    }

        /// <summary>
    /// Uploads the import package asynchronously in chunks.
    /// </summary>
    /// <param name="fileCabinet">The file cabinet.</param>
    /// <param name="file">The file.</param>
    /// <param name="chunkSize">Size of the chunk.</param>
    /// <param name="importSettings">The settings of the import.</param>
    /// <returns>Returns the result of the import operation.</returns>
    public static Future<DeserializedHttpResponseGen<ImportResult>> chunkImportArchiveAsync(FileCabinet fileCabinet, ImportSettings importSettings, IFileUploadInfo file, int chunkSize) {
        return FileCabinetExtensionsBase.<ImportResult>chunkUploadFileAsync(fileCabinet.getImportDocumentsRelationLink(), ((IRelationsWithProxy) fileCabinet), file, chunkSize, importSettings, ImportResult.class);
    }

        /// <summary>
    /// Uploads the import package in chunks.
    /// </summary>
    /// <param name="fileCabinet">The file cabinet.</param>
    /// <param name="file">The file.</param>
    /// <param name="chunkSize">Size of the chunk.</param>
    /// <param name="importSettings">The settings of the import.</param>
    /// <returns>Returns the result of the import operation.</returns>
    public static ImportResult chunkImportArchive(FileCabinet fileCabinet, ImportSettings importSettings, IFileUploadInfo file, int chunkSize) {
        return FileCabinetExtensionsBase.<ImportResult>chunkUploadFile(fileCabinet.getImportDocumentsRelationLink(), ((IRelationsWithProxy) fileCabinet), file, chunkSize, importSettings, ImportResult.class);
    }

        /// <summary>
    /// Uploads the specified synchronization package asynchronously in chunks.
    /// </summary>
    /// <param name="fileCabinet">The file cabinet.</param>
    /// <param name="file">The file.</param>
    /// <param name="chunkSize">Size of the chunk.</param>
    /// <param name="synchronizationSettings">The settings of the synchronization.</param>
    /// <returns>Returns the result of the synchronization operation.</returns>
    public static Future<DeserializedHttpResponseGen<ImportResult>> chunkSynchronizeAsync(FileCabinet fileCabinet, SynchronizationSettings synchronizationSettings, IFileUploadInfo file, int chunkSize) {
        return FileCabinetExtensionsBase.<ImportResult>chunkUploadFileAsync(fileCabinet.getImportDocumentsRelationLink(), ((IRelationsWithProxy) fileCabinet), file, chunkSize, synchronizationSettings, ImportResult.class);
    }

        /// <summary>
    /// Uploads the specified synchronization package in chunks.
    /// </summary>
    /// <param name="fileCabinet">The file cabinet.</param>
    /// <param name="file">The file.</param>
    /// <param name="chunkSize">Size of the chunk.</param>
    /// <param name="synchronizationSettings">The settings of the synchronization.</param>
    /// <returns>Returns the result of the synchronization operation.</returns>
    public static ImportResult chunkSynchronize(FileCabinet fileCabinet, SynchronizationSettings synchronizationSettings, IFileUploadInfo file, int chunkSize) {
        return FileCabinetExtensionsBase.<ImportResult>chunkUploadFile(fileCabinet.getImportDocumentsRelationLink(), ((IRelationsWithProxy) fileCabinet), file, chunkSize, synchronizationSettings, ImportResult.class);
    }

        /// <summary>
    /// Uploads the specified asynchronously document in chunks.
    /// </summary>
    /// <param name="fileCabinet">The file cabinet.</param>
    /// <param name="files">The files.</param>
    /// <param name="chunkSize">Size of the chunk.</param>
    /// <returns>The uploaded document's metadata.</returns>
    public static Future<DeserializedHttpResponseGen<Document>> chunkUploadDocumentAsync(FileCabinet fileCabinet, IFileUploadInfo[] files, int chunkSize) {
        return FileCabinetExtensionsBase.<Document>chunkUploadFileAsync(fileCabinet.getDocumentsRelationLink(), ((IRelationsWithProxy) fileCabinet), files, chunkSize, null);
    }

        /// <summary>
    /// Upload the specified document in chunks.
    /// </summary>
    /// <param name="fileCabinet">The file cabinet.</param>
    /// <param name="files">The files.</param>
    /// <param name="chunkSize">Size of the chunk.</param>
    /// <returns>The uploaded document's metadata.</returns>
    public static Document chunkUploadDocument(FileCabinet fileCabinet, IFileUploadInfo[] files, int chunkSize) {
        return FileCabinetExtensionsBase.<Document>chunkUploadFile(fileCabinet.getDocumentsRelationLink(), ((IRelationsWithProxy) fileCabinet), files, chunkSize, null);
    }

        /// <summary>
    /// Upload the specified document asynchronously in chunks.
    /// </summary>
    /// <param name="fileCabinet">The file cabinet.</param>
    /// <param name="file">The file.</param>
    /// <param name="chunkSize">Size of the chunk.</param>
    /// <param name="document">The document.</param>
    /// <returns>The uploaded document's metadata.</returns>
    public static Future<DeserializedHttpResponseGen<Document>> chunkUploadDocumentAsync(FileCabinet fileCabinet, Document document, IFileUploadInfo file, int chunkSize) {
        return FileCabinetExtensionsBase.<Document>chunkUploadFileAsync(fileCabinet.getDocumentsRelationLink(), ((IRelationsWithProxy) fileCabinet), file, chunkSize, document, Document.class);
    }

        /// <summary>
    /// Upload the specified document in chunks.
    /// </summary>
    /// <param name="fileCabinet">The file cabinet.</param>
    /// <param name="file">The file.</param>
    /// <param name="chunkSize">Size of the chunk.</param>
    /// <param name="document">The document.</param>
    /// <returns>The uploaded document's metadata.</returns>
    public static Document chunkUploadDocument(FileCabinet fileCabinet, Document document, IFileUploadInfo file, int chunkSize) {
        return FileCabinetExtensionsBase.<Document>chunkUploadFile(fileCabinet.getDocumentsRelationLink(), ((IRelationsWithProxy) fileCabinet), file, chunkSize, document, Document.class);
    }

        /// <summary>
    /// Upload the specified document asynchronously in chunks.
    /// </summary>
    /// <param name="fileCabinet">The file cabinet.</param>
    /// <param name="files">The files.</param>
    /// <param name="chunkSize">Size of the chunk.</param>
    /// <param name="document">The document.</param>
    /// <returns>The uploaded document's metadata.</returns>
    public static Future<DeserializedHttpResponseGen<Document>> chunkUploadDocumentAsync(FileCabinet fileCabinet, Document document, IFileUploadInfo[] files, int chunkSize) {
        return FileCabinetExtensionsBase.<Document>chunkUploadFileAsync(fileCabinet.getDocumentsRelationLink(), (IRelationsWithProxy) fileCabinet, files, chunkSize, document);
    }

        /// <summary>
    /// Upload the specified document in chunks.
    /// </summary>
    /// <param name="fileCabinet">The file cabinet.</param>
    /// <param name="files">The files.</param>
    /// <param name="chunkSize">Size of the chunk.</param>
    /// <param name="document">The document.</param>
    /// <returns>The uploaded document's metadata.</returns>
    public static Document chunkUploadDocument(FileCabinet fileCabinet, Document document, IFileUploadInfo[] files, int chunkSize) {
        return FileCabinetExtensionsBase.<Document>chunkUploadFile(fileCabinet.getDocumentsRelationLink(), (IRelationsWithProxy) fileCabinet, files, chunkSize, document);
    }

        /// <summary>
    /// Upload the specified document asynchronously in chunks.
    /// </summary>
    /// <param name="dialog">The store dialog which is used to fill index data.</param>
    /// <param name="file">The file.</param>
    /// <param name="chunkSize">Size of the chunk.</param>
    /// <param name="document">The document.</param>
    /// <returns>The uploaded document's metadata.</returns>
    public static Future<DeserializedHttpResponseGen<Document>> chunkUploadDocumentAsync(DialogInfo dialog, Document document, IFileUploadInfo file, int chunkSize) {
        return FileCabinetExtensionsBase.<Document>chunkUploadFileAsync(dialog.getStoreDocumentRelationLink(), (IRelationsWithProxy) dialog, file, chunkSize, document, Document.class);
    }

        /// <summary>
    /// Upload the specified document in chunks.
    /// </summary>
    /// <param name="dialog">The store dialog which is used to fill index data.</param>
    /// <param name="file">The file.</param>
    /// <param name="chunkSize">Size of the chunk.</param>
    /// <param name="document">The document.</param>
    /// <returns>The uploaded document's metadata.</returns>
    public static Document chunkUploadDocument(DialogInfo dialog, Document document, IFileUploadInfo file, int chunkSize) {
        return FileCabinetExtensionsBase.<Document>chunkUploadFile(dialog.getStoreDocumentRelationLink(), (IRelationsWithProxy) dialog, file, chunkSize, document, Document.class);
    }

        /// <summary>
    /// Upload the specified document asynchronously in chunks.
    /// </summary>
    /// <param name="dialog">The store dialog which is used to fill index data.</param>
    /// <param name="document">The document.</param>
    /// <param name="files">The files.</param>
    /// <param name="chunkSize">Size of the chunk.</param>
    /// <returns></returns>
    public static Future<DeserializedHttpResponseGen<Document>> chunkUploadDocumentAsync(DialogInfo dialog, Document document, IFileUploadInfo[] files, int chunkSize) {
        return FileCabinetExtensionsBase.<Document>chunkUploadFileAsync(dialog.getStoreDocumentRelationLink(), (IRelationsWithProxy) dialog, files, chunkSize, document);
    }

        /// <summary>
    /// Upload the specified document in chunks.
    /// </summary>
    /// <param name="dialog">The store dialog which is used to fill index data.</param>
    /// <param name="document">The document.</param>
    /// <param name="files">The files.</param>
    /// <param name="chunkSize">Size of the chunk.</param>
    /// <returns></returns>
    public static Document chunkUploadDocument(DialogInfo dialog, Document document, IFileUploadInfo[] files, int chunkSize) {
        return FileCabinetExtensionsBase.<Document>chunkUploadFile(dialog.getStoreDocumentRelationLink(), (IRelationsWithProxy) dialog, files, chunkSize, document);
    }

        /// <summary>
    /// Replaces the content of a section with the passed file asynchronously.
    /// Uploads the specified file in chunks.
    /// </summary>
    /// <param name="section">The section whose content is replaced.</param>
    /// <param name="file">The file.</param>
    /// <param name="chunkSize">Size of the chunk.</param>
    /// <returns>The changed section's metadata.</returns>
    public static Future<DeserializedHttpResponseGen<Section>> chunkUploadSectionAsync(Section section, IFileUploadInfo file, int chunkSize) {
        return FileCabinetExtensionsBase.<Section>chunkUploadFileAsync(section.getContentRelationLink(), (IRelationsWithProxy) section, file, chunkSize, null, Section.class);
    }

        /// <summary>
    /// Replaces the content of a section with the passed file
    /// Uploads the specified file in chunks.
    /// </summary>
    /// <param name="section">The section whose content is replaced.</param>
    /// <param name="file">The file.</param>
    /// <param name="chunkSize">Size of the chunk.</param>
    /// <returns>The changed section's metadata.</returns>
    public static Section chunkUploadSection(Section section, IFileUploadInfo file, int chunkSize) {
        return FileCabinetExtensionsBase.<Section>chunkUploadFile(section.getContentRelationLink(), (IRelationsWithProxy) section, file, chunkSize, null, Section.class);
    }

        /// <summary>
    /// Adds a section to a document asynchronously using chunked upload.
    /// </summary>
    /// <param name="document">The document.</param>
    /// <param name="file">The file.</param>
    /// <param name="chunkSize">Size of the chunk in bytes.</param>
    /// <returns>The new section's metadata.</returns>*/
    public static Future<DeserializedHttpResponseGen<Section>> chunkAddSectionAsync(Document document, IFileUploadInfo file, int chunkSize) {
        return FileCabinetExtensionsBase.<Section>chunkUploadFileAsync(document.getSectionsRelationLink(), ((IRelationsWithProxy) document), file, chunkSize, null, Section.class);
    }

        /// <summary>
    /// Adds a section to a document using chunked upload.
    /// </summary>
    /// <param name="document">The document.</param>
    /// <param name="file">The file.</param>
    /// <param name="chunkSize">Size of the chunk in bytes.</param>
    /// <returns>The new section's metadata.</returns>
    public static Section chunkAddSection(Document document, IFileUploadInfo file, int chunkSize) {
        return FileCabinetExtensionsBase.<Section>chunkUploadFile(document.getSectionsRelationLink(), ((IRelationsWithProxy) document), file, chunkSize, null, Section.class);
    }

    private static Document chunkUploadFile(URI link, IRelationsWithProxy proxy, IFileUploadInfo[] files, int chunkSize, Document document) {
        try (TarArchiveFileUploadInfo tarArchive = new TarArchiveFileUploadInfo(files)) {
            return FileCabinetExtensionsBase.<Document>chunkUploadFile(link, proxy, tarArchive, chunkSize, document, Document.class);
        } catch (Exception e) {
            throw new RuntimeException(e.getCause());
        }
    }

    private static Future<DeserializedHttpResponseGen<Document>> chunkUploadFileAsync(URI link, IRelationsWithProxy proxy, IFileUploadInfo[] files, int chunkSize, Document document) {
        try (TarArchiveFileUploadInfo tarArchive = new TarArchiveFileUploadInfo(files)) {
            return FileCabinetExtensionsBase.<Document>chunkUploadFileAsync(link, proxy, tarArchive, chunkSize, document, Document.class);
        } catch (Exception e) {
            throw new RuntimeException(e.getCause());
        }
    }

    private static <T extends IChunkable> T chunkUploadFile(URI link, IRelationsWithProxy proxy, IFileUploadInfo file, int chunkSize, IStringContent stringContent, Class<T> expectedClass) {

        if (chunkSize == 0) {
            chunkSize = EasyUploadDefaults.chunkSize;
        }
        final int cs = chunkSize;

        String contentType = file.getContentType();
        URI l = link;
        try {
            try (InputStream fs = file.createStream()) {

                int bytesRead = 0;
                long length = fs.available();
                byte[] buffer = new byte[cs];
                boolean addDocumentMetaData = stringContent != null;
                System.out.println(length);
                while ((bytesRead = fs.read(buffer, 0, cs > fs.available() ? fs.available() : cs)) > 0) {
                    System.out.println(bytesRead);
                    if (fs.available() == 0) {
                        byte[] b = new byte[bytesRead];
                        System.arraycopy(buffer, 0, b, 0, b.length);
                        buffer = b;
                    }
                    try (ByteArrayInputStream streamContent = new ByteArrayInputStream(buffer)) {

                        // In case there is document meta data attached, we create a multi-part body to send the index
                        // data together with the first chunk.
                        // In most cases (when the document is small) this causes only a single request.
                        String rel = findRelFromLink(link, proxy.getLinks());
                        T doc;
                        ClientResponse resp;
                        if (addDocumentMetaData == true) {
                            MultiPart mul;
                            BodyPart bp = new BodyPart(streamContent, MediaType.valueOf(file.getContentType()));
                            bp.getHeaders().add(HttpHeaders.CONTENT_TYPE, file.getContentType());
                            bp.setContentDisposition(new ContentDisposition("form-data; name=\"indexdata\"; fileName=\"" + file.getName() + "\";"));
                            mul = getMultipart(stringContent);
                            mul.bodyPart(bp);
                            // We do not send the document meta data with the next chunks.
                            addDocumentMetaData = false;
                            l = link.equals(l) ? LinkResolver.getLink(proxy.getProxy().getBaseAddress(), proxy.getLinks(), rel) : l;
                            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(l);
                            resp = web.header("Content-Disposition", "inline; filename=\"" + file.getName() + "\";")
                                    .header("X-File-Name", file.getName())
                                    .header("X-File-Size", "" + length)
                                    .header("X-File-ModifiedDate", file.getLastWriteTimeUtc().toString())
                                    .header("Expect", "100-continue")
                                    .type(MediaType.MULTIPART_FORM_DATA).post(ClientResponse.class, mul);
                            doc = resp.getEntity(expectedClass);
                        } else {

                            l = link.equals(l) ? LinkResolver.getLink(proxy.getProxy().getBaseAddress(), proxy.getLinks(), rel) : l;
                            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(l);
                            resp = web//.header(HttpHeaders.COOKIE, ".DWPLATFORMAUTH=902EB067D55C421B0D2EA08A58BB9C49B67808A51DF57411AC8E92CA537794FE9FDC4AB2404601B14BF6141E27550C2D1D7146023DA0A638BF30F2AF2219291E8845A5CC3AD57D0F58A823DAD017B92FC23647F790BAFE99A3748D15EE8D829D6C5E383898EFDECA231DC9633FE36B70BEF100A858DDD428D3F699816F87DE020D971776BE4E635701F2788AE9AF30513D577B48E7B4CADB115FD05FE57AE3FDD47B8F6AE55717F0813864CB4BAEF7AA03DEF0201BB9F04392650008A94A620A9787B0A0CFCC967309A74C75472A00687AFC2DC1713A5200D8F0F2E9FE9229FE203CDDCC66C81890183F18F199DF4C9269877E44AC92CC0F7089F693172DCF9B2B85FA6D3E883D5BC495746F01F600F37DE697CF3AFCF6DD8C4297E157319923413FC9FD063212F0DD1291F5E94C1E2E28E2C1BC6931E3495D3EED1A50B3FC1948BD86A5386D2F5C89B142C22CEC62B486D200CCEB81161519937FB7F9D70C928922300C17915355CB2DDB667557762FD669716BAF996539D6B60D5110D87499654C46F66094F68B411F3B6EF31CCA94C29A8B11; DWPLATFORMBROWSERID=DD6D5AE890C4496E3178E4C8AB126750A7CEFC047E579B13E4C79182E794EEBD99AF696FD7C2DB9FDBB0E7354B163AC6441837779D1F65A31B9B765AE22B1F288C2166374EB8C6D99096AF59419ACCA3296C0F682917B6FA77653EB8A710F8F25C93D2E478A780147C4447811EA4E1F9587FF3926053398628AF7064FCC07A456E0794C086E788C0F1A3C540DB5451887D7551567B6E93C8766650A98694C9348AB4CB58606B990AD8A9EE40C6757F21820F7FDE; ARRAffinity=3f69d05b7482b58fab9ae7fcc49c89deb82bd7b72f50fe9f8cc15991525b8441")
                                    .header(HttpHeaders.CONTENT_TYPE, file.getContentType())
                                    .header("Content-Disposition", "inline; filename=\"" + file.getName() + "\";")
                                    .header("X-File-Name", file.getName()).header("X-File-Size", "" + length)
                                    .header("X-File-ModifiedDate", file.getLastWriteTimeUtc().toString())
                                    .header(HttpHeaders.CONTENT_LENGTH, "" + buffer.length)
                                    .header("Expect", "" + cs + "-continue")
                                    .post(ClientResponse.class, streamContent);
                            doc = resp.getEntity(expectedClass);
                            resp.close();
                        }
                        if (doc instanceof IHttpClientProxy) {
                            ((IHttpClientProxy) doc).setProxy(proxy.getProxy());
                        }
                        if (doc.getFileChunk() == null || doc.getFileChunk().isFinished()) {
                            return doc;
                        } else {
                            l = doc.getFileChunk().getNextRelationLink();
                        }
                    } catch (ParseException ex) {
                        Logger.getLogger(FileCabinetExtensionsBase.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (Exception e) {
            for (StackTraceElement s : e.getStackTrace()) {
                System.err.println(s);
            }
            throw new RuntimeException(e.fillInStackTrace());
        }
        throw new RuntimeException("Chunk upload was not finished even entire file was uploaded.");
    }

    private static <T extends IChunkable> Future<DeserializedHttpResponseGen<T>> chunkUploadFileAsync(URI link, IRelationsWithProxy proxy, IFileUploadInfo file, int chunkSize, IStringContent stringContent, Class<T> expectedClass) {

        if (chunkSize == 0) {
            chunkSize = EasyUploadDefaults.chunkSize;
        }
        final int cs = chunkSize;

        String contentType = file.getContentType();
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            URI l = link;
            try {
                try (InputStream fs = file.createStream()) {
                    int bytesRead = 0;
                    int length = fs.available();
                    System.out.println(length);
                    byte[] buffer = new byte[cs];
                    boolean addDocumentMetaData = stringContent != null;

                    int i = 0;
                    while ((bytesRead = fs.read(buffer, 0, cs > fs.available() ? fs.available() : cs)) > 0) {
                        i++;
                        if (fs.available() < 1) {
                            byte[] b = new byte[bytesRead];
                            System.arraycopy(buffer, 0, b, 0, b.length);
                            buffer = b;
                        }
                        try (ByteArrayInputStream streamContent = new ByteArrayInputStream(buffer)) {

                        // In case there is document meta data attached, we create a multi-part body to send the index
                            // data together with the first chunk.
                            // In most cases (when the document is small) this causes only a single request.
                            String rel = findRelFromLink(link, proxy.getLinks());
                            T doc;
                            ClientResponse resp;
                            if (addDocumentMetaData) {
                                MultiPart mul;
                                FormDataMultiPart mult = new FormDataMultiPart();
                                BodyPart bp = new BodyPart(streamContent, MediaType.valueOf(file.getContentType()));
                                bp.getHeaders().add(HttpHeaders.CONTENT_TYPE, file.getContentType());
                                bp.setContentDisposition(new ContentDisposition("form-data; name=\"indexdata\"; fileName=\"" + file.getName() + "\";"));
                                mul = getMultipart(stringContent);
                                mul.bodyPart(bp);
                                // We do not send the document meta data with the next chunks.
                                addDocumentMetaData = false;
                                l = link.equals(l) ? LinkResolver.getLink(proxy.getProxy().getBaseAddress(), proxy.getLinks(), rel) : l;
                                WebResource web = proxy.getProxy().getHttpClient().getClient().resource(l);
                                resp = web.header("Content-Disposition", "inline; filename=\"" + file.getName() + "\";")
                                        .header("X-File-Name", file.getName())
                                        .header("X-File-Size", "" + length)
                                        .header("X-File-ModifiedDate", file.getLastWriteTimeUtc().toString())
                                        .header("Expect", "100-continue")
                                        .type(MediaType.MULTIPART_FORM_DATA).post(ClientResponse.class, mul);
                                doc = resp.getEntity(expectedClass);
                            } else {

                                l = link.equals(l) ? LinkResolver.getLink(proxy.getProxy().getBaseAddress(), proxy.getLinks(), rel) : l;
                                WebResource web = proxy.getProxy().getHttpClient().getClient().resource(l);
                                resp = web//.header(HttpHeaders.COOKIE, ".DWPLATFORMAUTH=902EB067D55C421B0D2EA08A58BB9C49B67808A51DF57411AC8E92CA537794FE9FDC4AB2404601B14BF6141E27550C2D1D7146023DA0A638BF30F2AF2219291E8845A5CC3AD57D0F58A823DAD017B92FC23647F790BAFE99A3748D15EE8D829D6C5E383898EFDECA231DC9633FE36B70BEF100A858DDD428D3F699816F87DE020D971776BE4E635701F2788AE9AF30513D577B48E7B4CADB115FD05FE57AE3FDD47B8F6AE55717F0813864CB4BAEF7AA03DEF0201BB9F04392650008A94A620A9787B0A0CFCC967309A74C75472A00687AFC2DC1713A5200D8F0F2E9FE9229FE203CDDCC66C81890183F18F199DF4C9269877E44AC92CC0F7089F693172DCF9B2B85FA6D3E883D5BC495746F01F600F37DE697CF3AFCF6DD8C4297E157319923413FC9FD063212F0DD1291F5E94C1E2E28E2C1BC6931E3495D3EED1A50B3FC1948BD86A5386D2F5C89B142C22CEC62B486D200CCEB81161519937FB7F9D70C928922300C17915355CB2DDB667557762FD669716BAF996539D6B60D5110D87499654C46F66094F68B411F3B6EF31CCA94C29A8B11; DWPLATFORMBROWSERID=DD6D5AE890C4496E3178E4C8AB126750A7CEFC047E579B13E4C79182E794EEBD99AF696FD7C2DB9FDBB0E7354B163AC6441837779D1F65A31B9B765AE22B1F288C2166374EB8C6D99096AF59419ACCA3296C0F682917B6FA77653EB8A710F8F25C93D2E478A780147C4447811EA4E1F9587FF3926053398628AF7064FCC07A456E0794C086E788C0F1A3C540DB5451887D7551567B6E93C8766650A98694C9348AB4CB58606B990AD8A9EE40C6757F21820F7FDE; ARRAffinity=3f69d05b7482b58fab9ae7fcc49c89deb82bd7b72f50fe9f8cc15991525b8441")
                                        .header(HttpHeaders.CONTENT_TYPE, file.getContentType())
                                        .header("Content-Disposition", "inline; filename=\"" + file.getName() + "\";")
                                        .header("X-File-Name", file.getName()).header("X-File-Size", "" + length)
                                        .header("X-File-ModifiedDate", file.getLastWriteTimeUtc().toString())
                                        .header(HttpHeaders.CONTENT_LENGTH, "" + buffer.length)
                                        .header("Expect", "100-continue")
                                        .post(ClientResponse.class, streamContent);
                                doc = resp.getEntity(expectedClass);
                                resp.close();
                            }
                            if (doc instanceof IHttpClientProxy) {
                                ((IHttpClientProxy) doc).setProxy(proxy.getProxy());
                            }
                            if (doc.getFileChunk() == null || doc.getFileChunk().isFinished()) {
                                return new DeserializedHttpResponseGen<T>(resp, doc);
                            } else {
                                l = doc.getFileChunk().getNextRelationLink();
                            }
                        } catch (ParseException ex) {
                            Logger.getLogger(FileCabinetExtensionsBase.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            } catch (Exception e) {
                for (StackTraceElement s : e.getStackTrace()) {
                    System.err.println(s);
                }
                throw new RuntimeException(e.fillInStackTrace());
            }
            throw new RuntimeException("Chunk upload was not finished even entire file was uploaded.");
        });
    }

    class EasyUploadDefaults {

        static final int chunkSize = 3000000;
        static final int maxSingleFileChunkSize = 2 * chunkSize;
    }

}