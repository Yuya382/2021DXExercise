
public class Matrix2dMul_name{
	public static float[] matmul(float A[],float B[],int M,int N,int K){
		float[] C = new float[N*M];//答えを代入して返す変数
		int i,j,k;
		

		return C;
	}

	//テスト用Main関数
	public static void main(String[] args){
		int M= 2;
		int N= 2;
		int K= 2;

		/// 求めるのはN＊K行列 x　K＊M行列
		/// 出来上がるのはN＊M行列

		float[] A = new float[]{1,2,3,4};
		float[] B = new float[]{5,6,7,8};
		float[] C = new float[N*M];

		float[] Ans = new float[]{19,22,43,50};//　簡単なチェック
		C = matmul(A,B,M,N,K);
		System.out.println(isEqual(Ans,C));
		
	}

	// 2つの配列を比較する
	public static boolean isEqual(float[] A, float[] B){

		if(A.length != B.length) return false;
		boolean result = true;
		for(int i = 0; i < A.length; i++){
			if( A[i] != B[i])
			{
				result =false;
			}
		}
	
		return result;
	}

}
