import scala.util.Random
object matMulTest {

    def main(args: Array[String]): Unit = {
        val N = 10
        val M = 10
        val K = 20


        var A = List.fill(N * K)(Random.nextFloat()).toArray
        var B = List.fill(K * M)(Random.nextFloat()).toArray
        
       // var A = Array(1f,2f,3f,4f)
        //var B = Array(5f,6f,7f,8f)

        var C = Matrix2dMul.matmul(A,B,M,N,K)

        C.foreach{println(_)}
    }
}
