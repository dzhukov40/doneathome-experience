package doneathome.restSecond.model;

import doneathome.restSecond.model.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dzhukov on 30.05.17.
 */
@Entity
@Table(name="Contact_relation")
public class ContactRelation extends BaseEntity {

    private Long id;
    private Long contact_id;
    private Long user_id;


    public ContactRelation() {
    }

    public ContactRelation(Long contact_id, Long user_id) {
        this.contact_id = contact_id;
        this.user_id = user_id;
    }

    @Id
    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getContact_id() {
        return contact_id;
    }

    public void setContact_id(Long contact_id) {
        this.contact_id = contact_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "ContactRelation{" +
                "id=" + id +
                ", contact_id=" + contact_id +
                ", user_id=" + user_id +
                '}';
    }

}
