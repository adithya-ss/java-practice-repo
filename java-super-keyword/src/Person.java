public class Person {
    String personName;
    int personAge;
    Person(String name, int age){ 
        this.personName = name;
        this.personAge = age;
    }
    public String toString() {
        return "Name: " + this.personName + "\nAge: " + this.personAge + "\n";
    }
}
