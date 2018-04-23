package com.magisterka.magisterka.repository;


import com.magisterka.magisterka.entity.Choice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;
import java.util.List;

@EnableJpaRepositories
public interface ChoiceRepository  extends JpaRepository<Choice , Long>{

  ArrayList<Choice> findByColar = new ArrayList<>();
  ArrayList<Choice> findByChais = new ArrayList<>();
  ArrayList<Choice> findByDispenser = new ArrayList<>();
  ArrayList<Choice> findByGravity = new ArrayList<>();
  ArrayList<Choice> findBySlip = new ArrayList<>();
  ArrayList<Choice> findById = new ArrayList<>();


}
