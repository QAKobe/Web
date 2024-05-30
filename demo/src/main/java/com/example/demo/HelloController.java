package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

@Controller
public class HelloController {

    @GetMapping("/customer")
    public String customer(Model model) throws IOException {
        byte [] file = Files.readAllBytes(Paths.get("demo/src/main/resources/static/customer.svg"));
        String baseImage = Base64.getEncoder().encodeToString(file);
        model.addAttribute("customer.svg", baseImage);
        return "customer";
    }

    @GetMapping("/getMe")
    public String getUpdates(){
        return "stringisupdated";
    }
}
