package doneathome.restSecond.dao.base;

import doneathome.restSecond.model.base.BaseEntity;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by dzhukov on 31.05.17.
 */
public interface Dao<T extends BaseEntity> {

    /**
     * Ищет сущность по заданному id.
     * @param id - идентификатор сущности.
     * @return сущность
     */
    @Transactional(readOnly=true)
    T findById(Long id);

    /**
     * Сохраняет или обновляет сущность если уже есть запись в базе.
     * @param entity - Объект сущности для сохранения
     */
    @Transactional
    void saveOrUpdate(T entity);

    /**
     * Сохраняет сущность.
     * @param entity Объект сущности для сохранения
     * @return true - сохрили. false - не удалось сохранить
     * */
    @Transactional
    void save(T entity);

    /**
     * Удаляет сущность.
     * @param entity Объект сущности для удаления
     * */
    @Transactional
    void delete(T entity);

    /**
     * Удаляет сущность.
     * @param id id сущности для удаления
     * */
    @Transactional
    void deleteById(Long id);

}
