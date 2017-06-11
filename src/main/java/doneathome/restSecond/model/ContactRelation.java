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

    /**
     * преподаватель не владеет связью и поэтому указано
     * свойство mappedBy=teacher, которое указывает на
     * название поля в дочернем классе, которое представляет
     * текущую сущность(в нашем случае это будет Teacher).
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id")
    private Contact contact;

    @Column(name="user_id")
    private Long userId;


    public ContactRelation() {
    }

    public ContactRelation(Long userId) {
        this.userId = userId;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "ContactRelation{" +
                "id=" + id +
                ", contact=" + contact +
                ", userId=" + userId +
                '}';
    }

}
