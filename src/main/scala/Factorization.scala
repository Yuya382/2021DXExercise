import scala.util.Random
import scala.math._
object Factorization {
    def main(args: Array[String]): Unit = {
        val size = 10
        var max = 10
        var testList1 = List.fill(size)(Random.nextInt(max))

        for (i <- 0 until 5){

            testList1 = testList1 ::: List.fill(size)(Random.nextInt(max))
            max *= 10
        }

        println("---------")
        for (i <- 0 until testList1.size){

            print(testList1(i)+":")
           // factorize(testList1(i)).foreach(a => print(a+","))
        
            marging(factorize(testList1(i))).foreach(a => print(a+","))
            println()
        }

        
    }

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

        returnList
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
            }ß
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
