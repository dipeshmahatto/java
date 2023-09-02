package lab.Assignment;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ArrayOfObjectsDemo {
    public static void main(String[] args) {
        // Creating an array of Person objects
        Person[] people = new Person[3];

        // Initializing array elements with Person objects
        people[0] = new Person("Alice", 25);
        people[1] = new Person("Bob", 30);
        people[2] = new Person("Charlie", 22);

        // Accessing and displaying information of each person
        for (Person person : people) {
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println();
        }
    }
}
