package scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int m = 0;
        System.out.println("请输入：");
        while(scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            m = m +1;
            sum = sum+x;
        }
        System.out.println(m+"个数的和为"+sum);
        System.out.println(m+"个数的平均值"+(sum/m));
        scanner.close();
    }
}
