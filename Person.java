// Program 10: Class with default and parameterized constructors
class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "null";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person const1 = new Person();
        const1.display();

        Person parameterizedConst = new Person("Denish", 21);
        parameterizedConst.display();
    }
}