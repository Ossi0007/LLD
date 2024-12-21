package src.main.java.creational.prototype;

public class Student implements Prototype {
    int age;
    private int roll;
    String name;

    public Student() {
    }

    public Student(int age, int roll, String name) {
        this.age = age;
        this.roll = roll;
        this.name = name;
    }


    @Override
    public Prototype clone() {
        return new Student(age, roll, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}
