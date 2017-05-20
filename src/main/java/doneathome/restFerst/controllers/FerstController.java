package doneathome.restFerst.controllers;

import doneathome.restFerst.model.TwoStrings;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dzhukov on 08.05.17.
 */
@RestController
@RequestMapping(value = "/ferst")
public class FerstController {

    //---------------------------------------------------------------------

    // возвращаем ответ как текст в кодировке utf-8
    @RequestMapping(value = "/ruText", method = RequestMethod.GET, produces = "text/plain;charset=UTF-8")
    public String getRuText(){
        return "Выводим русские символы благодаря [text/plain;charset=UTF-8]";
    }

    // возвращаем ответ как json в кодировке utf-8 // объект [TwoStrings] - класс обертка
    @RequestMapping(value = "/ruJson", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public TwoStrings getRuTextInJson(){
        return new TwoStrings("Первая","Вторая");
    }

    // запрос [/ruJsonAddParams?ferst=111&second=222] - указываем что параметра может и не быть!
    @RequestMapping(value = "/ruJsonAddParams", method = RequestMethod.GET)
    public TwoStrings getRuJsonAddParamsR(@RequestParam(value = "ferst", required = false) String ferst,
                                          @RequestParam(value = "second", required = false) String second){
        return new TwoStrings(ferst,second);
    }

    // запрос [/ruJsonAddParams/111/222] - указываем что параметра может и не быть!
    @RequestMapping(value = "/ruJsonAddParams/{ferst}/{second}", method = RequestMethod.GET)
    public TwoStrings getRuJsonAddParamsP(@PathVariable("ferst") String ferst,
                                          @PathVariable("second") String second){
        return new TwoStrings(ferst,second);
    }

    //---------------------------------------------------------------------

}