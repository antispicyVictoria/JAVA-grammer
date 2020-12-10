package Array;

public class Man {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5,6,7,8,9};

        System.out.println(a[0]);//静态初始化


        int[]b = new int[10];
        b[0] = 10;
        b[1] = 10;

        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
    }
}
