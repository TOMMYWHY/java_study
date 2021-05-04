package com.tommy.why;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.thymeleaf.context.WebContext;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class Demo04ApplicationTests {

    @Test
    void contextLoads() {
    }


    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext  context;
    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }
    @Test
    public void mockMvcGet() throws Exception{
        MvcResult mvcResult =mockMvc.perform(MockMvcRequestBuilders.get("/test/user")
        .contentType(MediaType.APPLICATION_JSON)
        .accept(MediaType.APPLICATION_JSON)
        .param("name","tommy")
        .param("userId","123"))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.userId").value("123"))
        .andExpect(jsonPath("$.name").value("tommy"))
        .andReturn();
        System.out.println(mvcResult.getResponse().getContentAsString());
    }

}
