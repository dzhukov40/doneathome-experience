package doneathome.restSecond.controller.chat;

import doneathome.restSecond.controller.registration.RegistrationRestURI;
import doneathome.restSecond.model.Contact;
import doneathome.restSecond.model.Mesage;
import doneathome.restSecond.util.Status;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by dzhukov on 29.05.17.
 */
@RestController
public class ChatController implements Chat {

    @Override
    @RequestMapping(value = ChatRestURI.CHAT_SEND_MESSAGE, method = RequestMethod.POST)
    public @ResponseBody Status sendMessage(@RequestBody Mesage mesage) {

        // TODO: отправляем сообщение от этого залогиненного пользователя в определенный контакт

        return null;
    }

    @Override
    @RequestMapping(value = ChatRestURI.REGISTRATION_GET_MESSAGE, method = RequestMethod.POST)
    public @ResponseBody List<Mesage> getMessage(@RequestBody Contact contact) {

        // TODO: получаем сообщения из указанного контакта

        return null;
    }
}
