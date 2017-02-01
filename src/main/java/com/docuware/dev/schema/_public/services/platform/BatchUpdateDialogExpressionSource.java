

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchUpdateDialogExpressionSource", propOrder = {
    "expression"
})
public class BatchUpdateDialogExpressionSource
    extends BatchUpdateSource
 {

    @XmlElement(name = "Expression", required = true)
    protected DialogExpression expression;

    /**A dialog expression which is used to get the documents to be updated.*/
    public DialogExpression getExpression() {
        return expression;
    }

    /**A dialog expression which is used to get the documents to be updated.*/
    public void setExpression(DialogExpression value) {
        this.expression = value;
    }



}
