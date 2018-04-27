//package com.magisterka.magisterka.algorithms;
//
//
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//
//
//
//
//@Controller
//@RequestMapping("/apriori")
//public class AprioriController  {
//
//  @Autowired
//  private ChoiceRepository choiceRepository ;
//
//
//
//  @GetMapping("")
//  public String choice() throws Exception {
//
////    SparkConf conf = new SparkConf().setAppName("SparkSample").setMaster("local[*]");
////    JavaSparkContext jsc = new JavaSparkContext(conf);
////    SQLContext sqc = new SQLContext(jsc);
////
////
////    Dataset<Row> sqlDF = sqc.sql("Select chais , colar , dispenser , gravity , slip from choice");
//
//    //mogę zapisać wyciągnięte wyniki do csv i wtedy to przetworzyć i zapisać jako string i będzie to bez różnicy czy użyję weka czy
//    // spark
//
//
//
//
//   // SparkSession spark =  SparkSession.builder().appName("Magisterka").config("com.magisterka.magisterka" , "Magisterka").getOrCreate();
//
////    SparkConf conf = new SparkConf().setAppName("SparkSample").setMaster("local[*]");
////    JavaSparkContext jsc = new JavaSparkContext(conf);
////    SQLContext sqc = new SQLContext(jsc);
////    List<Choice> myArrayList = choiceRepository.findAll() ;
////
////
////    DataFrameWriter df = sqc.createDataset(myArrayList , Encoders.INT()).toDF();
////
////    DataFrameWriter df1 =  df.selectExpr("split(value, ',')[1] as chains", "split(value, ',')[2] as colar","split(value, ',')[3] as dispenser",
////            "split(value, ',')[4] as gravity" , "split(value, ',')[5] as slip");
//
//
//
//    // Dataset<Row> df = sqlContext.sql("Select chais , colar , dispenser , gravity , slip from choice");
//
////    sqlContext.createDataset(myArrayList , )
//
//
//
//   // Dataset<Row> df = sqlContext.createDataset(myArrayList , Encoder).toDF();
//
//
////    ConverterUtils.DataSource dataSource = new ConverterUtils.DataSource(df);
////    Instances data = dataSource.getDataSet();
////
////
////
////    Apriori model = new Apriori();
////    model.buildAssociations(data);
////    System.out.println(model);
// //   System.out.println(df);
//    return "clientResult";
//
//
//  }
//
//
//
//
//}
