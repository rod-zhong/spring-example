package net.rod.demo.vo;

import java.io.Serializable;

/**
 * Created by Rod on 9/13/2016.
 */
public class MessageVO implements Serializable {
    private String messageTitle;
    private String messageContent;

    public MessageVO(String messageTitle, String messageContent) {
        this.messageTitle = messageTitle;
        this.messageContent = messageContent;
    }

    public MessageVO() {
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }


    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }
}
