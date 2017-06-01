package doneathome.restSecond.model;

import doneathome.restSecond.model.base.BaseEntity;

import javax.persistence.*;

/**
 * Created by dzhukov on 30.05.17.
 */
@Entity
@Table(name="CONTACT_RELATION")
public class ContactRelation extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="contact_relations_id")
    private Long id;

    @Column(name="contact_id")
    private Long contact_id;


    public ContactRelation() {
    }

    public ContactRelation(Long contact_id) {
        this.contact_id = contact_id;
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

    @Override
    public String toString() {
        return "ContactRelation{" +
                "id=" + id +
                ", contact_id=" + contact_id +
                '}';
    }

}
