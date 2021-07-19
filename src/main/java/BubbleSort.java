/** ソートのアルゴリズム(バブルソート) */
public class BubbleSort {

  /** バブルソートの処理を実行するメソッド */
    public static float[] sort( float[] array ) {

        float tmp=0f; //作業領域
        for( int i=0; i<array.length-1; i++ ) {
            for( int j=0; j<array.length-i-1; j++ ) {
                if( array[j] > array[j+1] ) {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        
        return array;

    }
}