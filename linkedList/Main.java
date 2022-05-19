package linkedList;

public class Main {
    public static class Person{
        String name;
        int age;
    }
    public static void main(String[] args) {
        Person p1=new Person();
        System.out.println(p1.name +" "+p1.age);
        p1.name="rohit";
        p1.age=23;
        System.out.println(p1.name +" "+p1.age);
    }
    
}
