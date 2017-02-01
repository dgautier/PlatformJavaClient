

package com.docuware.dev.schema._public.services.platform;

import com.docuware.dev.Extensions.CompareIgnore;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewerToolbar", propOrder = {
    "controls"
})
@CompareIgnore
public class ViewerToolbar  {

    @XmlElement(name = "Controls")
    protected ViewerToolbar.Controls controls;
    @XmlAttribute(name = "Type", required = true)
    protected ViewerToolbarType type;
    @XmlAttribute(name = "Position", required = true)
    protected ToolbarPosition position;
    @XmlAttribute(name = "Visibility", required = true)
    protected ToolbarVisibility visibility;

    public ViewerToolbar.Controls getControls() {
        return controls;
    }

    public void setControls(ViewerToolbar.Controls value) {
        this.controls = value;
    }

    public ViewerToolbarType getType() {
        return type;
    }

    public void setType(ViewerToolbarType value) {
        this.type = value;
    }

    public ToolbarPosition getPosition() {
        return position;
    }

    public void setPosition(ToolbarPosition value) {
        this.position = value;
    }

    public ToolbarVisibility getVisibility() {
        return visibility;
    }

    public void setVisibility(ToolbarVisibility value) {
        this.visibility = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "toolbarControl"
    })
    public static class Controls {

        @XmlElement(name = "ToolbarControl")
        protected List<ViewerToolbarControl> toolbarControl;

    /**ArrayList is required for the XML-Marshalling */
    public void setToolbarControl(ArrayList<ViewerToolbarControl> value) {
        toolbarControl=value;
    }

        public List<ViewerToolbarControl> getToolbarControl() {
            if (toolbarControl == null) {
                toolbarControl = new ArrayList<ViewerToolbarControl>();
            }
            return this.toolbarControl;
        }

    }



}
