package doneathome.restSecond.service;

import doneathome.restSecond.model.User;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by dzhukov on 09.05.17.
 */
@Service
public class UserDAOServiceImpl implements UserDAOService {

    // Это наш источник мы храним в нем пользователей !
    Map<Integer,User> map = new HashMap<>();

    @Override
    public User getUser(int id) {
        return map.get(id);
    }

    @Override
    public List<User> getUserList() {
        List<User> userList = new LinkedList<>();
        for(Map.Entry entry : map.entrySet()){
            userList.add((User)entry.getValue());
        }
        return userList;
    }

    @Override
    public boolean setUser(User user) {
        if(map.containsKey(user.getId())){
            return true;
        }
        else {
            map.put(user.getId(), user);
            return false;
        }
    }

    @Override
    public User updateUser(User user) {
        return map.put(user.getId(),user);
    }

    @Override
    public User removeUser(int id) {
        return map.remove(id);
    }

}
