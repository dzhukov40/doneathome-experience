package doneathome.restSecond.controller.debug;

import doneathome.restSecond.dao.api.MessageDao;
import doneathome.restSecond.dao.api.UserDao;
import doneathome.restSecond.model.Message;
import doneathome.restSecond.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dzhukov on 06.06.17.
 */
@RestController
public class DebugMessageImpl {

    @Autowired
    private MessageDao messageDao;

    // [ 192.168.56.11:8080/u01/experience/tomcat/... ]
    private static final String GET_TEST = "/rest/debug/Message/getTest";

    private static final String FIND_BY_ID = "/rest/debug/Message/findById/{messageId}";
    private static final String SAVE_OR_UPDATE = "/rest/debug/Message/saveOrUpdate";
    private static final String SAVE = "/rest/debug/Message/save";
    private static final String DELETE = "/rest/debug/Message/delete";
    private static final String DELETE_BY_ID = "/rest/debug/Message/deleteById/{messageId}";


    @RequestMapping(value = GET_TEST, method = RequestMethod.GET)
    public @ResponseBody Message getTest() {
        return new Message(1L, 2L, "Приветики");
    }

    @RequestMapping(value = FIND_BY_ID, method = RequestMethod.GET)
    public @ResponseBody Message findByIdUser(@PathVariable(name = "messageId") Long id) {
        return messageDao.findById(id);
    }

    @RequestMapping(value = SAVE_OR_UPDATE, method = RequestMethod.POST)
    public void saveOrUpdateUser(@RequestBody Message message) {
        messageDao.saveOrUpdate(message);
    }

    @RequestMapping(value = SAVE, method = RequestMethod.POST)
    public void saveUser(@RequestBody Message message) {
        messageDao.save(message);
    }

    @RequestMapping(value = DELETE, method = RequestMethod.POST)
    public void deleteUser(@RequestBody Message message) {
        messageDao.delete(message);
    }

    @RequestMapping(value = DELETE_BY_ID, method = RequestMethod.GET)
    public void deleteByIdUser(@PathVariable(name = "messageId") Long id) {
        messageDao.deleteById(id);
    }

}
