package doneathome.restSecond.dao.base;

import doneathome.restSecond.model.base.BaseEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.engine.spi.SessionImplementor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * Created by dzhukov on 01.06.17.
 */
@Repository
public abstract class HibernateDao<T extends BaseEntity> implements Dao<T> {

    @Autowired
    private SessionFactory sessionFactory;
    private Class<T> persistentClass;

    // TODO: разобраться как мы тут поняли свой класс
    public HibernateDao() {
        for (Type type = getClass().getGenericSuperclass(); type != null; ) {
            if (type instanceof ParameterizedType) {
                Object parameter = ((ParameterizedType) type).getActualTypeArguments()[0];

                if (parameter instanceof Class) {
                    persistentClass = (Class<T>) ((ParameterizedType) type).getActualTypeArguments()[0];
                } else {
                    persistentClass = (Class<T>) ((ParameterizedType) ((TypeVariable<?>) parameter).getBounds()[0]).getRawType();
                }

                break;
            } else if (type instanceof Class) {
                type = ((Class<?>) type).getGenericSuperclass();
            }
        }
    }

    public Session getSession() {

        Session session;
        // TODO: тут мы просто создаем новую сессию есл нет работы с пулом подключений
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }
        // TODO: настраиваем сессию
        if (session instanceof SessionImplementor) {
            ((SessionImplementor)session).setAutoClear(true);
        }

        return session;
    }

    public Class<T> getPersistentClass() {
        return persistentClass;
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
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
    public void save(T entity) {
        getSession().save(entity);
    }

    @Override
    public void delete(T entity) {
        getSession().remove(entity);
    }

    @Override
    public void deleteById(Long id) {
        Session session = getSession();
        Object o = session.get(getPersistentClass(), id);
        if (o != null) {
            session.remove(o);
        }
    }
}
