package doneathome.restSecond.controller.debug;

import doneathome.restSecond.dao.api.ContactDao;
import doneathome.restSecond.dao.api.UserDao;
import doneathome.restSecond.model.Contact;
import doneathome.restSecond.model.ContactRelation;
import doneathome.restSecond.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dzhukov on 05.06.17.
 */
@RestController
public class DebugContactController {

    @Autowired
    private ContactDao contactDao;

    // [ 192.168.56.11:8080/u01/experience/tomcat/... ]
    private static final String GET_TEST = "/rest/debug/Contact/getTest";

    private static final String FIND_BY_ID = "/rest/debug/Contact/findById/{contactId}";
    private static final String SAVE_OR_UPDATE = "/rest/debug/Contact/saveOrUpdate";
    private static final String SAVE = "/rest/debug/Contact/save";
    private static final String DELETE = "/rest/debug/Contact/delete";
    private static final String DELETE_BY_ID = "/rest/debug/Contact/deleteById/{contactId}";


    @RequestMapping(value = GET_TEST, method = RequestMethod.GET)
    public @ResponseBody Contact getTest() {
        Set<ContactRelation> set = new HashSet<>();
        set.add(new ContactRelation(1L));
        set.add(new ContactRelation(2L));
        set.add(new ContactRelation(3L));
        return new Contact(set);
    }

    @RequestMapping(value = FIND_BY_ID, method = RequestMethod.GET)
    public @ResponseBody Contact findByIdUser(@PathVariable(name = "contactId") Long id) {
        return contactDao.findById(id);
    }

    @RequestMapping(value = SAVE_OR_UPDATE, method = RequestMethod.POST)
    public void saveOrUpdateUser(@RequestBody Contact contact) {
        Contact contactLocal = new Contact();
        Set<ContactRelation>contactRelationSet = new HashSet<>();

        for (ContactRelation contactRelation : contact.getContactRelations()) {
            contactRelation.setContact(contactLocal);
            contactRelationSet.add(contactRelation);
        }

        contactLocal.setContactRelations(contactRelationSet);
        contactDao.saveOrUpdate(contactLocal);
    }

    @RequestMapping(value = SAVE, method = RequestMethod.POST)
    public void saveUser(@RequestBody Contact contact) {
        contactDao.save(contact);
    }

    @RequestMapping(value = DELETE, method = RequestMethod.POST)
    public void deleteUser(@RequestBody Contact contact) {
        contactDao.delete(contact);
    }

    @RequestMapping(value = DELETE_BY_ID, method = RequestMethod.GET)
    public void deleteByIdUser(@PathVariable(name = "contactId") Long id) {
        contactDao.deleteById(id);
    }
}
