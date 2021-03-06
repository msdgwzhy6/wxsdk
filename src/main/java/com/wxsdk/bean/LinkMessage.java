package com.wxsdk.bean;

import com.wxsdk.bean.EventMessage.EventType;
import org.dom4j.Element;

/**
 *
 * User: free anuo
 * Date: 13-5-3
 * Time: 下午10:29
 * 链接消息
 */
public class LinkMessage extends Message {

    private String title;
    private String description;
    private String url;
    private EventType eventType;

    public LinkMessage(Element element_) {
        super(element_);
        this.setTitle(element_.elementTextTrim("Title"));
        this.setDescription(element_.elementTextTrim("Description"));
        this.setUrl(element_.elementTextTrim("Url"));
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
