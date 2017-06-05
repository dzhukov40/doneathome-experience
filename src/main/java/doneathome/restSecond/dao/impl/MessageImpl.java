package doneathome.restSecond.dao.impl;

import doneathome.restSecond.dao.api.MessageDao;
import doneathome.restSecond.dao.base.HibernateDao;
import doneathome.restSecond.model.Message;
import org.springframework.stereotype.Repository;

/**
 * Created by dzhukov on 06.06.17.
 */
@Repository
public class MessageImpl extends HibernateDao<Message> implements MessageDao {
}
