package doneathome.restSecond.dao.api;

import doneathome.restSecond.dao.base.Dao;
import doneathome.restSecond.model.User;

import java.util.List;

/**
 * Created by dzhukov on 15.05.17.
 */
public interface UserDao extends Dao<User> {
    User getUserByName(String name);
    List<User> getUserByPartOfName(String regex);
}
