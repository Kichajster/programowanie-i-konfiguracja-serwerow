package visitor.model;

import lombok.AllArgsConstructor;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.json.bind.annotation.JsonbProperty;

import java.util.Date;

@AllArgsConstructor
public class SmsModel {
    @JsonbProperty("recipient")
    private String recipient;
    @JsonbProperty("sender")
    private String sender;

    @JsonbProperty("message")
    private String message;

    @JsonbDateFormat("dd-MM-yyyy")
    private Date sendDate;

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }
}
