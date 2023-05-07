import scala.io.Source
object sc{
    def main(args: Array[String])
    {
        print("CSE");
        val text="Hi cse cse nmit nmit nmit Bangalore"
        val wordcount = scala.collection.mutable.Map[String, Int]()
        for(word<-text.split(" "))
            wordcount(word)=if(wordcount.contains(word)) wordcount(word)+1 else 1
        println(wordcount)
    }
}
