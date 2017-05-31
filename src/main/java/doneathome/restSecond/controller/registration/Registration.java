package doneathome.restSecond.controller.registration;

import doneathome.restSecond.model.User;
import doneathome.restSecond.util.Status;

/**
 * Created by dzhukov on 29.05.17.
 */
public interface Registration {
    Status registration(User user);
    Status logIn(User user);
    Status logOut(User user);
}
