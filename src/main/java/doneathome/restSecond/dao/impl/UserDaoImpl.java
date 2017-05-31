package doneathome.restSecond.dao.impl;

import doneathome.restSecond.dao.api.UserDao;
import doneathome.restSecond.dao.base.HibernateDao;
import doneathome.restSecond.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dzhukov on 15.05.17.
 */
@Repository
public class UserDaoImpl extends HibernateDao<User> implements UserDao {

    @Override
    public User getUserByName(String name) {
        return null;
    }

    @Override
    public List<User> getUserByPartOfName(String regex) {
        return null;
    }
}
