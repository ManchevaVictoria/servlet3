package ru.mirea;

import java.util.ArrayList;
import java.util.List;

public class MyTodoModel implements TodoModel {

    private List<TodoItem> items = new ArrayList<>();
    private int count = 1;

    @Override
    public List<TodoItem> getItems() {
        return items;
    }

    @Override
    public void add(String text) {
        items.add(new TodoItem(count,text));
        count++;
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < items.size(); i++) {
            TodoItem ti = items.get(i);
            if (ti.getId() == id) {
                items.remove(i);
            }
        }
    }
}
