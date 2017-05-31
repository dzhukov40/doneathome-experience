package doneathome.restSecond.model;

import doneathome.restSecond.model.base.BaseEntity;

import javax.persistence.*;

/**
 * Created by dzhukov on 09.05.17.
 */
@Entity
@Table(name="User")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id")
    private Long id;

    @Column(name="login")
    private String login;

    @Column(name="password")
    private String password;

    
    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
