package com.montalvo.chatserver.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Message {
    private String senderName;
    private String receiverName;
    private String message;
    private String date;
    private Status status;

    public String getSenderName() {
        return this.senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return this.receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
