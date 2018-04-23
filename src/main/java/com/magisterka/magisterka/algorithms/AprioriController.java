package com.magisterka.magisterka.algorithms;
import com.magisterka.magisterka.entity.Choice;
import com.magisterka.magisterka.repository.ChoiceRepository;
import org.eclipse.jetty.websocket.common.frames.DataFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import static spark.Spark.*;
import org.springframework.web.bind.annotation.RequestMapping;
import spark.Spark;
import sun.nio.cs.ext.DoubleByte;
import weka.associations.Apriori;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;


import java.util.List;

@Controller
@RequestMapping("/apriori")
public class AprioriController  {

  @Autowired
  private ChoiceRepository choiceRepository ;



  @GetMapping("")
  public String choice() throws Exception {
    //Map<Integer , ArrayList<Choice>> mapOfApriori  ;
    List<Choice> myArrayList = choiceRepository.findAll() ;

//    SparkConf conf = new SparkConf().setAppName("SparkSample").setMaster("local[*]");
//    JavaSparkContext jsc = new JavaSparkContext(conf);
//    SQLContext sqc = new SQLContext(jsc);
//    DataFrame df = sqc.createDataset(myArrayList, Encoder.STRING()).toDF();



    String dataset = myArrayList.toString() ;
    DataSource source = new DataSource(dataset);
    Instances data = source.getDataSet();



    Apriori model = new Apriori();
    model.buildAssociations(data);
    System.out.println(model);
    return "clientResult";


  }




}
