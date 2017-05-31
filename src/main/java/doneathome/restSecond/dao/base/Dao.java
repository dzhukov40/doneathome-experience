package doneathome.restSecond.dao.base;

import doneathome.restSecond.model.base.BaseEntity;

/**
 * Created by dzhukov on 31.05.17.
 */
public interface Dao<T extends BaseEntity> {

    /**
     * Ищет сущность по заданному id.
     * @param id - идентификатор сущности.
     * @return сущность
     */
    T findById(Long id);

    /**
     * Сохраняет или обновляет сущность если уже есть запись в базе.
     * @param entity - Объект сущности для сохранения
     */
    void saveOrUpdate(T entity);

    /**
     * Сохраняет сущность.
     * @param entity Объект сущности для сохранения
     * @return true - сохрили. false - не удалось сохранить
     * */
     Boolean save(T entity);

    /**
     * Удаляет сущность.
     * @param entity Объект сущности для удаления
     * */
    void delete(T entity);

    /**
     * Удаляет сущность.
     * @param id id сущности для удаления
     * */
    void deleteById(Long id);

}
