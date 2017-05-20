package doneathome.restSecond.controllers;

import doneathome.restSecond.model.User;
import doneathome.restSecond.service.UserDAOService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by dzhukov on 09.05.17.
 */
@RestController
@RequestMapping(value = "/second")
public class SecondController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }



    /*
      GET    - получаем экземпляр
      PUT    - создаем новый экземпляр
      DELETE - удаляем экземпляр
      POST   - обновляем существующий, если такого нет создаем экземпляр

      (*) - в запросах указывае заголовок [Content-Type] -> [application/json;charset=UTF-8]
     */

    @Autowired
    UserDAOService userDAOService;

    //---------------------------------------------------------------------

    // получаем User
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id") int id){
        return userDAOService.getUser(id);
    }

    // получаем список User
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getUserList(){
        return userDAOService.getUserList();
    }

    // добавляем пользователя, если он уже есть ошибка! [класс должен иметь конструктор без параметров]
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public Boolean putUser(@RequestBody User user){
        return userDAOService.setUser(user);
    }

    // удаляем пользователя
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public User removeUser(@PathVariable("id") int id){
        return userDAOService.removeUser(id);
    }

    // обновляем существующего или добавляем нового [класс должен иметь конструктор без параметров]
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public User postUser(@RequestBody User user){
        return userDAOService.updateUser(user);
    }


    //---------------------------------------------------------------------

    // получаем тестового пользователя: User
    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public User getUserTest1(){

        int age = 30;

        try {
            dataSource.getConnection();
            age = 35;
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return new User(1,"dzhukov","Lanit65281",age);
    }

    //
    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public User getUserTest2(){
        User user = new User(1,"dzhukov","Lanit65281",20);


        Session session = getSession();

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();



        return user;
    }

    //---------------------------------------------------------------------

}
