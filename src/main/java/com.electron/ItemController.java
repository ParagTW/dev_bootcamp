package com.electron;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by paragb on 06/10/15.
 */
@Controller
public class ItemController {

    @RequestMapping("/Item")
    public void home(ModelMap model)
    {

//        model.addAttribute("item1", )
    }
}
