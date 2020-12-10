package Stucture;

public class Switch02 {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("优秀");
                break;
            case'B':
                System.out.println("良好");
            case'C':
                System.out.println("及格");
            default:
                System.out.println("未知等级");
        }
    }
}
