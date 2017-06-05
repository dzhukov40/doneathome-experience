package doneathome.restSecond.controller.chat;

import doneathome.restSecond.model.Contact;
import doneathome.restSecond.model.Message;
import doneathome.restSecond.util.Status;

import java.util.List;

/**
 * Created by dzhukov on 29.05.17.
 */
public interface Chat {
    Status sendMessage(Message message);
    List<Message> getMessage(Contact contact);
}
