package com.magisterka.magisterka.controller;

import com.magisterka.magisterka.entity.Choice;
import com.magisterka.magisterka.entity.Client;
import com.magisterka.magisterka.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class ClientController {


  @Autowired
  private ClientRepository clr;


  @GetMapping("/add")
  public String newClientGet(Model model) {
    model.addAttribute("client", new Client());
    return "register";

  }


  @PostMapping("/add")
  public String newClinet(@ModelAttribute Client client , Model model) {
    clr.save(client);
    return "dashbord";
  }







}