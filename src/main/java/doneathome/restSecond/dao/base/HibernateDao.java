package doneathome.restSecond.dao.base;

import doneathome.restSecond.model.base.BaseEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.engine.spi.SessionImplementor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by dzhukov on 01.06.17.
 */
@Repository
public abstract class HibernateDao<T extends BaseEntity> implements Dao<T> {

    @Autowired
    private SessionFactory sessionFactory;
    private Class<T> persistentClass;


    public Session getSession() {
        Session session = sessionFactory.getCurrentSession();
        if (session instanceof SessionImplementor) {
            ((SessionImplementor)session).setAutoClear(true);
        }
        return session;
    }

    public Class<T> getPersistentClass() {
        return persistentClass;
    }

    @Override
    public T findById(Long id) {
        return getSession().get(getPersistentClass(), id);
    }

    @Override
    public void saveOrUpdate(T entity) {
        getSession().saveOrUpdate(entity);
    }

    @Override
    public Boolean save(T entity) {
        getSession().save(entity);

        // TODO: каксделать функционал ? согласно описанию

        return true;
    }

    @Override
    public void delete(T entity) {
        getSession().delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        Session session = getSession();
        Object o = session.get(getPersistentClass(), id);
        if (o != null) {
            session.delete(o);
        }
    }
}
