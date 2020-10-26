package com.example.exercise_springmvc_thymeleaf.repository;

import com.example.exercise_springmvc_thymeleaf.controllers.Contact;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface contactRepository extends CrudRepository <Contact, Integer> {

}
