

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.Eagle;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogExpression", propOrder = {
    "condition",
    "additionalCabinets"
})
public class DialogExpression
    extends ResultListQuery
 {

    @XmlElement(name = "Condition")
    protected List<DialogExpressionCondition> condition;
    @XmlElement(name = "AdditionalCabinets")
    protected List<String> additionalCabinets;
    @XmlAttribute(name = "Operation", required = true)
    protected DialogExpressionOperation operation;

    /**ArrayList is required for the XML-Marshalling */
    public void setCondition(ArrayList<DialogExpressionCondition> value) {
        condition=value;
    }

    /**Gets or sets the conditions which are checked to obtain the search result.*/
    public List<DialogExpressionCondition> getCondition() {
        if (condition == null) {
            condition = new ArrayList<DialogExpressionCondition>();
        }
        return this.condition;
    }

    /**ArrayList is required for the XML-Marshalling */
    public void setAdditionalCabinets(ArrayList<String> value) {
        additionalCabinets=value;
    }

    /**Gets or sets the additional cabinets to search in.*/
    @Eagle
    public List<String> getAdditionalCabinets() {
        if (additionalCabinets == null) {
            additionalCabinets = new ArrayList<String>();
        }
        return this.additionalCabinets;
    }

    /**Specifies the operation between the conditions of the dialog expression.*/
    public DialogExpressionOperation getOperation() {
        return operation;
    }

    /**Specifies the operation between the conditions of the dialog expression.*/
    public void setOperation(DialogExpressionOperation value) {
        this.operation = value;
    }



}
