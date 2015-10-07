package com.electron;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;


import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MockServletContext.class)
@WebAppConfiguration
public class ItemControllerTest {


    private MockMvc mvc;


    @Before
    public void setUp() throws Exception {
        //mvc = MockMvcBuilders.standaloneSetup(mockRepository).build();
    }


    @Test
    public void getHello() throws Exception {

        ItemRepository mockRepository = mock(ItemRepository.class);
        Model mockModel = mock(Model.class);

        List<Item> items = new ArrayList<>();
        items.add(new Item());
        items.add(new Item());
        when(mockRepository.getItems()).thenReturn(items);

        ItemController itemController = new ItemController(mockRepository);
        String viewName = itemController.getItems(mockModel);

        verify(mockModel).addAttribute("itemList", items);
        System.out.print(viewName);
//        verify(mockModel).addAttribute("name", "abcd");

        //mvc.perform(MockMvcRequestBuilders.get("/Item").accept(MediaType.TEXT_HTML))
        //        .andExpect(status().isOk());
    }

    @Ignore
    @Test
    public void getGreeting() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/greeting").accept(MediaType.TEXT_HTML))
                .andExpect(status().isOk());
        // .andExpect(content().string(equalTo("Greetings from Spring Boot!")));
    }
}
