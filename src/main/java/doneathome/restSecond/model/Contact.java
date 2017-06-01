package doneathome.restSecond.model;

import doneathome.restSecond.model.base.BaseEntity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by dzhukov on 27.05.17.
 */
@Entity
@Table(name="CONTACT")
public class Contact extends BaseEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="contact_id")
    private Long id;

    @OneToMany(mappedBy = "contact_id", cascade = CascadeType.ALL)
    private Set<ContactRelation> contactRelations;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<ContactRelation> getContactRelations() {
        return contactRelations;
    }

    public void setContactRelations(Set<ContactRelation> contactRelations) {
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
