package com.electron;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ItemRepositoryTest {

    @Test
    public void someTestName(){
        ItemRepository repository = new ItemRepository();
        List<Item> itemList = repository.getItems();
        assertEquals(itemList.size(),3);
    }

    @Test
    public void someTestName1(){
        ItemController itemController = new ItemController();
        itemController.getItems(null);
//        List<Item> itemList = itemListrepository.getItems();
//        assertEquals(itemList.size(),3);
    }
}