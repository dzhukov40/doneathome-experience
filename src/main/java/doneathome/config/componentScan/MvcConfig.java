package doneathome.config.componentScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by dzhukov on 08.05.17.
 */
/*
@EnableWebMvc ----------------- (для класса) говорит Spring, что это конфигурационный класс
@Configuration ---------------- (для класса) указывает, что конфигурация поддерживает Web MVC
@componentScan("ru.lanit") ---- (для класса) говорим Spring-у в каком пакете будут лежать
                                 controllers и сервисы для их инициализации.
@Bean ------------------------- (для метода) — указывает, что аннотируемый метод является
                                 инициализацией бина требуемого для выполнение вашей логики.
*/
@EnableWebMvc
@Configuration
@ComponentScan("doneathome") //указываем где искать компоненты
@EnableTransactionManagement
public class MvcConfig extends WebMvcConfigurerAdapter {

}