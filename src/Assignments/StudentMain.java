package Assignments;

public class StudentMain {
    public static void main(String[] args) {

        Student s1 = new Student("Alice", new int[]{85, 90, 92});
        Student s2 = new Student("Bob", new int[]{78, 82, 88});
        Student s3 = new Student("Charlie", new int[]{50, 50, 9});

        Course.addStudent(s1);
        Course.addStudent(s2);
        Course.addStudent(s3);

        Course.printStudentDetails();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}
