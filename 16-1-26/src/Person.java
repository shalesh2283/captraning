public class Person {
    String name;
    int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public Person(Person p) {
        name = p.name;
        age = p.age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Aman", 20);
        Person p2 = new Person(p1);

        System.out.println(p2.name);
        System.out.println(p2.age);
    }
}