package doneathome.restSecond.model;

/**
 * Created by dzhukov on 09.05.17.
 */
public class User {

    private int id;
    private String login;
    private String password;
    private int age;

    // [ !!! класс должен иметь конструктор без параметров !!! ]
    public User() {
    }

    public User(int id, String login, String password, int age) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.age = age;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
