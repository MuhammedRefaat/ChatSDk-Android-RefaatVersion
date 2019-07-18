package co.chatsdk.ui.chat;

public class MessageGotSentEvent {

    public boolean success;
    public boolean isImage;

    public MessageGotSentEvent(boolean success, boolean isImage) {
        this.success = success;
        this.isImage = isImage;
    }

}
