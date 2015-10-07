package com.electron;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by paragb on 06/10/15.
 */
@Controller
//@RequestMapping("/Item")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public ItemController(){

    }

    @RequestMapping("/Item")
    public String getItems(Model model)
    {
//        System.out.print("testing");
        model.addAttribute("name", "abcd");
        model.addAttribute("itemList",itemRepository.getItems());
            return "ListView";
    }
}
