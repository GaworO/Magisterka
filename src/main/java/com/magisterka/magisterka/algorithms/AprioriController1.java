package com.magisterka.magisterka.algorithms;


import ch.qos.logback.core.encoder.Encoder;
import com.magisterka.magisterka.entity.Choice;
import com.magisterka.magisterka.repository.ChoiceRepository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

@Controller
@RequestMapping("/apriori")
public class AprioriController1 {

//  @Autowired
//  private ChoiceRepository choiceRepository ;

//     try {
//    Process p = Runtime.getRuntime().exec("C:\\Users\\Ola\\AppData\\Local\\Programs\\Python\\Python36\\python.exe  C:\\Users\\Ola\\Desktop\\Magisterka_Python\\Apriori.py");
//  } catch (Exception IOException){
//
//  }

//    List<Choice> choice = choiceRepository.findAllDataFromDataBase();
//    PrintWriter writer = new PrintWriter(new File("C:\\Users\\Ola\\Desktop\\Magisterka_Python\\apriori.csv"));
//
//
//    Choice[] chais = new Choice[choice.size()];
//    chais = choice.toArray(chais);
//
//
//    for (int i = 0; i < chais.length; i++) {
//      for (Choice choices : chais) {
//        StringBuilder sb = new StringBuilder();
//        sb.append(choices.getChais());
//        sb.append(";");
//        sb.append(choices.getColar());
//        sb.append(";");
//        sb.append(choices.getGravity());
//        sb.append(";");
//        sb.append(choices.getDispenser());
//        sb.append(";");
//        sb.append(choices.getSlip());
//        sb.append('\n');
//        writer.println(sb.toString());
//      }

    }
//    writer.flush();






//    SparkConf conf = new SparkConf().setAppName("SparkSample").setMaster("local[*]");
//    JavaSparkContext jsc = new JavaSparkContext(conf);
//    SQLContext sqc = new SQLContext(jsc);
//
//    JavaRDD<Choice> choiceRDD = jsc.parallelize(choiceRepository.findAll()) ;
//
//
//
//    Dataset<Row> sqlDF1 = sqc.createDataset(choiceRDD , Choice.class).toDF();
//    sqlDF1.createOrReplaceTempView("choice");
//    Dataset<Row> sqlDF = sqc.sql("Select chais , colar , dispenser , gravity , slip from magisterka.choice").toDF();
//
//    sqlDF.write().csv("C:\\Users\\Ola\\Desktop\\Magisterka\\src\\main\\resources\\dataframe.csv");














