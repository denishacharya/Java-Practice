// Program 10: Class with private variables and getter/setter methods
class Student {
    private String name;
    private int age;
    private String batch;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Batch: " + batch);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Denish");
        student.setAge(21);
        student.setBatch("BCA");
        student.display();
    }
}
