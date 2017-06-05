package doneathome.restSecond.dao.impl;

import doneathome.restSecond.dao.api.ContactDao;
import doneathome.restSecond.dao.base.HibernateDao;
import doneathome.restSecond.model.Contact;
import org.springframework.stereotype.Repository;

/**
 * Created by dzhukov on 05.06.17.
 */
@Repository
public class ContactImpl extends HibernateDao<Contact> implements ContactDao {
}
