

package com.docuware.dev._public.intellix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gridTable", propOrder = {
    "gridCol",
    "gridRow"
})
public class GridTable  {

    @XmlElement(type = Integer.class)
    protected List<Integer> gridCol;
    @XmlElement(type = Integer.class)
    protected List<Integer> gridRow;

    /**ArrayList is required for the XML-Marshalling */
    public void setGridCol(ArrayList<Integer> value) {
        gridCol=value;
    }

    public List<Integer> getGridCol() {
        if (gridCol == null) {
            gridCol = new ArrayList<Integer>();
        }
        return this.gridCol;
    }

    /**ArrayList is required for the XML-Marshalling */
    public void setGridRow(ArrayList<Integer> value) {
        gridRow=value;
    }

    public List<Integer> getGridRow() {
        if (gridRow == null) {
            gridRow = new ArrayList<Integer>();
        }
        return this.gridRow;
    }



}
