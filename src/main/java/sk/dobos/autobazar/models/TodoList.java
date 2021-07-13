package sk.dobos.autobazar.models;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Todos> todosList;

    public TodoList() {
        this.todosList = new ArrayList<>();
    }

    public List<Todos> getTodosList() {
        return todosList;
    }

    public void setTodosList(List<Todos> todosList) {
        this.todosList = todosList;
    }
}
