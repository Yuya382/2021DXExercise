import scala.util.Random

object bubbleSortTest {

    def main(args: Array[String]): Unit = {
        var testList1 = List.fill(30)(Random.nextFloat()).toArray
        var testList2 = List.fill(30)(Random.nextFloat()).toArray
        
        var retrunList = bublle_sort(testList1)
        var java_result = BubbleSort.sort(testList2)

        println(check_result(retrunList, testList1.sorted))
        println(check_result(java_result, testList2.sorted))
        
    }

    def bublle_sort(list : Array[Float]):Array[Float] = {
        for (i <- 0 until list.length) {
            for (j <- 0 until list.length - i - 1) { //Each every inner loop, list.length-i-1 to list.length is already sorted.
                if (list(j) > list(j + 1)) {
                    var tmp = list(j)
                    list(j) = list(j + 1)
                    list(j + 1) = tmp
                }
            }
        }

        return list
    }


    def check_result(l1: Array[Float],l2: Array[Float]) : Boolean =  l1.zip(l2).map{case (a,b) => a-b}.filter(_!=0f).size == 0
    
    
}


