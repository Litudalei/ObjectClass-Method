package day1cloning;

public class CloningDemo {
    public static void main(String[] args)throws CloneNotSupportedException {
        Person p1=new Person(12,"Rohan");
        Person p2=p1;
        System.out.println("value after assigning");

        p2.setAge(23);
        System.out.println(p1.getAge());
        System.out.println("After cloning");
        Person p3=(Person)p1.clone();
        p3.setAge(11);
        System.out.println(p3.getAge());
        System.out.println(p1.getAge());
    }
}
