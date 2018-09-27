import org.apache.spark.{SparkConf, SparkContext}

object WordCount_01 {
  def main(args: Array[String]): Unit = {
    // 配置信息
    val conf = new SparkConf().setAppName("WordCount").setMaster("local[*]")
    // sc
    val sc = new SparkContext(conf)

        sc.textFile("C:\\Users\\Just Do It\\Desktop\\data\\spark\\wordCount.txt").flatMap(_.split(" ")).map((_, 1)).reduceByKey(_ + _).saveAsTextFile("hdfs://bigdata111:9000/output/0927/wc");
/*    val result = sc.textFile("C:\\Users\\Just Do It\\Desktop\\data\\spark\\wordCount.txt").flatMap(_.split(" ")).map((_, 1)).reduceByKey(_ + _)
    result.foreach(println);*/


    sc.stop();
  }
}
