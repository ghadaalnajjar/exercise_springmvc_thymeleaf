package com.example.exercise_springmvc_thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Home {

    List<String> strings = new ArrayList<>();
    String contact = null;

    @RequestMapping("/")
    public String getIndexPage() {
        return "index";
    }

    @GetMapping("/index")
    public String getIndexPages() {
        return "index";
    }

    @GetMapping("/contact")
    public String getContactPage() {
        return "fever";
    }

    @PostMapping("/contact")
    public String addContact(@RequestParam("contact") String contact) {
        return "fever";
    }

    @GetMapping("/contactList")
    public String ContactList(Model model) {
        String name = "All";

        List<Contact> contactList = new ArrayList<>();
        model.addAttribute("name", name);
        return "fever";
    }

    @RequestMapping("/thymeleaf")
    public String test(Model model) {
        Contact contact = new Contact();
        Object name = "All";
        int id = 1;
        model.addAttribute("name", name);
        model.addAttribute("id", id);
        return "fever";
    }
}
