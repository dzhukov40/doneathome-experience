package doneathome.restSecond.controller.debug;

import doneathome.restSecond.controller.registration.RegistrationRestURI;
import doneathome.restSecond.dao.api.UserDao;
import doneathome.restSecond.model.User;
import doneathome.restSecond.service.RegistrationService;
import doneathome.restSecond.util.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dzhukov on 01.06.17.
 */
@RestController
public class UserController {

    @Autowired
    private UserDao userDao;


    private static final String model = "User";
    private static final String FIND_BY_ID = "/rest/debug"+ model +"/findById";
    private static final String SAVE_OR_UPDATE = "/rest/debug"+ model +"/saveOrUpdate";
    private static final String SAVE = "/rest/debug"+ model +"/save";
    private static final String DELETE = "/rest/debug"+ model +"/delete";
    private static final String DELETE_BY_ID = "/rest/debug"+ model +"/deleteById";




    @RequestMapping(value = FIND_BY_ID, method = RequestMethod.POST)
    public @ResponseBody User findByIdUser(@RequestBody Long id) {

        // TODO: ищем пользователя по ID

        return userDao.findById(id);
    }

    @RequestMapping(value = SAVE_OR_UPDATE, method = RequestMethod.POST)
    public void saveOrUpdateUser(@RequestBody User user) {

        // TODO:
        userDao.saveOrUpdate(user);

        return;
    }

    @RequestMapping(value = SAVE, method = RequestMethod.POST)
    public Boolean saveUser(@RequestBody User user) {

        // TODO:

        return userDao.save(user);
    }

    @RequestMapping(value = DELETE, method = RequestMethod.POST)
    public void deleteUser(@RequestBody User user) {

        // TODO:
        userDao.delete(user);

        return;
    }

    @RequestMapping(value = DELETE_BY_ID, method = RequestMethod.POST)
    public void deleteByIdUser(@RequestBody Long id) {

        // TODO:
        userDao.deleteById(id);

        return;
    }













}
