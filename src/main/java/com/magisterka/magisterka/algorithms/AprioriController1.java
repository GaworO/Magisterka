package com.magisterka.magisterka.algorithms;


import ch.qos.logback.core.encoder.Encoder;
import com.magisterka.magisterka.entity.Choice;
import com.magisterka.magisterka.repository.ChoiceRepository;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import scala.collection.JavaConverters._;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/apriori")
public class AprioriController1 {

  @Autowired
  private ChoiceRepository choiceRepository ;

  @GetMapping("")
  public String choice() throws Exception {


    SparkConf conf = new SparkConf().setAppName("SparkSample").setMaster("local[*]");
    JavaSparkContext jsc = new JavaSparkContext(conf);
    SQLContext sqc = new SQLContext(jsc);

    JavaRDD<Choice> choiceRDD = jsc.parallelize(choiceRepository.findAll()) ;



    Dataset<Row> sqlDF1 = sqc.createDataset(choiceRDD , Choice.class).toDF();
    sqlDF1.createOrReplaceTempView("choice");
    Dataset<Row> sqlDF = sqc.sql("Select chais , colar , dispenser , gravity , slip from magisterka.choice").toDF();

    sqlDF.write().csv("C:\\Users\\Ola\\Desktop\\Magisterka\\src\\main\\resources\\dataframe.csv");
    return "clientResult";

  }










}
