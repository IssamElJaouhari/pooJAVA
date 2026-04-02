public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void affch() {

    }

    public static void main(String[] args) {
        Student e1 = new Student("Loubna", 21);
        System.out.println(e1);
    }
}
