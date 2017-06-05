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
public class DebugUserController {

    @Autowired
    private UserDao userDao;

    // [ 192.168.56.11:8080/u01/experience/tomcat/... ]
    private static final String GET_TEST = "/rest/debug/User/getTest";

    private static final String FIND_BY_ID = "/rest/debug/User/findById/{userId}";
    private static final String SAVE_OR_UPDATE = "/rest/debug/User/saveOrUpdate";
    private static final String SAVE = "/rest/debug/User/save";
    private static final String DELETE = "/rest/debug/User/delete";
    private static final String DELETE_BY_ID = "/rest/debug/User/deleteById/{userId}";


    @RequestMapping(value = GET_TEST, method = RequestMethod.GET)
    public @ResponseBody User getTest() {
        return new User("Den","trenirovka");
    }

    @RequestMapping(value = FIND_BY_ID, method = RequestMethod.GET)
    public @ResponseBody User findByIdUser(@PathVariable(name = "userId") Long id) {
        return userDao.findById(id);
    }

    @RequestMapping(value = SAVE_OR_UPDATE, method = RequestMethod.POST)
    public void saveOrUpdateUser(@RequestBody User user) {
        userDao.saveOrUpdate(user);
    }

    @RequestMapping(value = SAVE, method = RequestMethod.POST)
    public void saveUser(@RequestBody User user) {
        userDao.save(user);
    }

    @RequestMapping(value = DELETE, method = RequestMethod.POST)
    public void deleteUser(@RequestBody User user) {
        userDao.delete(user);
    }

    @RequestMapping(value = DELETE_BY_ID, method = RequestMethod.GET)
    public void deleteByIdUser(@PathVariable(name = "userId") Long id) {
        userDao.deleteById(id);
    }

}
