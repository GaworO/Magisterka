package com.magisterka.magisterka.controller;

import com.magisterka.magisterka.entity.Choice;
import com.magisterka.magisterka.entity.Client;
import com.magisterka.magisterka.repository.ChoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
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
  public String choice(Model model ,@RequestParam(value = "colar", required = false) String colar ,
                      @RequestParam(value = "chais", required = false) String chais  ,
          @RequestParam(value = "dispenser", required = false) String dispenser  ,
          @RequestParam(value = "gravity", required = false) String gravity ,
          @RequestParam(value = "slip", required = false) String slip) {
    Choice choice = new Choice();
    choice.setSlip(slip);
    choice.setDispenser(dispenser);
    choice.setChais(chais);
    choice.setColar(colar);
    choice.setGravity(gravity);
    model.addAttribute("choice" , choice);
    return "dashbord";

  }

  @PostMapping("/add")
  public String choice(@ModelAttribute Choice choice , Model model , Client client) {
     chr.save(choice);
     System.out.println(choice);
    ArrayList   categ_0 = new ArrayList();
    categ_0.add(choice.getDispenser());


    ArrayList   categ_1 = new ArrayList();
    categ_0.add(choice.getChais());

    ArrayList   categ_2 = new ArrayList();
    categ_0.add(choice.getSlip());


    ArrayList   categ_3 = new ArrayList();
    categ_0.add(choice.getGravity());

    ArrayList   categ_4 = new ArrayList();
    categ_0.add(choice.getColar());


    ArrayList basket = new ArrayList();

    for (int i = 0; i < categ_0.size(); i++) {
      System.out.println(categ_0.get(i));
      basket.add(categ_0.get(i));
    }
    for (int i = 0; i < categ_1.size(); i++) {
      System.out.println(categ_1.get(i));
      basket.add(categ_1.get(i));
    }

    for (int i = 0; i < categ_2.size(); i++) {
      System.out.println(categ_2.get(i));
      basket.add(categ_2.get(i));
    }

    for (int i = 0; i < categ_3.size(); i++) {
      System.out.println(categ_3.get(i));
      basket.add(categ_3.get(i));
    }

    for (int i = 0; i < categ_4.size(); i++) {
      System.out.println(categ_4.get(i));
      basket.add(categ_4.get(i));
    }


    model.addAttribute("basket" , basket);

     return "clientResult";
  }

}


