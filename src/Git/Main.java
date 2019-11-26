package Git;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.greet();
        Student student = new Student();
        student.setAge(21);
        student.greet();
        System.out.println(student.getAge());
        Teacher teacher = new Teacher();
        teacher.setAge(28);
        teacher.greet();
        teacher.explain();
    }
}
