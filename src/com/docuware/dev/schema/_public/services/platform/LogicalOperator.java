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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r LogicalOperator complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LogicalOperator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="DefaultOperator" use="required" type="{http://dev.docuware.com/schema/public/services/platform}DialogExpressionOperation" />
 *       &lt;attribute name="Show" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogicalOperator")
public class LogicalOperator  {

    @XmlAttribute(name = "DefaultOperator", required = true)
    protected DialogExpressionOperation defaultOperator;
    @XmlAttribute(name = "Show", required = true)
    protected boolean show;

    /**
     * Ruft den Wert der defaultOperator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DialogExpressionOperation }
     *     
     */
    public DialogExpressionOperation getDefaultOperator() {
        return defaultOperator;
    }

    /**
     * Legt den Wert der defaultOperator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DialogExpressionOperation }
     *     
     */
    public void setDefaultOperator(DialogExpressionOperation value) {
        this.defaultOperator = value;
    }

    /**
     * Ruft den Wert der show-Eigenschaft ab.
     * 
     */
    public boolean isShow() {
        return show;
    }

    /**
     * Legt den Wert der show-Eigenschaft fest.
     * 
     */
    public void setShow(boolean value) {
        this.show = value;
    }



}