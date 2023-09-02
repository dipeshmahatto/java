//package lab.Assignment;
//class Person {
//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    // Override equals() method for custom equality comparison
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null || getClass() != obj.getClass()) {
//            return false;
//        }
//        Personn personn = (Personn) obj;
//        return age == personn.age && name.equals(personn.name);
//    }
//}
//public class EqualsDemo {
//    public static void main(String[] args) {
//        Personn personn1 = new Personn("Alice", 25);
//        Personn personn2 = new Personn("Bob", 30);
//        Personn personn3 = new Personn("Alice", 25);
//
//        System.out.println("person1 equals person2: " + personn1.equals(personn2));
//        System.out.println("person1 equals person3: " + personn1.equals(personn3));
//    }
//}
