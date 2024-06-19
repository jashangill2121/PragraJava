package Assignments;

public class Student {
    String name;
    static int[] grades = new int[3];


    public Student(String name, int[] grades) {

        this.name = name;
        this.grades = grades;

    }

    public double getAverageGrade(){

      double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];

        }

        return sum/grades.length;
    }


    public String toString() {
        return  name + ": Average grade : " +getAverageGrade();
    }
}
