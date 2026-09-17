public class Main {

    public static void main(String[] args) {

        Person p1 = new Person();

        // Person object 2 - Overloaded constructor

//        Person p2 = new Person(72, 70, "Black", "Barack Obama", 170);
//        System.out.println(p2.name);

        Person p2 = new Person(72, 70);
        System.out.println(p2.age);

        Person p3 = p2.Call_Privates();

        Student s1 = new Student();
        s1.age = 20;
        s1.gpa = 4.00;
        System.out.println(s1.gpa);

    }
}
