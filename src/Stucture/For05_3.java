package Stucture;

public class For05_3 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("============");
        //简化版
        for(int X:numbers){
            System.out.println(X);
        }
    }
}
