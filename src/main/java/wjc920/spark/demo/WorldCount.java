package wjc920.spark.demo;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

public class WorldCount {
    
    public static void main(String[] args) {
        SparkConf sparkConf = new SparkConf().setAppName(WorldCount.class.getSimpleName());
        JavaSparkContext ctx = new JavaSparkContext(sparkConf);
    }

}
