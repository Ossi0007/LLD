package src.main.java.creational.prototype;

public class College implements Prototype {
    int id;
    private int roll;
    String name;

    public College() {
    }

    public College(int age, int roll, String name) {
        this.id = age;
        this.roll = roll;
        this.name = name;
    }


    @Override
    public Prototype clone() {
        return new College(id, roll, name);
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "age=" + id +
                ", roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}
