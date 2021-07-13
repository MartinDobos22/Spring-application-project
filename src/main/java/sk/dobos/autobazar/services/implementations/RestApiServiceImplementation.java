package sk.dobos.autobazar.services.implementations;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sk.dobos.autobazar.models.TodoList;
import sk.dobos.autobazar.models.Todos;
import sk.dobos.autobazar.models.Usd;
import sk.dobos.autobazar.services.RestApiService;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//ako načítať cudzie api
@Service
public class RestApiServiceImplementation implements RestApiService {

    RestTemplate restTemplate;

    public RestApiServiceImplementation(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Usd getPriceSymbol(String code) {

        Usd symbol = restTemplate.getForObject("https://api.coindesk.com/v1/bpi/currentprice.json", Usd.class);
        return symbol;
    }

    //

    @Override
    public Todos getTodo(Long id) {

        Todos todo = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/1", Todos.class);
        return todo;
    }


    @Override
    public List<Todos> getTodos() {

        ResponseEntity<List<Todos>> responseEntity = restTemplate.exchange(
                "https://jsonplaceholder.typicode.com/todos",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Todos>>() {}
        );

        List<Todos> listTodo = responseEntity.getBody();
        return listTodo;
    }



    @Override
    public TodoList getTodoList() {
        TodoList todoList = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos", TodoList.class);
        return todoList;
    }



/*
    public static void main(String[] args) {
        RestApiServiceImplementation restApiServiceImplementation = new RestApiServiceImplementation();
        //Usd symbol = restApiServiceImplementation.getPriceSymbol("USD");
        // System.out.println(symbol.getSymbol());
        // Todos todo = restApiServiceImplementation.getTodo(150L);
        // System.out.println(todo.getTitle());

       // System.out.println(restApiServiceImplementation.getTodos());
        System.out.println(restApiServiceImplementation.getTodoList());
    }
*/

}
