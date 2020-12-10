package Array;

public class ArrayDemo05 {
    public static void main(String[] args) {
        int [][] array = {{1,2},{2,3},{3,4},{4,5}};

        /*
        * 1,2 array[0]
        * 2,3 array[1]
        * 3,4 array[2]
        * 4,5 array[3]*/
        System.out.println(array[2][0]);
        System.out.println(array[2][1]);
        System.out.println(array.length);
        System.out.println(array[0].length);
    }
}
