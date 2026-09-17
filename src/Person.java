//https://github.com/tezaiangemaxime-spec/Inheritance.git
//Private and protected are not allowed for access modifier

public class Person {
    //height, age, color, name, weight : Instance variable

    double height;

    int age;

    String color;

    String name;

    double weight;

    //Constructor can have private, protected, public access modifiers

    public Person() {
        // Default Constructor can be empty
        height = 48;
        age = 18;
        color = "black";
        name = "";
        weight = 140;
    }

    // Protected members are accessible within the same package

    protected Person(double height, int age){
        // Parameters are local variables to the constructor
        this.height = height;
        this.age = age;
    }

    // Overloaded Constructor
    private Person(double height, int age, String color, String name, double weight) {
        // Parameters are local variables to the constructor
        this.height = height;
        this.age = age;
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    // Setter and Getter
    //Methods

    // Return type : Person
    public Person Call_Privates(){
        Person p3 = new Person(72, 70, "Black", "Barack Obama", 170);
                return p3;

    }
}
