package sk.dobos.autobazar.services;

import sk.dobos.autobazar.models.TodoList;
import sk.dobos.autobazar.models.Todos;
import sk.dobos.autobazar.models.Usd;

import java.util.List;

public interface RestApiService {
    Usd getPriceSymbol(String code);
    Todos getTodo(Long id);
    List<Todos> getTodos();
    TodoList getTodoList();



}
