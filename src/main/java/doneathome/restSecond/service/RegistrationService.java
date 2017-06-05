package doneathome.restSecond.service;

import doneathome.restSecond.dao.api.UserDao;
import doneathome.restSecond.model.User;
import doneathome.restSecond.util.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dzhukov on 01.06.17.
 */
@Service
public class RegistrationService {

    @Autowired
    private UserDao userDao;


    public Status registration(User user) {


        return new Status();
    }

    public Status logIn(User user){
        Status status = new Status();

        return status;
    }

    public Status logOut(User user){
        Status status = new Status();

        return status;
    }


}
