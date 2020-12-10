package Oop.DEMO02;

public class Application {
    public static void main(String[] args) {
        Student nikita = new Student();
        Student sasha = new Student();
        System.out.println(nikita.name);
        System.out.println(nikita.age);

        sasha.name = "beauty";
        sasha.age = 18;

        System.out.println(sasha.name);
        System.out.println(sasha.age);

    }
}
