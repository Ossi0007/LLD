package src.main.java.creational.prototype;

public class Main {
    public static void main(String[] args) {

        Student obj = new Student(20, 20, "20");
        System.out.println("OG:" + obj);

        //ProBLEM
        Student cloneObj = new Student();
        cloneObj.age = obj.age;
        cloneObj.name = obj.name;
        //but below will give erro while setting roll number because it is private and its getter is also private
        //cloneObj.roll=obj.rolll;
        System.out.println("without prototype" + cloneObj);


        //SOLUTION
        //all class will implement that interface and call the clone() method
        Student cloneObj1 = (Student) obj.clone();
        System.out.println("with prototype" + cloneObj1);
    }
}
