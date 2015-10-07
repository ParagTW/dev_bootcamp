package com.electron;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ItemRepository{


    public List<Item> getItems(){

        return getHardcodedItems();
    }

    private ArrayList<Item> getHardcodedItems(){
        ArrayList<Item> items = new ArrayList<Item>();

        Item item1 = new Item();
        item1.name = "Phone";

        Item item2 = new Item();
        item2.name = "car";

        Item item3 = new Item();
        item3.name = "laptop";

        items.add(item1);
        items.add(item2);
        items.add(item3);

        return items;
    }
}