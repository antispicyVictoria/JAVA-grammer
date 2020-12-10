package Array;

public class ArrayDemo04_1 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};
        int[] reverse = reverse(arrays);
    }
    public static int[] reverse(int[] arrays) {
        int[] result = new int[arrays.length];

        //反转操作
        for(int i =0,j=result.length-1; i <arrays.length;i++,j--){
            result[j] = arrays[i];
        }
        return result;
    }
}
