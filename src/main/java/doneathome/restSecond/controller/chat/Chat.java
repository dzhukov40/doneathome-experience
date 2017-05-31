package doneathome.restSecond.controller.chat;

import doneathome.restSecond.model.Contact;
import doneathome.restSecond.model.Mesage;
import doneathome.restSecond.model.User;
import doneathome.restSecond.util.Status;

import java.util.List;

/**
 * Created by dzhukov on 29.05.17.
 */
public interface Chat {
    Status sendMessage(Mesage mesage);
    List<Mesage> getMessage(Contact contact);
}
