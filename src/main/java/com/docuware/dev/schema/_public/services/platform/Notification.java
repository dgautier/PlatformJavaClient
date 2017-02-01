

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.*;
import java.util.GregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notification", propOrder = {
    "timeStamp"
})
public class Notification  {

    @XmlElement(name = "TimeStamp", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected GregorianCalendar timeStamp;
    @XmlAttribute(name = "IsActive")
    protected Boolean isActive;
    @XmlAttribute(name = "Name", required = true)
    protected String name;

    /**TimeStamp when the notification was checked. Ensure that notification was happened before that time stamp*/
    public GregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**TimeStamp when the notification was checked. Ensure that notification was happened before that time stamp*/
    public void setTimeStamp(GregorianCalendar value) {
        this.timeStamp = value;
    }

    /**If this flag is true then this notification is set.*/
    public boolean isIsActive() {
        if (isActive == null) {
            return false;
        } else {
            return isActive;
        }
    }

    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**Gets or sets the name of this notification.*/
    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }



}
