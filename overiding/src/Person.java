import java.util.Scanner;

public class Person {
    private String name;

    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info() {
        System.out.println(this.age);
        System.out.println(this.name);

    }
    public void input() {
        this.age = new Scanner(System.in).nextInt();
        this.name = new Scanner(System.in).nextLine();
    }
}
