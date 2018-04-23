package com.magisterka.magisterka.controller;

import com.magisterka.magisterka.entity.Choice;
import com.magisterka.magisterka.repository.ChoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/dashbord")
public class ChoiceController {


  @Autowired
  private ChoiceRepository chr;

  @GetMapping("")
  public String dashbord() {
    return "dashbord";
  }

  @GetMapping("/add")
  public String choice(Model model) {
    model.addAttribute("choice", new Choice());
    return "dashbord";

  }

  @PostMapping("/add")
  public String choice(@ModelAttribute Choice choice) {
     chr.save(choice);
     return ("redirect:/apriori");
  }

}


