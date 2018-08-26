package com.magisterka.magisterka.repository;


import com.magisterka.magisterka.entity.Choice;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;
import java.util.List;

@EnableJpaRepositories
public interface ChoiceRepository  extends JpaRepository<Choice , Long>{


}
