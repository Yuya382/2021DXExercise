import scala.util.Random
import scala.math._
import java.io.PrintWriter
object Factorization {
    def main(args: Array[String]): Unit = {
        val size = 10
        val epo = 3
        var max = 100
        
        var testList1 = List.fill(size)(Random.nextInt(max))

        for (i <- 0 until epo){

            testList1 = testList1 ::: List.fill(size)(Random.nextInt(max))
            max *= 10
        }
        val file = new PrintWriter("testdata/testdata.txt")
        println("---------")
        for (i <- 0 until testList1.size){
            
            var result = listRichString(factorize(testList1(i)))
            file.write(testList1(i)+":"+result+"\n")
            println(testList1(i)+":"+result)
        }
        
        file.close()
        
    }



    def listRichString(list :Array[Int]):String= list.mkString(",")

    def listRichString(list :Array[String]):String= list.mkString(",")
    
    ///素因数分解をするProgram
    /// Input：Int
    /// OutPut：Array[Int]
    def factorize(n : Int):Array[Int] = {
        var returnList = Array[Int]()
        var tmp = n

        for (i <- 2 until n) {
            while (tmp % i == 0){     
                returnList = returnList:+ i
                tmp = tmp / i
            }
        }

        if (returnList.length == 0){
            returnList = returnList :+ n
        }

        return returnList.sorted
    }

    ///素因数分解の結果を冪乗にして返す
    /// Input：Array[Int]
    /// OutPut：Array[String]
    def marging(numberList:Array[Int]) ={
        var returnList = Array[String]()
        var Dic = Map.empty[Int, Int]

        for(number <- numberList){
            if(Dic contains number){
                var preCount = Dic(number)
                Dic = Dic updated (number,  preCount + 1) 
            }else{
                Dic = Dic updated (number,1)
            }
        }
        for (result <- Dic.keySet){

            if(Dic(result) > 1){
                returnList = returnList :+ result+"^"+Dic(result).toString()
            }
            else
            {
                returnList = returnList :+ result.toString()
            }
        }
        returnList
    }
}
