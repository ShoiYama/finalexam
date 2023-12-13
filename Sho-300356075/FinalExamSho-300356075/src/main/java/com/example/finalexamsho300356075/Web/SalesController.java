package com.example.finalexamsho300356075.Web;


import groovyjarjarpicocli.CommandLine;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;
@SessionAttributes({"id"})
@Controller
@AllArgsConstructor
public class SalesController {
    //@Autowired
    @GetMapping(path = "/Main")
    public String Sales(Model model){

        return "Main";
    }
}
