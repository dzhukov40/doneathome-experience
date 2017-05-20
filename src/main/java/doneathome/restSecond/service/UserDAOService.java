package doneathome.restSecond.service;

import doneathome.restSecond.model.User;

import java.util.List;

/**
 * Created by dzhukov on 09.05.17.
 */
public interface UserDAOService {

    public User getUser(int id);
    public List<User> getUserList();
    public boolean setUser(User user);
    public User updateUser(User user);
    public User removeUser(int id);

}
