package doneathome.restSecond.controller.registration;

import doneathome.restSecond.model.User;
import doneathome.restSecond.service.RegistrationService;
import doneathome.restSecond.util.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dzhukov on 29.05.17.
 */
@RestController
public class RegistrationController implements Registration {

    @Autowired
    RegistrationService registrationService;

    @Override
    @RequestMapping(value = RegistrationRestURI.REGISTRATION, method = RequestMethod.POST)
    public @ResponseBody Status registration(@RequestBody User user) {

        // TODO: регистрируем пользователя в системе, если логин не занят

        registrationService.registration(user);

        return null;
    }

    @Override
    @RequestMapping(value = RegistrationRestURI.REGISTRATION_LOG_IN, method = RequestMethod.POST)
    public @ResponseBody Status logIn(@RequestBody User user) {

        // TODO: логинимся в системе

        return null;
    }

    @Override
    @RequestMapping(value = RegistrationRestURI.REGISTRATION_LOG_OUT, method = RequestMethod.POST)
    public @ResponseBody Status logOut(@RequestBody User user) {

        // TODO: выходим из системы

        return null;
    }
}
