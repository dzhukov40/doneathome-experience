package doneathome.restSecond.model;

import doneathome.restSecond.model.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by dzhukov on 27.05.17.
 */
@Entity
@Table(name="Contact")
public class Contact extends BaseEntity {

    @Id
    @Column(name="contact_id")
    private Long id;
    private List<ContactRelation> contactRelations;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ContactRelation> getContactRelations() {
        return contactRelations;
    }

    public void setContactRelations(List<ContactRelation> contactRelations) {
        this.contactRelations = contactRelations;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", contactRelations=" + contactRelations +
                '}';
    }

}
