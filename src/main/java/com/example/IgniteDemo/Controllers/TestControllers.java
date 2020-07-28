package com.example.IgniteDemo.Controllers;

import com.example.IgniteDemo.Services.TestService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestControllers {

    @Autowired
    private TestService testService;
    private static final Logger LOGGER = LogManager.getLogger(TestControllers.class.getName());

    @RequestMapping("/")
    public String index() {

        return "index returned";
    }

    @RequestMapping("/getData")
    public String getData() {
        List<Map<String, Object>> list = testService.getUsers();
        LOGGER.debug("lst {}", list.toString());
        System.out.println("list.toString() = " + list.toString());
        return list.toString();
    }
}
